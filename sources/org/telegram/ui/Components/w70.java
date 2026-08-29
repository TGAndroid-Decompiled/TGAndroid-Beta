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
public abstract class w70 extends org.telegram.ui.ActionBar.f3 {
    public boolean f34342b;

    public w70(Context context, TLRPC.Chat chat) {
        super(context, true);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        setCustomView(linearLayout);
        t9 t9Var = new t9(context);
        t9Var.setRoundRadius(AndroidUtilities.dp(45.0f));
        linearLayout.addView(t9Var, i7.f6.t(90, 90, 49, 0, 29, 0, 0));
        t9Var.e(chat, new e9(chat));
        TextView textView = new TextView(context);
        org.telegram.ui.b.g(18.0f, 1, textView);
        org.telegram.ui.th.s(org.telegram.ui.ActionBar.g6.f23169j5, null, false, textView, 1);
        TextView i10 = org.telegram.ui.th.i(linearLayout, textView, i7.f6.t(-2, -2, 49, 17, 24, 17, 0), context);
        i10.setTextSize(1, 14.0f);
        org.telegram.ui.th.s(org.telegram.ui.ActionBar.g6.f23310r5, null, false, i10, 1);
        linearLayout.addView(i10, i7.f6.t(-2, -2, 49, 30, 8, 30, 0));
        ChatObject.Call groupCall = AccountInstance.getInstance(this.currentAccount).getMessagesController().getGroupCall(chat.f22392id, false);
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
        view.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
        frameLayout.addView(view, i7.f6.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(context);
        frameLayout.f33487a = textView2;
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        org.telegram.messenger.x3.t(textView2, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false), 1, 14.0f);
        frameLayout.addView(textView2, i7.f6.e(-2, -2, 17));
        frameLayout.setBackground(null);
        if (ChatObject.isChannelOrGiga(chat)) {
            frameLayout.setText(LocaleController.getString(R.string.VoipChannelJoinVoiceChatUrl));
        } else {
            frameLayout.setText(LocaleController.getString(R.string.VoipGroupJoinVoiceChatUrl));
        }
        view.setOnClickListener(new u70(this, 0));
        linearLayout.addView((View) frameLayout, i7.f6.t(-1, 50, 51, 0, 30, 0, 0));
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.f34342b) {
            m();
        }
    }

    public abstract void m();
}
