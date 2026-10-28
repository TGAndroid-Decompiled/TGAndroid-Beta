package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_agent;
public final class dy0 implements Utilities.Callback {
    public final int f38712a;
    public final ProfileActivity f38713b;

    public dy0(ProfileActivity profileActivity, int i10) {
        this.f38712a = i10;
        this.f38713b = profileActivity;
    }

    @Override
    public final void run(Object obj) {
        String userName;
        int i10 = this.f38712a;
        ProfileActivity profileActivity = this.f38713b;
        switch (i10) {
            case 0:
                String str = (String) obj;
                int i11 = ProfileActivity.R6;
                TL_agent.agentProvider provider = profileActivity.getMessagesController().getAgentController().getProvider(str);
                TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f36003e1));
                if (provider != null) {
                    str = provider.title;
                }
                if (user != null && UserObject.getPublicUsername(user) != null) {
                    userName = "@" + UserObject.getPublicUsername(user);
                } else {
                    userName = UserObject.getUserName(user);
                }
                org.telegram.ui.Components.wc.b0(profileActivity).K(R.raw.contact_check, LocaleController.formatString(R.string.AgentProviderConnected, str), LocaleController.formatString(R.string.AgentProviderConnectedText, userName), LocaleController.getString(R.string.AgentStart), new hb0(profileActivity, 13)).j();
                return;
            case 1:
                View view = (View) obj;
                int i12 = ProfileActivity.R6;
                if (view instanceof org.telegram.ui.Cells.g9) {
                    org.telegram.ui.Cells.g9 g9Var = (org.telegram.ui.Cells.g9) view;
                    g9Var.f24174a.setLoading(profileActivity.f36076o5);
                    g9Var.f24175b.setLoading(profileActivity.f36076o5);
                    return;
                }
                return;
            case 2:
                ProfileActivity.k0(profileActivity, (Boolean) obj);
                return;
            case 3:
                int i13 = ProfileActivity.R6;
                profileActivity.getClass();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add((TLRPC.InputStickerSet) obj);
                profileActivity.showDialog(new org.telegram.ui.Components.aw(profileActivity, profileActivity.getParentActivity(), profileActivity.f36150z0, arrayList));
                return;
            default:
                View view2 = (View) obj;
                int i14 = ProfileActivity.R6;
                if (view2 instanceof org.telegram.ui.Cells.q4) {
                    ((org.telegram.ui.Cells.q4) view2).setTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.L6, profileActivity.f36150z0));
                } else if (view2 instanceof org.telegram.ui.Cells.g9) {
                    ((org.telegram.ui.Cells.g9) view2).updateColors();
                } else if (view2 instanceof org.telegram.ui.Cells.v8) {
                    ((org.telegram.ui.Cells.v8) view2).updateColors();
                } else if (view2 instanceof org.telegram.ui.Cells.j) {
                    ((org.telegram.ui.Cells.j) view2).updateColors();
                } else if (view2 instanceof org.telegram.ui.Cells.n5) {
                    ((org.telegram.ui.Cells.n5) view2).getCheckBox().invalidate();
                } else if (view2 instanceof jg.k1) {
                    jg.k1 k1Var = (jg.k1) view2;
                    org.telegram.ui.Components.pq pqVar = k1Var.f15764r;
                    int dp = AndroidUtilities.dp(8.0f);
                    int i15 = org.telegram.ui.ActionBar.y6.f23561o6;
                    org.telegram.ui.ActionBar.u6 u6Var = k1Var.f15759a;
                    int w02 = org.telegram.ui.ActionBar.y6.w0(i15, u6Var);
                    k1Var.a(w02);
                    int o12 = org.telegram.ui.ActionBar.y6.o1(0.1f, w02);
                    int w03 = org.telegram.ui.ActionBar.y6.w0(i15, u6Var);
                    k1Var.a(w03);
                    int o13 = org.telegram.ui.ActionBar.y6.o1(0.22f, w03);
                    pqVar.setBackground(org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, o12, o13, o13));
                    int w04 = org.telegram.ui.ActionBar.y6.w0(i15, u6Var);
                    k1Var.a(w04);
                    pqVar.setTextColor(w04);
                } else if (view2 instanceof org.telegram.ui.Cells.l6) {
                    ((org.telegram.ui.Cells.l6) view2).updateColors();
                }
                l01 l01Var = profileActivity.d;
                profileActivity.f35972a.getClass();
                l01Var.j(RecyclerView.R(view2));
                profileActivity.d.getClass();
                return;
        }
    }
}
