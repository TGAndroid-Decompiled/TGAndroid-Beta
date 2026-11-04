package org.telegram.ui;

import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
public final class fu0 implements View.OnClickListener {
    public final int f45371a;
    public final int f45372b;
    public final Object f45373c;

    public fu0(Object obj, int i3, int i10) {
        this.f45371a = i10;
        this.f45373c = obj;
        this.f45372b = i3;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i3;
        org.telegram.ui.Components.ac j10;
        int i10 = this.f45371a;
        int i11 = this.f45372b;
        Object obj = this.f45373c;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i11 == 0) {
                    mv0 mv0Var = profileActivity.O;
                    if (!mv0Var.F1) {
                        if (org.telegram.ui.Components.ws0.I0(mv0Var.getClosestTab())) {
                            mv0 mv0Var2 = profileActivity.O;
                            profileActivity.O.Y0(profileActivity, profileActivity.a(), mv0Var2.u1(mv0Var2.getClosestTab()));
                            return;
                        } else if (!profileActivity.getMessagesController().W4()) {
                            profileActivity.showDialog(new vg.v0((org.telegram.ui.ActionBar.d2) profileActivity, 14, true));
                            return;
                        } else {
                            profileActivity.getMessagesController().f22999e7.edit().putBoolean("story_keep", true).apply();
                            gi.va D = gi.va.D(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            D.f13776y = new lv0(profileActivity);
                            D.Q(null);
                            return;
                        }
                    }
                }
                if (org.telegram.ui.Components.ws0.I0(profileActivity.O.getClosestTab())) {
                    long a10 = profileActivity.a();
                    mv0 mv0Var3 = profileActivity.O;
                    int u12 = mv0Var3.u1(mv0Var3.getClosestTab());
                    String w10 = profileActivity.getMessagesController().P1().w(u12, a10);
                    org.telegram.messenger.video.o oVar = profileActivity.f41895y5;
                    if (oVar != null) {
                        oVar.run();
                        profileActivity.f41895y5 = null;
                    }
                    org.telegram.ui.Components.ac.e();
                    ArrayList arrayList = new ArrayList();
                    SparseArray<org.telegram.messenger.zi> actionModeSelected = profileActivity.O.getActionModeSelected();
                    if (actionModeSelected != null) {
                        for (int i12 = 0; i12 < actionModeSelected.size(); i12++) {
                            TL_stories.StoryItem storyItem = actionModeSelected.valueAt(i12).f26871l;
                            if (storyItem != null) {
                                arrayList.add(storyItem);
                            }
                        }
                    }
                    profileActivity.O.V(false);
                    if (!arrayList.isEmpty()) {
                        ci.f8 f8Var = new ci.f8(profileActivity, a10, u12, arrayList);
                        profileActivity.getMessagesController().P1().f0(u12, a10, arrayList);
                        org.telegram.ui.Components.fc.a0(profileActivity).K(2131623979, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.G(arrayList.size(), "StoryRemovedFromAlbumTitle", w10)), org.telegram.messenger.bd.M0(2131743895, null), f8Var).j();
                        return;
                    }
                    return;
                }
                long e10 = profileActivity.getUserConfig().e();
                org.telegram.messenger.video.o oVar2 = profileActivity.f41895y5;
                if (oVar2 != null) {
                    oVar2.run();
                    profileActivity.f41895y5 = null;
                }
                org.telegram.ui.Components.ac.e();
                if (profileActivity.O.getClosestTab() == 9) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ArrayList arrayList2 = new ArrayList();
                SparseArray<org.telegram.messenger.zi> actionModeSelected2 = profileActivity.O.getActionModeSelected();
                if (actionModeSelected2 != null) {
                    int i13 = 0;
                    for (int i14 = 0; i14 < actionModeSelected2.size(); i14++) {
                        TL_stories.StoryItem storyItem2 = actionModeSelected2.valueAt(i14).f26871l;
                        if (storyItem2 != null) {
                            arrayList2.add(storyItem2);
                            i13++;
                        }
                    }
                    i3 = i13;
                } else {
                    i3 = 0;
                }
                profileActivity.O.V(false);
                if (z10) {
                    profileActivity.O.i1(8);
                }
                if (!arrayList2.isEmpty()) {
                    boolean[] zArr = new boolean[arrayList2.size()];
                    for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                        TL_stories.StoryItem storyItem3 = (TL_stories.StoryItem) arrayList2.get(i15);
                        zArr[i15] = storyItem3.pinned;
                        storyItem3.pinned = z10;
                    }
                    profileActivity.getMessagesController().P1().q0(e10, arrayList2, false);
                    boolean[] zArr2 = {false};
                    boolean z11 = z10;
                    profileActivity.f41895y5 = new org.telegram.messenger.video.o(profileActivity, e10, arrayList2, z10);
                    ai.z1 z1Var = new ai.z1(profileActivity, zArr2, arrayList2, zArr, e10, 16);
                    if (z11) {
                        j10 = org.telegram.ui.Components.fc.a0(profileActivity).L(2131623989, org.telegram.messenger.bd.G(i3, "StorySavedTitle", new Object[0]), org.telegram.messenger.bd.M0(2131744494, null), org.telegram.messenger.bd.M0(2131743895, null), z1Var).j();
                    } else {
                        j10 = org.telegram.ui.Components.fc.a0(profileActivity).J(2131623979, org.telegram.messenger.bd.G(i3, "StoryArchived", new Object[0]), org.telegram.messenger.bd.M0(2131743895, null), 5000, false, z1Var).j();
                    }
                    j10.v = new hk0(27, profileActivity, zArr2);
                    return;
                }
                return;
            case 1:
                r41 r41Var = (r41) obj;
                r41Var.f49076i0.D(i11);
                r41Var.p0(i11, true);
                return;
            default:
                org.telegram.ui.Wallet.na naVar = (org.telegram.ui.Wallet.na) obj;
                EditText editText = naVar.f42960a;
                TextView[] textViewArr = naVar.O;
                TextView textView = textViewArr[i11];
                if (textView != null && !TextUtils.isEmpty(textView.getText())) {
                    String charSequence = textViewArr[i11].getText().toString();
                    editText.setText(charSequence);
                    editText.setSelection(charSequence.length());
                    naVar.a();
                    naVar.a();
                    Runnable runnable = naVar.f42966r;
                    if (runnable != null) {
                        editText.post(runnable);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
