package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.Property;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.GroupCreateUserCell;
import org.telegram.ui.Components.AnimatedAvatarContainer;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.FragmentFloatingButton;
import org.telegram.ui.Components.GroupCreateSpan;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.StickerEmptyView;

public class UsersSelectActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate, View.OnClickListener {
    private GroupCreateAdapter adapter;
    private ArrayList allSpans;
    public boolean allowSelf;
    AnimatedAvatarContainer animatedAvatarContainer;
    private int containerHeight;
    private GroupCreateSpan currentDeletingSpan;
    private FilterUsersActivityDelegate delegate;
    public boolean doNotNewChats;
    private EditTextBoldCursor editText;
    private StickerEmptyView emptyView;
    private int fieldY;
    private int filterFlags;
    private FragmentFloatingButton floatingButton;
    private FrameLayout.LayoutParams floatingButtonLp;
    private boolean ignoreScrollEvent;
    private ArrayList initialIds;
    private boolean isInclude;
    private RecyclerListView listView;
    public boolean noChatTypes;
    private FlickerLoadingView progressView;
    private ScrollView scrollView;
    private boolean searchWas;
    private boolean searching;
    private LongSparseArray selectedContacts;
    private int selectedCount;
    private SpansContainer spansContainer;
    private int ttlPeriod;
    private int type;

    public interface FilterUsersActivityDelegate {
        void didSelectChats(ArrayList arrayList, int i);
    }

    static int access$2272(UsersSelectActivity usersSelectActivity, int i) {
        int i2 = i & usersSelectActivity.filterFlags;
        usersSelectActivity.filterFlags = i2;
        return i2;
    }

    static int access$508(UsersSelectActivity usersSelectActivity) {
        int i = usersSelectActivity.selectedCount;
        usersSelectActivity.selectedCount = i + 1;
        return i;
    }

    static int access$510(UsersSelectActivity usersSelectActivity) {
        int i = usersSelectActivity.selectedCount;
        usersSelectActivity.selectedCount = i - 1;
        return i;
    }

    public void setTtlPeriod(int i) {
        this.ttlPeriod = i;
    }

    private static class ItemDecoration extends RecyclerView.ItemDecoration {
        private boolean single;
        private int skipRows;

        private ItemDecoration() {
        }

