package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;

public abstract class MessageAuthorView extends FrameLayout {
    public final FlickerLoadingView flickerLoadingView;
    public boolean ignoreLayout;
    public final LinkSpanDrawable.LinksTextView titleView;
    public TLRPC.User user;

    public MessageAuthorView(Context context, int i, MessageObject messageObject) {
        super(context);
        this.user = null;
        if (!messageObject.isRoundVideo()) {
            messageObject.isVoice();
        }
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, null);
        this.flickerLoadingView = flickerLoadingView;
        int i2 = Theme.key_actionBarDefaultSubmenuBackground;
        int i3 = Theme.key_listSelector;
        flickerLoadingView.colorKey1 = i2;
        flickerLoadingView.colorKey2 = i3;
        flickerLoadingView.colorKey3 = -1;
        flickerLoadingView.invalidate();
        flickerLoadingView.setViewType(13);
        flickerLoadingView.setIsSingleCell(false);
        addView(flickerLoadingView, LayoutHelper.createFrame(-1.0f, -2));
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, null);
        this.titleView = linksTextView;
        linksTextView.setTextSize(1, 14.0f);
        linksTextView.setGravity(19);
        linksTextView.setTextColor(Theme.getColor(null, Theme.key_actionBarDefaultSubmenuItem, false));
        linksTextView.setLinkTextColor(Theme.getColor(null, Theme.key_chat_messageLinkIn, false));
        linksTextView.setEllipsize(TextUtils.TruncateAt.END);
        linksTextView.setSingleLine();
        linksTextView.setLines(1);
        linksTextView.setMaxLines(1);
        addView(linksTextView, LayoutHelper.createFrame(-1, -2.0f, 19, 12.0f, 0.0f, 12.0f, 0.0f));
        TLRPC.TL_channels_getMessageAuthor tL_channels_getMessageAuthor = new TLRPC.TL_channels_getMessageAuthor();
        tL_channels_getMessageAuthor.channel = MessagesController.getInstance(i).getInputChannel(-messageObject.getDialogId());
        tL_channels_getMessageAuthor.id = messageObject.getId();
        linksTextView.setAlpha(0.0f);
        ConnectionsManager.getInstance(i).sendRequest(tL_channels_getMessageAuthor, new LaunchActivity$$ExternalSyntheticLambda63(this, i, 3));
        setBackground(Theme.createRadSelectorDrawable(Theme.getColor(null, Theme.key_dialogButtonSelector, false), 6, 0));
        setEnabled(false);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824);
        this.ignoreLayout = true;
        FlickerLoadingView flickerLoadingView = this.flickerLoadingView;
        boolean z = flickerLoadingView.getVisibility() == 0;
        LinkSpanDrawable.LinksTextView linksTextView = this.titleView;
        linksTextView.setVisibility(8);
        if (z) {
            flickerLoadingView.setVisibility(8);
        }
        super.onMeasure(i, iMakeMeasureSpec);
        if (z) {
            flickerLoadingView.getLayoutParams().width = getMeasuredWidth();
            flickerLoadingView.setVisibility(0);
        }
        linksTextView.setVisibility(0);
        linksTextView.getLayoutParams().width = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
        this.ignoreLayout = false;
        super.onMeasure(i, iMakeMeasureSpec);
    }

    @Override
    public final void requestLayout() {
        if (this.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }
}
