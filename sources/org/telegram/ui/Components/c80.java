package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public abstract class c80 extends org.telegram.ui.ActionBar.g3 {
    public boolean f23874b;

    public c80(Context context, TLRPC.Chat chat) {
        super(context, true);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        setCustomView(linearLayout);
        p9 p9Var = new p9(context);
        p9Var.setRoundRadius(AndroidUtilities.dp(45.0f));
        linearLayout.addView(p9Var, k7.b6.t(90, 90, 49, 0, 29, 0, 0));
        p9Var.e(chat, new z8(chat));
        TextView textView = new TextView(context);
        org.telegram.ui.b.g(18.0f, 1, textView);
        org.telegram.ui.ai.s(org.telegram.ui.ActionBar.j6.f19987j5, null, false, textView, 1);
        TextView i10 = org.telegram.ui.ai.i(linearLayout, textView, k7.b6.t(-2, -2, 49, 17, 24, 17, 0), context);
        i10.setTextSize(1, 14.0f);
        org.telegram.ui.ai.s(org.telegram.ui.ActionBar.j6.f20131r5, null, false, i10, 1);
        linearLayout.addView(i10, k7.b6.t(-2, -2, 49, 30, 8, 30, 0));
        ChatObject.Call groupCall = AccountInstance.getInstance(this.currentAccount).getMessagesController().getGroupCall(chat.f19159id, false);
        if (groupCall != null) {
            if (TextUtils.isEmpty(groupCall.call.title)) {
                textView.setText(chat.title);
            } else {
                textView.setText(groupCall.call.title);
            }
            int i11 = groupCall.call.participants_count;
            if (i11 == 0) {
                i10.setText(LocaleController.getString(R.string.NoOneJoinedYet));
            } else {
                i10.setText(LocaleController.formatPluralString("Participants", i11, new Object[0]));
            }
        } else {
            textView.setText(chat.title);
            i10.setText(LocaleController.getString(R.string.NoOneJoinedYet));
        }
        ?? frameLayout = new FrameLayout(context);
        View view = new View(context);
        view.setBackground(org.telegram.ui.ActionBar.z5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
        frameLayout.addView(view, k7.b6.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(context);
        frameLayout.f23579a = textView2;
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        org.telegram.messenger.y3.t(textView2, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false), 1, 14.0f);
        frameLayout.addView(textView2, k7.b6.e(-2, -2, 17));
        frameLayout.setBackground(null);
        if (ChatObject.isChannelOrGiga(chat)) {
            frameLayout.setText(LocaleController.getString(R.string.VoipChannelJoinVoiceChatUrl));
        } else {
            frameLayout.setText(LocaleController.getString(R.string.VoipGroupJoinVoiceChatUrl));
        }
        view.setOnClickListener(new a80(this, 0));
        linearLayout.addView((View) frameLayout, k7.b6.t(-1, 50, 51, 0, 30, 0, 0));
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.f23874b) {
            m();
        }
    }

    public abstract void m();
}
