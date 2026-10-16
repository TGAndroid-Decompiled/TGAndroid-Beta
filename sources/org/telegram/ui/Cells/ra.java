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
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.zc;
import org.telegram.ui.fo;
import org.telegram.ui.yy;
public final class ra implements View.OnClickListener {
    public final int f21469a = 1;
    public final boolean f21470b;
    public final int f21471c;
    public final org.telegram.ui.ActionBar.m2 d;
    public final Serializable e;

    public ra(fo foVar, TLRPC.User user, String str, boolean z10, int i10) {
        this.d = foVar;
        this.e = str;
        this.f21470b = z10;
        this.f21471c = i10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12 = this.f21469a;
        int i13 = this.f21471c;
        boolean z10 = this.f21470b;
        Serializable serializable = this.e;
        org.telegram.ui.ActionBar.m2 m2Var = this.d;
        switch (i12) {
            case 0:
                yy yyVar = (yy) m2Var;
                ArrayList<UnconfirmedAuthController.UnconfirmedAuth> arrayList = (ArrayList) serializable;
                String string = LocaleController.getString(R.string.UnconfirmedAuthConfirmedMessage);
                int i14 = org.telegram.ui.ActionBar.g6.Gi;
                SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(string, i14, 0, new g(yyVar, 10));
                SpannableString spannableString = new SpannableString(">");
                br brVar = new br(R.drawable.attach_arrow_right, 0);
                brVar.setOverrideColor(org.telegram.ui.ActionBar.g6.x0(null, i14, false));
                brVar.setScale(0.7f, 0.7f);
                brVar.setWidth(AndroidUtilities.dp(12.0f));
                spannableString.setSpan(brVar, 0, spannableString.length(), 33);
                AndroidUtilities.replaceCharSequence(">", replaceSingleTag, spannableString);
                zc a02 = zc.a0(yyVar);
                int i15 = R.raw.contact_check;
                if (z10) {
                    i10 = R.string.UnconfirmedAuthConfirmedBot;
                } else {
                    i10 = R.string.UnconfirmedAuthConfirmed;
                }
                a02.M(LocaleController.getString(i10), replaceSingleTag, i15).j();
                MessagesController.getInstance(i13).getUnconfirmedAuthController().confirm(arrayList, new bi.f(8));
                MessagesController.getInstance(i13).getUnconfirmedAuthController().cleanup();
                return;
            default:
                fo foVar = (fo) m2Var;
                String str = (String) serializable;
                Pattern pattern = org.telegram.ui.Components.g5.f24879a;
                if (foVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, (Context) foVar.getParentActivity(), (org.telegram.ui.ActionBar.c6) null, false);
                    e3Var.fixNavigationBar();
                    if (z10) {
                        i11 = R.string.ChatWithAdminChannelTitle;
                    } else {
                        i11 = R.string.ChatWithAdminGroupTitle;
                    }
                    e3Var.title = LocaleController.getString(i11);
                    e3Var.bigTitle = true;
                    LinearLayout linearLayout = new LinearLayout(foVar.getParentActivity());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(foVar.getParentActivity());
                    linearLayout.addView(textView, w7.z5.t(-1, -1, 0, 21, 0, 21, 8));
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false));
                    textView.setTextSize(1, 16.0f);
                    textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatWithAdminMessage", R.string.ChatWithAdminMessage, str, LocaleController.formatDateAudio(i13, false))));
                    TextView textView2 = new TextView(foVar.getParentActivity());
                    textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                    textView2.setGravity(17);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setText(LocaleController.getString(R.string.IUnderstand));
                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                    int dp = AndroidUtilities.dp(8.0f);
                    int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Oh, false);
                    int x03 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Qh, false);
                    textView2.setBackground(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, x02, x03, x03));
                    linearLayout.addView(textView2, w7.z5.t(-1, 48, 0, 16, 12, 16, 8));
                    e3Var.customView = linearLayout;
                    e3Var.show();
                    textView2.setOnClickListener(new org.telegram.ui.Components.g3(e3Var, 0));
                    return;
                }
                return;
        }
    }

    public ra(yy yyVar, boolean z10, int i10, ArrayList arrayList) {
        this.d = yyVar;
        this.f21470b = z10;
        this.f21471c = i10;
        this.e = arrayList;
    }
}
