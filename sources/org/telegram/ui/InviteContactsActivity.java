package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline1;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.SavedMessagesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.GroupCreateSectionCell;
import org.telegram.ui.Cells.InviteUserCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EmojiView$$ExternalSyntheticLambda24;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.FragmentFloatingButton;
import org.telegram.ui.Components.GroupCreateSpan;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.Components.blur3.DownscaleScrollableNoiseSuppressor;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.inset.WindowAnimatedInsetsProvider;

public class InviteContactsActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate, View.OnClickListener, FactorAnimator.Target, WindowAnimatedInsetsProvider.Listener {
    private static final int ANIMATOR_ID_SELECTED_CONTAINER_HEIGHT = 3;
    private final int ADDITIONAL_LIST_HEIGHT_DP;
    private InviteAdapter adapter;
    private final ArrayList<GroupCreateSpan> allSpans;
    private final FactorAnimator animatorSelectorContainerHeight;
    private GroupCreateSpan currentDeletingSpan;
    private StickerEmptyView emptyView;
    private int fieldY;
    private FragmentFloatingButton floatingButton;
    private IBlur3Capture iBlur3Capture;
    private boolean iBlur3Invalidated;
    private final RectF iBlur3PositionActionBar;
    private final ArrayList<RectF> iBlur3Positions;
    private final BlurredBackgroundSourceRenderNode iBlur3SourceGlassFrosted;
    private boolean ignoreScrollEvent;
    private int imeInsetAnimatedHeight;
    private LinearLayoutManager layoutManager;
    private RecyclerListView listView;
    private int maxSize;
    private int navigationBarHeight;
    private ArrayList<ContactsController.Contact> phoneBookContacts;
    private ScrollView scrollView;
    private final DownscaleScrollableNoiseSuppressor scrollableViewNoiseSuppressor;
    private SearchField searchField;
    private boolean searchWas;
    private boolean searching;
    private final HashMap<String, GroupCreateSpan> selectedContacts;
    private SpansContainer spansContainer;

    public class InviteAdapter extends RecyclerListView.SelectionAdapter {
        private final Context context;
        private ArrayList<ContactsController.Contact> searchResult = new ArrayList<>();
        private ArrayList<CharSequence> searchResultNames = new ArrayList<>();
        private Timer searchTimer;
        private boolean searching;

        public class AnonymousClass1 extends TimerTask {
            final String val$query;

            public AnonymousClass1(String str) {
                this.val$query = str;
            }

            public void lambda$run$0(String str) {
                String lowerCase = str.trim().toLowerCase();
                if (lowerCase.isEmpty()) {
                    InviteAdapter.this.updateSearchResults(new ArrayList(), new ArrayList());
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                if (lowerCase.equals(translitString) || translitString.isEmpty()) {
                    translitString = null;
                }
                int i = (translitString != null ? 1 : 0) + 1;
                String[] strArr = new String[i];
                strArr[0] = lowerCase;
                if (translitString != null) {
                    strArr[1] = translitString;
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < InviteContactsActivity.this.phoneBookContacts.size(); i2++) {
                    ContactsController.Contact contact = (ContactsController.Contact) InviteContactsActivity.this.phoneBookContacts.get(i2);
                    String lowerCase2 = ContactsController.formatName(contact.first_name, contact.last_name).toLowerCase();
                    String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                    if (lowerCase2.equals(translitString2)) {
                        translitString2 = null;
                    }
                    boolean z = false;
                    for (int i3 = 0; i3 < i; i3++) {
                        String str2 = strArr[i3];
                        if (lowerCase2.startsWith(str2) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", str2, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str2) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", str2, translitString2)))) {
                            z = true;
                        }
                        if (z) {
                            arrayList2.add(AndroidUtilities.generateSearchName(contact.first_name, contact.last_name, str2));
                            arrayList.add(contact);
                            break;
                        }
                    }
                }
                InviteAdapter.this.updateSearchResults(arrayList, arrayList2);
            }

            public void lambda$run$1(String str) {
                Utilities.searchQueue.postRunnable(new InviteContactsActivity$InviteAdapter$1$$ExternalSyntheticLambda0(this, str, 1));
            }

