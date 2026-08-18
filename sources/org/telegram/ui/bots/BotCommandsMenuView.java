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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.MenuDrawable;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.StaticLayoutEx;

public class BotCommandsMenuView extends View {
    final MenuDrawable backDrawable;
    Drawable backgroundDrawable;
    boolean drawBackgroundDrawable;
    float expandProgress;
    public boolean expanded;
    boolean isOpened;
    public boolean isWebView;
    boolean isWebViewOpened;
    int lastSize;
    private String menuText;
    StaticLayout menuTextLayout;
    private float menuTextWidth;
    final Paint paint;
    final RectF rectTmp;
    final TextPaint textPaint;
    RLottieDrawable webViewAnimation;

    protected void onTranslationChanged(float f) {
    }

    public BotCommandsMenuView(Context context) {
        super(context);
        this.rectTmp = new RectF();
        this.paint = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        MenuDrawable menuDrawable = new MenuDrawable() {
            @Override
            public void invalidateSelf() {
                super.invalidateSelf();
                BotCommandsMenuView.this.invalidate();
            }
        };
        this.backDrawable = menuDrawable;
        int i = R.raw.bot_webview_sheet_to_cross;
        this.webViewAnimation = new RLottieDrawable(i, String.valueOf(i) + hashCode(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
        this.menuText = LocaleController.getString(R.string.BotsMenuTitle);
        this.drawBackgroundDrawable = true;
        updateColors();
        menuDrawable.setMiniIcon(true);
        menuDrawable.setRotateToBack(false);
        menuDrawable.setRotation(0.0f, false);
        menuDrawable.setCallback(this);
        textPaint.setTypeface(AndroidUtilities.bold());
        menuDrawable.setRoundCap();
        Drawable drawableCreateSimpleSelectorRoundRectDrawable = Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(16.0f), 0, Theme.getColor(Theme.key_featuredStickers_addButtonPressed));
        this.backgroundDrawable = drawableCreateSimpleSelectorRoundRectDrawable;
        drawableCreateSimpleSelectorRoundRectDrawable.setCallback(this);
        this.webViewAnimation.setCallback(this);
        this.webViewAnimation.setMasterParent(this);
        setContentDescription(LocaleController.getString("AccDescrBotMenu", R.string.AccDescrBotMenu));
    }

    public void setDrawBackgroundDrawable(boolean z) {
        this.drawBackgroundDrawable = z;
        invalidate();
    }

    public void setWebView(boolean z) {
        this.isWebView = z;
        invalidate();
    }

    private void updateColors() {
        this.paint.setColor(Theme.getColor(Theme.key_chat_messagePanelVoiceBackground));
        int color = Theme.getColor(Theme.key_chat_messagePanelVoiceDuration);
        this.backDrawable.setBackColor(color);
        this.backDrawable.setIconColor(color);
        RLottieDrawable rLottieDrawable = this.webViewAnimation;
        if (rLottieDrawable != null) {
            rLottieDrawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
        }
        this.textPaint.setColor(color);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int size = (View.MeasureSpec.getSize(i) + View.MeasureSpec.getSize(i2)) << 16;
        if (this.lastSize != size || this.menuTextLayout == null) {
            this.backDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.textPaint.setTextSize(AndroidUtilities.dp(15.0f));
            this.lastSize = size;
            CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(this.menuText, this.textPaint.getFontMetricsInt(), false);
            int i3 = (int) (AndroidUtilities.displaySize.x * 0.6f);
            StaticLayout staticLayoutCreateStaticLayout = StaticLayoutEx.createStaticLayout(charSequenceReplaceEmoji, this.textPaint, i3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, i3, 1);
            this.menuTextLayout = staticLayoutCreateStaticLayout;
            this.menuTextWidth = staticLayoutCreateStaticLayout.getLineCount() > 0 ? this.menuTextLayout.getLineWidth(0) : 0.0f;
        }
        onTranslationChanged((this.menuTextWidth + AndroidUtilities.dp(4.0f)) * this.expandProgress);
        int iDp = AndroidUtilities.dp(40.0f);
        if (this.expanded) {
            iDp += ((int) this.menuTextWidth) + AndroidUtilities.dp(4.0f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(iDp, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
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
                this.rectTmp.set(0.0f, 0.0f, AndroidUtilities.dp(40.0f) + ((this.menuTextWidth + AndroidUtilities.dp(4.0f)) * interpolation), getMeasuredHeight());
                canvas.drawRoundRect(this.rectTmp, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), this.paint);
                Drawable drawable = this.backgroundDrawable;
                RectF rectF = this.rectTmp;
                drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                this.backgroundDrawable.draw(canvas);
            }
            if (this.isWebView) {
                canvas.save();
                canvas.translate(AndroidUtilities.dp(9.5f), AndroidUtilities.dp(6.0f));
                RLottieDrawable rLottieDrawable = this.webViewAnimation;
                rLottieDrawable.setBounds(0, 0, rLottieDrawable.getMinimumWidth(), rLottieDrawable.getMinimumHeight());
                rLottieDrawable.draw(canvas);
                canvas.restore();
                if (rLottieDrawable.isRunning()) {
                    invalidate();
                }
            } else {
                canvas.save();
                canvas.translate(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f));
                this.backDrawable.draw(canvas);
                canvas.restore();
            }
            if (interpolation > 0.0f) {
                canvas.save();
                canvas.translate(AndroidUtilities.dp(34.0f), (getMeasuredHeight() - this.menuTextLayout.getHeight()) / 2.0f);
                this.menuTextLayout.draw(canvas);
                canvas.restore();
            }
            if (z) {
                onTranslationChanged((this.menuTextWidth + AndroidUtilities.dp(4.0f)) * interpolation);
            }
        }
        super.dispatchDraw(canvas);
    }

