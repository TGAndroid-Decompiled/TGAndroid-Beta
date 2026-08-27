package org.telegram.ui.Cells;

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
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.mc;
import org.telegram.ui.gy;
import org.telegram.ui.rn;

public final class ma implements View.OnClickListener {

    public final int f24691a = 0;

    public final boolean f24692b;

    public final int f24693c;
    public final org.telegram.ui.ActionBar.n2 d;

    public final Serializable f24694e;

    public ma(rn rnVar, TLRPC.User user, String str, boolean z10, int i10) {
        this.d = rnVar;
        this.f24694e = str;
        this.f24692b = z10;
        this.f24693c = i10;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f24691a;
        int i11 = this.f24693c;
        boolean z10 = this.f24692b;
        Serializable serializable = this.f24694e;
        org.telegram.ui.ActionBar.n2 n2Var = this.d;
        int i12 = 0;
        switch (i10) {
            case 0:
                gy gyVar = (gy) n2Var;
                ArrayList<UnconfirmedAuthController.UnconfirmedAuth> arrayList = (ArrayList) serializable;
                String string = LocaleController.getString(R.string.UnconfirmedAuthConfirmedMessage);
                int i13 = org.telegram.ui.ActionBar.g6.Gi;
                SpannableStringBuilder spannableStringBuilderReplaceSingleTag = AndroidUtilities.replaceSingleTag(string, i13, 0, new g(gyVar, 10));
                SpannableString spannableString = new SpannableString(">");
                cq cqVar = new cq(R.drawable.attach_arrow_right, 0);
                cqVar.setOverrideColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
                cqVar.setScale(0.7f, 0.7f);
                cqVar.setWidth(AndroidUtilities.dp(12.0f));
                spannableString.setSpan(cqVar, 0, spannableString.length(), 33);
                AndroidUtilities.replaceCharSequence(">", spannableStringBuilderReplaceSingleTag, spannableString);
                mc.a0(gyVar).M(LocaleController.getString(z10 ? R.string.UnconfirmedAuthConfirmedBot : R.string.UnconfirmedAuthConfirmed), spannableStringBuilderReplaceSingleTag, R.raw.contact_check).j();
                MessagesController.getInstance(i11).getUnconfirmedAuthController().confirm(arrayList, new cg.h(3));
                MessagesController.getInstance(i11).getUnconfirmedAuthController().cleanup();
                break;
            default:
                rn rnVar = (rn) n2Var;
                String str = (String) serializable;
                Pattern pattern = org.telegram.ui.Components.y4.f34802a;
                if (rnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(rnVar.getParentActivity(), null, false, false);
                    e3Var.fixNavigationBar();
                    e3Var.title = LocaleController.getString(z10 ? R.string.ChatWithAdminChannelTitle : R.string.ChatWithAdminGroupTitle);
                    e3Var.bigTitle = true;
                    LinearLayout linearLayout = new LinearLayout(rnVar.getParentActivity());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(rnVar.getParentActivity());
                    linearLayout.addView(textView, h7.z5.t(-1, -1, 0, 21, 0, 21, 8));
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
                    textView.setTextSize(1, 16.0f);
                    textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatWithAdminMessage", R.string.ChatWithAdminMessage, str, LocaleController.formatDateAudio(i11, false))));
                    TextView textView2 = new TextView(rnVar.getParentActivity());
                    textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                    textView2.setGravity(17);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setText(LocaleController.getString(R.string.IUnderstand));
                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                    int iDp = AndroidUtilities.dp(8.0f);
                    int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false);
                    int iW1 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
                    textView2.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp, iDp, iDp, iDp, iW0, iW1, iW1));
                    linearLayout.addView(textView2, h7.z5.t(-1, 48, 0, 16, 12, 16, 8));
                    e3Var.customView = linearLayout;
                    e3Var.show();
                    textView2.setOnClickListener(new org.telegram.ui.Components.z2(e3Var, i12));
                    break;
                }
                break;
        }
    }

    public ma(gy gyVar, boolean z10, int i10, ArrayList arrayList) {
        this.d = gyVar;
        this.f24692b = z10;
        this.f24693c = i10;
        this.f24694e = arrayList;
    }
}
