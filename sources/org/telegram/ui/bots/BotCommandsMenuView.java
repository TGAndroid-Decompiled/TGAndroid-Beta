package org.telegram.ui.bots;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.MenuDrawable;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.StaticLayoutEx;

public final class BotCommandsMenuView extends View {
    public final AnonymousClass1 backDrawable;
    public final BaseCell.RippleDrawableSafe backgroundDrawable;
    public boolean drawBackgroundDrawable;
    public float expandProgress;
    public boolean expanded;
    public boolean isOpened;
    public boolean isWebView;
    public boolean isWebViewOpened;
    public int lastSize;
    public String menuText;
    public StaticLayout menuTextLayout;
    public float menuTextWidth;
    public final Paint paint;
    public final RectF rectTmp;
    public final TextPaint textPaint;
    public final RLottieDrawable webViewAnimation;

    public final class BotCommandView extends LinearLayout {
        public final TextView command;
        public String commandStr;
        public final ArticleViewer.AnonymousClass9 description;

        public BotCommandView(Context context) {
            super(context);
            setOrientation(0);
            setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
            ArticleViewer.AnonymousClass9 anonymousClass9 = new ArticleViewer.AnonymousClass9(context, 25);
            this.description = anonymousClass9;
            NotificationCenter.listenEmojiLoading(anonymousClass9);
            anonymousClass9.setTextSize(1, 16.0f);
            int i = Theme.key_windowBackgroundWhiteBlackText;
            anonymousClass9.setTextColor(Theme.getColor(null, i, false));
            anonymousClass9.setTag(Integer.valueOf(i));
            anonymousClass9.setMaxLines(2);
            anonymousClass9.setEllipsize(TextUtils.TruncateAt.END);
            addView(anonymousClass9, LayoutHelper.createLinear(-1, -2, 1.0f, 16, 0, 0, AndroidUtilities.dp(8.0f), 0));
            TextView textView = new TextView(context);
            this.command = textView;
            textView.setTextSize(1, 14.0f);
            int i2 = Theme.key_windowBackgroundWhiteGrayText;
            textView.setTextColor(Theme.getColor(null, i2, false));
            textView.setTag(Integer.valueOf(i2));
            addView(textView, LayoutHelper.createLinear(-2, -2, 0.0f, 16));
        }

        public String getCommand() {
            return this.commandStr;
        }
    }

    public final class BotCommandsAdapter extends RecyclerListView.SelectionAdapter {
        public final ArrayList newResult = new ArrayList();
        public final ArrayList newResultHelp = new ArrayList();
        public final ArrayList newResultEphemeral = new ArrayList();

        @Override
        public final int getItemCount() {
            return this.newResult.size();
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            BotCommandView botCommandView = (BotCommandView) viewHolder.itemView;
            String str = (String) this.newResult.get(i);
            if (((Boolean) this.newResultEphemeral.get(i)).booleanValue()) {
                ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.mini_ephemeral_hidden_14);
                coloredImageSpan.setColorKey(Theme.key_windowBackgroundWhiteGrayText3);
                coloredImageSpan.setTopOffset(1);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                spannableStringBuilder.append((CharSequence) " *");
                spannableStringBuilder.setSpan(coloredImageSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                botCommandView.command.setText(spannableStringBuilder);
            } else {
                botCommandView.command.setText(str);
            }
            botCommandView.description.setText((CharSequence) this.newResultHelp.get(i));
            botCommandView.commandStr = str;
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            BotCommandView botCommandView = new BotCommandView(viewGroup.getContext());
            botCommandView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(botCommandView);
        }