            @Override
            public void run() {
                try {
                    InviteAdapter.this.searchTimer.cancel();
                    InviteAdapter.this.searchTimer = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new InviteContactsActivity$InviteAdapter$1$$ExternalSyntheticLambda0(this, this.val$query, 0));
            }
        }

        public InviteAdapter(Context context) {
            this.context = context;
        }

        public void lambda$updateSearchResults$0(ArrayList arrayList, ArrayList arrayList2) {
            if (this.searching) {
                this.searchResult = arrayList;
                this.searchResultNames = arrayList2;
                notifyDataSetChanged();
                InviteContactsActivity.this.emptyView.showProgress(false);
            }
        }

        public void updateSearchResults(ArrayList<ContactsController.Contact> arrayList, ArrayList<CharSequence> arrayList2) {
            AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda30(this, arrayList, arrayList2, 23));
        }

        @Override
        public int getItemCount() {
            return this.searching ? this.searchResult.size() : InviteContactsActivity.this.phoneBookContacts.size() + 2;
        }

        @Override
        public int getItemViewType(int i) {
            if (this.searching) {
                return 0;
            }
            if (i == 0) {
                return 1;
            }
            return i == 1 ? 2 : 0;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() != 2;
        }

        @Override
        public void notifyDataSetChanged() {
            super.notifyDataSetChanged();
            InviteContactsActivity.this.checkUi_emptyViewVisible();
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            ContactsController.Contact contact;
            CharSequence charSequence;
            if (viewHolder.getItemViewType() == 0) {
                InviteUserCell inviteUserCell = (InviteUserCell) viewHolder.itemView;
                if (this.searching) {
                    contact = this.searchResult.get(i);
                    charSequence = this.searchResultNames.get(i);
                } else {
                    contact = (ContactsController.Contact) InviteContactsActivity.this.phoneBookContacts.get(i - 2);
                    charSequence = null;
                }
                inviteUserCell.currentContact = contact;
                inviteUserCell.currentName = charSequence;
                inviteUserCell.update();
                boolean zContainsKey = InviteContactsActivity.this.selectedContacts.containsKey(contact.key);
                CheckBox2 checkBox2 = inviteUserCell.checkBox;
                if (checkBox2 != null) {
                    checkBox2.setChecked(zContainsKey, false);
                }
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View shadowSectionCell;
            if (i == 1) {
                TextCell textCell = new TextCell(this.context);
                int i2 = Theme.key_windowBackgroundWhiteBlackText;
                textCell.setColors(i2, i2);
                textCell.setTextAndValueAndIcon((CharSequence) LocaleController.getString(R.string.ShareTelegram2), (CharSequence) "", R.drawable.msg_shareout, false);
                shadowSectionCell = textCell;
            } else {
                shadowSectionCell = i == 2 ? new ShadowSectionCell(this.context, null, 0) : new InviteUserCell(this.context, true);
            }
            return new RecyclerListView.Holder(shadowSectionCell);
        }

        @Override
        public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof InviteUserCell) {
                ((InviteUserCell) view).avatarImageView.getImageReceiver().cancelLoadImage();
            }
        }

        public void searchDialogs(String str) {
            try {
                Timer timer = this.searchTimer;
                if (timer != null) {
                    timer.cancel();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            if (str == null) {
                this.searchResult.clear();
                this.searchResultNames.clear();
                notifyDataSetChanged();
            } else {
                Timer timer2 = new Timer();
                this.searchTimer = timer2;
                timer2.schedule(new AnonymousClass1(str), 200L, 300L);
            }
        }

        public void setSearching(boolean z) {
            if (this.searching == z) {
                return;
            }
            this.searching = z;
            notifyDataSetChanged();
        }
    }

    public class SearchField extends FrameLayout implements Theme.Colorable {
        private final EditTextBoldCursor editText;
        private GradientDrawable gradient;
        private final ImageView iconView;
        private final Paint paint;
        private final Path path;

        public SearchField(Context context, ScrollView scrollView) {
            super(context);
            this.paint = new Paint(1);
            this.path = new Path();
            setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f));
            setClipChildren(false);
            setClipToPadding(false);
            ImageView imageView = new ImageView(context);
            this.iconView = imageView;
            imageView.setImageResource(R.drawable.outline_search_1_24);
            int i = Theme.key_windowBackgroundWhiteBlackText;
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.multAlpha(0.6f, InviteContactsActivity.this.getThemedColor(i)), PorterDuff.Mode.SRC_IN));
            addView(imageView, LayoutHelper.createFrame(24, 24.0f, 51, 11.0f, 8.0f, 11.0f, 8.0f));
            scrollView.setClipChildren(true);
            addView(scrollView, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 40.0f));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context) {
                @Override
                public boolean onKeyDown(int i2, KeyEvent keyEvent) {
                    if (i2 != 67 || SearchField.this.editText.length() != 0 || InviteContactsActivity.this.allSpans.isEmpty()) {
                        return super.onKeyDown(i2, keyEvent);
                    }
                    InviteContactsActivity.this.spansContainer.removeSpan((GroupCreateSpan) InviteContactsActivity.this.allSpans.get(InviteContactsActivity.this.allSpans.size() - 1));
                    InviteContactsActivity.this.updateHint();
                    InviteContactsActivity.this.checkVisibleRows();
                    return true;
                }
            };
            this.editText = editTextBoldCursor;
            editTextBoldCursor.setHint(LocaleController.getString(R.string.Search));
            editTextBoldCursor.setTextSize(1, 15.0f);
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setInputType(editTextBoldCursor.getInputType() | 176);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setBackground(null);
            editTextBoldCursor.setVerticalScrollBarEnabled(false);
            editTextBoldCursor.setHorizontalScrollBarEnabled(false);
            editTextBoldCursor.setClipToPadding(true);
            editTextBoldCursor.setPadding(AndroidUtilities.dp(46.0f), 0, AndroidUtilities.dp(46.0f), 0);
            editTextBoldCursor.setEllipsizeByGradient(true);
            editTextBoldCursor.setImeOptions(268435462);
            editTextBoldCursor.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            editTextBoldCursor.addTextChangedListener(new TextWatcher() {
                @Override
                public void afterTextChanged(Editable editable) {
                    if (InviteContactsActivity.this.searchField.editText.length() == 0) {
                        InviteContactsActivity.this.closeSearch();
                        return;
                    }
                    InviteContactsActivity.this.searching = true;
                    InviteContactsActivity.this.searchWas = true;
                    InviteContactsActivity.this.adapter.setSearching(true);
                    InviteContactsActivity.this.adapter.searchDialogs(InviteContactsActivity.this.searchField.editText.toString());
                    InviteContactsActivity.this.listView.setFastScrollVisible(false);
                    InviteContactsActivity.this.listView.setVerticalScrollBarEnabled(true);
                    InviteContactsActivity.this.emptyView.showProgress(true);
                    InviteContactsActivity.this.emptyView.setStickerType(1);
                    InviteContactsActivity.this.emptyView.title.setText(LocaleController.getString(R.string.NoResult));
                    InviteContactsActivity.this.emptyView.subtitle.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                }

                @Override
                public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }
            });
            if (Build.VERSION.SDK_INT >= 35) {
                editTextBoldCursor.setLocalePreferredLineHeightForMinimumUsed(false);
            }
            editTextBoldCursor.setTextColor(InviteContactsActivity.this.getThemedColor(i));
            editTextBoldCursor.setHintTextColor(InviteContactsActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteHintText));
            addView(editTextBoldCursor, LayoutHelper.createFrame(-1, 40.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            updateColors();
        }

        public void lambda$setSpansBounds$0(float f) {
            InviteContactsActivity.this.scrollView.smoothScrollTo(0, (int) f);
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            this.paint.setShadowLayer(AndroidUtilities.dpf2(2.0f), 0.0f, AndroidUtilities.dpf2(0.33f), 285212672);
            this.paint.setColor(InviteContactsActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f), getWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f) + InviteContactsActivity.this.animatorSelectorContainerHeight.factor + AndroidUtilities.dp(3.0f));
            this.path.rewind();
            this.path.addRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), Path.Direction.CW);
            GradientDrawable gradientDrawable = this.gradient;
            if (gradientDrawable != null) {
                gradientDrawable.setBounds(0, 0, getWidth(), Math.min(getHeight(), AndroidUtilities.dp(24.0f) + ((int) InviteContactsActivity.this.animatorSelectorContainerHeight.factor)));
                this.gradient.draw(canvas);
            }
            canvas.save();
            canvas.drawPath(this.path, this.paint);
            canvas.clipPath(this.path);
            super.dispatchDraw(canvas);
            canvas.restore();
        }

        @Override
        public boolean drawChild(Canvas canvas, View view, long j) {
            if (view != InviteContactsActivity.this.scrollView) {
                return super.drawChild(canvas, view, j);
            }
            canvas.save();
            canvas.clipRect(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
            boolean zDrawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return zDrawChild;
        }

        public int[] getColorKeys() {
            return null;
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(144.0f), 1073741824));
        }

        public void setSpansBounds(int i, float f, float f2, boolean z) {
            boolean z2 = i <= 0;
            float fMax = 0.0f;
            ViewPropertyAnimator viewPropertyAnimatorScaleY = this.iconView.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : 0.5f).scaleY(z2 ? 1.0f : 0.5f);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            OKLCH.m(viewPropertyAnimatorScaleY, cubicBezierInterpolator, 320L);
            ViewPropertyAnimator viewPropertyAnimatorTranslationY = this.editText.animate().translationY(z ? ((getHeight() - getPaddingTop()) - getPaddingBottom()) - AndroidUtilities.dp(44.0f) : f);
            if (z) {
                fMax = AndroidUtilities.dp(-36.0f);
            } else if (i > 0) {
                fMax = Math.max(-AndroidUtilities.dp(36.0f), f2 - AndroidUtilities.dp(46.0f));
            }
            viewPropertyAnimatorTranslationY.translationX(fMax).setInterpolator(cubicBezierInterpolator).setDuration(320L).start();
            InviteContactsActivity.this.scrollView.post(new PhotoViewer$6$$ExternalSyntheticLambda0(this, f, 1));
        }

        @Override
        public void updateColors() {
            int themedColor = InviteContactsActivity.this.getThemedColor(Theme.key_windowBackgroundGray);
            this.gradient = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Theme.multAlpha(1.0f, themedColor), Theme.multAlpha(0.0f, themedColor)});
        }
    }

    public class SpansContainer extends ViewGroup {
        private View addingSpan;
        private boolean animationStarted;
        private final ArrayList<Animator> animators;
        private int containerHeight;
        private AnimatorSet currentAnimation;
        private View removingSpan;

        public SpansContainer(Context context) {
            super(context);
            this.animators = new ArrayList<>();
        }

        public void addSpan(GroupCreateSpan groupCreateSpan) {
            InviteContactsActivity.this.allSpans.add(groupCreateSpan);
            InviteContactsActivity.this.selectedContacts.put(groupCreateSpan.getKey(), groupCreateSpan);
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
                    SpansContainer.this.addingSpan = null;
                    SpansContainer.this.currentAnimation = null;
                    SpansContainer.this.animationStarted = false;
                }
            });
            this.currentAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.currentAnimation.setDuration(320L);
            this.addingSpan = groupCreateSpan;
            this.animators.clear();
            this.animators.add(ObjectAnimator.ofFloat(this.addingSpan, (Property<View, Float>) View.SCALE_X, 0.75f, 1.0f));
            this.animators.add(ObjectAnimator.ofFloat(this.addingSpan, (Property<View, Float>) View.SCALE_Y, 0.75f, 1.0f));
            this.animators.add(ObjectAnimator.ofFloat(this.addingSpan, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f));
            addView(groupCreateSpan);
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            int iM$2;
            char c;
            int childCount = getChildCount();
            int size = View.MeasureSpec.getSize(i);
            int iDp = size - AndroidUtilities.dp(26.0f);
            int iDp2 = AndroidUtilities.dp(6.0f);
            int iDp3 = AndroidUtilities.dp(6.0f);
            int iMax = 0;
            int iM = 0;
            int iM2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt instanceof GroupCreateSpan) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), 1073741824));
                    if (childAt != this.removingSpan && childAt.getMeasuredWidth() + iM > iDp) {
                        iDp2 += AndroidUtilities.dp(34.0f);
                        iM = 0;
                    }
                    if (childAt.getMeasuredWidth() + iM2 > iDp) {
                        iDp3 += AndroidUtilities.dp(34.0f);
                        iM2 = 0;
                    }
                    int iDp4 = AndroidUtilities.dp(5.0f) + iM;
                    if (!this.animationStarted) {
                        View view = this.removingSpan;
                        if (childAt == view) {
                            childAt.setTranslationX(AndroidUtilities.dp(5.0f) + iM2);
                            childAt.setTranslationY(iDp3);
                        } else if (view != null) {
                            float f = iDp4;
                            if (childAt.getTranslationX() != f) {
                                c = 0;
                                this.animators.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_X, f));
                            } else {
                                c = 0;
                            }
                            float f2 = iDp2;
                            if (childAt.getTranslationY() != f2) {
                                ArrayList<Animator> arrayList = this.animators;
                                Property property = View.TRANSLATION_Y;
                                float[] fArr = new float[1];
                                fArr[c] = f2;
                                arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property, fArr));
                            }
                            iMax = Math.max(iMax, iDp2);
                        } else {
                            childAt.setTranslationX(iDp4);
                            childAt.setTranslationY(iDp2);
                            iMax = Math.max(iMax, iDp2);
                        }
                    }
                    if (childAt != this.removingSpan) {
                        iM = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(9.0f, childAt.getMeasuredWidth(), iM);
                    }
                    iM2 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(9.0f, childAt.getMeasuredWidth(), iM2);
                }
            }
            if (AndroidUtilities.isTablet()) {
                iM$2 = AndroidUtilities.dp(372.0f) / 3;
            } else {
                Point point = AndroidUtilities.displaySize;
                iM$2 = OKLCH.m$2(158.0f, Math.min(point.x, point.y), 3);
            }
            boolean z = (iMax > 0 ? AndroidUtilities.dp(34.0f) + iMax : 0) > InviteContactsActivity.this.maxSize - AndroidUtilities.dp(12.0f);
            if (iDp - iM < iM$2 && !z) {
                iDp2 += AndroidUtilities.dp(34.0f);
                iMax = Math.max(iMax, iDp2);
                iM = 0;
            }
            boolean z2 = (iMax > 0 ? AndroidUtilities.dp(34.0f) + iMax : 0) > InviteContactsActivity.this.maxSize - AndroidUtilities.dp(12.0f);
            if (!this.animationStarted) {
                int iDp5 = AndroidUtilities.dp(28.0f) + iDp3;
                InviteContactsActivity.this.fieldY = iDp2;
                if (this.currentAnimation != null) {
                    this.containerHeight = AndroidUtilities.dp(28.0f) + iDp2;
                    this.currentAnimation.playTogether(this.animators);
                    this.currentAnimation.start();
                    this.animationStarted = true;
                } else {
                    this.containerHeight = iDp5;
                }
            }
            InviteContactsActivity.this.animatorSelectorContainerHeight.animateTo(z2 ? InviteContactsActivity.this.maxSize - AndroidUtilities.dp(12.0f) : Math.max(AndroidUtilities.dp(37.0f), Math.min(iMax > 0 ? AndroidUtilities.dp(31.0f) + iMax : 0, InviteContactsActivity.this.maxSize - AndroidUtilities.dp(12.0f))));
            if (InviteContactsActivity.this.searchField != null) {
                InviteContactsActivity.this.searchField.setSpansBounds(Math.max(0, childCount - (this.removingSpan == null ? 0 : 1)), BotFullscreenButtons$$ExternalSyntheticOutline1.m(6.0f, iMax, 0), iM, z2);
            }
            setMeasuredDimension(size, this.containerHeight);
        }

        public void removeSpan(final GroupCreateSpan groupCreateSpan) {
            InviteContactsActivity.this.ignoreScrollEvent = true;
            InviteContactsActivity.this.selectedContacts.remove(groupCreateSpan.getKey());
            InviteContactsActivity.this.allSpans.remove(groupCreateSpan);
            groupCreateSpan.setOnClickListener(null);
            AnimatorSet animatorSet = this.currentAnimation;
            if (animatorSet != null && animatorSet.isRunning()) {
                this.currentAnimation.setupEndValues();
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
                }
            });
            this.currentAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.currentAnimation.setDuration(320L);
            this.removingSpan = groupCreateSpan;
            this.animators.clear();
            this.animators.add(ObjectAnimator.ofFloat(this.removingSpan, (Property<View, Float>) View.SCALE_X, 1.0f, 0.75f));
            this.animators.add(ObjectAnimator.ofFloat(this.removingSpan, (Property<View, Float>) View.SCALE_Y, 1.0f, 0.75f));
            this.animators.add(ObjectAnimator.ofFloat(this.removingSpan, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f));
            requestLayout();
        }
    }

    public InviteContactsActivity() {
        super(null);
        int i = Build.VERSION.SDK_INT;
        this.ADDITIONAL_LIST_HEIGHT_DP = i >= 31 ? 48 : 0;
        this.animatorSelectorContainerHeight = new FactorAnimator(3, this, CubicBezierInterpolator.EASE_OUT_QUINT, 350L, AndroidUtilities.dp(37.0f));
        this.selectedContacts = new HashMap<>();
        this.allSpans = new ArrayList<>();
        ArrayList<RectF> arrayList = new ArrayList<>();
        this.iBlur3Positions = arrayList;
        RectF rectF = new RectF();
        this.iBlur3PositionActionBar = rectF;
        arrayList.add(rectF);
        if (i >= 31) {
            this.scrollableViewNoiseSuppressor = new DownscaleScrollableNoiseSuppressor(false);
            this.iBlur3SourceGlassFrosted = new BlurredBackgroundSourceRenderNode(null);
        } else {
            this.scrollableViewNoiseSuppressor = null;
            this.iBlur3SourceGlassFrosted = null;
        }
    }

    public void lambda$createView$2() {
        if (Build.VERSION.SDK_INT < 31 || this.scrollableViewNoiseSuppressor == null) {
            return;
        }
        int iDp = AndroidUtilities.dp(48.0f);
        this.iBlur3PositionActionBar.set(0.0f, -iDp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + iDp + AndroidUtilities.dp(48.0f) + this.maxSize);
        this.scrollableViewNoiseSuppressor.setupRenderNodes(1, this.iBlur3Positions);
        this.scrollableViewNoiseSuppressor.invalidateResultRenderNodes(this.iBlur3Capture, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    public void checkUi_emptyViewVisible() {
        InviteAdapter inviteAdapter = this.adapter;
        if (inviteAdapter == null || this.searching) {
            return;
        }
        this.emptyView.setVisibility(inviteAdapter.getItemCount() == 2 ? 0 : 4);
    }

    public void checkUi_floatingButton() {
        FragmentFloatingButton fragmentFloatingButton = this.floatingButton;
        if (fragmentFloatingButton != null) {
            fragmentFloatingButton.setTranslationY(-Math.max(this.navigationBarHeight, this.imeInsetAnimatedHeight));
        }
    }

    public void checkUi_listViewPadding() {
        this.listView.setPadding(0, AndroidUtilities.dp(4.0f) + this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.ADDITIONAL_LIST_HEIGHT_DP) + ((int) this.animatorSelectorContainerHeight.factor), 0, this.navigationBarHeight);
        this.emptyView.setPadding(0, 0, 0, this.navigationBarHeight);
    }

    public void checkUi_searchFieldY() {
        this.searchField.setTranslationY(this.actionBar.getMeasuredHeight());
    }

    public void checkVisibleRows() {
        InviteUserCell inviteUserCell;
        ContactsController.Contact contact;
        int childCount = this.listView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.listView.getChildAt(i);
            if ((childAt instanceof InviteUserCell) && (contact = (inviteUserCell = (InviteUserCell) childAt).getContact()) != null) {
                boolean zContainsKey = this.selectedContacts.containsKey(contact.key);
                CheckBox2 checkBox2 = inviteUserCell.checkBox;
                if (checkBox2 != null) {
                    checkBox2.setChecked(zContainsKey, true);
                }
            }
        }
    }

    public void closeSearch() {
        this.searching = false;
        this.searchWas = false;
        this.adapter.setSearching(false);
        this.adapter.searchDialogs(null);
        this.listView.setFastScrollVisible(true);
        this.listView.setVerticalScrollBarEnabled(false);
        this.emptyView.showProgress(false);
        this.emptyView.setStickerType(0);
        this.emptyView.title.setText(LocaleController.getString(R.string.NoContacts));
        this.emptyView.subtitle.setText("");
    }

    private void fetchContacts() {
        ArrayList<ContactsController.Contact> arrayList = new ArrayList<>(ContactsController.getInstance(this.currentAccount).phoneBookContacts);
        this.phoneBookContacts = arrayList;
        Collections.sort(arrayList, new OAuthSheet$$ExternalSyntheticLambda10(13));
        StickerEmptyView stickerEmptyView = this.emptyView;
        if (stickerEmptyView != null) {
            stickerEmptyView.showProgress(false);
        }
        InviteAdapter inviteAdapter = this.adapter;
        if (inviteAdapter != null) {
            inviteAdapter.notifyDataSetChanged();
        }
    }

    public void lambda$createView$0(View view, int i) {
        InviteUserCell inviteUserCell;
        ContactsController.Contact contact;
        if (i == 0 && !this.searching) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                String inviteText = ContactsController.getInstance(this.currentAccount).getInviteText(0);
                intent.putExtra("android.intent.extra.TEXT", inviteText);
                getParentActivity().startActivityForResult(Intent.createChooser(intent, inviteText), 500);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        if ((view instanceof InviteUserCell) && (contact = (inviteUserCell = (InviteUserCell) view).getContact()) != null) {
            GroupCreateSpan groupCreateSpan = this.selectedContacts.get(contact.key);
            if (groupCreateSpan != null) {
                this.spansContainer.removeSpan(groupCreateSpan);
            } else {
                GroupCreateSpan groupCreateSpan2 = new GroupCreateSpan(getContext(), null, contact, true, this.resourceProvider);
                this.spansContainer.addSpan(groupCreateSpan2);
                groupCreateSpan2.setOnClickListener(this);
            }
            updateHint();
            if (this.searching || this.searchWas) {
                return;
            }
            boolean z = groupCreateSpan == null;
            CheckBox2 checkBox2 = inviteUserCell.checkBox;
            if (checkBox2 != null) {
                checkBox2.setChecked(z, true);
            }
        }
    }

    public void lambda$createView$1(View view) {
        try {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            for (int i2 = 0; i2 < this.allSpans.size(); i2++) {
                ContactsController.Contact contact = this.allSpans.get(i2).getContact();
                if (sb.length() != 0) {
                    sb.append(';');
                }
                sb.append(contact.phones.get(0));
                if (i2 == 0 && this.allSpans.size() == 1) {
                    i = contact.imported;
                }
            }
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + sb.toString()));
            intent.putExtra("sms_body", ContactsController.getInstance(this.currentAccount).getInviteText(i));
            getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e) {
            FileLog.e(e);
        }
        finishFragment();
    }

    public void lambda$createView$3() {
        this.listView.postOnAnimation(new InviteContactsActivity$$ExternalSyntheticLambda2(this, 0));
    }

    public static int lambda$fetchContacts$4(ContactsController.Contact contact, ContactsController.Contact contact2) {
        int i = contact.imported;
        int i2 = contact2.imported;
        if (i > i2) {
            return -1;
        }
        return i < i2 ? 1 : 0;
    }

    public void lambda$getThemeDescriptions$5() {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView != null) {
            int childCount = recyclerListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.listView.getChildAt(i);
                if (childAt instanceof InviteUserCell) {
                    ((InviteUserCell) childAt).update();
                }
            }
        }
    }

    public void updateHint() {
        this.floatingButton.setButtonVisible(!this.allSpans.isEmpty(), true);
    }

    @Override
    public ActionBar createActionBar(Context context) {
        ActionBar actionBarCreateActionBar = super.createActionBar(context);
        actionBarCreateActionBar.setAddToContainer(false);
        return actionBarCreateActionBar;
    }

    @Override
    public View createView(Context context) {
        this.searching = false;
        this.searchWas = false;
        this.allSpans.clear();
        this.selectedContacts.clear();
        this.currentDeletingSpan = null;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.InviteFriends));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    InviteContactsActivity.this.finishFragment();
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context) {
            @Override
            public void dispatchDraw(Canvas canvas) {
                if (Build.VERSION.SDK_INT >= 31 && InviteContactsActivity.this.scrollableViewNoiseSuppressor != null) {
                    InviteContactsActivity.this.lambda$createView$2();
                    int measuredWidth = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    if (InviteContactsActivity.this.iBlur3SourceGlassFrosted != null && !InviteContactsActivity.this.iBlur3SourceGlassFrosted.inRecording && (InviteContactsActivity.this.iBlur3SourceGlassFrosted.needUpdateDisplayList(measuredWidth, measuredHeight) || InviteContactsActivity.this.iBlur3Invalidated)) {
                        InviteContactsActivity.this.scrollableViewNoiseSuppressor.draw(InviteContactsActivity.this.iBlur3SourceGlassFrosted.beginRecording(measuredWidth, measuredHeight), -3);
                        InviteContactsActivity.this.iBlur3SourceGlassFrosted.endRecording();
                    }
                    InviteContactsActivity.this.iBlur3Invalidated = false;
                }
                super.dispatchDraw(canvas);
            }

            @Override
            public void onLayout(boolean z, int i, int i2, int i3, int i4) {
                super.onLayout(z, i, i2, i3, i4);
                InviteContactsActivity.this.checkUi_floatingButton();
                InviteContactsActivity.this.checkUi_searchFieldY();
            }

            @Override
            public void onMeasure(int i, int i2) {
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                if (AndroidUtilities.isTablet() || size2 > size) {
                    InviteContactsActivity.this.maxSize = AndroidUtilities.dp(144.0f);
                } else {
                    InviteContactsActivity.this.maxSize = AndroidUtilities.dp(56.0f);
                }
                measureChildWithMargins(((BaseFragment) InviteContactsActivity.this).actionBar, i, 0, i2, 0);
                ((ViewGroup.MarginLayoutParams) InviteContactsActivity.this.emptyView.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + ((BaseFragment) InviteContactsActivity.this).actionBar.getMeasuredHeight();
                InviteContactsActivity.this.searchField.getLayoutParams().height = AndroidUtilities.dp(18.0f) + InviteContactsActivity.this.maxSize;
                InviteContactsActivity.this.checkUi_listViewPadding();
                super.onMeasure(i, i2);
            }
        };
        this.fragmentView = frameLayout;
        ScrollView scrollView = new ScrollView(context) {
            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                float f = InviteContactsActivity.this.animatorSelectorContainerHeight.factor;
                float y = motionEvent.getY();
                if (action != 0 || y <= f) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            }

            @Override
            public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
                if (InviteContactsActivity.this.ignoreScrollEvent) {
                    InviteContactsActivity.this.ignoreScrollEvent = false;
                    return false;
                }
                rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                rect.top = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(20.0f, InviteContactsActivity.this.fieldY, rect.top);
                rect.bottom = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(50.0f, InviteContactsActivity.this.fieldY, rect.bottom);
                return super.requestChildRectangleOnScreen(view, rect, z);
            }
        };
        this.scrollView = scrollView;
        scrollView.setVerticalScrollBarEnabled(false);
        SpansContainer spansContainer = new SpansContainer(context);
        this.spansContainer = spansContainer;
        this.scrollView.addView(spansContainer, LayoutHelper.createFrame(-1, 108.0f));
        this.searchField = new SearchField(context, this.scrollView);
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context);
        flickerLoadingView.setViewType(6);
        flickerLoadingView.showDate(false);
        StickerEmptyView stickerEmptyView = new StickerEmptyView(context, flickerLoadingView, 0);
        this.emptyView = stickerEmptyView;
        stickerEmptyView.addView(flickerLoadingView, 0);
        this.emptyView.setAnimateLayoutChange(true);
        this.emptyView.title.setText(LocaleController.getString(R.string.NoContacts));
        this.emptyView.subtitle.setText("");
        this.emptyView.showProgress(ContactsController.getInstance(this.currentAccount).isLoadingContacts());
        int i = Theme.key_windowBackgroundGray;
        frameLayout.setBackgroundColor(getThemedColor(i));
        frameLayout.addView(this.emptyView);
        this.layoutManager = new LinearLayoutManager(1, false);
        this.adapter = new InviteAdapter(context);
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setSections(true);
        this.listView.setEmptyView(this.emptyView);
        this.listView.setAdapter(this.adapter);
        this.listView.setLayoutManager(this.layoutManager);
        this.listView.setVerticalScrollBarEnabled(true);
        this.listView.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        this.listView.setClipToPadding(false);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, -this.ADDITIONAL_LIST_HEIGHT_DP, 0.0f, 0.0f));
        this.listView.setOnItemClickListener(new PhotoViewer$$ExternalSyntheticLambda100(this, 20));
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i2) {
                if (i2 == 1) {
                    InviteContactsActivity.this.searchField.editText.hideActionMode();
                    AndroidUtilities.hideKeyboard(InviteContactsActivity.this.searchField.editText);
                }
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                InviteContactsActivity.this.layoutManager.findFirstVisibleItemPosition();
                View childAt = InviteContactsActivity.this.listView.getChildAt(0);
                if (childAt != null) {
                    childAt.getTop();
                }
                if (Build.VERSION.SDK_INT < 31 || InviteContactsActivity.this.scrollableViewNoiseSuppressor == null) {
                    return;
                }
                InviteContactsActivity.this.scrollableViewNoiseSuppressor.onScrolled(i2, i3);
                InviteContactsActivity.this.lambda$createView$2();
            }
        });
        BackDrawable backDrawable = new BackDrawable(false);
        backDrawable.arrowRotation = 180;
        backDrawable.invalidateSelf();
        FragmentFloatingButton fragmentFloatingButton = new FragmentFloatingButton(context, this.resourceProvider);
        this.floatingButton = fragmentFloatingButton;
        fragmentFloatingButton.imageView.setImageDrawable(backDrawable);
        this.floatingButton.setButtonVisible(false, false);
        this.floatingButton.setContentDescription(LocaleController.getString(R.string.Next));
        this.floatingButton.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda11(this, 18));
        this.actionBar.setBackgroundColor(getThemedColor(i));
        RecyclerListView recyclerListView2 = this.listView;
        Objects.requireNonNull(recyclerListView2);
        this.iBlur3Capture = new ViewGroupPartRenderer(recyclerListView2, frameLayout, new EmojiView$$ExternalSyntheticLambda24(recyclerListView2));
        this.listView.addEdgeEffectListener(new InviteContactsActivity$$ExternalSyntheticLambda2(this, 1));
        checkUi_emptyViewVisible();
        frameLayout.addView(this.floatingButton, FragmentFloatingButton.createDefaultLayoutParams());
        frameLayout.addView(this.actionBar);
        frameLayout.addView(this.searchField, LayoutHelper.createFrame(-1, -2.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        LaunchActivity launchActivity = LaunchActivity.instance;
        if (launchActivity != null) {
            launchActivity.getRootAnimatedInsetsListener().listeners.add(this);
        }
        return this.fragmentView;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        StickerEmptyView stickerEmptyView;
        if (i == NotificationCenter.contactsImported) {
            fetchContacts();
        } else {
            if (i != NotificationCenter.contactsDidLoad || (stickerEmptyView = this.emptyView) == null) {
                return;
            }
            stickerEmptyView.showProgress(false);
        }
    }

    @Override
    public View getAnimatedInsetsTargetView() {
        return this.fragmentView;
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        IntroActivity$$ExternalSyntheticLambda0 introActivity$$ExternalSyntheticLambda0 = new IntroActivity$$ExternalSyntheticLambda0(this, 19);
        arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 33554432, null, null, null, null, Theme.key_fastScrollActive));
        arrayList.add(new ThemeDescription(this.listView, 33554432, null, null, null, null, Theme.key_fastScrollInactive));
        arrayList.add(new ThemeDescription(this.listView, 33554432, null, null, null, null, Theme.key_fastScrollText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.listView, 16, new Class[]{GroupCreateSectionCell.class}, null, null, null, Theme.key_graySection));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{GroupCreateSectionCell.class}, new String[]{"drawable"}, null, null, -1, null, Theme.key_groupcreate_sectionShadow));
        int i = Theme.key_groupcreate_sectionText;
        arrayList.add(new ThemeDescription(this.listView, 4, new Class[]{GroupCreateSectionCell.class}, new String[]{"textView"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(this.listView, 4, new Class[]{InviteUserCell.class}, new String[]{"textView"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(this.listView, 4, new Class[]{InviteUserCell.class}, new String[]{"nameTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.add(new ThemeDescription(this.listView, 4, new Class[]{InviteUserCell.class}, new String[]{"checkBox"}, null, null, -1, null, Theme.key_checkbox));
        arrayList.add(new ThemeDescription(this.listView, 4, new Class[]{InviteUserCell.class}, new String[]{"checkBox"}, null, null, -1, null, Theme.key_checkboxCheck));
        arrayList.add(new ThemeDescription(this.listView, 262148, new Class[]{InviteUserCell.class}, new String[]{"statusTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueText));
        arrayList.add(new ThemeDescription(this.listView, 262148, new Class[]{InviteUserCell.class}, new String[]{"statusTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{InviteUserCell.class}, null, Theme.avatarDrawables, null, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundCyan));
        int i2 = Theme.key_avatar_backgroundBlue;
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, i2));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(this.spansContainer, 0, new Class[]{GroupCreateSpan.class}, null, null, null, Theme.key_groupcreate_spanBackground));
        arrayList.add(new ThemeDescription(this.spansContainer, 0, new Class[]{GroupCreateSpan.class}, null, null, null, Theme.key_groupcreate_spanText));
        arrayList.add(new ThemeDescription(this.spansContainer, 0, new Class[]{GroupCreateSpan.class}, null, null, null, Theme.key_groupcreate_spanDelete));
        arrayList.add(new ThemeDescription(this.spansContainer, 0, new Class[]{GroupCreateSpan.class}, null, null, null, i2));
        return arrayList;
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public void onAnimatedInsetsChanged(View view, WindowInsetsCompat windowInsetsCompat) {
        this.imeInsetAnimatedHeight = windowInsetsCompat.mImpl.getInsets(8).bottom;
        checkUi_floatingButton();
    }

    @Override
    public void onAnimatedInsetsFinished() {
    }

    @Override
    public void onAnimatedInsetsStarted() {
    }

    @Override
    public void onClick(View view) {
        GroupCreateSpan groupCreateSpan = (GroupCreateSpan) view;
        if (groupCreateSpan.isDeleting()) {
            this.currentDeletingSpan = null;
            this.spansContainer.removeSpan(groupCreateSpan);
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
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i == 3) {
            int paddingTop = this.listView.getPaddingTop();
            this.searchField.invalidate();
            checkUi_listViewPadding();
            checkUi_searchFieldY();
            int paddingTop2 = this.listView.getPaddingTop();
            if (paddingTop2 != paddingTop) {
                this.listView.scrollBy(0, paddingTop - paddingTop2);
            }
        }
    }

    @Override
    public boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsImported);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsDidLoad);
        fetchContacts();
        if (!UserConfig.getInstance(this.currentAccount).contactsReimported) {
            ContactsController.getInstance(this.currentAccount).forceImportContacts();
            UserConfig.getInstance(this.currentAccount).contactsReimported = true;
            UserConfig.getInstance(this.currentAccount).saveConfig(false);
        }
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsImported);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsDidLoad);
    }

    @Override
    public void onInsets(int i, int i2, int i3, int i4) {
        this.navigationBarHeight = i4;
        checkUi_listViewPadding();
        checkUi_floatingButton();
    }
}