    public boolean setMenuText(String str) {
        if (str == null) {
            str = LocaleController.getString(R.string.BotsMenuTitle);
        }
        String str2 = this.menuText;
        boolean z = str2 == null || !str2.equals(str);
        this.menuText = str;
        this.menuTextLayout = null;
        requestLayout();
        return z;
    }

    public void setExpanded(boolean z, boolean z2) {
        if (this.expanded != z) {
            this.expanded = z;
            if (!z2) {
                this.expandProgress = z ? 1.0f : 0.0f;
            }
            requestLayout();
            invalidate();
        }
    }

    public boolean isOpened() {
        return this.isOpened;
    }

    public static class BotCommandsAdapter extends RecyclerListView.SelectionAdapter {
        ArrayList newResult = new ArrayList();
        ArrayList newResultHelp = new ArrayList();
        ArrayList newResultEphemeral = new ArrayList();

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            BotCommandView botCommandView = new BotCommandView(viewGroup.getContext());
            botCommandView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(botCommandView);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
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
        public int getItemCount() {
            return this.newResult.size();
        }

        public void setBotInfo(LongSparseArray longSparseArray) {
            this.newResult.clear();
            this.newResultHelp.clear();
            this.newResultEphemeral.clear();
            for (int i = 0; i < longSparseArray.size(); i++) {
                TL_bots.BotInfo botInfo = (TL_bots.BotInfo) longSparseArray.valueAt(i);
                for (int i2 = 0; i2 < botInfo.commands.size(); i2++) {
                    TLRPC.BotCommand botCommand = botInfo.commands.get(i2);
                    if (botCommand != null && botCommand.command != null) {
                        this.newResult.add("/" + botCommand.command);
                        this.newResultHelp.add(botCommand.description);
                        this.newResultEphemeral.add(Boolean.valueOf(botCommand.ephemeral));
                    }
                }
            }
            notifyDataSetChanged();
        }
    }

    public void setOpened(boolean z) {
        if (this.isOpened != z) {
            this.isOpened = z;
        }
        if (this.isWebView) {
            if (this.isWebViewOpened != z) {
                RLottieDrawable rLottieDrawable = this.webViewAnimation;
                rLottieDrawable.stop();
                rLottieDrawable.setPlayInDirectionOfCustomEndFrame(true);
                rLottieDrawable.setCustomEndFrame(z ? rLottieDrawable.getFramesCount() : 1);
                rLottieDrawable.start();
                this.isWebViewOpened = z;
                return;
            }
            return;
        }
        this.backDrawable.setRotation(z ? 1.0f : 0.0f, true);
    }

    public static class BotCommandView extends LinearLayout {
        TextView command;
        String commandStr;
        TextView description;

        public BotCommandView(Context context) {
            super(context);
            setOrientation(0);
            setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
            TextView textView = new TextView(context) {
                @Override
                public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
                    super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
                }
            };
            this.description = textView;
            NotificationCenter.listenEmojiLoading(textView);
            this.description.setTextSize(1, 16.0f);
            TextView textView2 = this.description;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            textView2.setTextColor(Theme.getColor(i));
            this.description.setTag(Integer.valueOf(i));
            this.description.setMaxLines(2);
            this.description.setEllipsize(TextUtils.TruncateAt.END);
            addView(this.description, LayoutHelper.createLinear(-1, -2, 1.0f, 16, 0, 0, AndroidUtilities.dp(8.0f), 0));
            TextView textView3 = new TextView(context);
            this.command = textView3;
            textView3.setTextSize(1, 14.0f);
            TextView textView4 = this.command;
            int i2 = Theme.key_windowBackgroundWhiteGrayText;
            textView4.setTextColor(Theme.getColor(i2));
            this.command.setTag(Integer.valueOf(i2));
            addView(this.command, LayoutHelper.createLinear(-2, -2, 0.0f, 16));
        }

        public String getCommand() {
            return this.commandStr;
        }
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || this.backgroundDrawable == drawable;
    }

    @Override
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.backgroundDrawable.setState(getDrawableState());
    }

    @Override
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.backgroundDrawable.jumpToCurrentState();
    }
}
