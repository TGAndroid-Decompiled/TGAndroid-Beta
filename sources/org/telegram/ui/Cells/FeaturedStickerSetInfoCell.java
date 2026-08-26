package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Property;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzlj;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$MediaCell$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Components.ColorSpanUnderline;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ProgressButton;
import org.telegram.ui.Components.RecyclerListView;

public final class FeaturedStickerSetInfoCell extends FrameLayout {
    public final ProgressButton addButton;
    public AnimatorSet animatorSet;
    public final boolean canAddRemove;
    public final int currentAccount;
    public final TextView delButton;
    public boolean hasOnClick;
    public final TextView infoTextView;
    public boolean isInstalled;
    public boolean isUnread;
    public final TextView nameTextView;
    public boolean needDivider;
    public final Paint paint;
    public final Theme.ResourcesProvider resourcesProvider;
    public TLRPC.StickerSetCovered set;
    public int stickerSetNameSearchIndex;
    public int stickerSetNameSearchLength;
    public float unreadProgress;
    public String url;
    public int urlSearchLength;

    public FeaturedStickerSetInfoCell(int i, Context context, Theme.ResourcesProvider resourcesProvider, boolean z, boolean z2) {
        super(context);
        this.currentAccount = UserConfig.selectedAccount;
        this.paint = new Paint(1);
        this.canAddRemove = z2;
        this.resourcesProvider = resourcesProvider;
        TextView textView = new TextView(context);
        this.nameTextView = textView;
        zzlj.m(Theme.key_chat_emojiPanelTrendingTitle, resourcesProvider, textView, 17.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        addView(textView, z ? LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388659, i, 8.0f, 40.0f, 0.0f) : LayoutHelper.createFrame(-2, -2.0f, 51, i, 8.0f, 40.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.infoTextView = textView2;
        OKLCH.m(Theme.key_chat_emojiPanelTrendingDescription, resourcesProvider, textView2, 13.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        addView(textView2, z ? LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388659, i, 30.0f, 100.0f, 0.0f) : LayoutHelper.createFrame(-2, -2.0f, 51, i, 30.0f, 100.0f, 0.0f));
        if (z2) {
            ProgressButton progressButton = new ProgressButton(context);
            this.addButton = progressButton;
            progressButton.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText, resourcesProvider));
            progressButton.setText(LocaleController.getString(R.string.Add));
            addView(progressButton, z ? LayoutHelper.createFrameRelatively(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f) : LayoutHelper.createFrame(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f));
            TextView textView3 = new TextView(context);
            this.delButton = textView3;
            textView3.setGravity(17);
            zzlj.m(Theme.key_featuredStickers_removeButtonText, resourcesProvider, textView3, 14.0f);
            textView3.setText(LocaleController.getString(R.string.StickersRemove));
            addView(textView3, z ? LayoutHelper.createFrameRelatively(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f) : LayoutHelper.createFrame(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f));
        }
        setWillNotDraw(false);
        updateColors();
    }

