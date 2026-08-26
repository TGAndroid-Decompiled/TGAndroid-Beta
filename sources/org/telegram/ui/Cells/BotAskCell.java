package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import com.google.android.gms.internal.mlkit_vision_common.zzkm;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.TopicSeparator;

public abstract class BotAskCell extends View {
    public final TopicSeparator askBotForumSeparator;
    public int backgroundHeight;
    public final BotAskCellDrawable drawable;
    public final Theme.ResourcesProvider resourcesProvider;
    public float viewTop;

    public BotAskCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.resourcesProvider = resourcesProvider;
        this.drawable = new BotAskCellDrawable(context, i, resourcesProvider);
        TopicSeparator topicSeparator = new TopicSeparator(i, this, resourcesProvider, true);
        this.askBotForumSeparator = topicSeparator;
        topicSeparator.text = new Text("", 14.0f, AndroidUtilities.bold());
    }

    public int getSideMenuWidth() {
        return 0;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int sideMenuWidth = getSideMenuWidth();
        int measuredWidth = getMeasuredWidth();
        BotAskCellDrawable botAskCellDrawable = this.drawable;
        int i = ((measuredWidth - botAskCellDrawable.width) + sideMenuWidth) / 2;
        int iDp = AndroidUtilities.dp(34.0f);
        int measuredWidth2 = getMeasuredWidth();
        float f = sideMenuWidth;
        float f2 = f / 2.0f;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (resourcesProvider != null) {
            resourcesProvider.applyServiceShaderMatrix(f2, this.viewTop, measuredWidth2, this.backgroundHeight);
        } else {
            Theme.applyServiceShaderMatrix(Theme.serviceBitmap, Theme.serviceBitmapShader, Theme.serviceBitmapMatrix, measuredWidth2, this.backgroundHeight, f2, this.viewTop);
        }
        this.askBotForumSeparator.draw(canvas, getWidth(), f, 0.0f, 1.0f, 1.0f, false);
        botAskCellDrawable.setBounds(i, iDp, botAskCellDrawable.width + i, botAskCellDrawable.height + iDp);
        botAskCellDrawable.draw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), zzkm.m(40.0f, this.drawable.height));
    }

    public void setDialogId(long j) {
        BotAskCellDrawable botAskCellDrawable = this.drawable;
        botAskCellDrawable.getClass();
        int i = (int) (AndroidUtilities.displaySize.x * 0.95f);
        TLRPC.User user = MessagesController.getInstance(botAskCellDrawable.currentAccount).getUser(Long.valueOf(j));
        Text text = botAskCellDrawable.text;
        text.maxLines = 1;
        text.setText(text.layout.getText());
        text.maxWidth = 9999.0f;
        text.setText(text.layout.getText());
        int i2 = 0;
        text.setText(LocaleController.formatString(R.string.BotForumAskForStartNewChat, UserObject.getUserName(user)));
        float fMax = 0.0f;
        for (int i3 = 0; i3 < text.layout.getLineCount(); i3++) {
            fMax = Math.max(fMax, text.layout.getLineWidth(i3));
        }
        float f = (fMax / 2.0f) * 1.2f;
        text.maxLines = 4;
        text.setText(text.layout.getText());
        float f2 = i;
        text.maxWidth = Math.min(f2, f);
        text.setText(text.layout.getText());
        if (text.layout.getLineCount() > 2) {
            text.maxWidth = Math.min(f2, f * 1.2f);
            text.setText(text.layout.getText());
        }
        float fMax2 = 0.0f;
        for (int i4 = 0; i4 < text.layout.getLineCount(); i4++) {
            fMax2 = Math.max(fMax2, text.layout.getLineWidth(i4));
        }
        float fMax3 = Math.max(0.0f, fMax2);
        float fMax4 = 0.0f;
        while (true) {
            Text text2 = botAskCellDrawable.title;
            if (i2 >= text2.layout.getLineCount()) {
                float fMin = Math.min(Math.max(fMax3, fMax4) + AndroidUtilities.dp(32.0f), f2);
                float fDp = AndroidUtilities.dp(17.0f) + 0.0f + AndroidUtilities.dp(70.0f) + AndroidUtilities.dp(14.0f) + text2.layout.getHeight() + AndroidUtilities.dp(4.0f) + text.layout.getHeight() + AndroidUtilities.dp(2.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(5.0f);
                botAskCellDrawable.width = (int) fMin;
                botAskCellDrawable.height = (int) fDp;
                return;
            }
            fMax4 = Math.max(fMax4, text2.layout.getLineWidth(i2));
            i2++;
        }
    }

    public final void setVisiblePart(float f, int i) {
        this.backgroundHeight = i;
        this.viewTop = f;
    }
}
