package org.telegram.ui;

import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
public final class mu0 implements View.OnClickListener {
    public final int f49318a;
    public final int f49319b;
    public final Object f49320c;

    public mu0(Object obj, int i7, int i10) {
        this.f49318a = i10;
        this.f49320c = obj;
        this.f49319b = i7;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i7;
        org.telegram.ui.Components.xb j3;
        int i10 = this.f49318a;
        int i11 = this.f49319b;
        Object obj = this.f49320c;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i11 == 0) {
                    uv0 uv0Var = profileActivity.O;
                    if (!uv0Var.F1) {
                        if (org.telegram.ui.Components.ys0.J0(uv0Var.getClosestTab())) {
                            uv0 uv0Var2 = profileActivity.O;
                            profileActivity.O.a1(profileActivity, profileActivity.a(), uv0Var2.w1(uv0Var2.getClosestTab()));
                            return;
                        } else if (!profileActivity.getMessagesController().X4()) {
                            profileActivity.showDialog(new ug.x0((org.telegram.ui.ActionBar.e2) profileActivity, 14, true));
                            return;
                        } else {
                            profileActivity.getMessagesController().f25280f7.edit().putBoolean("story_keep", true).apply();
                            hi.sa D = hi.sa.D(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            D.f15113y = new tv0(profileActivity);
                            D.Q(null);
                            return;
                        }
                    }
                }
                if (org.telegram.ui.Components.ys0.J0(profileActivity.O.getClosestTab())) {
                    long a10 = profileActivity.a();
                    uv0 uv0Var3 = profileActivity.O;
                    int w12 = uv0Var3.w1(uv0Var3.getClosestTab());
                    String w10 = profileActivity.getMessagesController().P1().w(w12, a10);
                    ai.k2 k2Var = profileActivity.B5;
                    if (k2Var != null) {
                        k2Var.run();
                        profileActivity.B5 = null;
                    }
                    org.telegram.ui.Components.xb.e();
                    ArrayList arrayList = new ArrayList();
                    SparseArray<org.telegram.messenger.gj> actionModeSelected = profileActivity.O.getActionModeSelected();
                    if (actionModeSelected != null) {
                        for (int i12 = 0; i12 < actionModeSelected.size(); i12++) {
                            TL_stories.StoryItem storyItem = actionModeSelected.valueAt(i12).f23822l;
                            if (storyItem != null) {
                                arrayList.add(storyItem);
                            }
                        }
                    }
                    profileActivity.O.V(false);
                    if (!arrayList.isEmpty()) {
                        di.x7 x7Var = new di.x7(profileActivity, a10, w12, arrayList);
                        profileActivity.getMessagesController().P1().f0(w12, a10, arrayList);
                        org.telegram.ui.Components.cc.a0(profileActivity).K(2131623980, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(arrayList.size(), "StoryRemovedFromAlbumTitle", w10)), org.telegram.messenger.hd.M0(2131743885, null), x7Var).j();
                        return;
                    }
                    return;
                }
                long e10 = profileActivity.getUserConfig().e();
                ai.k2 k2Var2 = profileActivity.B5;
                if (k2Var2 != null) {
                    k2Var2.run();
                    profileActivity.B5 = null;
                }
                org.telegram.ui.Components.xb.e();
                if (profileActivity.O.getClosestTab() == 9) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ArrayList arrayList2 = new ArrayList();
                SparseArray<org.telegram.messenger.gj> actionModeSelected2 = profileActivity.O.getActionModeSelected();
                if (actionModeSelected2 != null) {
                    int i13 = 0;
                    for (int i14 = 0; i14 < actionModeSelected2.size(); i14++) {
                        TL_stories.StoryItem storyItem2 = actionModeSelected2.valueAt(i14).f23822l;
                        if (storyItem2 != null) {
                            arrayList2.add(storyItem2);
                            i13++;
                        }
                    }
                    i7 = i13;
                } else {
                    i7 = 0;
                }
                profileActivity.O.V(false);
                if (z10) {
                    profileActivity.O.k1(8);
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
                    profileActivity.B5 = new ai.k2(profileActivity, e10, arrayList2, z10, 3);
                    bi.r1 r1Var = new bi.r1(profileActivity, zArr2, arrayList2, zArr, e10, 16);
                    if (z11) {
                        j3 = org.telegram.ui.Components.cc.a0(profileActivity).L(2131623990, org.telegram.messenger.hd.G(i7, "StorySavedTitle", new Object[0]), org.telegram.messenger.hd.M0(2131744484, null), org.telegram.messenger.hd.M0(2131743885, null), r1Var).j();
                    } else {
                        j3 = org.telegram.ui.Components.cc.a0(profileActivity).J(2131623980, org.telegram.messenger.hd.G(i7, "StoryArchived", new Object[0]), org.telegram.messenger.hd.M0(2131743885, null), 5000, false, r1Var).j();
                    }
                    j3.v = new mp0(19, profileActivity, zArr2);
                    return;
                }
                return;
            case 1:
                z41 z41Var = (z41) obj;
                z41Var.f53855i0.C(i11);
                z41Var.p0(i11, true);
                return;
            default:
                org.telegram.ui.Wallet.pa paVar = (org.telegram.ui.Wallet.pa) obj;
                EditText editText = paVar.f44364a;
                TextView[] textViewArr = paVar.O;
                TextView textView = textViewArr[i11];
                if (textView != null && !TextUtils.isEmpty(textView.getText())) {
                    String charSequence = textViewArr[i11].getText().toString();
                    editText.setText(charSequence);
                    editText.setSelection(charSequence.length());
                    paVar.a();
                    paVar.a();
                    Runnable runnable = paVar.f44370r;
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
