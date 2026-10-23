package org.telegram.ui.Cells;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xq;
import org.telegram.ui.ey;
import org.telegram.ui.sn;
public final class ra implements View.OnClickListener {
    public final int f23121a = 0;
    public final boolean f23122b;
    public final int f23123c;
    public final org.telegram.ui.ActionBar.o2 d;
    public final Serializable e;

    public ra(sn snVar, TLRPC.User user, String str, boolean z10, int i10) {
        this.d = snVar;
        this.e = str;
        this.f23122b = z10;
        this.f23123c = i10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12 = this.f23121a;
        int i13 = this.f23123c;
        boolean z10 = this.f23122b;
        Serializable serializable = this.e;
        org.telegram.ui.ActionBar.o2 o2Var = this.d;
        switch (i12) {
            case 0:
                ey eyVar = (ey) o2Var;
                ArrayList<UnconfirmedAuthController.UnconfirmedAuth> arrayList = (ArrayList) serializable;
                String string = LocaleController.getString(R.string.UnconfirmedAuthConfirmedMessage);
                int i14 = org.telegram.ui.ActionBar.k6.Gi;
                SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(string, i14, 0, new g(eyVar, 10));
                SpannableString spannableString = new SpannableString(">");
                xq xqVar = new xq(R.drawable.attach_arrow_right, 0);
                xqVar.setOverrideColor(org.telegram.ui.ActionBar.k6.x0(null, i14, false));
                xqVar.setScale(0.7f, 0.7f);
                xqVar.setWidth(AndroidUtilities.dp(12.0f));
                spannableString.setSpan(xqVar, 0, spannableString.length(), 33);
                AndroidUtilities.replaceCharSequence(">", replaceSingleTag, spannableString);
                xc a02 = xc.a0(eyVar);
                int i15 = R.raw.contact_check;
                if (z10) {
                    i10 = R.string.UnconfirmedAuthConfirmedBot;
                } else {
                    i10 = R.string.UnconfirmedAuthConfirmed;
                }
                a02.M(LocaleController.getString(i10), replaceSingleTag, i15).j();
                MessagesController.getInstance(i13).getUnconfirmedAuthController().confirm(arrayList, new ci.e(8));
                MessagesController.getInstance(i13).getUnconfirmedAuthController().cleanup();
                return;
            default:
                sn snVar = (sn) o2Var;
                String str = (String) serializable;
                Pattern pattern = org.telegram.ui.Components.f5.f26167a;
                if (snVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) snVar.getParentActivity(), (org.telegram.ui.ActionBar.g6) null, false);
                    h3Var.fixNavigationBar();
                    if (z10) {
                        i11 = R.string.ChatWithAdminChannelTitle;
                    } else {
                        i11 = R.string.ChatWithAdminGroupTitle;
                    }
                    h3Var.title = LocaleController.getString(i11);
                    h3Var.bigTitle = true;
                    LinearLayout linearLayout = new LinearLayout(snVar.getParentActivity());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(snVar.getParentActivity());
                    linearLayout.addView(textView, w7.z5.t(-1, -1, 0, 21, 0, 21, 8));
                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.G6, null);
                    textView.setTextSize(1, 16.0f);
                    textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatWithAdminMessage", R.string.ChatWithAdminMessage, str, LocaleController.formatDateAudio(i13, false))));
                    TextView textView2 = new TextView(snVar.getParentActivity());
                    textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                    textView2.setGravity(17);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setText(LocaleController.getString(R.string.IUnderstand));
                    org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.Sh, null);
                    int dp = AndroidUtilities.dp(8.0f);
                    int i16 = org.telegram.ui.ActionBar.k6.Oh;
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, i16, false);
                    int i17 = org.telegram.ui.ActionBar.k6.Qh;
                    int x03 = org.telegram.ui.ActionBar.k6.x0(null, i17, false);
                    y j02 = org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, x02, x03, x03);
                    org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i16);
                    org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i17);
                    textView2.setBackground(j02);
                    org.telegram.ui.ActionBar.r6.k(textView2, j02, O, O2, null);
                    linearLayout.addView(textView2, w7.z5.t(-1, 48, 0, 16, 12, 16, 8));
                    h3Var.customView = linearLayout;
                    h3Var.show();
                    textView2.setOnClickListener(new org.telegram.ui.Components.e3(h3Var, 0));
                    return;
                }
                return;
        }
    }

    public ra(ey eyVar, boolean z10, int i10, ArrayList arrayList) {
        this.d = eyVar;
        this.f23122b = z10;
        this.f23123c = i10;
        this.e = arrayList;
    }
}
