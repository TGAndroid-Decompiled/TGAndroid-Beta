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
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.yc;
import org.telegram.ui.co;
import org.telegram.ui.uy;
public final class ta implements View.OnClickListener {
    public final int f23299a = 1;
    public final boolean f23300b;
    public final int f23301c;
    public final org.telegram.ui.ActionBar.n2 d;
    public final Serializable f23302e;

    public ta(co coVar, TLRPC.User user, String str, boolean z10, int i10) {
        this.d = coVar;
        this.f23302e = str;
        this.f23300b = z10;
        this.f23301c = i10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12 = this.f23299a;
        int i13 = this.f23301c;
        boolean z10 = this.f23300b;
        Serializable serializable = this.f23302e;
        org.telegram.ui.ActionBar.n2 n2Var = this.d;
        switch (i12) {
            case 0:
                uy uyVar = (uy) n2Var;
                ArrayList<UnconfirmedAuthController.UnconfirmedAuth> arrayList = (ArrayList) serializable;
                String string = LocaleController.getString(R.string.UnconfirmedAuthConfirmedMessage);
                int i14 = org.telegram.ui.ActionBar.j6.Gi;
                SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(string, i14, 0, new g(uyVar, 10));
                SpannableString spannableString = new SpannableString(">");
                nq nqVar = new nq(R.drawable.attach_arrow_right, 0);
                nqVar.setOverrideColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
                nqVar.setScale(0.7f, 0.7f);
                nqVar.setWidth(AndroidUtilities.dp(12.0f));
                spannableString.setSpan(nqVar, 0, spannableString.length(), 33);
                AndroidUtilities.replaceCharSequence(">", replaceSingleTag, spannableString);
                yc a02 = yc.a0(uyVar);
                int i15 = R.raw.contact_check;
                if (z10) {
                    i10 = R.string.UnconfirmedAuthConfirmedBot;
                } else {
                    i10 = R.string.UnconfirmedAuthConfirmed;
                }
                a02.M(LocaleController.getString(i10), replaceSingleTag, i15).j();
                MessagesController.getInstance(i13).getUnconfirmedAuthController().confirm(arrayList, new org.telegram.ui.ActionBar.j3(2));
                MessagesController.getInstance(i13).getUnconfirmedAuthController().cleanup();
                return;
            default:
                co coVar = (co) n2Var;
                String str = (String) serializable;
                Pattern pattern = org.telegram.ui.Components.e5.f25557a;
                if (coVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) coVar.getParentActivity(), (org.telegram.ui.ActionBar.f6) null, false);
                    f3Var.fixNavigationBar();
                    if (z10) {
                        i11 = R.string.ChatWithAdminChannelTitle;
                    } else {
                        i11 = R.string.ChatWithAdminGroupTitle;
                    }
                    f3Var.title = LocaleController.getString(i11);
                    f3Var.bigTitle = true;
                    LinearLayout linearLayout = new LinearLayout(coVar.getParentActivity());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(coVar.getParentActivity());
                    linearLayout.addView(textView, w7.x5.t(-1, -1, 0, 21, 0, 21, 8));
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
                    textView.setTextSize(1, 16.0f);
                    textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatWithAdminMessage", R.string.ChatWithAdminMessage, str, LocaleController.formatDateAudio(i13, false))));
                    TextView textView2 = new TextView(coVar.getParentActivity());
                    textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                    textView2.setGravity(17);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setText(LocaleController.getString(R.string.IUnderstand));
                    textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
                    int dp = AndroidUtilities.dp(8.0f);
                    int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
                    int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
                    textView2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, w02, w03, w03));
                    linearLayout.addView(textView2, w7.x5.t(-1, 48, 0, 16, 12, 16, 8));
                    f3Var.customView = linearLayout;
                    f3Var.show();
                    textView2.setOnClickListener(new org.telegram.ui.Components.e3(f3Var, 0));
                    return;
                }
                return;
        }
    }

    public ta(uy uyVar, boolean z10, int i10, ArrayList arrayList) {
        this.d = uyVar;
        this.f23300b = z10;
        this.f23301c = i10;
        this.f23302e = arrayList;
    }
}
