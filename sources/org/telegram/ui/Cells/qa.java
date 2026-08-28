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
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.oc;
import org.telegram.ui.dy;
import org.telegram.ui.qn;
public final class qa implements View.OnClickListener {
    public final int f24923a = 0;
    public final boolean f24924b;
    public final int f24925c;
    public final org.telegram.ui.ActionBar.o2 d;
    public final Serializable f24926e;

    public qa(qn qnVar, TLRPC.User user, String str, boolean z10, int i9) {
        this.d = qnVar;
        this.f24926e = str;
        this.f24924b = z10;
        this.f24925c = i9;
    }

    @Override
    public final void onClick(View view) {
        int i9;
        int i10;
        int i11 = this.f24923a;
        int i12 = this.f24925c;
        boolean z10 = this.f24924b;
        Serializable serializable = this.f24926e;
        org.telegram.ui.ActionBar.o2 o2Var = this.d;
        switch (i11) {
            case 0:
                dy dyVar = (dy) o2Var;
                ArrayList<UnconfirmedAuthController.UnconfirmedAuth> arrayList = (ArrayList) serializable;
                String string = LocaleController.getString(R.string.UnconfirmedAuthConfirmedMessage);
                int i13 = org.telegram.ui.ActionBar.f6.Gi;
                SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(string, i13, 0, new g(dyVar, 10));
                SpannableString spannableString = new SpannableString(">");
                eq eqVar = new eq(R.drawable.attach_arrow_right, 0);
                eqVar.setOverrideColor(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
                eqVar.setScale(0.7f, 0.7f);
                eqVar.setWidth(AndroidUtilities.dp(12.0f));
                spannableString.setSpan(eqVar, 0, spannableString.length(), 33);
                AndroidUtilities.replaceCharSequence(">", replaceSingleTag, spannableString);
                oc a02 = oc.a0(dyVar);
                int i14 = R.raw.contact_check;
                if (z10) {
                    i9 = R.string.UnconfirmedAuthConfirmedBot;
                } else {
                    i9 = R.string.UnconfirmedAuthConfirmed;
                }
                a02.M(LocaleController.getString(i9), replaceSingleTag, i14).j();
                MessagesController.getInstance(i12).getUnconfirmedAuthController().confirm(arrayList, new bg.k(3));
                MessagesController.getInstance(i12).getUnconfirmedAuthController().cleanup();
                return;
            default:
                qn qnVar = (qn) o2Var;
                String str = (String) serializable;
                Pattern pattern = org.telegram.ui.Components.y4.f34847a;
                if (qnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(qnVar.getParentActivity(), null, false, false);
                    f3Var.fixNavigationBar();
                    if (z10) {
                        i10 = R.string.ChatWithAdminChannelTitle;
                    } else {
                        i10 = R.string.ChatWithAdminGroupTitle;
                    }
                    f3Var.title = LocaleController.getString(i10);
                    f3Var.bigTitle = true;
                    LinearLayout linearLayout = new LinearLayout(qnVar.getParentActivity());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(qnVar.getParentActivity());
                    linearLayout.addView(textView, g7.e6.t(-1, -1, 0, 21, 0, 21, 8));
                    textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
                    textView.setTextSize(1, 16.0f);
                    textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatWithAdminMessage", R.string.ChatWithAdminMessage, str, LocaleController.formatDateAudio(i12, false))));
                    TextView textView2 = new TextView(qnVar.getParentActivity());
                    textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                    textView2.setGravity(17);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setText(LocaleController.getString(R.string.IUnderstand));
                    textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
                    int dp = AndroidUtilities.dp(8.0f);
                    int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oh, false);
                    int w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Qh, false);
                    textView2.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, w02, w03, w03));
                    linearLayout.addView(textView2, g7.e6.t(-1, 48, 0, 16, 12, 16, 8));
                    f3Var.customView = linearLayout;
                    f3Var.show();
                    textView2.setOnClickListener(new org.telegram.ui.Components.z2(f3Var, 0));
                    return;
                }
                return;
        }
    }

    public qa(dy dyVar, boolean z10, int i9, ArrayList arrayList) {
        this.d = dyVar;
        this.f24924b = z10;
        this.f24925c = i9;
        this.f24926e = arrayList;
    }
}