        public final void setBotInfo(LongSparseArray longSparseArray) {
            ArrayList arrayList = this.newResult;
            arrayList.clear();
            ArrayList arrayList2 = this.newResultHelp;
            arrayList2.clear();
            ArrayList arrayList3 = this.newResultEphemeral;
            arrayList3.clear();
            for (int i = 0; i < longSparseArray.size(); i++) {
                TL_bots.BotInfo botInfo = (TL_bots.BotInfo) longSparseArray.valueAt(i);
                for (int i2 = 0; i2 < botInfo.commands.size(); i2++) {
                    TLRPC.BotCommand botCommand = botInfo.commands.get(i2);
                    if (botCommand != null && botCommand.command != null) {
                        arrayList.add("/" + botCommand.command);
                        arrayList2.add(botCommand.description);
                        arrayList3.add(Boolean.valueOf(botCommand.ephemeral));
                    }
                }
            }
            this.mObservable.notifyChanged();
        }
    }

    public BotCommandsMenuView(Context context) {
        super(context);
        this.rectTmp = new RectF();
        Paint paint = new Paint(1);
        this.paint = paint;
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        ?? r2 = new MenuDrawable() {
            @Override
            public final void invalidateSelf() {
                super.invalidateSelf();
                BotCommandsMenuView.this.invalidate();
            }
        };
        this.backDrawable = r2;
        int i = R.raw.bot_webview_sheet_to_cross;
        RLottieDrawable rLottieDrawable = new RLottieDrawable(i, String.valueOf(i) + hashCode(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), true, null);
        this.webViewAnimation = rLottieDrawable;
        this.menuText = LocaleController.getString(R.string.BotsMenuTitle);
        this.drawBackgroundDrawable = true;
        paint.setColor(Theme.getColor(null, Theme.key_chat_messagePanelVoiceBackground, false));
        int color = Theme.getColor(null, Theme.key_chat_messagePanelVoiceDuration, false);
        r2.backColor = color;
        r2.iconColor = color;
        rLottieDrawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
        textPaint.setColor(color);
        r2.miniIcon = true;
        r2.rotateToBack = false;
        r2.setRotation(0.0f, false);
        r2.setCallback(this);
        textPaint.setTypeface(AndroidUtilities.bold());
        r2.paint.setStrokeCap(Paint.Cap.ROUND);
        r2.roundCap = true;
        int iDp = AndroidUtilities.dp(16.0f);
        int color2 = Theme.getColor(null, Theme.key_featuredStickers_addButtonPressed, false);
        BaseCell.RippleDrawableSafe rippleDrawableSafeCreateSimpleSelectorRoundRectDrawable = Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, 0, color2, color2);
        this.backgroundDrawable = rippleDrawableSafeCreateSimpleSelectorRoundRectDrawable;
        rippleDrawableSafeCreateSimpleSelectorRoundRectDrawable.setCallback(this);
        rLottieDrawable.setCallback(this);
        rLottieDrawable.masterParent = this;
        setContentDescription(LocaleController.getString("AccDescrBotMenu", R.string.AccDescrBotMenu));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        float f;
        float f2;
        if (this.menuTextLayout != null) {
            boolean z2 = this.expanded;
            if (z2) {
                float f3 = this.expandProgress;
                if (f3 != 1.0f) {
                    float f4 = f3 + 0.10666667f;
                    this.expandProgress = f4;
                    if (f4 > 1.0f) {
                        this.expandProgress = 1.0f;
                    } else {
                        invalidate();
                    }
                } else {
                    if (!z2) {
                        f = this.expandProgress;
                        if (f != 0.0f) {
                            f2 = f - 0.10666667f;
                            this.expandProgress = f2;
                            if (f2 < 0.0f) {
                                this.expandProgress = 0.0f;
                            } else {
                                invalidate();
                            }
                        }
                    }
                    z = false;
                }
                z = true;
            } else {
                if (!z2) {
                    f = this.expandProgress;
                    if (f != 0.0f) {
                        f2 = f - 0.10666667f;
                        this.expandProgress = f2;
                        if (f2 < 0.0f) {
                            this.expandProgress = 0.0f;
                        } else {
                            invalidate();
                        }
                        z = true;
                    }
                }
                z = false;
            }
            float interpolation = CubicBezierInterpolator.DEFAULT.getInterpolation(this.expandProgress);
            if (z && interpolation > 0.0f) {
                this.textPaint.setAlpha((int) (255.0f * interpolation));
            }
            if (this.drawBackgroundDrawable) {
                this.rectTmp.set(0.0f, 0.0f, ((this.menuTextWidth + AndroidUtilities.dp(4.0f)) * interpolation) + AndroidUtilities.dp(40.0f), getMeasuredHeight());
                canvas.drawRoundRect(this.rectTmp, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), this.paint);
                BaseCell.RippleDrawableSafe rippleDrawableSafe = this.backgroundDrawable;
                RectF rectF = this.rectTmp;
                rippleDrawableSafe.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                this.backgroundDrawable.draw(canvas);
            }
            if (this.isWebView) {
                canvas.save();
                canvas.translate(AndroidUtilities.dp(9.5f), AndroidUtilities.dp(6.0f));
                RLottieDrawable rLottieDrawable = this.webViewAnimation;
                rLottieDrawable.setBounds(0, 0, rLottieDrawable.width, rLottieDrawable.height);
                rLottieDrawable.draw(canvas);
                canvas.restore();
                if (rLottieDrawable.isRunning) {
                    invalidate();
                }
            } else {
                canvas.save();
                canvas.translate(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f));
                draw(canvas);
                canvas.restore();
            }
            if (interpolation > 0.0f) {
                canvas.save();
                canvas.translate(AndroidUtilities.dp(34.0f), (getMeasuredHeight() - this.menuTextLayout.getHeight()) / 2.0f);
                this.menuTextLayout.draw(canvas);
                canvas.restore();
            }
            if (z) {
                AndroidUtilities.dp(4.0f);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.backgroundDrawable.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.backgroundDrawable.jumpToCurrentState();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = (View.MeasureSpec.getSize(i2) + View.MeasureSpec.getSize(i)) << 16;
        if (this.lastSize != size || this.menuTextLayout == null) {
            setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            TextPaint textPaint = this.textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(15.0f));
            this.lastSize = size;
            CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(this.menuText, textPaint.getFontMetricsInt(), false);
            int i3 = (int) (AndroidUtilities.displaySize.x * 0.6f);
            StaticLayout staticLayoutCreateStaticLayout = StaticLayoutEx.createStaticLayout(charSequenceReplaceEmoji, textPaint, i3, Layout.Alignment.ALIGN_NORMAL, 0.0f, false, TextUtils.TruncateAt.END, i3, 1, true);
            this.menuTextLayout = staticLayoutCreateStaticLayout;
            this.menuTextWidth = staticLayoutCreateStaticLayout.getLineCount() > 0 ? this.menuTextLayout.getLineWidth(0) : 0.0f;
        }
        AndroidUtilities.dp(4.0f);
        int iDp = AndroidUtilities.dp(40.0f);
        if (this.expanded) {
            iDp = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m((int) this.menuTextWidth, 4.0f, iDp);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(iDp, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
    }

    public void setDrawBackgroundDrawable(boolean z) {
        this.drawBackgroundDrawable = z;
        invalidate();
    }

    public void setOpened(boolean z) {
        if (this.isOpened != z) {
            this.isOpened = z;
        }
        if (!this.isWebView) {
            setRotation(z ? 1.0f : 0.0f, true);
            return;
        }
        if (this.isWebViewOpened != z) {
            RLottieDrawable rLottieDrawable = this.webViewAnimation;
            rLottieDrawable.isRunning = false;
            rLottieDrawable.checkChoreographer$1();
            rLottieDrawable.playInDirectionOfCustomEndFrame = true;
            rLottieDrawable.setCustomEndFrame(z ? rLottieDrawable.metaData[0] : 1);
            rLottieDrawable.start();
            this.isWebViewOpened = z;
        }
    }

    public void setWebView(boolean z) {
        this.isWebView = z;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || this.backgroundDrawable == drawable;
    }
}
