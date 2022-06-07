package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
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
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC$BotInfo;
import org.telegram.tgnet.TLRPC$TL_botCommand;
import org.telegram.ui.ActionBar.MenuDrawable;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.RecyclerListView;

public class BotCommandsMenuView extends View {
    final MenuDrawable backDrawable;
    Drawable backgroundDrawable;
    float expandProgress;
    boolean expanded;
    boolean isOpened;
    boolean isWebView;
    boolean isWebViewOpened;
    int lastSize;
    StaticLayout menuTextLayout;
    final TextPaint textPaint;
    final RectF rectTmp = new RectF();
    final Paint paint = new Paint(1);
    RLottieDrawable webViewAnimation = new RLottieDrawable(R.raw.bot_webview_sheet_to_cross, String.valueOf((int) R.raw.bot_webview_sheet_to_cross) + hashCode(), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)) {
        @Override
        public void invalidateSelf() {
            super.invalidateSelf();
            BotCommandsMenuView.this.invalidate();
        }

        @Override
        protected void invalidateInternal() {
            super.invalidateInternal();
            BotCommandsMenuView.this.invalidate();
        }
    };
    private String menuText = LocaleController.getString((int) R.string.BotsMenuTitle);
    boolean drawBackgroundDrawable = true;

    protected void onTranslationChanged(float f) {
    }

    public BotCommandsMenuView(Context context) {
        super(context);
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
        updateColors();
        menuDrawable.setMiniIcon(true);
        menuDrawable.setRotateToBack(false);
        menuDrawable.setRotation(0.0f, false);
        menuDrawable.setCallback(this);
        textPaint.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        menuDrawable.setRoundCap();
        Drawable createSimpleSelectorRoundRectDrawable = Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(16.0f), 0, Theme.getColor("featuredStickers_addButtonPressed"));
        this.backgroundDrawable = createSimpleSelectorRoundRectDrawable;
        createSimpleSelectorRoundRectDrawable.setCallback(this);
        setContentDescription(LocaleController.getString("AccDescrBotMenu", R.string.AccDescrBotMenu));
    }

    public void setDrawBackgroundDrawable(boolean z) {
        this.drawBackgroundDrawable = z;
        invalidate();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.webViewAnimation.addParentView(this);
        this.webViewAnimation.setCurrentParentView(this);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.webViewAnimation.removeParentView(this);
    }

    public void setWebView(boolean z) {
        this.isWebView = z;
        invalidate();
    }

    private void updateColors() {
        this.paint.setColor(Theme.getColor("chat_messagePanelVoiceBackground"));
        int color = Theme.getColor("chat_messagePanelVoicePressed");
        this.backDrawable.setBackColor(color);
        this.backDrawable.setIconColor(color);
        this.textPaint.setColor(color);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int size = (View.MeasureSpec.getSize(i) + View.MeasureSpec.getSize(i2)) << 16;
        if (this.lastSize != size || this.menuTextLayout == null) {
            this.backDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.textPaint.setTextSize(AndroidUtilities.dp(15.0f));
            this.lastSize = size;
            int measureText = (int) this.textPaint.measureText(this.menuText);
            this.menuTextLayout = StaticLayoutEx.createStaticLayout(this.menuText, this.textPaint, measureText, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, measureText, 1);
        }
        onTranslationChanged((this.menuTextLayout.getWidth() + AndroidUtilities.dp(4.0f)) * this.expandProgress);
        int dp = AndroidUtilities.dp(40.0f);
        if (this.expanded) {
            dp += this.menuTextLayout.getWidth() + AndroidUtilities.dp(4.0f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
    }

    @Override
    protected void dispatchDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.BotCommandsMenuView.dispatchDraw(android.graphics.Canvas):void");
    }

    public boolean setMenuText(String str) {
        if (str == null) {
            str = LocaleController.getString((int) R.string.BotsMenuTitle);
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
        ArrayList<String> newResult = new ArrayList<>();
        ArrayList<String> newResultHelp = new ArrayList<>();

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
            botCommandView.command.setText(this.newResult.get(i));
            botCommandView.description.setText(this.newResultHelp.get(i));
            botCommandView.commandStr = this.newResult.get(i);
        }

        @Override
        public int getItemCount() {
            return this.newResult.size();
        }

        public void setBotInfo(LongSparseArray<TLRPC$BotInfo> longSparseArray) {
            this.newResult.clear();
            this.newResultHelp.clear();
            for (int i = 0; i < longSparseArray.size(); i++) {
                TLRPC$BotInfo valueAt = longSparseArray.valueAt(i);
                for (int i2 = 0; i2 < valueAt.commands.size(); i2++) {
                    TLRPC$TL_botCommand tLRPC$TL_botCommand = valueAt.commands.get(i2);
                    if (!(tLRPC$TL_botCommand == null || tLRPC$TL_botCommand.command == null)) {
                        ArrayList<String> arrayList = this.newResult;
                        arrayList.add("/" + tLRPC$TL_botCommand.command);
                        String str = tLRPC$TL_botCommand.description;
                        if (str == null || str.length() <= 1) {
                            this.newResultHelp.add(tLRPC$TL_botCommand.description);
                        } else {
                            ArrayList<String> arrayList2 = this.newResultHelp;
                            arrayList2.add(tLRPC$TL_botCommand.description.substring(0, 1).toUpperCase() + tLRPC$TL_botCommand.description.substring(1).toLowerCase());
                        }
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
        int i = 1;
        if (!this.isWebView) {
            this.backDrawable.setRotation(z ? 1.0f : 0.0f, true);
        } else if (this.isWebViewOpened != z) {
            RLottieDrawable rLottieDrawable = this.webViewAnimation;
            if (!rLottieDrawable.hasParentView()) {
                rLottieDrawable.addParentView(this);
            }
            rLottieDrawable.stop();
            rLottieDrawable.setPlayInDirectionOfCustomEndFrame(true);
            if (z) {
                i = rLottieDrawable.getFramesCount();
            }
            rLottieDrawable.setCustomEndFrame(i);
            rLottieDrawable.start();
            this.isWebViewOpened = z;
        }
    }

    public static class BotCommandView extends LinearLayout {
        TextView command;
        String commandStr;
        TextView description;

        public BotCommandView(Context context) {
            super(context);
            setOrientation(0);
            setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
            TextView textView = new TextView(context);
            this.description = textView;
            textView.setTextSize(1, 16.0f);
            this.description.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
            this.description.setTag("windowBackgroundWhiteBlackText");
            this.description.setLines(1);
            this.description.setEllipsize(TextUtils.TruncateAt.END);
            addView(this.description, LayoutHelper.createLinear(-1, -2, 1.0f, 16, 0, 0, AndroidUtilities.dp(8.0f), 0));
            TextView textView2 = new TextView(context);
            this.command = textView2;
            textView2.setTextSize(1, 14.0f);
            this.command.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText"));
            this.command.setTag("windowBackgroundWhiteGrayText");
            addView(this.command, LayoutHelper.createLinear(-2, -2, 0.0f, 16));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
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
