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
public abstract class z70 extends org.telegram.ui.ActionBar.f3 {
    public boolean f33091b;

    public z70(Context context, TLRPC.Chat chat) {
        super(context, true);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        setCustomView(linearLayout);
        x9 x9Var = new x9(context);
        x9Var.setRoundRadius(AndroidUtilities.dp(45.0f));
        linearLayout.addView(x9Var, w7.x5.t(90, 90, 49, 0, 29, 0, 0));
        x9Var.e(chat, new i9(chat));
        TextView textView = new TextView(context);
        org.telegram.messenger.wl.j(18.0f, 1, textView);
        com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.j6.f20770j5, null, false, textView, 1);
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.x5.t(-2, -2, 49, 17, 24, 17, 0), context);
        h.setTextSize(1, 14.0f);
        com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.j6.f20915r5, null, false, h, 1);
        linearLayout.addView(h, w7.x5.t(-2, -2, 49, 30, 8, 30, 0));
        ChatObject.Call groupCall = AccountInstance.getInstance(this.currentAccount).getMessagesController().getGroupCall(chat.f19869id, false);
        if (groupCall != null) {
            if (TextUtils.isEmpty(groupCall.call.title)) {
                textView.setText(chat.title);
            } else {
                textView.setText(groupCall.call.title);
            }
            int i10 = groupCall.call.participants_count;
            if (i10 == 0) {
                h.setText(LocaleController.getString(R.string.NoOneJoinedYet));
            } else {
                h.setText(LocaleController.formatPluralString("Participants", i10, new Object[0]));
            }
        } else {
            textView.setText(chat.title);
            h.setText(LocaleController.getString(R.string.NoOneJoinedYet));
        }
        ?? frameLayout = new FrameLayout(context);
        View view = new View(context);
        view.setBackground(org.telegram.ui.ActionBar.y5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
        frameLayout.addView(view, w7.x5.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(context);
        frameLayout.f32860a = textView2;
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        org.telegram.messenger.w1.q(textView2, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false), 1, 14.0f);
        frameLayout.addView(textView2, w7.x5.e(-2, -2, 17));
        frameLayout.setBackground(null);
        if (ChatObject.isChannelOrGiga(chat)) {
            frameLayout.setText(LocaleController.getString(R.string.VoipChannelJoinVoiceChatUrl));
        } else {
            frameLayout.setText(LocaleController.getString(R.string.VoipGroupJoinVoiceChatUrl));
        }
        view.setOnClickListener(new x70(this, 0));
        linearLayout.addView((View) frameLayout, w7.x5.t(-1, 50, 51, 0, 30, 0, 0));
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.f33091b) {
            m();
        }
    }

    public abstract void m();
}
