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
public abstract class i80 extends org.telegram.ui.ActionBar.h3 {
    public boolean f23924b;

    public i80(Context context, TLRPC.Chat chat) {
        super(context, true);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        setCustomView(linearLayout);
        w9 w9Var = new w9(context);
        w9Var.setRoundRadius(AndroidUtilities.dp(45.0f));
        linearLayout.addView(w9Var, w7.a6.t(90, 90, 49, 0, 29, 0, 0));
        w9Var.e(chat, new g9(chat));
        TextView textView = new TextView(context);
        org.telegram.messenger.em.j(18.0f, 1, textView);
        com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.j6.f18034j5, null, false, textView, 1);
        TextView g10 = com.google.android.gms.internal.vision.e2.g(linearLayout, textView, w7.a6.t(-2, -2, 49, 17, 24, 17, 0), context);
        g10.setTextSize(1, 14.0f);
        com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.j6.f18179r5, null, false, g10, 1);
        linearLayout.addView(g10, w7.a6.t(-2, -2, 49, 30, 8, 30, 0));
        ChatObject.Call groupCall = AccountInstance.getInstance(this.currentAccount).getMessagesController().getGroupCall(chat.f17195id, false);
        if (groupCall != null) {
            if (TextUtils.isEmpty(groupCall.call.title)) {
                textView.setText(chat.title);
            } else {
                textView.setText(groupCall.call.title);
            }
            int i10 = groupCall.call.participants_count;
            if (i10 == 0) {
                g10.setText(LocaleController.getString(R.string.NoOneJoinedYet));
            } else {
                g10.setText(LocaleController.formatPluralString("Participants", i10, new Object[0]));
            }
        } else {
            textView.setText(chat.title);
            g10.setText(LocaleController.getString(R.string.NoOneJoinedYet));
        }
        ?? frameLayout = new FrameLayout(context);
        View view = new View(context);
        view.setBackground(org.telegram.ui.ActionBar.z5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
        frameLayout.addView(view, w7.a6.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(context);
        frameLayout.f23547a = textView2;
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        org.telegram.messenger.a2.q(textView2, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false), 1, 14.0f);
        frameLayout.addView(textView2, w7.a6.e(-2, -2, 17));
        frameLayout.setBackground(null);
        if (ChatObject.isChannelOrGiga(chat)) {
            frameLayout.setText(LocaleController.getString(R.string.VoipChannelJoinVoiceChatUrl));
        } else {
            frameLayout.setText(LocaleController.getString(R.string.VoipGroupJoinVoiceChatUrl));
        }
        view.setOnClickListener(new g80(this, 0));
        linearLayout.addView((View) frameLayout, w7.a6.t(-1, 50, 51, 0, 30, 0, 0));
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.f23924b) {
            m();
        }
    }

    public abstract void m();
}
