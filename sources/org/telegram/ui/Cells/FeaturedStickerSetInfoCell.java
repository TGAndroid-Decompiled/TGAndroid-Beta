package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Property;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC$StickerSetCovered;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Components.ColorSpanUnderline;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ProgressButton;
import org.telegram.ui.Components.RecyclerListView;

public class FeaturedStickerSetInfoCell extends FrameLayout {
    private ProgressButton addButton;
    private AnimatorSet animatorSet;
    private boolean canAddRemove;
    private TextView delButton;
    private boolean hasOnClick;
    private TextView infoTextView;
    private boolean isInstalled;
    private boolean isUnread;
    private TextView nameTextView;
    private boolean needDivider;
    private final Theme.ResourcesProvider resourcesProvider;
    private TLRPC$StickerSetCovered set;
    private int stickerSetNameSearchIndex;
    private int stickerSetNameSearchLength;
    float unreadProgress;
    private CharSequence url;
    private int urlSearchLength;
    private int currentAccount = UserConfig.selectedAccount;
    private Paint paint = new Paint(1);

    public FeaturedStickerSetInfoCell(Context context, int i, boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        FrameLayout.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        FrameLayout.LayoutParams layoutParams3;
        FrameLayout.LayoutParams layoutParams4;
        this.canAddRemove = z2;
        this.resourcesProvider = resourcesProvider;
        TextView textView = new TextView(context);
        this.nameTextView = textView;
        textView.setTextColor(getThemedColor("chat_emojiPanelTrendingTitle"));
        this.nameTextView.setTextSize(1, 17.0f);
        this.nameTextView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        this.nameTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.nameTextView.setSingleLine(true);
        if (z) {
            layoutParams = LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388659, i, 8.0f, 40.0f, 0.0f);
        } else {
            layoutParams = LayoutHelper.createFrame(-2, -2.0f, 51, i, 8.0f, 40.0f, 0.0f);
        }
        addView(this.nameTextView, layoutParams);
        TextView textView2 = new TextView(context);
        this.infoTextView = textView2;
        textView2.setTextColor(getThemedColor("chat_emojiPanelTrendingDescription"));
        this.infoTextView.setTextSize(1, 13.0f);
        this.infoTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.infoTextView.setSingleLine(true);
        if (z) {
            layoutParams2 = LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388659, i, 30.0f, 100.0f, 0.0f);
        } else {
            layoutParams2 = LayoutHelper.createFrame(-2, -2.0f, 51, i, 30.0f, 100.0f, 0.0f);
        }
        addView(this.infoTextView, layoutParams2);
        if (z2) {
            ProgressButton progressButton = new ProgressButton(context);
            this.addButton = progressButton;
            progressButton.setTextColor(getThemedColor("featuredStickers_buttonText"));
            this.addButton.setText(LocaleController.getString("Add", R.string.Add));
            if (z) {
                layoutParams3 = LayoutHelper.createFrameRelatively(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f);
            } else {
                layoutParams3 = LayoutHelper.createFrame(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f);
            }
            addView(this.addButton, layoutParams3);
            TextView textView3 = new TextView(context);
            this.delButton = textView3;
            textView3.setGravity(17);
            this.delButton.setTextColor(getThemedColor("featuredStickers_removeButtonText"));
            this.delButton.setTextSize(1, 14.0f);
            this.delButton.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
            this.delButton.setText(LocaleController.getString("StickersRemove", R.string.StickersRemove));
            if (z) {
                layoutParams4 = LayoutHelper.createFrameRelatively(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f);
            } else {
                layoutParams4 = LayoutHelper.createFrame(-2, 28.0f, 53, 0.0f, 16.0f, 14.0f, 0.0f);
            }
            addView(this.delButton, layoutParams4);
        }
        setWillNotDraw(false);
        updateColors();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
        if (this.canAddRemove) {
            int measuredWidth = this.addButton.getMeasuredWidth();
            int measuredWidth2 = this.delButton.getMeasuredWidth();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.delButton.getLayoutParams();
            if (measuredWidth2 < measuredWidth) {
                layoutParams.rightMargin = AndroidUtilities.dp(14.0f) + ((measuredWidth - measuredWidth2) / 2);
            } else {
                layoutParams.rightMargin = AndroidUtilities.dp(14.0f);
            }
            measureChildWithMargins(this.nameTextView, i, measuredWidth, i2, 0);
        }
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        if (this.canAddRemove) {
            this.hasOnClick = true;
            this.addButton.setOnClickListener(onClickListener);
            this.delButton.setOnClickListener(onClickListener);
        }
    }

    public void setAddDrawProgress(boolean z, boolean z2) {
        if (this.canAddRemove) {
            this.addButton.setDrawProgress(z, z2);
        }
    }

    public void setStickerSet(TLRPC$StickerSetCovered tLRPC$StickerSetCovered, boolean z) {
        setStickerSet(tLRPC$StickerSetCovered, z, false, 0, 0, false);
    }

    public void setStickerSet(TLRPC$StickerSetCovered tLRPC$StickerSetCovered, boolean z, boolean z2, int i, int i2) {
        setStickerSet(tLRPC$StickerSetCovered, z, z2, i, i2, false);
    }

    public void setStickerSet(TLRPC$StickerSetCovered tLRPC$StickerSetCovered, boolean z, boolean z2, int i, int i2, boolean z3) {
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.animatorSet = null;
        }
        float f = 1.0f;
        if (this.set != tLRPC$StickerSetCovered) {
            this.unreadProgress = z ? 1.0f : 0.0f;
            invalidate();
        }
        this.set = tLRPC$StickerSetCovered;
        this.stickerSetNameSearchIndex = i;
        this.stickerSetNameSearchLength = i2;
        if (i2 != 0) {
            updateStickerSetNameSearchSpan();
        } else {
            this.nameTextView.setText(tLRPC$StickerSetCovered.set.title);
        }
        this.infoTextView.setText(LocaleController.formatPluralString("Stickers", tLRPC$StickerSetCovered.set.count));
        this.isUnread = z;
        if (!this.canAddRemove) {
            return;
        }
        if (this.hasOnClick) {
            this.addButton.setVisibility(0);
            boolean z4 = z3 || MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(tLRPC$StickerSetCovered.set.id);
            this.isInstalled = z4;
            if (z2) {
                if (z4) {
                    this.delButton.setVisibility(0);
                } else {
                    this.addButton.setVisibility(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.animatorSet = animatorSet2;
                animatorSet2.setDuration(250L);
                AnimatorSet animatorSet3 = this.animatorSet;
                Animator[] animatorArr = new Animator[6];
                TextView textView = this.delButton;
                Property property = View.ALPHA;
                float[] fArr = new float[1];
                fArr[0] = this.isInstalled ? 1.0f : 0.0f;
                animatorArr[0] = ObjectAnimator.ofFloat(textView, property, fArr);
                TextView textView2 = this.delButton;
                Property property2 = View.SCALE_X;
                float[] fArr2 = new float[1];
                fArr2[0] = this.isInstalled ? 1.0f : 0.0f;
                animatorArr[1] = ObjectAnimator.ofFloat(textView2, property2, fArr2);
                TextView textView3 = this.delButton;
                Property property3 = View.SCALE_Y;
                float[] fArr3 = new float[1];
                fArr3[0] = this.isInstalled ? 1.0f : 0.0f;
                animatorArr[2] = ObjectAnimator.ofFloat(textView3, property3, fArr3);
                ProgressButton progressButton = this.addButton;
                Property property4 = View.ALPHA;
                float[] fArr4 = new float[1];
                fArr4[0] = this.isInstalled ? 0.0f : 1.0f;
                animatorArr[3] = ObjectAnimator.ofFloat(progressButton, property4, fArr4);
                ProgressButton progressButton2 = this.addButton;
                Property property5 = View.SCALE_X;
                float[] fArr5 = new float[1];
                fArr5[0] = this.isInstalled ? 0.0f : 1.0f;
                animatorArr[4] = ObjectAnimator.ofFloat(progressButton2, property5, fArr5);
                ProgressButton progressButton3 = this.addButton;
                Property property6 = View.SCALE_Y;
                float[] fArr6 = new float[1];
                if (this.isInstalled) {
                    f = 0.0f;
                }
                fArr6[0] = f;
                animatorArr[5] = ObjectAnimator.ofFloat(progressButton3, property6, fArr6);
                animatorSet3.playTogether(animatorArr);
                this.animatorSet.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        if (FeaturedStickerSetInfoCell.this.isInstalled) {
                            FeaturedStickerSetInfoCell.this.addButton.setVisibility(4);
                        } else {
                            FeaturedStickerSetInfoCell.this.delButton.setVisibility(4);
                        }
                    }
                });
                this.animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                this.animatorSet.start();
            } else if (z4) {
                this.delButton.setVisibility(0);
                this.delButton.setAlpha(1.0f);
                this.delButton.setScaleX(1.0f);
                this.delButton.setScaleY(1.0f);
                this.addButton.setVisibility(4);
                this.addButton.setAlpha(0.0f);
                this.addButton.setScaleX(0.0f);
                this.addButton.setScaleY(0.0f);
            } else {
                this.addButton.setVisibility(0);
                this.addButton.setAlpha(1.0f);
                this.addButton.setScaleX(1.0f);
                this.addButton.setScaleY(1.0f);
                this.delButton.setVisibility(4);
                this.delButton.setAlpha(0.0f);
                this.delButton.setScaleX(0.0f);
                this.delButton.setScaleY(0.0f);
            }
        } else {
            this.addButton.setVisibility(8);
        }
    }

    private void updateStickerSetNameSearchSpan() {
        if (this.stickerSetNameSearchLength != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.set.set.title);
            try {
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(getThemedColor("windowBackgroundWhiteBlueText4"));
                int i = this.stickerSetNameSearchIndex;
                spannableStringBuilder.setSpan(foregroundColorSpan, i, this.stickerSetNameSearchLength + i, 33);
            } catch (Exception unused) {
            }
            this.nameTextView.setText(spannableStringBuilder);
        }
    }

    public void setUrl(CharSequence charSequence, int i) {
        this.url = charSequence;
        this.urlSearchLength = i;
        updateUrlSearchSpan();
    }

    private void updateUrlSearchSpan() {
        if (this.url != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.url);
            try {
                spannableStringBuilder.setSpan(new ColorSpanUnderline(getThemedColor("windowBackgroundWhiteBlueText4")), 0, this.urlSearchLength, 33);
                spannableStringBuilder.setSpan(new ColorSpanUnderline(getThemedColor("chat_emojiPanelTrendingDescription")), this.urlSearchLength, this.url.length(), 33);
            } catch (Exception unused) {
            }
            this.infoTextView.setText(spannableStringBuilder);
        }
    }

    public boolean isInstalled() {
        return this.isInstalled;
    }

    public TLRPC$StickerSetCovered getStickerSet() {
        return this.set;
    }

    public void setNeedDivider(boolean z) {
        this.needDivider = z;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        boolean z = this.isUnread;
        if (z || this.unreadProgress != 0.0f) {
            if (z) {
                float f = this.unreadProgress;
                if (f != 1.0f) {
                    float f2 = f + 0.16f;
                    this.unreadProgress = f2;
                    if (f2 > 1.0f) {
                        this.unreadProgress = 1.0f;
                    } else {
                        invalidate();
                    }
                    this.paint.setColor(getThemedColor("featuredStickers_unread"));
                    canvas.drawCircle(this.nameTextView.getRight() + AndroidUtilities.dp(12.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f) * this.unreadProgress, this.paint);
                }
            }
            if (!z) {
                float f3 = this.unreadProgress;
                if (f3 != 0.0f) {
                    float f4 = f3 - 0.16f;
                    this.unreadProgress = f4;
                    if (f4 < 0.0f) {
                        this.unreadProgress = 0.0f;
                    } else {
                        invalidate();
                    }
                }
            }
            this.paint.setColor(getThemedColor("featuredStickers_unread"));
            canvas.drawCircle(this.nameTextView.getRight() + AndroidUtilities.dp(12.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f) * this.unreadProgress, this.paint);
        }
        if (this.needDivider) {
            canvas.drawLine(0.0f, 0.0f, getWidth(), 0.0f, Theme.dividerPaint);
        }
    }

    public void updateColors() {
        if (this.canAddRemove) {
            this.addButton.setProgressColor(getThemedColor("featuredStickers_buttonProgress"));
            this.addButton.setBackgroundRoundRect(getThemedColor("featuredStickers_addButton"), getThemedColor("featuredStickers_addButtonPressed"));
        }
        updateStickerSetNameSearchSpan();
        updateUrlSearchSpan();
    }

    public static void createThemeDescriptions(List<ThemeDescription> list, RecyclerListView recyclerListView, ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate) {
        list.add(new ThemeDescription(recyclerListView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{FeaturedStickerSetInfoCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "chat_emojiPanelTrendingTitle"));
        list.add(new ThemeDescription(recyclerListView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{FeaturedStickerSetInfoCell.class}, new String[]{"infoTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "chat_emojiPanelTrendingDescription"));
        list.add(new ThemeDescription(recyclerListView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{FeaturedStickerSetInfoCell.class}, new String[]{"addButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "featuredStickers_buttonText"));
        list.add(new ThemeDescription(recyclerListView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{FeaturedStickerSetInfoCell.class}, new String[]{"delButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "featuredStickers_removeButtonText"));
        list.add(new ThemeDescription(recyclerListView, 0, new Class[]{FeaturedStickerSetInfoCell.class}, null, null, null, "featuredStickers_unread"));
        list.add(new ThemeDescription(recyclerListView, 0, new Class[]{FeaturedStickerSetInfoCell.class}, Theme.dividerPaint, null, null, "divider"));
        list.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, "featuredStickers_buttonProgress"));
        list.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, "featuredStickers_addButton"));
        list.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, "featuredStickers_addButtonPressed"));
        list.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, "windowBackgroundWhiteBlueText4"));
        list.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, "chat_emojiPanelTrendingDescription"));
    }

    private int getThemedColor(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Integer color = resourcesProvider != null ? resourcesProvider.getColor(str) : null;
        return color != null ? color.intValue() : Theme.getColor(str);
    }
}
