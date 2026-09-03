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
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.qc;
import org.telegram.ui.py;
import org.telegram.ui.xn;
public final class pa implements View.OnClickListener {
    public final int f23344a = 0;
    public final boolean f23345b;
    public final int f23346c;
    public final org.telegram.ui.ActionBar.p2 d;
    public final Serializable f23347e;

    public pa(xn xnVar, TLRPC.User user, String str, boolean z4, int i10) {
        this.d = xnVar;
        this.f23347e = str;
        this.f23345b = z4;
        this.f23346c = i10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12 = this.f23344a;
        int i13 = this.f23346c;
        boolean z4 = this.f23345b;
        Serializable serializable = this.f23347e;
        org.telegram.ui.ActionBar.p2 p2Var = this.d;
        switch (i12) {
            case 0:
                py pyVar = (py) p2Var;
                ArrayList<UnconfirmedAuthController.UnconfirmedAuth> arrayList = (ArrayList) serializable;
                String string = LocaleController.getString(R.string.UnconfirmedAuthConfirmedMessage);
                int i14 = org.telegram.ui.ActionBar.k6.Gi;
                SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(string, i14, 0, new g(pyVar, 10));
                SpannableString spannableString = new SpannableString(">");
                oq oqVar = new oq(R.drawable.attach_arrow_right, 0);
                oqVar.setOverrideColor(org.telegram.ui.ActionBar.k6.w0(null, i14, false));
                oqVar.setScale(0.7f, 0.7f);
                oqVar.setWidth(AndroidUtilities.dp(12.0f));
                spannableString.setSpan(oqVar, 0, spannableString.length(), 33);
                AndroidUtilities.replaceCharSequence(">", replaceSingleTag, spannableString);
                qc a02 = qc.a0(pyVar);
                int i15 = R.raw.contact_check;
                if (z4) {
                    i10 = R.string.UnconfirmedAuthConfirmedBot;
                } else {
                    i10 = R.string.UnconfirmedAuthConfirmed;
                }
                a02.M(LocaleController.getString(i10), replaceSingleTag, i15).j();
                MessagesController.getInstance(i13).getUnconfirmedAuthController().confirm(arrayList, new hg.h(3));
                MessagesController.getInstance(i13).getUnconfirmedAuthController().cleanup();
                return;
            default:
                xn xnVar = (xn) p2Var;
                String str = (String) serializable;
                Pattern pattern = org.telegram.ui.Components.z4.f33754a;
                if (xnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(xnVar.getParentActivity(), null, false, false);
                    h3Var.fixNavigationBar();
                    if (z4) {
                        i11 = R.string.ChatWithAdminChannelTitle;
                    } else {
                        i11 = R.string.ChatWithAdminGroupTitle;
                    }
                    h3Var.title = LocaleController.getString(i11);
                    h3Var.bigTitle = true;
                    LinearLayout linearLayout = new LinearLayout(xnVar.getParentActivity());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(xnVar.getParentActivity());
                    linearLayout.addView(textView, k7.c6.t(-1, -1, 0, 21, 0, 21, 8));
                    textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false));
                    textView.setTextSize(1, 16.0f);
                    textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatWithAdminMessage", R.string.ChatWithAdminMessage, str, LocaleController.formatDateAudio(i13, false))));
                    TextView textView2 = new TextView(xnVar.getParentActivity());
                    textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                    textView2.setGravity(17);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setText(LocaleController.getString(R.string.IUnderstand));
                    textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Sh, false));
                    int dp = AndroidUtilities.dp(8.0f);
                    int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Oh, false);
                    int w03 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Qh, false);
                    textView2.setBackground(org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, w02, w03, w03));
                    linearLayout.addView(textView2, k7.c6.t(-1, 48, 0, 16, 12, 16, 8));
                    h3Var.customView = linearLayout;
                    h3Var.show();
                    textView2.setOnClickListener(new org.telegram.ui.Components.a3(h3Var, 0));
                    return;
                }
                return;
        }
    }

    public pa(py pyVar, boolean z4, int i10, ArrayList arrayList) {
        this.d = pyVar;
        this.f23345b = z4;
        this.f23346c = i10;
        this.f23347e = arrayList;
    }
}
