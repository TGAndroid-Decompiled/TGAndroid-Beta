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
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.tc;
import org.telegram.ui.fy;
import org.telegram.ui.tn;
public final class na implements View.OnClickListener {
    public final int f24757a = 0;
    public final boolean f24758b;
    public final int f24759c;
    public final org.telegram.ui.ActionBar.o2 d;
    public final Serializable f24760e;

    public na(tn tnVar, TLRPC.User user, String str, boolean z10, int i10) {
        this.d = tnVar;
        this.f24760e = str;
        this.f24758b = z10;
        this.f24759c = i10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12 = this.f24757a;
        int i13 = this.f24759c;
        boolean z10 = this.f24758b;
        Serializable serializable = this.f24760e;
        org.telegram.ui.ActionBar.o2 o2Var = this.d;
        switch (i12) {
            case 0:
                fy fyVar = (fy) o2Var;
                ArrayList<UnconfirmedAuthController.UnconfirmedAuth> arrayList = (ArrayList) serializable;
                String string = LocaleController.getString(R.string.UnconfirmedAuthConfirmedMessage);
                int i14 = org.telegram.ui.ActionBar.g6.Gi;
                SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(string, i14, 0, new g(fyVar, 10));
                SpannableString spannableString = new SpannableString(">");
                iq iqVar = new iq(R.drawable.attach_arrow_right, 0);
                iqVar.setOverrideColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
                iqVar.setScale(0.7f, 0.7f);
                iqVar.setWidth(AndroidUtilities.dp(12.0f));
                spannableString.setSpan(iqVar, 0, spannableString.length(), 33);
                AndroidUtilities.replaceCharSequence(">", replaceSingleTag, spannableString);
                tc a02 = tc.a0(fyVar);
                int i15 = R.raw.contact_check;
                if (z10) {
                    i10 = R.string.UnconfirmedAuthConfirmedBot;
                } else {
                    i10 = R.string.UnconfirmedAuthConfirmed;
                }
                a02.M(LocaleController.getString(i10), replaceSingleTag, i15).j();
                MessagesController.getInstance(i13).getUnconfirmedAuthController().confirm(arrayList, new eg.h(3));
                MessagesController.getInstance(i13).getUnconfirmedAuthController().cleanup();
                return;
            default:
                tn tnVar = (tn) o2Var;
                String str = (String) serializable;
                Pattern pattern = org.telegram.ui.Components.c5.f27308a;
                if (tnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(tnVar.getParentActivity(), null, false, false);
                    f3Var.fixNavigationBar();
                    if (z10) {
                        i11 = R.string.ChatWithAdminChannelTitle;
                    } else {
                        i11 = R.string.ChatWithAdminGroupTitle;
                    }
                    f3Var.title = LocaleController.getString(i11);
                    f3Var.bigTitle = true;
                    LinearLayout linearLayout = new LinearLayout(tnVar.getParentActivity());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(tnVar.getParentActivity());
                    linearLayout.addView(textView, i7.f6.t(-1, -1, 0, 21, 0, 21, 8));
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
                    textView.setTextSize(1, 16.0f);
                    textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatWithAdminMessage", R.string.ChatWithAdminMessage, str, LocaleController.formatDateAudio(i13, false))));
                    TextView textView2 = new TextView(tnVar.getParentActivity());
                    textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                    textView2.setGravity(17);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setText(LocaleController.getString(R.string.IUnderstand));
                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                    int dp = AndroidUtilities.dp(8.0f);
                    int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false);
                    int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
                    textView2.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, w02, w03, w03));
                    linearLayout.addView(textView2, i7.f6.t(-1, 48, 0, 16, 12, 16, 8));
                    f3Var.customView = linearLayout;
                    f3Var.show();
                    textView2.setOnClickListener(new org.telegram.ui.Components.d3(f3Var, 0));
                    return;
                }
                return;
        }
    }

    public na(fy fyVar, boolean z10, int i10, ArrayList arrayList) {
        this.d = fyVar;
        this.f24758b = z10;
        this.f24759c = i10;
        this.f24760e = arrayList;
    }
}
