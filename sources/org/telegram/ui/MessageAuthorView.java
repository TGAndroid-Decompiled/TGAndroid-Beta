package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.HideViewAfterAnimation;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;

public class MessageAuthorView extends FrameLayout {
    int currentAccount;
    FlickerLoadingView flickerLoadingView;
    boolean ignoreLayout;
    boolean isVoice;
    LinkSpanDrawable.LinksTextView titleView;
    public TLRPC.User user;

    public MessageAuthorView(Context context, int i, MessageObject messageObject, TLRPC.Chat chat) {
        super(context);
        this.user = null;
        this.currentAccount = i;
        this.isVoice = messageObject.isRoundVideo() || messageObject.isVoice();
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context);
        this.flickerLoadingView = flickerLoadingView;
        flickerLoadingView.setColors(Theme.key_actionBarDefaultSubmenuBackground, Theme.key_listSelector, -1);
        this.flickerLoadingView.setViewType(13);
        this.flickerLoadingView.setIsSingleCell(false);
        addView(this.flickerLoadingView, LayoutHelper.createFrame(-2, -1.0f));
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
        this.titleView = linksTextView;
        linksTextView.setTextSize(1, 14.0f);
        this.titleView.setGravity(19);
        this.titleView.setTextColor(Theme.getColor(null, Theme.key_actionBarDefaultSubmenuItem, false));
        this.titleView.setLinkTextColor(Theme.getColor(null, Theme.key_chat_messageLinkIn, false));
        this.titleView.setEllipsize(TextUtils.TruncateAt.END);
        this.titleView.setSingleLine();
        this.titleView.setLines(1);
        this.titleView.setMaxLines(1);
        addView(this.titleView, LayoutHelper.createFrame(-1, -2.0f, 19, 12.0f, 0.0f, 12.0f, 0.0f));
        TLRPC.TL_channels_getMessageAuthor tL_channels_getMessageAuthor = new TLRPC.TL_channels_getMessageAuthor();
        tL_channels_getMessageAuthor.channel = MessagesController.getInstance(i).getInputChannel(-messageObject.getDialogId());
        tL_channels_getMessageAuthor.id = messageObject.getId();
        this.titleView.setAlpha(0.0f);
        ConnectionsManager.getInstance(i).sendRequest(tL_channels_getMessageAuthor, new MessageAuthorView$$ExternalSyntheticLambda1(this, i, 0));
        setBackground(Theme.createRadSelectorDrawable(Theme.getColor(null, Theme.key_dialogButtonSelector, false), 6, 0));
        setEnabled(false);
    }

    public void lambda$new$0(TLObject tLObject, int i) {
        if (tLObject instanceof TLRPC.User) {
            this.user = (TLRPC.User) tLObject;
            MessagesController.getInstance(i).putUser(this.user, false);
        }
        updateView();
    }

    public void lambda$new$1(int i, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda2(this, tLObject, i, 20));
    }

    private void updateView() {
        setEnabled(this.user != null);
        TLRPC.User user = this.user;
        if (user != null) {
            this.titleView.setText(AndroidUtilities.premiumText(LocaleController.formatString(R.string.MessageAuthorSentBy, UserObject.getUserName(user)), new LinkManager$3$$ExternalSyntheticLambda0(this, user.id, 4)));
        }
        this.titleView.animate().alpha(1.0f).setDuration(220L).start();
        this.flickerLoadingView.animate().alpha(0.0f).setDuration(220L).setListener(new HideViewAfterAnimation(this.flickerLoadingView)).start();
    }

    @Override
    public void onMeasure(int i, int i2) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824);
        this.ignoreLayout = true;
        boolean z = this.flickerLoadingView.getVisibility() == 0;
        this.titleView.setVisibility(8);
        if (z) {
            this.flickerLoadingView.setVisibility(8);
        }
        super.onMeasure(i, iMakeMeasureSpec);
        if (z) {
            this.flickerLoadingView.getLayoutParams().width = getMeasuredWidth();
            this.flickerLoadingView.setVisibility(0);
        }
        this.titleView.setVisibility(0);
        this.titleView.getLayoutParams().width = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
        this.ignoreLayout = false;
        super.onMeasure(i, iMakeMeasureSpec);
    }

    public void lambda$updateView$2(long j) {
    }

    @Override
    public void requestLayout() {
        if (this.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }
}
