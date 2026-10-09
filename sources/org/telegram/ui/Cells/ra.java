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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.er;
import org.telegram.ui.ty;
import org.telegram.ui.zn;
public final class ra implements View.OnClickListener {
    public final int f22732a = 0;
    public final boolean f22733b;
    public final int f22734c;
    public final org.telegram.ui.ActionBar.n2 d;
    public final Serializable f22735e;

    public ra(zn znVar, TLRPC.User user, String str, boolean z10, int i10) {
        this.d = znVar;
        this.f22735e = str;
        this.f22733b = z10;
        this.f22734c = i10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12 = this.f22732a;
        int i13 = this.f22734c;
        boolean z10 = this.f22733b;
        Serializable serializable = this.f22735e;
        org.telegram.ui.ActionBar.n2 n2Var = this.d;
        switch (i12) {
            case 0:
                ty tyVar = (ty) n2Var;
                ArrayList<UnconfirmedAuthController.UnconfirmedAuth> arrayList = (ArrayList) serializable;
                String string = LocaleController.getString(R.string.UnconfirmedAuthConfirmedMessage);
                int i14 = org.telegram.ui.ActionBar.i6.Gi;
                SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(string, i14, 0, new g(tyVar, 10));
                SpannableString spannableString = new SpannableString(">");
                er erVar = new er(R.drawable.attach_arrow_right, 0);
                erVar.setOverrideColor(org.telegram.ui.ActionBar.i6.x0(null, i14, false));
                erVar.setScale(0.7f, 0.7f);
                erVar.setWidth(AndroidUtilities.dp(12.0f));
                spannableString.setSpan(erVar, 0, spannableString.length(), 33);
                AndroidUtilities.replaceCharSequence(">", replaceSingleTag, spannableString);
                ad a02 = ad.a0(tyVar);
                int i15 = R.raw.contact_check;
                if (z10) {
                    i10 = R.string.UnconfirmedAuthConfirmedBot;
                } else {
                    i10 = R.string.UnconfirmedAuthConfirmed;
                }
                a02.M(LocaleController.getString(i10), replaceSingleTag, i15).j();
                MessagesController.getInstance(i13).getUnconfirmedAuthController().confirm(arrayList, new ai.i(8));
                MessagesController.getInstance(i13).getUnconfirmedAuthController().cleanup();
                return;
            default:
                zn znVar = (zn) n2Var;
                String str = (String) serializable;
                Pattern pattern = org.telegram.ui.Components.g5.f26593a;
                if (znVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) znVar.getParentActivity(), (org.telegram.ui.ActionBar.e6) null, false);
                    f3Var.fixNavigationBar();
                    if (z10) {
                        i11 = R.string.ChatWithAdminChannelTitle;
                    } else {
                        i11 = R.string.ChatWithAdminGroupTitle;
                    }
                    f3Var.title = LocaleController.getString(i11);
                    f3Var.bigTitle = true;
                    LinearLayout linearLayout = new LinearLayout(znVar.getParentActivity());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(znVar.getParentActivity());
                    linearLayout.addView(textView, w7.x5.t(-1, -1, 0, 21, 0, 21, 8));
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.G6, false));
                    textView.setTextSize(1, 16.0f);
                    textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatWithAdminMessage", R.string.ChatWithAdminMessage, str, LocaleController.formatDateAudio(i13, false))));
                    TextView textView2 = new TextView(znVar.getParentActivity());
                    textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                    textView2.setGravity(17);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setText(LocaleController.getString(R.string.IUnderstand));
                    textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Sh, false));
                    int dp = AndroidUtilities.dp(8.0f);
                    int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Oh, false);
                    int x03 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Qh, false);
                    textView2.setBackground(org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, x02, x03, x03));
                    linearLayout.addView(textView2, w7.x5.t(-1, 48, 0, 16, 12, 16, 8));
                    f3Var.customView = linearLayout;
                    f3Var.show();
                    textView2.setOnClickListener(new org.telegram.ui.Components.g3(f3Var, 0));
                    return;
                }
                return;
        }
    }

    public ra(ty tyVar, boolean z10, int i10, ArrayList arrayList) {
        this.d = tyVar;
        this.f22733b = z10;
        this.f22734c = i10;
        this.f22735e = arrayList;
    }
}
