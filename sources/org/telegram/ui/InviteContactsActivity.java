package org.telegram.ui;

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
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
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
import org.telegram.messenger.UserConfig;
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
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.FragmentFloatingButton;
import org.telegram.ui.Components.GroupCreateSpan;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.Components.blur3.DownscaleScrollableNoiseSuppressor;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.inset.WindowAnimatedInsetsProvider;

public final class InviteContactsActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate, View.OnClickListener, FactorAnimator.Target, WindowAnimatedInsetsProvider.Listener {
    public final int ADDITIONAL_LIST_HEIGHT_DP;
    public InviteAdapter adapter;
    public final ArrayList allSpans;
    public final FactorAnimator animatorSelectorContainerHeight;
    public GroupCreateSpan currentDeletingSpan;
    public StickerEmptyView emptyView;
    public int fieldY;
    public FragmentFloatingButton floatingButton;
    public ViewGroupPartRenderer iBlur3Capture;
    public final RectF iBlur3PositionActionBar;
    public final ArrayList iBlur3Positions;
    public final BlurredBackgroundSourceRenderNode iBlur3SourceGlassFrosted;
    public boolean ignoreScrollEvent;
    public int imeInsetAnimatedHeight;
    public LinearLayoutManager layoutManager;
    public RecyclerListView listView;
    public int maxSize;
    public int navigationBarHeight;
    public ArrayList phoneBookContacts;
    public LoginActivity.AnonymousClass3 scrollView;
    public final DownscaleScrollableNoiseSuppressor scrollableViewNoiseSuppressor;
    public SearchField searchField;
    public boolean searchWas;
    public boolean searching;
    public final HashMap selectedContacts;
    public SpansContainer spansContainer;

    public final class InviteAdapter extends RecyclerListView.SelectionAdapter {
        public final Context context;
        public ArrayList searchResult = new ArrayList();
        public ArrayList searchResultNames = new ArrayList();
        public Timer searchTimer;
        public boolean searching;

        public final class AnonymousClass1 extends TimerTask {
            public final String val$query;

            public AnonymousClass1(String str) {
                this.val$query = str;
            }

            @Override
            public final void run() {
                InviteAdapter inviteAdapter = InviteAdapter.this;
                try {
                    inviteAdapter.searchTimer.cancel();
                    inviteAdapter.searchTimer = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new InviteContactsActivity$InviteAdapter$1$$ExternalSyntheticLambda0(this, this.val$query, 0));
            }
        }

        public InviteAdapter(Context context) {
            this.context = context;
        }

        @Override
        public final int getItemCount() {
            return this.searching ? this.searchResult.size() : InviteContactsActivity.this.phoneBookContacts.size() + 2;
        }

        @Override
        public final int getItemViewType(int i) {
            if (this.searching) {
                return 0;
            }
            if (i == 0) {
                return 1;
            }
            return i == 1 ? 2 : 0;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.mItemViewType != 2;
        }