        @Override
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            Canvas canvas2;
            int width = recyclerView.getWidth();
            int childCount = recyclerView.getChildCount() - (!this.single ? 1 : 0);
            int i = 0;
            while (i < childCount) {
                View childAt = recyclerView.getChildAt(i);
                View childAt2 = i < childCount + (-1) ? recyclerView.getChildAt(i + 1) : null;
                if (recyclerView.getChildAdapterPosition(childAt) < this.skipRows || (childAt instanceof GraySectionCell) || (childAt2 instanceof GraySectionCell)) {
                    canvas2 = canvas;
                } else {
                    float bottom = childAt.getBottom();
                    canvas2 = canvas;
                    canvas2.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(72.0f), bottom, width - (LocaleController.isRTL ? AndroidUtilities.dp(72.0f) : 0), bottom, Theme.dividerPaint);
                }
                i++;
                canvas = canvas2;
            }
        }

        @Override
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            super.getItemOffsets(rect, view, recyclerView, state);
            rect.top = 1;
        }
    }

    class SpansContainer extends ViewGroup {
        private View addingSpan;
        private boolean animationStarted;
        private ArrayList animators;
        private AnimatorSet currentAnimation;
        private View removingSpan;

        public SpansContainer(Context context) {
            super(context);
            this.animators = new ArrayList();
        }

        @Override
        protected void onMeasure(int i, int i2) {
            Property property;
            Property property2;
            int iMin;
            int childCount = getChildCount();
            int size = View.MeasureSpec.getSize(i);
            int iDp = size - AndroidUtilities.dp(26.0f);
            int iDp2 = AndroidUtilities.dp(10.0f);
            int iDp3 = AndroidUtilities.dp(10.0f);
            int i3 = 0;
            int measuredWidth = 0;
            int measuredWidth2 = 0;
            while (true) {
                property = View.TRANSLATION_Y;
                property2 = View.TRANSLATION_X;
                if (i3 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i3);
                if (childAt instanceof GroupCreateSpan) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                    if (childAt != this.removingSpan && childAt.getMeasuredWidth() + measuredWidth > iDp) {
                        iDp2 += childAt.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                        measuredWidth = 0;
                    }
                    if (childAt.getMeasuredWidth() + measuredWidth2 > iDp) {
                        iDp3 += childAt.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                        measuredWidth2 = 0;
                    }
                    int iDp4 = AndroidUtilities.dp(13.0f) + measuredWidth;
                    if (!this.animationStarted) {
                        View view = this.removingSpan;
                        if (childAt == view) {
                            childAt.setTranslationX(AndroidUtilities.dp(13.0f) + measuredWidth2);
                            childAt.setTranslationY(iDp3);
                        } else if (view != null) {
                            float f = iDp4;
                            if (childAt.getTranslationX() != f) {
                                this.animators.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property2, f));
                            }
                            float f2 = iDp2;
                            if (childAt.getTranslationY() != f2) {
                                this.animators.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property, f2));
                            }
                        } else {
                            childAt.setTranslationX(iDp4);
                            childAt.setTranslationY(iDp2);
                        }
                    }
                    if (childAt != this.removingSpan) {
                        measuredWidth += childAt.getMeasuredWidth() + AndroidUtilities.dp(9.0f);
                    }
                    measuredWidth2 += childAt.getMeasuredWidth() + AndroidUtilities.dp(9.0f);
                }
                i3++;
            }
            if (AndroidUtilities.isTablet()) {
                iMin = AndroidUtilities.dp(372.0f) / 3;
            } else {
                Point point = AndroidUtilities.displaySize;
                iMin = (Math.min(point.x, point.y) - AndroidUtilities.dp(158.0f)) / 3;
            }
            if (iDp - measuredWidth < iMin) {
                iDp2 += AndroidUtilities.dp(40.0f);
                measuredWidth = 0;
            }
            if (iDp - measuredWidth2 < iMin) {
                iDp3 += AndroidUtilities.dp(40.0f);
            }
            UsersSelectActivity.this.editText.measure(View.MeasureSpec.makeMeasureSpec(iDp - measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
            if (!this.animationStarted) {
                int iDp5 = iDp3 + AndroidUtilities.dp(42.0f);
                int iDp6 = measuredWidth + AndroidUtilities.dp(16.0f);
                UsersSelectActivity.this.fieldY = iDp2;
                if (this.currentAnimation == null) {
                    UsersSelectActivity.this.containerHeight = iDp5;
                    UsersSelectActivity.this.editText.setTranslationX(iDp6);
                    UsersSelectActivity.this.editText.setTranslationY(UsersSelectActivity.this.fieldY);
                } else {
                    int iDp7 = iDp2 + AndroidUtilities.dp(42.0f);
                    if (UsersSelectActivity.this.containerHeight != iDp7) {
                        this.animators.add(ObjectAnimator.ofInt(UsersSelectActivity.this, "containerHeight", iDp7));
                    }
                    float f3 = iDp6;
                    if (UsersSelectActivity.this.editText.getTranslationX() != f3) {
                        this.animators.add(ObjectAnimator.ofFloat(UsersSelectActivity.this.editText, (Property<EditTextBoldCursor, Float>) property2, f3));
                    }
                    if (UsersSelectActivity.this.editText.getTranslationY() != UsersSelectActivity.this.fieldY) {
                        this.animators.add(ObjectAnimator.ofFloat(UsersSelectActivity.this.editText, (Property<EditTextBoldCursor, Float>) property, UsersSelectActivity.this.fieldY));
                    }
                    UsersSelectActivity.this.editText.setAllowDrawCursor(false);
                    this.currentAnimation.playTogether(this.animators);
                    this.currentAnimation.start();
                    this.animationStarted = true;
                }
            } else if (this.currentAnimation != null && !UsersSelectActivity.this.ignoreScrollEvent && this.removingSpan == null) {
                UsersSelectActivity.this.editText.bringPointIntoView(UsersSelectActivity.this.editText.getSelectionStart());
            }
            setMeasuredDimension(size, UsersSelectActivity.this.containerHeight);
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            }
        }

        public void addSpan(GroupCreateSpan groupCreateSpan, boolean z) {
            UsersSelectActivity.this.allSpans.add(groupCreateSpan);
            long uid = groupCreateSpan.getUid();
            if (uid > -9223372036854775801L) {
                UsersSelectActivity.access$508(UsersSelectActivity.this);
            }
            UsersSelectActivity.this.selectedContacts.put(uid, groupCreateSpan);
            UsersSelectActivity.this.editText.setHintVisible(false, TextUtils.isEmpty(UsersSelectActivity.this.editText.getText()));
            AnimatorSet animatorSet = this.currentAnimation;
            if (animatorSet != null && animatorSet.isRunning()) {
                this.currentAnimation.setupEndValues();
                this.currentAnimation.cancel();
            }
            this.animationStarted = false;
            if (z) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.currentAnimation = animatorSet2;
                animatorSet2.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        SpansContainer.this.addingSpan = null;
                        SpansContainer.this.currentAnimation = null;
                        SpansContainer.this.animationStarted = false;
                        UsersSelectActivity.this.editText.setAllowDrawCursor(true);
                    }
                });
                this.currentAnimation.setDuration(150L);
                this.addingSpan = groupCreateSpan;
                this.animators.clear();
                this.animators.add(ObjectAnimator.ofFloat(this.addingSpan, (Property<View, Float>) View.SCALE_X, 0.01f, 1.0f));
                this.animators.add(ObjectAnimator.ofFloat(this.addingSpan, (Property<View, Float>) View.SCALE_Y, 0.01f, 1.0f));
                this.animators.add(ObjectAnimator.ofFloat(this.addingSpan, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f));
            }
            addView(groupCreateSpan);
        }

        public void removeSpan(final GroupCreateSpan groupCreateSpan) {
            UsersSelectActivity.this.ignoreScrollEvent = true;
            long uid = groupCreateSpan.getUid();
            if (uid > -9223372036854775801L) {
                UsersSelectActivity.access$510(UsersSelectActivity.this);
            }
            UsersSelectActivity.this.selectedContacts.remove(uid);
            UsersSelectActivity.this.allSpans.remove(groupCreateSpan);
            groupCreateSpan.setOnClickListener(null);
            AnimatorSet animatorSet = this.currentAnimation;
            if (animatorSet != null) {
                animatorSet.setupEndValues();
                this.currentAnimation.cancel();
            }
            this.animationStarted = false;
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.currentAnimation = animatorSet2;
            animatorSet2.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    SpansContainer.this.removeView(groupCreateSpan);
                    SpansContainer.this.removingSpan = null;
                    SpansContainer.this.currentAnimation = null;
                    SpansContainer.this.animationStarted = false;
                    UsersSelectActivity.this.editText.setAllowDrawCursor(true);
                    if (UsersSelectActivity.this.allSpans.isEmpty()) {
                        UsersSelectActivity.this.editText.setHintVisible(true, true);
                    }
                }
            });
            this.currentAnimation.setDuration(150L);
            this.removingSpan = groupCreateSpan;
            this.animators.clear();
            this.animators.add(ObjectAnimator.ofFloat(this.removingSpan, (Property<View, Float>) View.SCALE_X, 1.0f, 0.01f));
            this.animators.add(ObjectAnimator.ofFloat(this.removingSpan, (Property<View, Float>) View.SCALE_Y, 1.0f, 0.01f));
            this.animators.add(ObjectAnimator.ofFloat(this.removingSpan, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f));
            requestLayout();
        }
    }

    public UsersSelectActivity(boolean z, ArrayList arrayList, int i) {
        this.selectedContacts = new LongSparseArray();
        this.allSpans = new ArrayList();
        this.isInclude = z;
        this.filterFlags = i;
        this.initialIds = arrayList;
        this.type = 0;
        this.allowSelf = true;
    }

    public UsersSelectActivity asPrivateChats() {
        this.type = 2;
        this.allowSelf = false;
        return this;
    }

    public UsersSelectActivity(int i) {
        this.selectedContacts = new LongSparseArray();
        this.allSpans = new ArrayList();
        this.type = i;
        this.allowSelf = i != 1;
    }

    @Override
    public boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidCreated);
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
    }

    @Override
    public void onClick(View view) {
        GroupCreateSpan groupCreateSpan = (GroupCreateSpan) view;
        if (groupCreateSpan.isDeleting()) {
            this.currentDeletingSpan = null;
            this.spansContainer.removeSpan(groupCreateSpan);
            if (this.type == 2) {
                if (groupCreateSpan.getUid() == -9223372036854775800L) {
                    this.filterFlags &= -2;
                } else if (groupCreateSpan.getUid() == -9223372036854775799L) {
                    this.filterFlags &= -3;
                } else if (groupCreateSpan.getUid() == Long.MIN_VALUE) {
                    this.filterFlags &= -5;
                } else if (groupCreateSpan.getUid() == -9223372036854775807L) {
                    this.filterFlags &= -9;
                }
            } else if (groupCreateSpan.getUid() == Long.MIN_VALUE) {
                this.filterFlags &= ~MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
            } else if (groupCreateSpan.getUid() == -9223372036854775807L) {
                this.filterFlags &= ~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
            } else if (groupCreateSpan.getUid() == -9223372036854775806L) {
                this.filterFlags &= ~MessagesController.DIALOG_FILTER_FLAG_GROUPS;
            } else if (groupCreateSpan.getUid() == -9223372036854775805L) {
                this.filterFlags &= ~MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
            } else if (groupCreateSpan.getUid() == -9223372036854775804L) {
                this.filterFlags &= ~MessagesController.DIALOG_FILTER_FLAG_BOTS;
            } else if (groupCreateSpan.getUid() == -9223372036854775803L) {
                this.filterFlags &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
            } else if (groupCreateSpan.getUid() == -9223372036854775802L) {
                this.filterFlags &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
            } else if (groupCreateSpan.getUid() == -9223372036854775801L) {
                this.filterFlags &= ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
            }
            updateHint();
            checkVisibleRows();
            return;
        }
        GroupCreateSpan groupCreateSpan2 = this.currentDeletingSpan;
        if (groupCreateSpan2 != null) {
            groupCreateSpan2.cancelDeleteAnimation();
        }
        this.currentDeletingSpan = groupCreateSpan;
        groupCreateSpan.startDeleteAnimation();
    }

    @Override
    public View createView(final Context context) {
        int i;
        Object chat;
        this.searching = false;
        this.searchWas = false;
        this.allSpans.clear();
        this.selectedContacts.clear();
        this.currentDeletingSpan = null;
        int i2 = 1;
        if (this.type == 1) {
            AnimatedAvatarContainer animatedAvatarContainer = new AnimatedAvatarContainer(getContext());
            this.animatedAvatarContainer = animatedAvatarContainer;
            ActionBar actionBar = this.actionBar;
            boolean z = LocaleController.isRTL;
            actionBar.addView(animatedAvatarContainer, LayoutHelper.createFrame(-1, -1.0f, 0, z ? 0.0f : 64.0f, 0.0f, z ? 64.0f : 0.0f, 0.0f));
            this.actionBar.setAllowOverlayTitle(false);
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i3 = this.type;
        if (i3 == 0 || i3 == 2) {
            if (this.isInclude) {
                this.actionBar.setTitle(LocaleController.getString(R.string.FilterAlwaysShow));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.FilterNeverShow));
            }
        } else if (i3 == 1) {
            updateHint();
        }
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i4) {
                if (i4 == -1) {
                    UsersSelectActivity.this.finishFragment();
                } else if (i4 == 1) {
                    UsersSelectActivity.this.onDonePressed(true);
                }
            }
        });
        ViewGroup viewGroup = new ViewGroup(context) {
            @Override
            protected void onMeasure(int i4, int i5) {
                int iDp;
                int size = View.MeasureSpec.getSize(i4);
                int size2 = View.MeasureSpec.getSize(i5);
                setMeasuredDimension(size, size2);
                if (AndroidUtilities.isTablet() || size2 > size) {
                    iDp = AndroidUtilities.dp(144.0f);
                } else {
                    iDp = AndroidUtilities.dp(56.0f);
                }
                UsersSelectActivity.this.scrollView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(iDp, Integer.MIN_VALUE));
                UsersSelectActivity.this.listView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - UsersSelectActivity.this.scrollView.getMeasuredHeight(), 1073741824));
                UsersSelectActivity.this.emptyView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - UsersSelectActivity.this.scrollView.getMeasuredHeight(), 1073741824));
                UsersSelectActivity.this.progressView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - UsersSelectActivity.this.scrollView.getMeasuredHeight(), 1073741824));
                if (UsersSelectActivity.this.floatingButton != null) {
                    int i6 = UsersSelectActivity.this.floatingButtonLp.width;
                    UsersSelectActivity.this.floatingButton.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
                }
            }

            @Override
            protected void onLayout(boolean z2, int i4, int i5, int i6, int i7) {
                UsersSelectActivity.this.scrollView.layout(0, 0, UsersSelectActivity.this.scrollView.getMeasuredWidth(), UsersSelectActivity.this.scrollView.getMeasuredHeight());
                UsersSelectActivity.this.listView.layout(0, UsersSelectActivity.this.scrollView.getMeasuredHeight(), UsersSelectActivity.this.listView.getMeasuredWidth(), UsersSelectActivity.this.scrollView.getMeasuredHeight() + UsersSelectActivity.this.listView.getMeasuredHeight());
                UsersSelectActivity.this.emptyView.layout(0, UsersSelectActivity.this.scrollView.getMeasuredHeight(), UsersSelectActivity.this.emptyView.getMeasuredWidth(), UsersSelectActivity.this.scrollView.getMeasuredHeight() + UsersSelectActivity.this.emptyView.getMeasuredHeight());
                UsersSelectActivity.this.progressView.layout(0, UsersSelectActivity.this.scrollView.getMeasuredHeight(), UsersSelectActivity.this.emptyView.getMeasuredWidth(), UsersSelectActivity.this.scrollView.getMeasuredHeight() + UsersSelectActivity.this.progressView.getMeasuredHeight());
                if (UsersSelectActivity.this.floatingButton != null) {
                    int measuredWidth = LocaleController.isRTL ? UsersSelectActivity.this.floatingButtonLp.leftMargin : ((i6 - i4) - UsersSelectActivity.this.floatingButtonLp.rightMargin) - UsersSelectActivity.this.floatingButton.getMeasuredWidth();
                    int measuredHeight = ((i7 - i5) - UsersSelectActivity.this.floatingButtonLp.bottomMargin) - UsersSelectActivity.this.floatingButton.getMeasuredHeight();
                    UsersSelectActivity.this.floatingButton.layout(measuredWidth, measuredHeight, UsersSelectActivity.this.floatingButton.getMeasuredWidth() + measuredWidth, UsersSelectActivity.this.floatingButton.getMeasuredHeight() + measuredHeight);
                }
            }

            @Override
            protected boolean drawChild(Canvas canvas, View view, long j) {
                boolean zDrawChild = super.drawChild(canvas, view, j);
                if (view != UsersSelectActivity.this.listView && view != UsersSelectActivity.this.emptyView) {
                    return zDrawChild;
                }
                ((BaseFragment) UsersSelectActivity.this).parentLayout.drawHeaderShadow(canvas, UsersSelectActivity.this.scrollView.getMeasuredHeight());
                return zDrawChild;
            }
        };
        this.fragmentView = viewGroup;
        ScrollView scrollView = new ScrollView(context) {
            @Override
            public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
                if (UsersSelectActivity.this.ignoreScrollEvent) {
                    UsersSelectActivity.this.ignoreScrollEvent = false;
                    return false;
                }
                rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                rect.top += UsersSelectActivity.this.fieldY + AndroidUtilities.dp(20.0f);
                rect.bottom += UsersSelectActivity.this.fieldY + AndroidUtilities.dp(50.0f);
                return super.requestChildRectangleOnScreen(view, rect, z2);
            }
        };
        this.scrollView = scrollView;
        scrollView.setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.scrollView, Theme.getColor(Theme.key_windowBackgroundWhite));
        viewGroup.addView(this.scrollView);
        SpansContainer spansContainer = new SpansContainer(context);
        this.spansContainer = spansContainer;
        this.scrollView.addView(spansContainer, LayoutHelper.createFrame(-1, -2.0f));
        this.spansContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                UsersSelectActivity.m4771$r8$lambda$LJ_HOsErIXcytip20leT2xNkc0(this.f$0, view);
            }
        });
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context) {
            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (UsersSelectActivity.this.currentDeletingSpan != null) {
                    UsersSelectActivity.this.currentDeletingSpan.cancelDeleteAnimation();
                    UsersSelectActivity.this.currentDeletingSpan = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            }
        };
        this.editText = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        this.editText.setHintColor(Theme.getColor(Theme.key_groupcreate_hintText));
        this.editText.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
        this.editText.setCursorColor(Theme.getColor(Theme.key_groupcreate_cursor));
        this.editText.setCursorWidth(1.5f);
        EditTextBoldCursor editTextBoldCursor2 = this.editText;
        editTextBoldCursor2.setInputType(editTextBoldCursor2.getInputType() | 176);
        this.editText.setSingleLine(true);
        this.editText.setBackgroundDrawable(null);
        this.editText.setVerticalScrollBarEnabled(false);
        this.editText.setHorizontalScrollBarEnabled(false);
        this.editText.setTextIsSelectable(false);
        this.editText.setPadding(0, 0, 0, 0);
        this.editText.setImeOptions(268435462);
        int i4 = 5;
        this.editText.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        this.spansContainer.addView(this.editText);
        this.editText.setHintText(LocaleController.getString(R.string.SearchForPeopleAndGroups));
        this.editText.setCustomSelectionActionModeCallback(new ActionMode.Callback() {
            @Override
            public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                return false;
            }

            @Override
            public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                return false;
            }

            @Override
            public void onDestroyActionMode(ActionMode actionMode) {
            }

            @Override
            public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                return false;
            }
        });
        this.editText.setOnKeyListener(new View.OnKeyListener() {
            private boolean wasEmpty;

            @Override
            public boolean onKey(View view, int i5, KeyEvent keyEvent) {
                if (i5 == 67) {
                    if (keyEvent.getAction() == 0) {
                        this.wasEmpty = UsersSelectActivity.this.editText.length() == 0;
                    } else if (keyEvent.getAction() == 1 && this.wasEmpty && !UsersSelectActivity.this.allSpans.isEmpty()) {
                        GroupCreateSpan groupCreateSpan = (GroupCreateSpan) UsersSelectActivity.this.allSpans.get(UsersSelectActivity.this.allSpans.size() - 1);
                        UsersSelectActivity.this.spansContainer.removeSpan(groupCreateSpan);
                        if (UsersSelectActivity.this.type == 2) {
                            if (groupCreateSpan.getUid() == -9223372036854775800L) {
                                UsersSelectActivity.access$2272(UsersSelectActivity.this, -2);
                            } else if (groupCreateSpan.getUid() == -9223372036854775799L) {
                                UsersSelectActivity.access$2272(UsersSelectActivity.this, -3);
                            } else if (groupCreateSpan.getUid() == Long.MIN_VALUE) {
                                UsersSelectActivity.access$2272(UsersSelectActivity.this, -5);
                            } else if (groupCreateSpan.getUid() == -9223372036854775807L) {
                                UsersSelectActivity.access$2272(UsersSelectActivity.this, -9);
                            }
                        } else if (groupCreateSpan.getUid() == Long.MIN_VALUE) {
                            UsersSelectActivity.access$2272(UsersSelectActivity.this, ~MessagesController.DIALOG_FILTER_FLAG_CONTACTS);
                        } else if (groupCreateSpan.getUid() == -9223372036854775807L) {
                            UsersSelectActivity.access$2272(UsersSelectActivity.this, ~MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS);
                        } else if (groupCreateSpan.getUid() == -9223372036854775806L) {
                            UsersSelectActivity.access$2272(UsersSelectActivity.this, ~MessagesController.DIALOG_FILTER_FLAG_GROUPS);
                        } else if (groupCreateSpan.getUid() == -9223372036854775805L) {
                            UsersSelectActivity.access$2272(UsersSelectActivity.this, ~MessagesController.DIALOG_FILTER_FLAG_CHANNELS);
                        } else if (groupCreateSpan.getUid() == -9223372036854775804L) {
                            UsersSelectActivity.access$2272(UsersSelectActivity.this, ~MessagesController.DIALOG_FILTER_FLAG_BOTS);
                        } else if (groupCreateSpan.getUid() == -9223372036854775803L) {
                            UsersSelectActivity.access$2272(UsersSelectActivity.this, ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED);
                        } else if (groupCreateSpan.getUid() == -9223372036854775802L) {
                            UsersSelectActivity.access$2272(UsersSelectActivity.this, ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ);
                        } else if (groupCreateSpan.getUid() == -9223372036854775801L) {
                            UsersSelectActivity.access$2272(UsersSelectActivity.this, ~MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED);
                        }
                        UsersSelectActivity.this.updateHint();
                        UsersSelectActivity.this.checkVisibleRows();
                        return true;
                    }
                }
                return false;
            }
        });
        this.editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (UsersSelectActivity.this.editText.length() == 0) {
                    UsersSelectActivity.this.closeSearch();
                    return;
                }
                if (!UsersSelectActivity.this.adapter.searching) {
                    UsersSelectActivity.this.searching = true;
                    UsersSelectActivity.this.searchWas = true;
                    UsersSelectActivity.this.adapter.setSearching(true);
                    UsersSelectActivity.this.listView.setFastScrollVisible(false);
                    UsersSelectActivity.this.listView.setVerticalScrollBarEnabled(true);
                    UsersSelectActivity.this.emptyView.title.setText(LocaleController.getString(R.string.NoResult));
                }
                UsersSelectActivity.this.emptyView.showProgress(true);
                UsersSelectActivity.this.adapter.searchDialogs(UsersSelectActivity.this.editText.getText().toString());
            }
        });
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context);
        this.progressView = flickerLoadingView;
        flickerLoadingView.setViewType(10);
        this.progressView.showDate(false);
        this.progressView.setItemsCount(3);
        FlickerLoadingView flickerLoadingView2 = this.progressView;
        int i5 = Theme.key_actionBarDefaultSubmenuBackground;
        int i6 = Theme.key_listSelector;
        flickerLoadingView2.setColors(i5, i6, i6);
        viewGroup.addView(this.progressView);
        StickerEmptyView stickerEmptyView = new StickerEmptyView(context, this.progressView, i2) {
            @Override
            public void setVisibility(int i7) {
                super.setVisibility(i7);
                if (i7 != 0) {
                    showProgress(false, false);
                }
            }
        };
        this.emptyView = stickerEmptyView;
        stickerEmptyView.showProgress(ContactsController.getInstance(this.currentAccount).isLoadingContacts());
        this.emptyView.title.setText(LocaleController.getString(R.string.NoContacts));
        viewGroup.addView(this.emptyView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false);
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setFastScrollEnabled(0);
        this.listView.setEmptyView(this.emptyView);
        RecyclerListView recyclerListView2 = this.listView;
        GroupCreateAdapter groupCreateAdapter = new GroupCreateAdapter(context);
        this.adapter = groupCreateAdapter;
        recyclerListView2.setAdapter(groupCreateAdapter);
        this.listView.setLayoutManager(linearLayoutManager);
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        this.listView.addItemDecoration(new ItemDecoration());
        viewGroup.addView(this.listView);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i7) {
                UsersSelectActivity.$r8$lambda$awejxiQ51snEicaKvknC2IfwWc4(this.f$0, context, view, i7);
            }
        });
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i7) {
                if (i7 == 1) {
                    AndroidUtilities.hideKeyboard(UsersSelectActivity.this.editText);
                }
            }
        });
        this.floatingButtonLp = FragmentFloatingButton.createDefaultLayoutParams();
        FragmentFloatingButton fragmentFloatingButton = new FragmentFloatingButton(context, this.resourceProvider);
        this.floatingButton = fragmentFloatingButton;
        fragmentFloatingButton.setImageResource(R.drawable.floating_check);
        viewGroup.addView(this.floatingButton, this.floatingButtonLp);
        this.floatingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.onDonePressed(true);
            }
        });
        this.floatingButton.setContentDescription(LocaleController.getString(R.string.Next));
        if (this.isInclude) {
            i = 1;
        } else {
            i = 1;
            i4 = 3;
        }
        while (i <= i4) {
            String str = "non_contacts";
            int i7 = 4;
            if (this.type == 2) {
                if (i == 1) {
                    str = "existing_chats";
                    i7 = 1;
                } else if (i == 2 && !this.doNotNewChats) {
                    str = "new_chats";
                    i7 = 2;
                } else if (i == (!this.doNotNewChats ? 1 : 0) + 2) {
                    str = "contacts";
                } else {
                    i7 = 8;
                }
            } else if (this.isInclude) {
                if (i == 1) {
                    i7 = MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
                    str = "contacts";
                } else if (i == 2) {
                    i7 = MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
                } else if (i == 3) {
                    i7 = MessagesController.DIALOG_FILTER_FLAG_GROUPS;
                    str = "groups";
                } else if (i == 4) {
                    i7 = MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
                    str = "channels";
                } else {
                    i7 = MessagesController.DIALOG_FILTER_FLAG_BOTS;
                    str = "bots";
                }
            } else if (i == 1) {
                i7 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
                str = "muted";
            } else if (i == 2) {
                i7 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
                str = "read";
            } else {
                i7 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
                str = "archived";
            }
            if ((this.filterFlags & i7) != 0) {
                GroupCreateSpan groupCreateSpan = new GroupCreateSpan(this.editText.getContext(), str);
                this.spansContainer.addSpan(groupCreateSpan, false);
                groupCreateSpan.setOnClickListener(this);
            }
            i++;
        }
        ArrayList arrayList = this.initialIds;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = this.initialIds.size();
            for (int i8 = 0; i8 < size; i8++) {
                Long l = (Long) this.initialIds.get(i8);
                if (l.longValue() > 0) {
                    chat = getMessagesController().getUser(l);
                } else {
                    chat = getMessagesController().getChat(Long.valueOf(-l.longValue()));
                }
                if (chat != null) {
                    GroupCreateSpan groupCreateSpan2 = new GroupCreateSpan(this.editText.getContext(), chat);
                    this.spansContainer.addSpan(groupCreateSpan2, false);
                    groupCreateSpan2.setOnClickListener(this);
                }
            }
        }
        updateHint();
        return this.fragmentView;
    }

    public static void m4771$r8$lambda$LJ_HOsErIXcytip20leT2xNkc0(UsersSelectActivity usersSelectActivity, View view) {
        usersSelectActivity.editText.clearFocus();
        usersSelectActivity.editText.requestFocus();
        AndroidUtilities.showKeyboard(usersSelectActivity.editText);
    }

    public static void $r8$lambda$awejxiQ51snEicaKvknC2IfwWc4(UsersSelectActivity usersSelectActivity, Context context, View view, int i) {
        long j;
        UsersSelectActivity usersSelectActivity2;
        usersSelectActivity.getClass();
        if (view instanceof GroupCreateUserCell) {
            GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) view;
            Object object = groupCreateUserCell.getObject();
            boolean z = object instanceof String;
            if (z) {
                j = -9223372036854775807L;
                int i2 = 4;
                if (usersSelectActivity.type == 2) {
                    if (i == 1) {
                        j = -9223372036854775800L;
                        i2 = 1;
                    } else if (i == 2 && !usersSelectActivity.doNotNewChats) {
                        j = -9223372036854775799L;
                        i2 = 2;
                    } else if (i == (!usersSelectActivity.doNotNewChats ? 1 : 0) + 2) {
                        j = Long.MIN_VALUE;
                    } else {
                        i2 = 8;
                    }
                } else if (usersSelectActivity.isInclude) {
                    if (i == 1) {
                        i2 = MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
                        j = Long.MIN_VALUE;
                    } else if (i == 2) {
                        i2 = MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
                    } else if (i == 3) {
                        i2 = MessagesController.DIALOG_FILTER_FLAG_GROUPS;
                        j = -9223372036854775806L;
                    } else if (i == 4) {
                        i2 = MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
                        j = -9223372036854775805L;
                    } else {
                        i2 = MessagesController.DIALOG_FILTER_FLAG_BOTS;
                        j = -9223372036854775804L;
                    }
                } else if (i == 1) {
                    i2 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
                    j = -9223372036854775803L;
                } else if (i == 2) {
                    i2 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
                    j = -9223372036854775802L;
                } else {
                    i2 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
                    j = -9223372036854775801L;
                }
                if (groupCreateUserCell.isChecked()) {
                    usersSelectActivity.filterFlags &= ~i2;
                } else {
                    usersSelectActivity.filterFlags |= i2;
                }
            } else if (object instanceof TLRPC.User) {
                j = ((TLRPC.User) object).id;
            } else {
                if (!(object instanceof TLRPC.Chat)) {
                    return;
                }
                TLRPC.Chat chat = (TLRPC.Chat) object;
                j = -chat.id;
                if (usersSelectActivity.type == 1 && !ChatObject.canUserDoAdminAction(chat, 13)) {
                    BulletinFactory.of(usersSelectActivity).createErrorBulletin(LocaleController.getString(R.string.NeedAdminRightForSetAutoDeleteTimer)).show();
                    return;
                }
            }
            boolean z2 = usersSelectActivity.selectedContacts.indexOfKey(j) >= 0;
            if (z2) {
                usersSelectActivity.spansContainer.removeSpan((GroupCreateSpan) usersSelectActivity.selectedContacts.get(j));
                usersSelectActivity2 = usersSelectActivity;
            } else {
                if ((!z && !usersSelectActivity.getUserConfig().isPremium() && usersSelectActivity.selectedCount >= MessagesController.getInstance(usersSelectActivity.currentAccount).dialogFiltersChatsLimitDefault) || usersSelectActivity.selectedCount >= MessagesController.getInstance(usersSelectActivity.currentAccount).dialogFiltersChatsLimitPremium) {
                    LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(usersSelectActivity, context, 4, usersSelectActivity.currentAccount, null);
                    limitReachedBottomSheet.setCurrentValue(usersSelectActivity.selectedCount);
                    usersSelectActivity.showDialog(limitReachedBottomSheet);
                    return;
                }
                usersSelectActivity2 = usersSelectActivity;
                if (object instanceof TLRPC.User) {
                    MessagesController.getInstance(usersSelectActivity2.currentAccount).putUser((TLRPC.User) object, !usersSelectActivity2.searching);
                } else if (object instanceof TLRPC.Chat) {
                    MessagesController.getInstance(usersSelectActivity2.currentAccount).putChat((TLRPC.Chat) object, !usersSelectActivity2.searching);
                }
                GroupCreateSpan groupCreateSpan = new GroupCreateSpan(usersSelectActivity2.editText.getContext(), object);
                usersSelectActivity2.spansContainer.addSpan(groupCreateSpan, true);
                groupCreateSpan.setOnClickListener(usersSelectActivity2);
            }
            usersSelectActivity2.updateHint();
            if (usersSelectActivity2.searching || usersSelectActivity2.searchWas) {
                AndroidUtilities.showKeyboard(usersSelectActivity2.editText);
            } else {
                groupCreateUserCell.setChecked(!z2, true);
            }
            if (usersSelectActivity2.editText.length() > 0) {
                usersSelectActivity2.editText.setText((CharSequence) null);
            }
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        EditTextBoldCursor editTextBoldCursor = this.editText;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.requestFocus();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.contactsDidLoad) {
            StickerEmptyView stickerEmptyView = this.emptyView;
            if (stickerEmptyView != null) {
                stickerEmptyView.showProgress(false);
            }
            GroupCreateAdapter groupCreateAdapter = this.adapter;
            if (groupCreateAdapter != null) {
                groupCreateAdapter.notifyDataSetChanged();
                return;
            }
            return;
        }
        if (i == NotificationCenter.updateInterfaces) {
            if (this.listView != null) {
                int iIntValue = ((Integer) objArr[0]).intValue();
                int childCount = this.listView.getChildCount();
                if ((MessagesController.UPDATE_MASK_AVATAR & iIntValue) == 0 && (MessagesController.UPDATE_MASK_NAME & iIntValue) == 0 && (MessagesController.UPDATE_MASK_STATUS & iIntValue) == 0) {
                    return;
                }
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = this.listView.getChildAt(i3);
                    if (childAt instanceof GroupCreateUserCell) {
                        ((GroupCreateUserCell) childAt).update(iIntValue);
                    }
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.chatDidCreated) {
            removeSelfFromStack();
        }
    }

    public void checkVisibleRows() {
        long j;
        int childCount = this.listView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.listView.getChildAt(i);
            if (childAt instanceof GroupCreateUserCell) {
                GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) childAt;
                Object object = groupCreateUserCell.getObject();
                if (object instanceof String) {
                    switch ((String) object) {
                        case "contacts":
                            j = Long.MIN_VALUE;
                            break;
                        case "non_contacts":
                            j = -9223372036854775807L;
                            break;
                        case "groups":
                            j = -9223372036854775806L;
                            break;
                        case "channels":
                            j = -9223372036854775805L;
                            break;
                        case "bots":
                            j = -9223372036854775804L;
                            break;
                        case "muted":
                            j = -9223372036854775803L;
                            break;
                        case "read":
                            j = -9223372036854775802L;
                            break;
                        case "existing_chats":
                        case "new_chats":
                            j = -9223372036854775800L;
                            break;
                        case "archived":
                        default:
                            j = -9223372036854775801L;
                            break;
                    }
                } else if (object instanceof TLRPC.User) {
                    j = ((TLRPC.User) object).id;
                } else {
                    j = object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : 0L;
                }
                if (j != 0) {
                    groupCreateUserCell.setChecked(this.selectedContacts.indexOfKey(j) >= 0, true);
                    groupCreateUserCell.setCheckBoxEnabled(true);
                }
            }
        }
    }

    public boolean onDonePressed(boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.selectedContacts.size(); i++) {
            if (this.selectedContacts.keyAt(i) > -9223372036854775799L) {
                arrayList.add(Long.valueOf(this.selectedContacts.keyAt(i)));
            }
        }
        FilterUsersActivityDelegate filterUsersActivityDelegate = this.delegate;
        if (filterUsersActivityDelegate != null) {
            filterUsersActivityDelegate.didSelectChats(arrayList, this.filterFlags);
        }
        finishFragment();
        return true;
    }

    public void closeSearch() {
        this.searching = false;
        this.searchWas = false;
        this.adapter.setSearching(false);
        this.adapter.searchDialogs(null);
        this.listView.setFastScrollVisible(true);
        this.listView.setVerticalScrollBarEnabled(false);
        this.emptyView.title.setText(LocaleController.getString(R.string.NoContacts));
    }

    public void updateHint() {
        int i = this.type;
        if (i == 0) {
            int i2 = getUserConfig().isPremium() ? getMessagesController().dialogFiltersChatsLimitPremium : getMessagesController().dialogFiltersChatsLimitDefault;
            int i3 = this.selectedCount;
            if (i3 == 0) {
                this.actionBar.setSubtitle(LocaleController.formatString("MembersCountZero", R.string.MembersCountZero, LocaleController.formatPluralString("Chats", i2, new Object[0])));
                return;
            } else {
                this.actionBar.setSubtitle(String.format(LocaleController.getPluralString("MembersCountSelected", i3), Integer.valueOf(this.selectedCount), Integer.valueOf(i2)));
                return;
            }
        }
        if (i == 1) {
            this.actionBar.setTitle("");
            this.actionBar.setSubtitle("");
            if (this.selectedCount == 0) {
                this.animatedAvatarContainer.getTitle().setText(LocaleController.getString(R.string.SelectChats), true);
                if (this.ttlPeriod > 0) {
                    this.animatedAvatarContainer.getSubtitleTextView().setText(LocaleController.getString(R.string.SelectChatsForAutoDelete), true);
                    return;
                } else {
                    this.animatedAvatarContainer.getSubtitleTextView().setText(LocaleController.getString(R.string.SelectChatsForDisableAutoDelete), true);
                    return;
                }
            }
            AnimatedTextView title = this.animatedAvatarContainer.getTitle();
            int i4 = this.selectedCount;
            title.setText(LocaleController.formatPluralString("Chats", i4, Integer.valueOf(i4)));
            if (this.ttlPeriod > 0) {
                this.animatedAvatarContainer.getSubtitleTextView().setText(LocaleController.getString(R.string.SelectChatsForAutoDelete2));
            } else {
                this.animatedAvatarContainer.getSubtitleTextView().setText(LocaleController.getString(R.string.SelectChatsForDisableAutoDelete2));
            }
        }
    }

    public void setDelegate(FilterUsersActivityDelegate filterUsersActivityDelegate) {
        this.delegate = filterUsersActivityDelegate;
    }

    public class GroupCreateAdapter extends RecyclerListView.FastScrollAdapter {
        private Context context;
        private SearchAdapterHelper searchAdapterHelper;
        private Runnable searchRunnable;
        private boolean searching;
        private final int usersStartRow;
        private ArrayList searchResult = new ArrayList();
        private ArrayList searchResultNames = new ArrayList();
        private ArrayList contacts = new ArrayList();

        @Override
        public String getLetter(int i) {
            return null;
        }

        public GroupCreateAdapter(Context context) {
            this.context = context;
            if (!UsersSelectActivity.this.noChatTypes) {
                if (UsersSelectActivity.this.type == 2) {
                    this.usersStartRow = (!UsersSelectActivity.this.doNotNewChats ? 1 : 0) + 5;
                } else if (UsersSelectActivity.this.type == 0) {
                    if (UsersSelectActivity.this.isInclude) {
                        this.usersStartRow = 7;
                    } else {
                        this.usersStartRow = 5;
                    }
                } else {
                    this.usersStartRow = 0;
                }
            } else {
                this.usersStartRow = 0;
            }
            boolean z = UsersSelectActivity.this.type != 2;
            boolean z2 = UsersSelectActivity.this.type != 2;
            ArrayList<TLRPC.Dialog> allDialogs = UsersSelectActivity.this.getMessagesController().getAllDialogs();
            int size = allDialogs.size();
            boolean z3 = false;
            for (int i = 0; i < size; i++) {
                TLRPC.Dialog dialog = allDialogs.get(i);
                if (!DialogObject.isEncryptedDialog(dialog.id)) {
                    if (DialogObject.isUserDialog(dialog.id)) {
                        TLRPC.User user = UsersSelectActivity.this.getMessagesController().getUser(Long.valueOf(dialog.id));
                        if (user != null && ((UsersSelectActivity.this.allowSelf || !UserObject.isUserSelf(user)) && (!user.bot || z))) {
                            this.contacts.add(user);
                            if (UserObject.isUserSelf(user)) {
                                z3 = true;
                            }
                        }
                    } else {
                        TLRPC.Chat chat = UsersSelectActivity.this.getMessagesController().getChat(Long.valueOf(-dialog.id));
                        if (z2 && chat != null) {
                            this.contacts.add(chat);
                        }
                    }
                }
            }
            if (!z3 && UsersSelectActivity.this.allowSelf) {
                this.contacts.add(0, UsersSelectActivity.this.getMessagesController().getUser(Long.valueOf(UsersSelectActivity.this.getUserConfig().clientUserId)));
            }
            SearchAdapterHelper searchAdapterHelper = new SearchAdapterHelper(false);
            this.searchAdapterHelper = searchAdapterHelper;
            searchAdapterHelper.setAllowGlobalResults(false);
            this.searchAdapterHelper.setDelegate(new SearchAdapterHelper.SearchAdapterHelperDelegate() {
                @Override
                public boolean canApplySearchResults(int i2) {
                    return SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$canApplySearchResults(this, i2);
                }

                @Override
                public LongSparseArray getExcludeCallParticipants() {
                    return SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$getExcludeCallParticipants(this);
                }

                @Override
                public LongSparseArray getExcludeUsers() {
                    return SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$getExcludeUsers(this);
                }

                @Override
                public final void onDataSetChanged(int i2) {
                    UsersSelectActivity.GroupCreateAdapter.$r8$lambda$O1C0HeATKF8GYBBhURl04ygWRmo(this.f$0, i2);
                }

                @Override
                public void onSetHashtags(ArrayList arrayList, HashMap map) {
                    SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$onSetHashtags(this, arrayList, map);
                }
            });
        }

        public static void $r8$lambda$O1C0HeATKF8GYBBhURl04ygWRmo(GroupCreateAdapter groupCreateAdapter, int i) {
            if (groupCreateAdapter.searchRunnable == null && !groupCreateAdapter.searchAdapterHelper.isSearchInProgress()) {
                UsersSelectActivity.this.emptyView.showProgress(false);
            }
            groupCreateAdapter.notifyDataSetChanged();
        }

        public void setSearching(boolean z) {
            if (this.searching == z) {
                return;
            }
            this.searching = z;
            notifyDataSetChanged();
        }

        @Override
        public int getItemCount() {
            int size;
            int size2;
            if (this.searching) {
                size = this.searchResult.size();
                size2 = this.searchAdapterHelper.getLocalServerSearch().size() + this.searchAdapterHelper.getGlobalSearch().size();
            } else {
                UsersSelectActivity usersSelectActivity = UsersSelectActivity.this;
                if (usersSelectActivity.noChatTypes) {
                    size = 0;
                } else if (usersSelectActivity.type == 2) {
                    size = (!UsersSelectActivity.this.doNotNewChats ? 1 : 0) + 3;
                } else if (UsersSelectActivity.this.type == 0) {
                    size = UsersSelectActivity.this.isInclude ? 7 : 5;
                } else {
                    size = 0;
                }
                size2 = this.contacts.size();
            }
            return size + size2;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View groupCreateUserCell;
            if (i == 1) {
                groupCreateUserCell = new GroupCreateUserCell(this.context, 1, 0, true);
            } else {
                groupCreateUserCell = new GraySectionCell(this.context);
            }
            return new RecyclerListView.Holder(groupCreateUserCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            Object obj;
            String string;
            CharSequence charSequence;
            long j;
            long j2;
            boolean z;
            ?? r7;
            boolean zCanUserDoAdminAction;
            int i2;
            boolean z2;
            ?? r8;
            int i3;
            SpannableStringBuilder spannableStringBuilder;
            Paint.FontMetricsInt fontMetricsInt;
            ArrayList<MessagesController.DialogFilter> arrayList;
            int size;
            int i4;
            MessagesController.DialogFilter dialogFilter;
            String publicUsername;
            int itemViewType = viewHolder.getItemViewType();
            int i5 = 2;
            if (itemViewType != 1) {
                if (itemViewType != 2) {
                    return;
                }
                GraySectionCell graySectionCell = (GraySectionCell) viewHolder.itemView;
                if (i == 0 && !UsersSelectActivity.this.noChatTypes) {
                    graySectionCell.setText(LocaleController.getString(R.string.FilterChatTypes));
                    return;
                } else {
                    graySectionCell.setText(LocaleController.getString(R.string.FilterChats));
                    return;
                }
            }
            ?? r1 = (GroupCreateUserCell) viewHolder.itemView;
            ?? spannableStringBuilder2 = 0;
            spannableStringBuilder2 = 0;
            spannableStringBuilder2 = 0;
            spannableStringBuilder2 = 0;
            if (this.searching) {
                int size2 = this.searchResult.size();
                int size3 = this.searchAdapterHelper.getGlobalSearch().size();
                int size4 = this.searchAdapterHelper.getLocalServerSearch().size();
                if (i >= 0 && i < size2) {
                    obj = this.searchResult.get(i);
                } else if (i >= size2 && i < size4 + size2) {
                    obj = this.searchAdapterHelper.getLocalServerSearch().get(i - size2);
                } else {
                    obj = (i <= size2 + size4 || i >= (size3 + size2) + size4) ? null : this.searchAdapterHelper.getGlobalSearch().get((i - size2) - size4);
                }
                if (obj != null) {
                    if (obj instanceof TLRPC.User) {
                        publicUsername = ((TLRPC.User) obj).username;
                    } else {
                        publicUsername = ChatObject.getPublicUsername((TLRPC.Chat) obj);
                    }
                    if (i < size2) {
                        charSequence = (CharSequence) this.searchResultNames.get(i);
                        if (charSequence != null && !TextUtils.isEmpty(publicUsername)) {
                            if (charSequence.toString().startsWith("@" + publicUsername)) {
                                spannableStringBuilder2 = charSequence;
                                charSequence = null;
                            }
                        }
                    } else if (i > size2 && !TextUtils.isEmpty(publicUsername)) {
                        String lastFoundUsername = this.searchAdapterHelper.getLastFoundUsername();
                        if (lastFoundUsername.startsWith("@")) {
                            lastFoundUsername = lastFoundUsername.substring(1);
                        }
                        try {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                            spannableStringBuilder3.append((CharSequence) "@");
                            spannableStringBuilder3.append((CharSequence) publicUsername);
                            int iIndexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(publicUsername, lastFoundUsername);
                            if (iIndexOfIgnoreCase != -1) {
                                int length = lastFoundUsername.length();
                                if (iIndexOfIgnoreCase == 0) {
                                    length++;
                                } else {
                                    iIndexOfIgnoreCase++;
                                }
                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4)), iIndexOfIgnoreCase, length + iIndexOfIgnoreCase, 33);
                            }
                            charSequence = null;
                            spannableStringBuilder2 = spannableStringBuilder3;
                        } catch (Exception unused) {
                            charSequence = null;
                            spannableStringBuilder2 = publicUsername;
                        }
                    }
                }
                if (obj instanceof TLRPC.User) {
                    j = ((TLRPC.User) obj).id;
                } else if (obj instanceof TLRPC.Chat) {
                    j = -((TLRPC.Chat) obj).id;
                } else {
                    j = 0;
                }
                if (UsersSelectActivity.this.type != 2) {
                    j2 = 0;
                    z = false;
                    r8 = spannableStringBuilder2;
                    zCanUserDoAdminAction = true;
                    r7 = r8;
                } else if (UsersSelectActivity.this.type == 0) {
                    if (!this.searching) {
                        fontMetricsInt = r1.getStatusTextView().getPaint().getFontMetricsInt();
                        spannableStringBuilder2 = new SpannableStringBuilder();
                        arrayList = UsersSelectActivity.this.getMessagesController().dialogFilters;
                        size = arrayList.size();
                        for (i4 = 0; i4 < size; i4++) {
                            dialogFilter = arrayList.get(i4);
                            if (!dialogFilter.includesDialog(UsersSelectActivity.this.getAccountInstance(), j)) {
                                if (spannableStringBuilder2.length() > 0) {
                                    spannableStringBuilder2.append(", ");
                                }
                                spannableStringBuilder2.append(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(new SpannableStringBuilder(dialogFilter.name), fontMetricsInt, false), dialogFilter.entities, fontMetricsInt));
                            }
                        }
                    }
                    j2 = 0;
                    z = false;
                    r8 = spannableStringBuilder2;
                    zCanUserDoAdminAction = true;
                    r7 = r8;
                } else {
                    j2 = 0;
                    if (UsersSelectActivity.this.getMessagesController().dialogs_dict.get(j) != null) {
                        i3 = ((TLRPC.Dialog) UsersSelectActivity.this.getMessagesController().dialogs_dict.get(j)).ttl_period;
                    } else {
                        i3 = 0;
                    }
                    if (i3 > 0) {
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                        spannableStringBuilder4.append((CharSequence) "d");
                        spannableStringBuilder4.setSpan(new ColoredImageSpan(R.drawable.msg_mini_fireon), 0, 1, 0);
                        spannableStringBuilder4.append((CharSequence) LocaleController.formatString(R.string.AutoDeleteAfter, LocaleController.formatTTLString(i3)).toLowerCase());
                        z = true;
                        spannableStringBuilder = spannableStringBuilder4;
                    } else {
                        SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                        spannableStringBuilder5.append((CharSequence) "d");
                        spannableStringBuilder5.setSpan(new ColoredImageSpan(R.drawable.msg_mini_fireoff), 0, 1, 0);
                        spannableStringBuilder5.append((CharSequence) LocaleController.getString(R.string.AutoDeleteDisabled));
                        spannableStringBuilder = spannableStringBuilder5;
                        z = false;
                    }
                    r8 = spannableStringBuilder;
                    if (obj instanceof TLRPC.Chat) {
                        zCanUserDoAdminAction = ChatObject.canUserDoAdminAction((TLRPC.Chat) obj, 13);
                    } else {
                        zCanUserDoAdminAction = true;
                        r7 = r8;
                    }
                }
                if (zCanUserDoAdminAction) {
                    r7 = spannableStringBuilder;
                    r1.setAlpha(1.0f);
                } else {
                    r7 = spannableStringBuilder;
                    r1.setAlpha(0.5f);
                }
                r1.setObject(obj, charSequence, r7);
                SimpleTextView statusTextView = r1.getStatusTextView();
                if (z) {
                    i2 = Theme.key_windowBackgroundWhiteBlueText;
                } else {
                    i2 = Theme.key_windowBackgroundWhiteGrayText;
                }
                statusTextView.setTextColor(Theme.getColor(i2));
                if (j != j2) {
                    if (UsersSelectActivity.this.selectedContacts.indexOfKey(j) >= 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    r1.setChecked(z2, false);
                    r1.setCheckBoxEnabled(true);
                }
            }
            int i6 = this.usersStartRow;
            if (i < i6) {
                String str = "non_contacts";
                if (UsersSelectActivity.this.type == 2) {
                    if (i == 1) {
                        string = LocaleController.getString(R.string.FilterExistingChats);
                        str = "existing_chats";
                        i5 = 1;
                    } else if (i == 2 && !UsersSelectActivity.this.doNotNewChats) {
                        string = LocaleController.getString(R.string.FilterNewChats);
                        str = "new_chats";
                    } else if (i == (!UsersSelectActivity.this.doNotNewChats ? 1 : 0) + 2) {
                        string = LocaleController.getString(R.string.FilterContacts);
                        str = "contacts";
                        i5 = 4;
                    } else {
                        string = LocaleController.getString(R.string.FilterNonContacts);
                        i5 = 8;
                    }
                } else if (UsersSelectActivity.this.isInclude) {
                    if (i == 1) {
                        string = LocaleController.getString(R.string.FilterContacts);
                        i5 = MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
                        str = "contacts";
                    } else if (i == 2) {
                        string = LocaleController.getString(R.string.FilterNonContacts);
                        i5 = MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
                    } else if (i == 3) {
                        string = LocaleController.getString(R.string.FilterGroups);
                        i5 = MessagesController.DIALOG_FILTER_FLAG_GROUPS;
                        str = "groups";
                    } else if (i == 4) {
                        string = LocaleController.getString(R.string.FilterChannels);
                        i5 = MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
                        str = "channels";
                    } else {
                        string = LocaleController.getString(R.string.FilterBots);
                        i5 = MessagesController.DIALOG_FILTER_FLAG_BOTS;
                        str = "bots";
                    }
                } else if (i == 1) {
                    string = LocaleController.getString(R.string.FilterMuted);
                    i5 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
                    str = "muted";
                } else if (i == 2) {
                    string = LocaleController.getString(R.string.FilterRead);
                    i5 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
                    str = "read";
                } else {
                    string = LocaleController.getString(R.string.FilterArchived);
                    i5 = MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
                    str = "archived";
                }
                r1.setObject(str, string, null);
                r1.setChecked((UsersSelectActivity.this.filterFlags & i5) == i5, false);
                r1.setCheckBoxEnabled(true);
                return;
            }
            obj = this.contacts.get(i - i6);
            charSequence = null;
            if (obj instanceof TLRPC.User) {
                j = ((TLRPC.User) obj).id;
            } else if (obj instanceof TLRPC.Chat) {
                j = -((TLRPC.Chat) obj).id;
            } else {
                j = 0;
            }
            if (UsersSelectActivity.this.type != 2) {
                j2 = 0;
                z = false;
                r8 = spannableStringBuilder2;
                zCanUserDoAdminAction = true;
                r7 = r8;
            } else if (UsersSelectActivity.this.type == 0) {
                if (!this.searching) {
                    fontMetricsInt = r1.getStatusTextView().getPaint().getFontMetricsInt();
                    spannableStringBuilder2 = new SpannableStringBuilder();
                    arrayList = UsersSelectActivity.this.getMessagesController().dialogFilters;
                    size = arrayList.size();
                    while (i4 < size) {
                        dialogFilter = arrayList.get(i4);
                        if (!dialogFilter.includesDialog(UsersSelectActivity.this.getAccountInstance(), j)) {
                            if (spannableStringBuilder2.length() > 0) {
                                spannableStringBuilder2.append(", ");
                            }
                            spannableStringBuilder2.append(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(new SpannableStringBuilder(dialogFilter.name), fontMetricsInt, false), dialogFilter.entities, fontMetricsInt));
                        }
                    }
                }
                j2 = 0;
                z = false;
                r8 = spannableStringBuilder2;
                zCanUserDoAdminAction = true;
                r7 = r8;
            } else {
                j2 = 0;
                if (UsersSelectActivity.this.getMessagesController().dialogs_dict.get(j) != null) {
                    i3 = ((TLRPC.Dialog) UsersSelectActivity.this.getMessagesController().dialogs_dict.get(j)).ttl_period;
                } else {
                    i3 = 0;
                }
                if (i3 > 0) {
                    SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
                    spannableStringBuilder6.append((CharSequence) "d");
                    spannableStringBuilder6.setSpan(new ColoredImageSpan(R.drawable.msg_mini_fireon), 0, 1, 0);
                    spannableStringBuilder6.append((CharSequence) LocaleController.formatString(R.string.AutoDeleteAfter, LocaleController.formatTTLString(i3)).toLowerCase());
                    z = true;
                    spannableStringBuilder = spannableStringBuilder6;
                } else {
                    SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder();
                    spannableStringBuilder7.append((CharSequence) "d");
                    spannableStringBuilder7.setSpan(new ColoredImageSpan(R.drawable.msg_mini_fireoff), 0, 1, 0);
                    spannableStringBuilder7.append((CharSequence) LocaleController.getString(R.string.AutoDeleteDisabled));
                    spannableStringBuilder = spannableStringBuilder7;
                    z = false;
                }
                r8 = spannableStringBuilder;
                if (obj instanceof TLRPC.Chat) {
                    zCanUserDoAdminAction = ChatObject.canUserDoAdminAction((TLRPC.Chat) obj, 13);
                } else {
                    zCanUserDoAdminAction = true;
                    r7 = r8;
                }
            }
            if (zCanUserDoAdminAction) {
                r7 = spannableStringBuilder;
                r1.setAlpha(1.0f);
            } else {
                r7 = spannableStringBuilder;
                r1.setAlpha(0.5f);
            }
            r1.setObject(obj, charSequence, r7);
            SimpleTextView statusTextView2 = r1.getStatusTextView();
            if (z) {
                i2 = Theme.key_windowBackgroundWhiteBlueText;
            } else {
                i2 = Theme.key_windowBackgroundWhiteGrayText;
            }
            statusTextView2.setTextColor(Theme.getColor(i2));
            if (j != j2) {
                if (UsersSelectActivity.this.selectedContacts.indexOfKey(j) >= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                r1.setChecked(z2, false);
                r1.setCheckBoxEnabled(true);
            }
        }

        @Override
        public int getItemViewType(int i) {
            if (this.searching) {
                return 1;
            }
            UsersSelectActivity usersSelectActivity = UsersSelectActivity.this;
            if (usersSelectActivity.noChatTypes) {
                if (i == 0) {
                    return 2;
                }
            } else if (usersSelectActivity.type == 2) {
                if (i == 0 || i == (!UsersSelectActivity.this.doNotNewChats ? 1 : 0) + 4) {
                    return 2;
                }
            } else if (UsersSelectActivity.this.type == 0) {
                if (UsersSelectActivity.this.isInclude) {
                    if (i == 0 || i == 6) {
                        return 2;
                    }
                } else if (i == 0 || i == 4) {
                    return 2;
                }
            }
            return 1;
        }

        @Override
        public void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            iArr[0] = (int) (getItemCount() * f);
            iArr[1] = 0;
        }

        @Override
        public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof GroupCreateUserCell) {
                ((GroupCreateUserCell) view).recycle();
            }
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 1;
        }

        public void searchDialogs(final String str) {
            if (this.searchRunnable != null) {
                Utilities.searchQueue.cancelRunnable(this.searchRunnable);
                this.searchRunnable = null;
            }
            final boolean z = UsersSelectActivity.this.type != 2;
            final boolean z2 = UsersSelectActivity.this.type != 2;
            if (str == null) {
                this.searchResult.clear();
                this.searchResultNames.clear();
                this.searchAdapterHelper.mergeResults(null);
                this.searchAdapterHelper.queryServerSearch(null, true, false, false, false, false, 0L, false, 0, 0);
                notifyDataSetChanged();
                return;
            }
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    UsersSelectActivity.GroupCreateAdapter.$r8$lambda$hMCak_sG9Uo8K8YTlwfUr4bSiug(this.f$0, str, z2, z);
                }
            };
            this.searchRunnable = runnable;
            dispatchQueue.postRunnable(runnable, 300L);
        }

        public static void $r8$lambda$hMCak_sG9Uo8K8YTlwfUr4bSiug(final GroupCreateAdapter groupCreateAdapter, final String str, final boolean z, final boolean z2) {
            groupCreateAdapter.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    UsersSelectActivity.GroupCreateAdapter.$r8$lambda$g1nrRNIUTHblfajPFIU15pg4qxs(this.f$0, str, z, z2);
                }
            });
        }

        public static void $r8$lambda$g1nrRNIUTHblfajPFIU15pg4qxs(final GroupCreateAdapter groupCreateAdapter, final String str, final boolean z, final boolean z2) {
            groupCreateAdapter.searchAdapterHelper.queryServerSearch(str, true, z, z, UsersSelectActivity.this.allowSelf, false, 0L, false, 0, 0);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    UsersSelectActivity.GroupCreateAdapter.$r8$lambda$akJsFlcEkPCpRWpXnfupgr2HgWc(this.f$0, str, z2, z);
                }
            };
            groupCreateAdapter.searchRunnable = runnable;
            dispatchQueue.postRunnable(runnable);
        }

        public static void $r8$lambda$akJsFlcEkPCpRWpXnfupgr2HgWc(GroupCreateAdapter groupCreateAdapter, String str, boolean z, boolean z2) {
            char c;
            String publicUsername;
            String str2;
            String translitString;
            int i;
            char c2;
            String str3;
            int i2;
            String str4;
            groupCreateAdapter.getClass();
            String lowerCase = str.trim().toLowerCase();
            if (lowerCase.length() == 0) {
                groupCreateAdapter.updateSearchResults(new ArrayList(), new ArrayList());
                return;
            }
            String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase);
            String str5 = null;
            if (lowerCase.equals(translitString2) || translitString2.length() == 0) {
                translitString2 = null;
            }
            char c3 = 1;
            int i3 = (translitString2 != null ? 1 : 0) + 1;
            String[] strArr = new String[i3];
            strArr[0] = lowerCase;
            if (translitString2 != null) {
                strArr[1] = translitString2;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i4 = 0;
            while (i4 < groupCreateAdapter.contacts.size()) {
                TLObject tLObject = (TLObject) groupCreateAdapter.contacts.get(i4);
                int i5 = 3;
                String[] strArr2 = new String[3];
                boolean z3 = tLObject instanceof TLRPC.User;
                if (z3) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    c = 0;
                    strArr2[0] = ContactsController.formatName(user.first_name, user.last_name).toLowerCase();
                    publicUsername = UserObject.getPublicUsername(user);
                    if (UserObject.isReplyUser(user)) {
                        strArr2[2] = LocaleController.getString(R.string.RepliesTitle).toLowerCase();
                    } else if (UserObject.isUserSelf(user)) {
                        if (UsersSelectActivity.this.allowSelf) {
                            strArr2[2] = LocaleController.getString(R.string.SavedMessages).toLowerCase();
                        }
                        i4++;
                        str5 = str2;
                    } else {
                        if (!user.bot || z) {
                        }
                        i4++;
                        str5 = str2;
                    }
                    translitString = LocaleController.getInstance().getTranslitString(strArr2[c]);
                    strArr2[c3] = translitString;
                    if (strArr2[c].equals(translitString)) {
                        strArr2[c3] = str5;
                    }
                    i = 0;
                    c2 = 0;
                    while (true) {
                        if (i < i3) {
                            str3 = strArr[i];
                            i2 = 0;
                            while (i2 < i5) {
                                str4 = strArr2[i2];
                                if (str4 == null) {
                                    if (!str4.startsWith(str3)) {
                                        if (str4.contains(" " + str3)) {
                                        }
                                    }
                                    c2 = 1;
                                    break;
                                }
                                i2++;
                                i5 = 3;
                            }
                            if (c2 == 0 && publicUsername != null && publicUsername.toLowerCase().startsWith(str3)) {
                                c2 = 2;
                            }
                            if (c2 != 0) {
                                c3 = 1;
                                if (c2 == 1) {
                                    if (z3) {
                                        TLRPC.User user2 = (TLRPC.User) tLObject;
                                        arrayList2.add(AndroidUtilities.generateSearchName(user2.first_name, user2.last_name, str3));
                                    } else {
                                        arrayList2.add(AndroidUtilities.generateSearchName(((TLRPC.Chat) tLObject).title, null, str3));
                                    }
                                    str2 = null;
                                } else {
                                    str2 = null;
                                    arrayList2.add(AndroidUtilities.generateSearchName("@" + publicUsername, null, "@" + str3));
                                }
                                arrayList.add(tLObject);
                                break;
                            }
                            c3 = 1;
                            i++;
                            str5 = null;
                            i5 = 3;
                        }
                    }
                    i4++;
                    str5 = str2;
                } else {
                    c = 0;
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    strArr2[0] = chat.title.toLowerCase();
                    publicUsername = chat.username;
                    if (z2) {
                        translitString = LocaleController.getInstance().getTranslitString(strArr2[c]);
                        strArr2[c3] = translitString;
                        if (strArr2[c].equals(translitString)) {
                            strArr2[c3] = str5;
                        }
                        i = 0;
                        c2 = 0;
                        while (true) {
                            if (i < i3) {
                                str3 = strArr[i];
                                i2 = 0;
                                while (i2 < i5) {
                                    str4 = strArr2[i2];
                                    if (str4 == null) {
                                        if (!str4.startsWith(str3)) {
                                            if (str4.contains(" " + str3)) {
                                            }
                                        }
                                        c2 = 1;
                                        break;
                                    }
                                    i2++;
                                    i5 = 3;
                                }
                                if (c2 == 0) {
                                    c2 = 2;
                                }
                                if (c2 != 0) {
                                    c3 = 1;
                                    if (c2 == 1) {
                                        if (z3) {
                                            TLRPC.User user3 = (TLRPC.User) tLObject;
                                            arrayList2.add(AndroidUtilities.generateSearchName(user3.first_name, user3.last_name, str3));
                                        } else {
                                            arrayList2.add(AndroidUtilities.generateSearchName(((TLRPC.Chat) tLObject).title, null, str3));
                                        }
                                        str2 = null;
                                    } else {
                                        str2 = null;
                                        arrayList2.add(AndroidUtilities.generateSearchName("@" + publicUsername, null, "@" + str3));
                                    }
                                    arrayList.add(tLObject);
                                    break;
                                    break;
                                }
                                c3 = 1;
                                i++;
                                str5 = null;
                                i5 = 3;
                            }
                        }
                    }
                    i4++;
                    str5 = str2;
                }
                str2 = str5;
                i4++;
                str5 = str2;
            }
            groupCreateAdapter.updateSearchResults(arrayList, arrayList2);
        }

        private void updateSearchResults(final ArrayList arrayList, final ArrayList arrayList2) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    UsersSelectActivity.GroupCreateAdapter.$r8$lambda$EdTLwJ4UVNKnV7fYQ_vpkcZ2i8M(this.f$0, arrayList, arrayList2);
                }
            });
        }

        public static void $r8$lambda$EdTLwJ4UVNKnV7fYQ_vpkcZ2i8M(GroupCreateAdapter groupCreateAdapter, ArrayList arrayList, ArrayList arrayList2) {
            if (groupCreateAdapter.searching) {
                groupCreateAdapter.searchRunnable = null;
                groupCreateAdapter.searchResult = arrayList;
                groupCreateAdapter.searchResultNames = arrayList2;
                groupCreateAdapter.searchAdapterHelper.mergeResults(arrayList);
                if (groupCreateAdapter.searching && !groupCreateAdapter.searchAdapterHelper.isSearchInProgress()) {
                    UsersSelectActivity.this.emptyView.showProgress(false);
                }
                groupCreateAdapter.notifyDataSetChanged();
            }
        }
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                UsersSelectActivity.m4772$r8$lambda$M9P3wo2x572uyzfrTtEJgmf8Pw(this.f$0);
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        View view = this.fragmentView;
        int i = ThemeDescription.FLAG_BACKGROUND;
        int i2 = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(view, i, null, null, null, null, i2));
        ActionBar actionBar = this.actionBar;
        int i3 = ThemeDescription.FLAG_BACKGROUND;
        int i4 = Theme.key_actionBarDefault;
        arrayList.add(new ThemeDescription(actionBar, i3, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.scrollView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_FASTSCROLL, null, null, null, null, Theme.key_fastScrollActive));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_FASTSCROLL, null, null, null, null, Theme.key_fastScrollInactive));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_FASTSCROLL, null, null, null, null, Theme.key_fastScrollText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.emptyView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_emptyListPlaceholder));
        arrayList.add(new ThemeDescription(this.emptyView, ThemeDescription.FLAG_PROGRESSBAR, null, null, null, null, Theme.key_progressCircle));
        arrayList.add(new ThemeDescription(this.editText, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.add(new ThemeDescription(this.editText, ThemeDescription.FLAG_HINTTEXTCOLOR, null, null, null, null, Theme.key_groupcreate_hintText));
        arrayList.add(new ThemeDescription(this.editText, ThemeDescription.FLAG_CURSORCOLOR, null, null, null, null, Theme.key_groupcreate_cursor));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{GraySectionCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_graySectionText));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{GraySectionCell.class}, null, null, null, Theme.key_graySection));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{GroupCreateUserCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_groupcreate_sectionText));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{GroupCreateUserCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_checkbox));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{GroupCreateUserCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_checkboxDisabled));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{GroupCreateUserCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_checkboxCheck));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CHECKTAG, new Class[]{GroupCreateUserCell.class}, new String[]{"statusTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueText));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CHECKTAG, new Class[]{GroupCreateUserCell.class}, new String[]{"statusTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{GroupCreateUserCell.class}, null, Theme.avatarDrawables, null, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundCyan));
        int i5 = Theme.key_avatar_backgroundBlue;
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, i5));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(this.spansContainer, 0, new Class[]{GroupCreateSpan.class}, null, null, null, Theme.key_groupcreate_spanBackground));
        arrayList.add(new ThemeDescription(this.spansContainer, 0, new Class[]{GroupCreateSpan.class}, null, null, null, Theme.key_groupcreate_spanText));
        arrayList.add(new ThemeDescription(this.spansContainer, 0, new Class[]{GroupCreateSpan.class}, null, null, null, Theme.key_groupcreate_spanDelete));
        arrayList.add(new ThemeDescription(this.spansContainer, 0, new Class[]{GroupCreateSpan.class}, null, null, null, i5));
        return arrayList;
    }

    public static void m4772$r8$lambda$M9P3wo2x572uyzfrTtEJgmf8Pw(UsersSelectActivity usersSelectActivity) {
        RecyclerListView recyclerListView = usersSelectActivity.listView;
        if (recyclerListView != null) {
            int childCount = recyclerListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = usersSelectActivity.listView.getChildAt(i);
                if (childAt instanceof GroupCreateUserCell) {
                    ((GroupCreateUserCell) childAt).update(0);
                }
            }
        }
    }
}
