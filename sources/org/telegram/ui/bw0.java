package org.telegram.ui;

import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
public final class bw0 implements View.OnClickListener {
    public final int f38114a;
    public final int f38115b;
    public final Object f38116c;

    public bw0(Object obj, int i10, int i11) {
        this.f38114a = i11;
        this.f38116c = obj;
        this.f38115b = i10;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10;
        org.telegram.ui.Components.qc j10;
        int i11 = this.f38114a;
        int i12 = this.f38115b;
        Object obj = this.f38116c;
        switch (i11) {
            case 0:
                MessageObject messageObject = (MessageObject) obj;
                int i13 = PopupNotificationActivity.f35877b0;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    SendMessagesHelper.getInstance(i12).sendNotificationCallback(messageObject.getDialogId(), messageObject.getId(), keyboardButtonProto.getData());
                    return;
                }
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i12 == 0) {
                    xz0 xz0Var = profileActivity.N;
                    if (!xz0Var.E1) {
                        if (org.telegram.ui.Components.bw0.E0(xz0Var.getClosestTab())) {
                            xz0 xz0Var2 = profileActivity.N;
                            profileActivity.N.U0(profileActivity, profileActivity.a(), xz0Var2.q1(xz0Var2.getClosestTab()));
                            return;
                        } else if (!profileActivity.getMessagesController().storiesEnabled()) {
                            profileActivity.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) profileActivity, 14, true));
                            return;
                        } else {
                            profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                            fi.sb D = fi.sb.D(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            D.f11678x = new wz0(profileActivity);
                            D.Q(null);
                            return;
                        }
                    }
                }
                if (org.telegram.ui.Components.bw0.E0(profileActivity.N.getClosestTab())) {
                    long a2 = profileActivity.a();
                    xz0 xz0Var3 = profileActivity.N;
                    int q12 = xz0Var3.q1(xz0Var3.getClosestTab());
                    String w10 = profileActivity.getMessagesController().getStoriesController().w(q12, a2);
                    org.telegram.messenger.v8 v8Var = profileActivity.D5;
                    if (v8Var != null) {
                        v8Var.run();
                        profileActivity.D5 = null;
                    }
                    org.telegram.ui.Components.qc.e();
                    ArrayList arrayList = new ArrayList();
                    SparseArray<MessageObject> actionModeSelected = profileActivity.N.getActionModeSelected();
                    if (actionModeSelected != null) {
                        for (int i14 = 0; i14 < actionModeSelected.size(); i14++) {
                            TL_stories.StoryItem storyItem = actionModeSelected.valueAt(i14).storyItem;
                            if (storyItem != null) {
                                arrayList.add(storyItem);
                            }
                        }
                    }
                    profileActivity.N.S(false);
                    if (!arrayList.isEmpty()) {
                        bi.da daVar = new bi.da(profileActivity, a2, q12, arrayList, 16);
                        profileActivity.getMessagesController().getStoriesController().f0(q12, a2, arrayList);
                        org.telegram.ui.Components.wc.b0(profileActivity).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", arrayList.size(), w10)), LocaleController.getString(R.string.UndoNoCaps), daVar).j();
                        return;
                    }
                    return;
                }
                long clientUserId = profileActivity.getUserConfig().getClientUserId();
                org.telegram.messenger.v8 v8Var2 = profileActivity.D5;
                if (v8Var2 != null) {
                    v8Var2.run();
                    profileActivity.D5 = null;
                }
                org.telegram.ui.Components.qc.e();
                if (profileActivity.N.getClosestTab() == 9) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ArrayList arrayList2 = new ArrayList();
                SparseArray<MessageObject> actionModeSelected2 = profileActivity.N.getActionModeSelected();
                if (actionModeSelected2 != null) {
                    int i15 = 0;
                    for (int i16 = 0; i16 < actionModeSelected2.size(); i16++) {
                        TL_stories.StoryItem storyItem2 = actionModeSelected2.valueAt(i16).storyItem;
                        if (storyItem2 != null) {
                            arrayList2.add(storyItem2);
                            i15++;
                        }
                    }
                    i10 = i15;
                } else {
                    i10 = 0;
                }
                profileActivity.N.S(false);
                if (z10) {
                    profileActivity.N.e1(8);
                }
                if (!arrayList2.isEmpty()) {
                    boolean[] zArr = new boolean[arrayList2.size()];
                    for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                        TL_stories.StoryItem storyItem3 = (TL_stories.StoryItem) arrayList2.get(i17);
                        zArr[i17] = storyItem3.pinned;
                        storyItem3.pinned = z10;
                    }
                    profileActivity.getMessagesController().getStoriesController().q0(clientUserId, arrayList2, false);
                    boolean[] zArr2 = {false};
                    boolean z11 = z10;
                    profileActivity.D5 = new org.telegram.messenger.v8(profileActivity, clientUserId, arrayList2, z10, 9);
                    bi.a0 a0Var = new bi.a0(profileActivity, zArr2, arrayList2, zArr, clientUserId, 16);
                    if (z11) {
                        j10 = org.telegram.ui.Components.wc.b0(profileActivity).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i10, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.UndoNoCaps), a0Var).j();
                    } else {
                        j10 = org.telegram.ui.Components.wc.b0(profileActivity).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i10, new Object[0]), LocaleController.getString(R.string.UndoNoCaps), 5000, false, a0Var).j();
                    }
                    j10.f31873w = new by0(5, profileActivity, zArr2);
                    return;
                }
                return;
            case 2:
                y91 y91Var = (y91) obj;
                y91Var.f45919h0.E(i12);
                y91Var.l0(i12, true);
                return;
            default:
                org.telegram.ui.Wallet.ha haVar = (org.telegram.ui.Wallet.ha) obj;
                EditText editText = haVar.f36676a;
                TextView[] textViewArr = haVar.N;
                TextView textView = textViewArr[i12];
                if (textView != null && !TextUtils.isEmpty(textView.getText())) {
                    String charSequence = textViewArr[i12].getText().toString();
                    editText.setText(charSequence);
                    editText.setSelection(charSequence.length());
                    haVar.a();
                    haVar.a();
                    Runnable runnable = haVar.f36681r;
                    if (runnable != null) {
                        editText.post(runnable);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public bw0(MessageObject messageObject, int i10) {
        this.f38114a = 0;
        this.f38115b = i10;
        this.f38116c = messageObject;
    }
}