    public static void createThemeDescriptions(ArrayList arrayList, RecyclerListView recyclerListView, ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate) {
        arrayList.add(new ThemeDescription(recyclerListView, 4, new Class[]{FeaturedStickerSetInfoCell.class}, new String[]{"nameTextView"}, null, null, -1, null, Theme.key_chat_emojiPanelTrendingTitle));
        int i = Theme.key_chat_emojiPanelTrendingDescription;
        arrayList.add(new ThemeDescription(recyclerListView, 4, new Class[]{FeaturedStickerSetInfoCell.class}, new String[]{"infoTextView"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(recyclerListView, 4, new Class[]{FeaturedStickerSetInfoCell.class}, new String[]{"addButton"}, null, null, -1, null, Theme.key_featuredStickers_buttonText));
        arrayList.add(new ThemeDescription(recyclerListView, 4, new Class[]{FeaturedStickerSetInfoCell.class}, new String[]{"delButton"}, null, null, -1, null, Theme.key_featuredStickers_removeButtonText));
        arrayList.add(new ThemeDescription(recyclerListView, 0, new Class[]{FeaturedStickerSetInfoCell.class}, null, null, null, Theme.key_featuredStickers_unread));
        arrayList.add(new ThemeDescription(recyclerListView, 0, new Class[]{FeaturedStickerSetInfoCell.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_featuredStickers_buttonProgress));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_featuredStickers_addButton));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_featuredStickers_addButtonPressed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_windowBackgroundWhiteBlueText4));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, i));
    }

    public TLRPC.StickerSetCovered getStickerSet() {
        return this.set;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        boolean z = this.isUnread;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (z || this.unreadProgress != 0.0f) {
            if (z) {
                float f3 = this.unreadProgress;
                if (f3 != 1.0f) {
                    float f4 = f3 + 0.16f;
                    this.unreadProgress = f4;
                    if (f4 > 1.0f) {
                        this.unreadProgress = 1.0f;
                    } else {
                        invalidate();
                    }
                } else if (!z) {
                    f = this.unreadProgress;
                    if (f != 0.0f) {
                        f2 = f - 0.16f;
                        this.unreadProgress = f2;
                        if (f2 < 0.0f) {
                            this.unreadProgress = 0.0f;
                        } else {
                            invalidate();
                        }
                    }
                }
            } else if (!z) {
                f = this.unreadProgress;
                if (f != 0.0f) {
                    f2 = f - 0.16f;
                    this.unreadProgress = f2;
                    if (f2 < 0.0f) {
                        this.unreadProgress = 0.0f;
                    } else {
                        invalidate();
                    }
                }
            }
            Paint paint = this.paint;
            paint.setColor(Theme.getColor(Theme.key_featuredStickers_unread, resourcesProvider));
            canvas.drawCircle(AndroidUtilities.dp(12.0f) + this.nameTextView.getRight(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f) * this.unreadProgress, paint);
        }
        if (this.needDivider) {
            canvas.drawLine(0.0f, 0.0f, getWidth(), 0.0f, Theme.getThemePaint("paintDivider", resourcesProvider));
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
        if (this.canAddRemove) {
            int measuredWidth = this.addButton.getMeasuredWidth();
            TextView textView = this.delButton;
            int measuredWidth2 = textView.getMeasuredWidth();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
            if (measuredWidth2 < measuredWidth) {
                layoutParams.rightMargin = RichMessageLayout$MediaCell$$ExternalSyntheticOutline0.m(measuredWidth, measuredWidth2, 2, AndroidUtilities.dp(14.0f));
            } else {
                layoutParams.rightMargin = AndroidUtilities.dp(14.0f);
            }
            measureChildWithMargins(this.nameTextView, i, measuredWidth, i2, 0);
        }
    }

    public final void setAddDrawProgress(boolean z, boolean z2) {
        if (this.canAddRemove) {
            this.addButton.setDrawProgress(z, z2);
        }
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        if (this.canAddRemove) {
            this.hasOnClick = true;
            this.addButton.setOnClickListener(onClickListener);
            this.delButton.setOnClickListener(onClickListener);
        }
    }

    public void setNeedDivider(boolean z) {
        this.needDivider = z;
    }

    public final void setStickerSet(TLRPC.StickerSetCovered stickerSetCovered, boolean z, boolean z2, int i, int i2, boolean z3) {
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.animatorSet = null;
        }
        if (this.set != stickerSetCovered) {
            this.unreadProgress = z ? 1.0f : 0.0f;
            invalidate();
        }
        this.set = stickerSetCovered;
        this.stickerSetNameSearchIndex = i;
        this.stickerSetNameSearchLength = i2;
        if (i2 != 0) {
            updateStickerSetNameSearchSpan();
        } else {
            this.nameTextView.setText(stickerSetCovered.set.title);
        }
        TLRPC.StickerSet stickerSet = stickerSetCovered.set;
        boolean z4 = stickerSet.emojis;
        TextView textView = this.infoTextView;
        if (z4) {
            textView.setText(LocaleController.formatPluralString("EmojiCount", stickerSet.count, new Object[0]));
        } else {
            textView.setText(LocaleController.formatPluralString("Stickers", stickerSet.count, new Object[0]));
        }
        this.isUnread = z;
        if (this.canAddRemove) {
            boolean z5 = this.hasOnClick;
            ProgressButton progressButton = this.addButton;
            if (!z5) {
                progressButton.setVisibility(8);
                return;
            }
            progressButton.setVisibility(0);
            boolean z6 = z3 || MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(stickerSetCovered.set.id);
            this.isInstalled = z6;
            TextView textView2 = this.delButton;
            if (!z2) {
                if (z6) {
                    textView2.setVisibility(0);
                    textView2.setAlpha(1.0f);
                    textView2.setScaleX(1.0f);
                    textView2.setScaleY(1.0f);
                    progressButton.setVisibility(4);
                    progressButton.setAlpha(0.0f);
                    progressButton.setScaleX(0.0f);
                    progressButton.setScaleY(0.0f);
                    return;
                }
                progressButton.setVisibility(0);
                progressButton.setAlpha(1.0f);
                progressButton.setScaleX(1.0f);
                progressButton.setScaleY(1.0f);
                textView2.setVisibility(4);
                textView2.setAlpha(0.0f);
                textView2.setScaleX(0.0f);
                textView2.setScaleY(0.0f);
                return;
            }
            if (z6) {
                textView2.setVisibility(0);
            } else {
                progressButton.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.animatorSet = animatorSet2;
            animatorSet2.setDuration(250L);
            AnimatorSet animatorSet3 = this.animatorSet;
            float[] fArr = {this.isInstalled ? 1.0f : 0.0f};
            Property property = View.ALPHA;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, fArr);
            float[] fArr2 = {this.isInstalled ? 1.0f : 0.0f};
            Property property2 = View.SCALE_X;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, fArr2);
            float[] fArr3 = {this.isInstalled ? 1.0f : 0.0f};
            Property property3 = View.SCALE_Y;
            animatorSet3.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, fArr3), ObjectAnimator.ofFloat(progressButton, (Property<ProgressButton, Float>) property, this.isInstalled ? 0.0f : 1.0f), ObjectAnimator.ofFloat(progressButton, (Property<ProgressButton, Float>) property2, this.isInstalled ? 0.0f : 1.0f), ObjectAnimator.ofFloat(progressButton, (Property<ProgressButton, Float>) property3, this.isInstalled ? 0.0f : 1.0f));
            this.animatorSet.addListener(new AnimatorListenerAdapter() {
                @Override
                public final void onAnimationEnd(Animator animator) {
                    FeaturedStickerSetInfoCell featuredStickerSetInfoCell = FeaturedStickerSetInfoCell.this;
                    if (featuredStickerSetInfoCell.isInstalled) {
                        featuredStickerSetInfoCell.addButton.setVisibility(4);
                    } else {
                        featuredStickerSetInfoCell.delButton.setVisibility(4);
                    }
                }
            });
            this.animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
            this.animatorSet.start();
        }
    }

    public final void updateColors() {
        if (this.canAddRemove) {
            int i = Theme.key_featuredStickers_buttonProgress;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            int color = Theme.getColor(i, resourcesProvider);
            ProgressButton progressButton = this.addButton;
            progressButton.setProgressColor(color);
            int color2 = Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider);
            Theme.getColor(Theme.key_featuredStickers_addButtonPressed, resourcesProvider);
            progressButton.setBackgroundRoundRect(14.0f, color2);
        }
        updateStickerSetNameSearchSpan();
        updateUrlSearchSpan();
    }

    public final void updateStickerSetNameSearchSpan() {
        if (this.stickerSetNameSearchLength != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.set.set.title);
            try {
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4, this.resourcesProvider));
                int i = this.stickerSetNameSearchIndex;
                spannableStringBuilder.setSpan(foregroundColorSpan, i, this.stickerSetNameSearchLength + i, 33);
            } catch (Exception unused) {
            }
            this.nameTextView.setText(spannableStringBuilder);
        }
    }

    public final void updateUrlSearchSpan() {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (this.url != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.url);
            try {
                spannableStringBuilder.setSpan(new ColorSpanUnderline(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4, resourcesProvider)), 0, this.urlSearchLength, 33);
                spannableStringBuilder.setSpan(new ColorSpanUnderline(Theme.getColor(Theme.key_chat_emojiPanelTrendingDescription, resourcesProvider)), this.urlSearchLength, this.url.length(), 33);
            } catch (Exception unused) {
            }
            this.infoTextView.setText(spannableStringBuilder);
        }
    }
}
