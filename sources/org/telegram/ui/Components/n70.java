package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public abstract class n70 extends org.telegram.ui.ActionBar.e3 {

    public boolean f30890b;

    public n70(Context context, TLRPC.Chat chat) {
        super(context, true);
        int i10 = 0;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        setCustomView(linearLayout);
        n9 n9Var = new n9(context);
        n9Var.setRoundRadius(AndroidUtilities.dp(45.0f));
        linearLayout.addView(n9Var, h7.z5.t(90, 90, 49, 0, 29, 0, 0));
        n9Var.e(chat, new y8(chat));
        TextView textView = new TextView(context);
        org.telegram.messenger.rl.h(18.0f, 1, textView);
        org.telegram.ui.Cells.pa.s(org.telegram.ui.ActionBar.g6.f23161j5, null, false, textView, 1);
        TextView textViewI = org.telegram.ui.Cells.pa.i(linearLayout, textView, h7.z5.t(-2, -2, 49, 17, 24, 17, 0), context);
        textViewI.setTextSize(1, 14.0f);
        org.telegram.ui.Cells.pa.s(org.telegram.ui.ActionBar.g6.f23300r5, null, false, textViewI, 1);
        linearLayout.addView(textViewI, h7.z5.t(-2, -2, 49, 30, 8, 30, 0));
        ChatObject.Call groupCall = AccountInstance.getInstance(this.currentAccount).getMessagesController().getGroupCall(chat.f22380id, false);
        if (groupCall != null) {
            if (TextUtils.isEmpty(groupCall.call.title)) {
                textView.setText(chat.title);
            } else {
                textView.setText(groupCall.call.title);
            }
            int i11 = groupCall.call.participants_count;
            if (i11 == 0) {
                textViewI.setText(LocaleController.getString(R.string.NoOneJoinedYet));
            } else {
                textViewI.setText(LocaleController.formatPluralString("Participants", i11, new Object[0]));
            }
        } else {
            textView.setText(chat.title);
            textViewI.setText(LocaleController.getString(R.string.NoOneJoinedYet));
        }
        m70 m70Var = new m70(context);
        View view = new View(context);
        view.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
        m70Var.addView(view, h7.z5.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(context);
        m70Var.f30608a = textView2;
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        org.telegram.messenger.y1.s(textView2, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false), 1, 14.0f);
        m70Var.addView(textView2, h7.z5.e(-2, -2, 17));
        m70Var.setBackground(null);
        if (ChatObject.isChannelOrGiga(chat)) {
            m70Var.setText(LocaleController.getString(R.string.VoipChannelJoinVoiceChatUrl));
        } else {
            m70Var.setText(LocaleController.getString(R.string.VoipGroupJoinVoiceChatUrl));
        }
        view.setOnClickListener(new l70(this, i10));
        linearLayout.addView(m70Var, h7.z5.t(-1, 50, 51, 0, 30, 0, 0));
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.f30890b) {
            m();
        }
    }

    public abstract void m();
}
