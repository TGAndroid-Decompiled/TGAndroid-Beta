package org.telegram.p009ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1072R;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.RadioButton;

public class ChatListCell extends LinearLayout {
    private C1383ListView[] listView;

    protected void didSelectChatType(boolean z) {
    }

    public class C1383ListView extends FrameLayout {
        private RadioButton button;
        private boolean isThreeLines;
        private RectF rect;
        private TextPaint textPaint;

        public C1383ListView(ChatListCell chatListCell, Context context, boolean z) {
            super(context);
            int i;
            String str;
            this.rect = new RectF();
            boolean z2 = true;
            this.textPaint = new TextPaint(1);
            setWillNotDraw(false);
            this.isThreeLines = z;
            if (z) {
                i = C1072R.string.ChatListExpanded;
                str = "ChatListExpanded";
            } else {
                i = C1072R.string.ChatListDefault;
                str = "ChatListDefault";
            }
            setContentDescription(LocaleController.getString(str, i));
            this.textPaint.setTextSize(AndroidUtilities.m36dp(13.0f));
            RadioButton radioButton = new RadioButton(context, chatListCell) {
                @Override
                public void invalidate() {
                    super.invalidate();
                    C1383ListView.this.invalidate();
                }
            };
            this.button = radioButton;
            radioButton.setSize(AndroidUtilities.m36dp(20.0f));
            addView(this.button, LayoutHelper.createFrame(22, 22.0f, 53, 0.0f, 26.0f, 10.0f, 0.0f));
            RadioButton radioButton2 = this.button;
            boolean z3 = this.isThreeLines;
            if ((!z3 || !SharedConfig.useThreeLinesLayout) && (z3 || SharedConfig.useThreeLinesLayout)) {
                z2 = false;
            }
            radioButton2.setChecked(z2, false);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            int i;
            String str;
            int color = Theme.getColor("switchTrack");
            int red = Color.red(color);
            int green = Color.green(color);
            int blue = Color.blue(color);
            this.button.setColor(Theme.getColor("radioBackground"), Theme.getColor("radioBackgroundChecked"));
            this.rect.set(AndroidUtilities.m36dp(1.0f), AndroidUtilities.m36dp(1.0f), getMeasuredWidth() - AndroidUtilities.m36dp(1.0f), AndroidUtilities.m36dp(73.0f));
            Theme.chat_instantViewRectPaint.setColor(Color.argb((int) (this.button.getProgress() * 43.0f), red, green, blue));
            canvas.drawRoundRect(this.rect, AndroidUtilities.m36dp(6.0f), AndroidUtilities.m36dp(6.0f), Theme.chat_instantViewRectPaint);
            this.rect.set(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.m36dp(74.0f));
            Theme.dialogs_onlineCirclePaint.setColor(Color.argb((int) ((1.0f - this.button.getProgress()) * 31.0f), red, green, blue));
            canvas.drawRoundRect(this.rect, AndroidUtilities.m36dp(6.0f), AndroidUtilities.m36dp(6.0f), Theme.dialogs_onlineCirclePaint);
            if (this.isThreeLines) {
                i = C1072R.string.ChatListExpanded;
                str = "ChatListExpanded";
            } else {
                i = C1072R.string.ChatListDefault;
                str = "ChatListDefault";
            }
            String string = LocaleController.getString(str, i);
            this.textPaint.setColor(Theme.getColor("windowBackgroundWhiteBlackText"));
            canvas.drawText(string, (getMeasuredWidth() - ((int) Math.ceil(this.textPaint.measureText(string)))) / 2, AndroidUtilities.m36dp(96.0f), this.textPaint);
            int i2 = 0;
            for (int i3 = 2; i2 < i3; i3 = 2) {
                int m36dp = AndroidUtilities.m36dp(i2 == 0 ? 21.0f : 53.0f);
                Theme.dialogs_onlineCirclePaint.setColor(Color.argb(i2 == 0 ? 204 : 90, red, green, blue));
                canvas.drawCircle(AndroidUtilities.m36dp(22.0f), m36dp, AndroidUtilities.m36dp(11.0f), Theme.dialogs_onlineCirclePaint);
                int i4 = 0;
                while (true) {
                    if (i4 < (this.isThreeLines ? 3 : 2)) {
                        Theme.dialogs_onlineCirclePaint.setColor(Color.argb(i4 == 0 ? 204 : 90, red, green, blue));
                        if (this.isThreeLines) {
                            float f = i4 * 7;
                            this.rect.set(AndroidUtilities.m36dp(41.0f), m36dp - AndroidUtilities.m36dp(8.3f - f), getMeasuredWidth() - AndroidUtilities.m36dp(i4 != 0 ? 48.0f : 72.0f), m36dp - AndroidUtilities.m36dp(5.3f - f));
                            canvas.drawRoundRect(this.rect, AndroidUtilities.dpf2(1.5f), AndroidUtilities.dpf2(1.5f), Theme.dialogs_onlineCirclePaint);
                        } else {
                            int i5 = i4 * 10;
                            this.rect.set(AndroidUtilities.m36dp(41.0f), m36dp - AndroidUtilities.m36dp(7 - i5), getMeasuredWidth() - AndroidUtilities.m36dp(i4 != 0 ? 48.0f : 72.0f), m36dp - AndroidUtilities.m36dp(3 - i5));
                            canvas.drawRoundRect(this.rect, AndroidUtilities.m36dp(2.0f), AndroidUtilities.m36dp(2.0f), Theme.dialogs_onlineCirclePaint);
                        }
                        i4++;
                    }
                }
                i2++;
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            int i;
            String str;
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(RadioButton.class.getName());
            accessibilityNodeInfo.setChecked(this.button.isChecked());
            accessibilityNodeInfo.setCheckable(true);
            if (this.isThreeLines) {
                i = C1072R.string.ChatListExpanded;
                str = "ChatListExpanded";
            } else {
                i = C1072R.string.ChatListDefault;
                str = "ChatListDefault";
            }
            accessibilityNodeInfo.setContentDescription(LocaleController.getString(str, i));
        }
    }

    public ChatListCell(Context context) {
        super(context);
        this.listView = new C1383ListView[2];
        setOrientation(0);
        setPadding(AndroidUtilities.m36dp(21.0f), AndroidUtilities.m36dp(10.0f), AndroidUtilities.m36dp(21.0f), 0);
        int i = 0;
        while (true) {
            C1383ListView[] c1383ListViewArr = this.listView;
            if (i >= c1383ListViewArr.length) {
                return;
            }
            final boolean z = i == 1;
            c1383ListViewArr[i] = new C1383ListView(this, context, z);
            addView(this.listView[i], LayoutHelper.createLinear(-1, -1, 0.5f, i == 1 ? 10 : 0, 0, 0, 0));
            this.listView[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ChatListCell.this.lambda$new$0(z, view);
                }
            });
            i++;
        }
    }

    public void lambda$new$0(boolean z, View view) {
        for (int i = 0; i < 2; i++) {
            this.listView[i].button.setChecked(this.listView[i] == view, true);
        }
        didSelectChatType(z);
    }

    @Override
    public void invalidate() {
        super.invalidate();
        int i = 0;
        while (true) {
            C1383ListView[] c1383ListViewArr = this.listView;
            if (i >= c1383ListViewArr.length) {
                return;
            }
            c1383ListViewArr[i].invalidate();
            i++;
        }
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m36dp(123.0f), 1073741824));
    }
}