        @Override
        public final void notifyDataSetChanged() {
            this.mObservable.notifyChanged();
            InviteContactsActivity inviteContactsActivity = InviteContactsActivity.this;
            InviteAdapter inviteAdapter = inviteContactsActivity.adapter;
            if (inviteAdapter == null || inviteContactsActivity.searching) {
                return;
            }
            inviteContactsActivity.emptyView.setVisibility(inviteAdapter.getItemCount() == 2 ? 0 : 4);
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            ContactsController.Contact contact;
            CharSequence charSequence;
            if (viewHolder.mItemViewType == 0) {
                InviteUserCell inviteUserCell = (InviteUserCell) viewHolder.itemView;
                boolean z = this.searching;
                InviteContactsActivity inviteContactsActivity = InviteContactsActivity.this;
                if (z) {
                    contact = (ContactsController.Contact) this.searchResult.get(i);
                    charSequence = (CharSequence) this.searchResultNames.get(i);
                } else {
                    contact = (ContactsController.Contact) inviteContactsActivity.phoneBookContacts.get(i - 2);
                    charSequence = null;
                }
                inviteUserCell.currentContact = contact;
                inviteUserCell.currentName = charSequence;
                inviteUserCell.update();
                boolean zContainsKey = inviteContactsActivity.selectedContacts.containsKey(contact.key);
                CheckBox2 checkBox2 = inviteUserCell.checkBox;
                if (checkBox2 != null) {
                    checkBox2.checkBoxBase.setChecked(-1, zContainsKey, false);
                }
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View shadowSectionCell;
            Context context = this.context;
            if (i == 1) {
                TextCell textCell = new TextCell(context);
                int i2 = Theme.key_windowBackgroundWhiteBlackText;
                textCell.setColors(i2, i2);
                textCell.setTextAndValueAndIcon(LocaleController.getString(R.string.ShareTelegram2), "", false, R.drawable.msg_shareout, false);
                shadowSectionCell = textCell;
            } else {
                shadowSectionCell = i == 2 ? new ShadowSectionCell(context, (Object) null) : new InviteUserCell(context, true);
            }
            return new RecyclerListView.Holder(shadowSectionCell);
        }

        @Override
        public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof InviteUserCell) {
                ((InviteUserCell) view).avatarImageView.getImageReceiver().cancelLoadImage();
            }
        }

        public final void searchDialogs(String str) {
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
    }

    public final class SearchField extends FrameLayout implements Theme.Colorable {
        public final UsersSelectActivity.AnonymousClass4 editText;
        public GradientDrawable gradient;
        public final ImageView iconView;
        public final Paint paint;
        public final Path path;

