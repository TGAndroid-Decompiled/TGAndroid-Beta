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
public abstract class v80 extends org.telegram.ui.ActionBar.k3 {
    public boolean f33599b;

    public v80(Context context, TLRPC.Chat chat) {
        super(context, true);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        setCustomView(linearLayout);
        y9 y9Var = new y9(context);
        y9Var.setRoundRadius(AndroidUtilities.dp(45.0f));
        linearLayout.addView(y9Var, gb1.x(90, 90, 49, 0, 29, 0, 0));
        y9Var.f(chat, new j9(chat));
        TextView textView = new TextView(context);
        org.telegram.messenger.vh.j(18.0f, 1, textView);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23464j5, null);
        textView.setGravity(1);
        TextView e = org.telegram.messenger.vh.e(linearLayout, textView, gb1.x(-2, -2, 49, 17, 24, 17, 0), context);
        e.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(e, org.telegram.ui.ActionBar.y6.f23614r5, null);
        e.setGravity(1);
        linearLayout.addView(e, gb1.x(-2, -2, 49, 30, 8, 30, 0));
        ChatObject.Call groupCall = AccountInstance.getInstance(this.currentAccount).getMessagesController().getGroupCall(chat.f22027id, false);
        if (groupCall != null) {
            if (TextUtils.isEmpty(groupCall.call.title)) {
                textView.setText(chat.title);
            } else {
                textView.setText(groupCall.call.title);
            }
            int i10 = groupCall.call.participants_count;
            if (i10 == 0) {
                e.setText(LocaleController.getString(R.string.NoOneJoinedYet));
            } else {
                e.setText(LocaleController.formatPluralString("Participants", i10, new Object[0]));
            }
        } else {
            textView.setText(chat.title);
            e.setText(LocaleController.getString(R.string.NoOneJoinedYet));
        }
        ?? frameLayout = new FrameLayout(context);
        View view = new View(context);
        frameLayout.f33291a = view;
        view.setBackground(org.telegram.ui.ActionBar.o6.f(new float[]{4.0f}, org.telegram.ui.ActionBar.y6.Oh));
        frameLayout.addView(view, gb1.h(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(context);
        frameLayout.f33292b = textView2;
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        org.telegram.messenger.t.r(textView2, org.telegram.ui.ActionBar.y6.Sh, null, 1, 14.0f);
        frameLayout.addView(textView2, gb1.i(-2, -2, 17));
        frameLayout.setBackground(null);
        if (ChatObject.isChannelOrGiga(chat)) {
            frameLayout.setText(LocaleController.getString(R.string.VoipChannelJoinVoiceChatUrl));
        } else {
            frameLayout.setText(LocaleController.getString(R.string.VoipGroupJoinVoiceChatUrl));
        }
        view.setOnClickListener(new f0(this, 29));
        linearLayout.addView((View) frameLayout, gb1.x(-1, 50, 51, 0, 30, 0, 0));
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        if (this.f33599b) {
            m();
        }
    }

    public abstract void m();
}