        public SearchField(Context context, LoginActivity.AnonymousClass3 anonymousClass3) {
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
            anonymousClass3.setClipChildren(true);
            addView(anonymousClass3, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 40.0f));
            UsersSelectActivity.AnonymousClass4 anonymousClass4 = new UsersSelectActivity.AnonymousClass4(this, context, 8);
            this.editText = anonymousClass4;
            anonymousClass4.setHint(LocaleController.getString(R.string.Search));
            anonymousClass4.setTextSize(1, 15.0f);
            anonymousClass4.setCursorWidth(1.5f);
            anonymousClass4.setInputType(anonymousClass4.getInputType() | 176);
            anonymousClass4.setSingleLine(true);
            anonymousClass4.setBackground(null);
            anonymousClass4.setVerticalScrollBarEnabled(false);
            anonymousClass4.setHorizontalScrollBarEnabled(false);
            anonymousClass4.setClipToPadding(true);
            anonymousClass4.setPadding(AndroidUtilities.dp(46.0f), 0, AndroidUtilities.dp(46.0f), 0);
            anonymousClass4.setEllipsizeByGradient(true);
            anonymousClass4.setImeOptions(268435462);
            anonymousClass4.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            anonymousClass4.addTextChangedListener(new TextWatcher() {
                @Override
                public final void afterTextChanged(Editable editable) {
                    SearchField searchField = SearchField.this;
                    int length = InviteContactsActivity.this.searchField.editText.length();
                    InviteContactsActivity inviteContactsActivity = InviteContactsActivity.this;
                    if (length != 0) {
                        inviteContactsActivity.searching = true;
                        inviteContactsActivity.searchWas = true;
                        InviteAdapter inviteAdapter = inviteContactsActivity.adapter;
                        if (!inviteAdapter.searching) {
                            inviteAdapter.searching = true;
                            inviteAdapter.notifyDataSetChanged();
                        }
                        inviteContactsActivity.adapter.searchDialogs(inviteContactsActivity.searchField.editText.toString());
                        inviteContactsActivity.listView.setFastScrollVisible(false);
                        inviteContactsActivity.listView.setVerticalScrollBarEnabled(true);
                        inviteContactsActivity.emptyView.showProgress(true, true);
                        inviteContactsActivity.emptyView.setStickerType(1);
                        inviteContactsActivity.emptyView.title.setText(LocaleController.getString(R.string.NoResult));
                        inviteContactsActivity.emptyView.subtitle.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                        return;
                    }
                    inviteContactsActivity.searching = false;
                    inviteContactsActivity.searchWas = false;
                    InviteAdapter inviteAdapter2 = inviteContactsActivity.adapter;
                    if (inviteAdapter2.searching) {
                        inviteAdapter2.searching = false;
                        inviteAdapter2.notifyDataSetChanged();
                    }
                    inviteContactsActivity.adapter.searchDialogs(null);
                    inviteContactsActivity.listView.setFastScrollVisible(true);
                    inviteContactsActivity.listView.setVerticalScrollBarEnabled(false);
                    inviteContactsActivity.emptyView.showProgress(false, true);
                    inviteContactsActivity.emptyView.setStickerType(0);
                    inviteContactsActivity.emptyView.title.setText(LocaleController.getString(R.string.NoContacts));
                    inviteContactsActivity.emptyView.subtitle.setText("");
                }

                @Override
                public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override
                public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }
            });
            if (Build.VERSION.SDK_INT >= 35) {
                anonymousClass4.setLocalePreferredLineHeightForMinimumUsed(false);
            }
            anonymousClass4.setTextColor(InviteContactsActivity.this.getThemedColor(i));
            anonymousClass4.setHintTextColor(InviteContactsActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteHintText));
            addView(anonymousClass4, LayoutHelper.createFrame(-1, 40.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            updateColors$1();
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            Paint paint = this.paint;
            paint.setShadowLayer(AndroidUtilities.dpf2(2.0f), 0.0f, AndroidUtilities.dpf2(0.33f), 285212672);
            int i = Theme.key_windowBackgroundWhite;
            InviteContactsActivity inviteContactsActivity = InviteContactsActivity.this;
            paint.setColor(inviteContactsActivity.getThemedColor(i));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f), getWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f) + inviteContactsActivity.animatorSelectorContainerHeight.factor + AndroidUtilities.dp(3.0f));
            Path path = this.path;
            path.rewind();
            path.addRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), Path.Direction.CW);
            GradientDrawable gradientDrawable = this.gradient;
            if (gradientDrawable != null) {
                gradientDrawable.setBounds(0, 0, getWidth(), Math.min(getHeight(), AndroidUtilities.dp(24.0f) + ((int) inviteContactsActivity.animatorSelectorContainerHeight.factor)));
                this.gradient.draw(canvas);
            }
            canvas.save();
            canvas.drawPath(path, paint);
            canvas.clipPath(path);
            super.dispatchDraw(canvas);
            canvas.restore();
        }

        @Override
        public final boolean drawChild(Canvas canvas, View view, long j) {
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
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(144.0f), 1073741824));
        }

        @Override
        public final void updateColors$1() {
            int themedColor = InviteContactsActivity.this.getThemedColor(Theme.key_windowBackgroundGray);
            this.gradient = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Theme.multAlpha(1.0f, themedColor), Theme.multAlpha(0.0f, themedColor)});
        }
    }

    public final class SpansContainer extends ViewGroup {
        public GroupCreateSpan addingSpan;
        public boolean animationStarted;
        public final ArrayList animators;
        public int containerHeight;
        public AnimatorSet currentAnimation;
        public GroupCreateSpan removingSpan;

        public SpansContainer(Context context) {
            super(context);
            this.animators = new ArrayList();
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            ArrayList arrayList;
            int iM$2;
            int iMax;
            int childCount = getChildCount();
            int size = View.MeasureSpec.getSize(i);
            int iDp = size - AndroidUtilities.dp(26.0f);
            int iDp2 = AndroidUtilities.dp(6.0f);
            int iDp3 = AndroidUtilities.dp(6.0f);
            int i3 = 0;
            int iMax2 = 0;
            int iM = 0;
            int iM2 = 0;
            while (true) {
                arrayList = this.animators;
                if (i3 >= childCount) {
                    break;
                }
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
                        GroupCreateSpan groupCreateSpan = this.removingSpan;
                        if (childAt == groupCreateSpan) {
                            childAt.setTranslationX(AndroidUtilities.dp(5.0f) + iM2);
                            childAt.setTranslationY(iDp3);
                        } else if (groupCreateSpan != null) {
                            float f = iDp4;
                            if (childAt.getTranslationX() != f) {
                                arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_X, f));
                            }
                            float f2 = iDp2;
                            if (childAt.getTranslationY() != f2) {
                                arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_Y, f2));
                            }
                            iMax2 = Math.max(iMax2, iDp2);
                        } else {
                            childAt.setTranslationX(iDp4);
                            childAt.setTranslationY(iDp2);
                            iMax2 = Math.max(iMax2, iDp2);
                        }
                    }
                    if (childAt != this.removingSpan) {
                        iM = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(childAt.getMeasuredWidth(), 9.0f, iM);
                    }
                    iM2 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(childAt.getMeasuredWidth(), 9.0f, iM2);
                }
                i3++;
            }
            if (AndroidUtilities.isTablet()) {
                iM$2 = AndroidUtilities.dp(372.0f) / 3;
            } else {
                Point point = AndroidUtilities.displaySize;
                iM$2 = OKLCH.m$2(158.0f, Math.min(point.x, point.y), 3);
            }
            int iDp5 = iMax2 > 0 ? AndroidUtilities.dp(34.0f) + iMax2 : 0;
            InviteContactsActivity inviteContactsActivity = InviteContactsActivity.this;
            boolean z = iDp5 > inviteContactsActivity.maxSize - AndroidUtilities.dp(12.0f);
            if (iDp - iM < iM$2 && !z) {
                iDp2 += AndroidUtilities.dp(34.0f);
                iMax2 = Math.max(iMax2, iDp2);
                iM = 0;
            }
            boolean z2 = (iMax2 > 0 ? AndroidUtilities.dp(34.0f) + iMax2 : 0) > inviteContactsActivity.maxSize - AndroidUtilities.dp(12.0f);
            if (!this.animationStarted) {
                int iDp6 = AndroidUtilities.dp(28.0f) + iDp3;
                inviteContactsActivity.fieldY = iDp2;
                if (this.currentAnimation != null) {
                    this.containerHeight = AndroidUtilities.dp(28.0f) + iDp2;
                    this.currentAnimation.playTogether(arrayList);
                    this.currentAnimation.start();
                    this.animationStarted = true;
                } else {
                    this.containerHeight = iDp6;
                }
            }
            if (z2) {
                iMax = inviteContactsActivity.maxSize - AndroidUtilities.dp(12.0f);
            } else {
                iMax = Math.max(AndroidUtilities.dp(37.0f), Math.min(iMax2 > 0 ? AndroidUtilities.dp(31.0f) + iMax2 : 0, inviteContactsActivity.maxSize - AndroidUtilities.dp(12.0f)));
            }
            inviteContactsActivity.animatorSelectorContainerHeight.animateTo(iMax);
            SearchField searchField = inviteContactsActivity.searchField;
            if (searchField != null) {
                int iMax3 = Math.max(0, childCount - (this.removingSpan != null ? 1 : 0));
                float fM = BotFullscreenButtons$$ExternalSyntheticOutline1.m(iMax2, 6.0f, 0);
                float f3 = iM;
                boolean z3 = iMax3 <= 0;
                float fMax = 0.0f;
                ViewPropertyAnimator viewPropertyAnimatorScaleY = searchField.iconView.animate().alpha(z3 ? 1.0f : 0.0f).scaleX(z3 ? 1.0f : 0.5f).scaleY(z3 ? 1.0f : 0.5f);
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                OKLCH.m(viewPropertyAnimatorScaleY, cubicBezierInterpolator, 320L);
                ViewPropertyAnimator viewPropertyAnimatorTranslationY = searchField.editText.animate().translationY(z2 ? ((searchField.getHeight() - searchField.getPaddingTop()) - searchField.getPaddingBottom()) - AndroidUtilities.dp(44.0f) : fM);
                if (z2) {
                    fMax = AndroidUtilities.dp(-36.0f);
                } else if (iMax3 > 0) {
                    fMax = Math.max(-AndroidUtilities.dp(36.0f), f3 - AndroidUtilities.dp(46.0f));
                }
                viewPropertyAnimatorTranslationY.translationX(fMax).setInterpolator(cubicBezierInterpolator).setDuration(320L).start();
                InviteContactsActivity.this.scrollView.post(new PhotoViewer$6$$ExternalSyntheticLambda0(searchField, fM, 4));
            }
            setMeasuredDimension(size, this.containerHeight);
        }

        public final void removeSpan(GroupCreateSpan groupCreateSpan) {
            InviteContactsActivity inviteContactsActivity = InviteContactsActivity.this;
            inviteContactsActivity.ignoreScrollEvent = true;
            inviteContactsActivity.selectedContacts.remove(groupCreateSpan.getKey());
            inviteContactsActivity.allSpans.remove(groupCreateSpan);
            groupCreateSpan.setOnClickListener(null);
            AnimatorSet animatorSet = this.currentAnimation;
            if (animatorSet != null && animatorSet.isRunning()) {
                this.currentAnimation.setupEndValues();
                this.currentAnimation.cancel();
            }
            this.animationStarted = false;
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.currentAnimation = animatorSet2;
            animatorSet2.addListener(new QrActivity.AnonymousClass4(6, this, groupCreateSpan));
            this.currentAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.currentAnimation.setDuration(320L);
            this.removingSpan = groupCreateSpan;
            ArrayList arrayList = this.animators;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(this.removingSpan, (Property<GroupCreateSpan, Float>) View.SCALE_X, 1.0f, 0.75f));
            arrayList.add(ObjectAnimator.ofFloat(this.removingSpan, (Property<GroupCreateSpan, Float>) View.SCALE_Y, 1.0f, 0.75f));
            arrayList.add(ObjectAnimator.ofFloat(this.removingSpan, (Property<GroupCreateSpan, Float>) View.ALPHA, 1.0f, 0.0f));
            requestLayout();
        }
    }

    public InviteContactsActivity() {
        super(null);
        int i = Build.VERSION.SDK_INT;
        this.ADDITIONAL_LIST_HEIGHT_DP = i >= 31 ? 48 : 0;
        this.animatorSelectorContainerHeight = new FactorAnimator(3, this, CubicBezierInterpolator.EASE_OUT_QUINT, 350L, AndroidUtilities.dp(37.0f));
        this.selectedContacts = new HashMap();
        this.allSpans = new ArrayList();
        ArrayList arrayList = new ArrayList();
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

    public final void blur3_InvalidateBlur$6() {
        DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor;
        if (Build.VERSION.SDK_INT < 31 || (downscaleScrollableNoiseSuppressor = this.scrollableViewNoiseSuppressor) == null) {
            return;
        }
        int iDp = AndroidUtilities.dp(48.0f);
        this.iBlur3PositionActionBar.set(0.0f, -iDp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + iDp + AndroidUtilities.dp(48.0f) + this.maxSize);
        downscaleScrollableNoiseSuppressor.setupRenderNodes(1, this.iBlur3Positions);
        downscaleScrollableNoiseSuppressor.invalidateResultRenderNodes(this.iBlur3Capture, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    public final void checkUi_listViewPadding$4() {
        this.listView.setPadding(0, AndroidUtilities.dp(4.0f) + this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.ADDITIONAL_LIST_HEIGHT_DP) + ((int) this.animatorSelectorContainerHeight.factor), 0, this.navigationBarHeight);
        this.emptyView.setPadding(0, 0, 0, this.navigationBarHeight);
    }

    public final void checkUi_searchFieldY$2() {
        this.searchField.setTranslationY(this.actionBar.getMeasuredHeight());
    }

    @Override
    public final ActionBar createActionBar(Context context) {
        ActionBar actionBarCreateActionBar = super.createActionBar(context);
        actionBarCreateActionBar.setAddToContainer(false);
        return actionBarCreateActionBar;
    }

    @Override
    public final View createView(Context context) {
        this.searching = false;
        this.searchWas = false;
        this.allSpans.clear();
        this.selectedContacts.clear();
        this.currentDeletingSpan = null;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.InviteFriends));
        this.actionBar.setActionBarMenuOnItemClick(new LoginActivity.AnonymousClass1(this, 26));
        LoginActivity.AnonymousClass4 anonymousClass4 = new LoginActivity.AnonymousClass4(this, context, 7);
        this.fragmentView = anonymousClass4;
        LoginActivity.AnonymousClass3 anonymousClass3 = new LoginActivity.AnonymousClass3(this, context, 4);
        this.scrollView = anonymousClass3;
        anonymousClass3.setVerticalScrollBarEnabled(false);
        SpansContainer spansContainer = new SpansContainer(context);
        this.spansContainer = spansContainer;
        this.scrollView.addView(spansContainer, LayoutHelper.createFrame(108.0f, -1));
        this.searchField = new SearchField(context, this.scrollView);
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, null);
        flickerLoadingView.setViewType(6);
        flickerLoadingView.showDate = false;
        StickerEmptyView stickerEmptyView = new StickerEmptyView(0, null, context, flickerLoadingView);
        this.emptyView = stickerEmptyView;
        stickerEmptyView.addView(flickerLoadingView, 0);
        this.emptyView.setAnimateLayoutChange(true);
        this.emptyView.title.setText(LocaleController.getString(R.string.NoContacts));
        this.emptyView.subtitle.setText("");
        this.emptyView.showProgress(ContactsController.getInstance(this.currentAccount).isLoadingContacts(), true);
        int i = Theme.key_windowBackgroundGray;
        anonymousClass4.setBackgroundColor(getThemedColor(i));
        anonymousClass4.addView(this.emptyView);
        this.layoutManager = new LinearLayoutManager(1, false);
        this.adapter = new InviteAdapter(context);
        RecyclerListView recyclerListView = new RecyclerListView(context, null);
        this.listView = recyclerListView;
        recyclerListView.setSections(true);
        this.listView.setEmptyView(this.emptyView);
        this.listView.setAdapter(this.adapter);
        this.listView.setLayoutManager(this.layoutManager);
        this.listView.setVerticalScrollBarEnabled(true);
        this.listView.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        this.listView.setClipToPadding(false);
        anonymousClass4.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, -this.ADDITIONAL_LIST_HEIGHT_DP, 0.0f, 0.0f));
        this.listView.setOnItemClickListener(new PhotoViewer$$ExternalSyntheticLambda61(this, 17));
        this.listView.setOnScrollListener(new LocationActivity.AnonymousClass10(this, 25));
        BackDrawable backDrawable = new BackDrawable(false);
        backDrawable.arrowRotation = 180;
        backDrawable.invalidateSelf();
        FragmentFloatingButton fragmentFloatingButton = new FragmentFloatingButton(context, this.resourceProvider, false);
        this.floatingButton = fragmentFloatingButton;
        fragmentFloatingButton.imageView.setImageDrawable(backDrawable);
        this.floatingButton.animatorButtonVisible.setValue(false, false);
        this.floatingButton.setContentDescription(LocaleController.getString(R.string.Next));
        this.floatingButton.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda4(this, 4));
        this.actionBar.setBackgroundColor(getThemedColor(i));
        RecyclerListView recyclerListView2 = this.listView;
        Objects.requireNonNull(recyclerListView2);
        this.iBlur3Capture = new ViewGroupPartRenderer(recyclerListView2, anonymousClass4, new TopicsFragment$$ExternalSyntheticLambda7(recyclerListView2, 3));
        this.listView.addEdgeEffectListener(new InviteContactsActivity$$ExternalSyntheticLambda4(this, 0));
        InviteAdapter inviteAdapter = this.adapter;
        if (inviteAdapter != null && !this.searching) {
            this.emptyView.setVisibility(inviteAdapter.getItemCount() != 2 ? 4 : 0);
        }
        anonymousClass4.addView(this.floatingButton, FragmentFloatingButton.createDefaultLayoutParams());
        anonymousClass4.addView(this.actionBar);
        anonymousClass4.addView(this.searchField, LayoutHelper.createFrame(-1, -2.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        LaunchActivity launchActivity = LaunchActivity.instance;
        if (launchActivity != null) {
            launchActivity.rootAnimatedInsetsListener.listeners.add(this);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        StickerEmptyView stickerEmptyView;
        if (i == NotificationCenter.contactsImported) {
            fetchContacts();
        } else {
            if (i != NotificationCenter.contactsDidLoad || (stickerEmptyView = this.emptyView) == null) {
                return;
            }
            stickerEmptyView.showProgress(false, true);
        }
    }

    public final void fetchContacts() {
        ArrayList arrayList = new ArrayList(ContactsController.getInstance(this.currentAccount).phoneBookContacts);
        this.phoneBookContacts = arrayList;
        Collections.sort(arrayList, new ChatActivity$$ExternalSyntheticLambda18(29));
        StickerEmptyView stickerEmptyView = this.emptyView;
        if (stickerEmptyView != null) {
            stickerEmptyView.showProgress(false, true);
        }
        InviteAdapter inviteAdapter = this.adapter;
        if (inviteAdapter != null) {
            inviteAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public final View getAnimatedInsetsTargetView() {
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        QrActivity$$ExternalSyntheticLambda9 qrActivity$$ExternalSyntheticLambda9 = new QrActivity$$ExternalSyntheticLambda9(2, this);
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
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundCyan));
        int i2 = Theme.key_avatar_backgroundBlue;
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, i2));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(this.spansContainer, 0, new Class[]{GroupCreateSpan.class}, null, null, null, Theme.key_groupcreate_spanBackground));
        arrayList.add(new ThemeDescription(this.spansContainer, 0, new Class[]{GroupCreateSpan.class}, null, null, null, Theme.key_groupcreate_spanText));
        arrayList.add(new ThemeDescription(this.spansContainer, 0, new Class[]{GroupCreateSpan.class}, null, null, null, Theme.key_groupcreate_spanDelete));
        arrayList.add(new ThemeDescription(this.spansContainer, 0, new Class[]{GroupCreateSpan.class}, null, null, null, i2));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void lambda$createView$0$2(int i, View view) {
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
            GroupCreateSpan groupCreateSpan = (GroupCreateSpan) this.selectedContacts.get(contact.key);
            if (groupCreateSpan != null) {
                this.spansContainer.removeSpan(groupCreateSpan);
            } else {
                GroupCreateSpan groupCreateSpan2 = new GroupCreateSpan(getParentActivity(), null, contact, true, this.resourceProvider);
                SpansContainer spansContainer = this.spansContainer;
                InviteContactsActivity inviteContactsActivity = InviteContactsActivity.this;
                inviteContactsActivity.allSpans.add(groupCreateSpan2);
                inviteContactsActivity.selectedContacts.put(groupCreateSpan2.getKey(), groupCreateSpan2);
                AnimatorSet animatorSet = spansContainer.currentAnimation;
                if (animatorSet != null) {
                    animatorSet.setupEndValues();
                    spansContainer.currentAnimation.cancel();
                }
                spansContainer.animationStarted = false;
                AnimatorSet animatorSet2 = new AnimatorSet();
                spansContainer.currentAnimation = animatorSet2;
                animatorSet2.addListener(new PhotoViewer$41$1(spansContainer, 16));
                spansContainer.currentAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                spansContainer.currentAnimation.setDuration(320L);
                spansContainer.addingSpan = groupCreateSpan2;
                ArrayList arrayList = spansContainer.animators;
                arrayList.clear();
                arrayList.add(ObjectAnimator.ofFloat(spansContainer.addingSpan, (Property<GroupCreateSpan, Float>) View.SCALE_X, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(spansContainer.addingSpan, (Property<GroupCreateSpan, Float>) View.SCALE_Y, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(spansContainer.addingSpan, (Property<GroupCreateSpan, Float>) View.ALPHA, 0.0f, 1.0f));
                spansContainer.addView(groupCreateSpan2);
                groupCreateSpan2.setOnClickListener(this);
            }
            this.floatingButton.animatorButtonVisible.setValue(!this.allSpans.isEmpty(), true);
            if (this.searching || this.searchWas) {
                return;
            }
            boolean z = groupCreateSpan == null;
            CheckBox2 checkBox2 = inviteUserCell.checkBox;
            if (checkBox2 != null) {
                checkBox2.checkBoxBase.setChecked(-1, z, true);
            }
        }
    }

    public final void lambda$createView$1$4$1() {
        try {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.allSpans;
                if (i >= arrayList.size()) {
                    break;
                }
                ContactsController.Contact contact = ((GroupCreateSpan) arrayList.get(i)).getContact();
                if (sb.length() != 0) {
                    sb.append(';');
                }
                sb.append(contact.phones.get(0));
                if (i == 0 && arrayList.size() == 1) {
                    i2 = contact.imported;
                }
                i++;
            }
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + sb.toString()));
            intent.putExtra("sms_body", ContactsController.getInstance(this.currentAccount).getInviteText(i2));
            getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e) {
            FileLog.e(e);
        }
        finishFragment();
    }

    @Override
    public final void onAnimatedInsetsChanged(WindowInsetsCompat windowInsetsCompat) {
        int i = windowInsetsCompat.mImpl.getInsets(8).bottom;
        this.imeInsetAnimatedHeight = i;
        FragmentFloatingButton fragmentFloatingButton = this.floatingButton;
        if (fragmentFloatingButton != null) {
            fragmentFloatingButton.setTranslationY(-Math.max(this.navigationBarHeight, i));
        }
    }

    @Override
    public final void onAnimatedInsetsFinished() {
    }

    @Override
    public final void onAnimatedInsetsStarted() {
    }

    @Override
    public final void onClick(View view) {
        InviteUserCell inviteUserCell;
        ContactsController.Contact contact;
        GroupCreateSpan groupCreateSpan = (GroupCreateSpan) view;
        if (!groupCreateSpan.deleting) {
            GroupCreateSpan groupCreateSpan2 = this.currentDeletingSpan;
            if (groupCreateSpan2 != null) {
                groupCreateSpan2.cancelDeleteAnimation();
            }
            this.currentDeletingSpan = groupCreateSpan;
            groupCreateSpan.startDeleteAnimation();
            return;
        }
        this.currentDeletingSpan = null;
        this.spansContainer.removeSpan(groupCreateSpan);
        this.floatingButton.animatorButtonVisible.setValue(!this.allSpans.isEmpty(), true);
        int childCount = this.listView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.listView.getChildAt(i);
            if ((childAt instanceof InviteUserCell) && (contact = (inviteUserCell = (InviteUserCell) childAt).getContact()) != null) {
                boolean zContainsKey = this.selectedContacts.containsKey(contact.key);
                CheckBox2 checkBox2 = inviteUserCell.checkBox;
                if (checkBox2 != null) {
                    checkBox2.checkBoxBase.setChecked(-1, zContainsKey, true);
                }
            }
        }
    }

    @Override
    public final void onFactorChangeFinished(float f, int i) {
    }

    @Override
    public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i == 3) {
            int paddingTop = this.listView.getPaddingTop();
            this.searchField.invalidate();
            checkUi_listViewPadding$4();
            checkUi_searchFieldY$2();
            int paddingTop2 = this.listView.getPaddingTop();
            if (paddingTop2 != paddingTop) {
                this.listView.scrollBy(0, paddingTop - paddingTop2);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
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
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsImported);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsDidLoad);
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.navigationBarHeight = i4;
        checkUi_listViewPadding$4();
        FragmentFloatingButton fragmentFloatingButton = this.floatingButton;
        if (fragmentFloatingButton != null) {
            fragmentFloatingButton.setTranslationY(-Math.max(this.navigationBarHeight, this.imeInsetAnimatedHeight));
        }
    }
}
