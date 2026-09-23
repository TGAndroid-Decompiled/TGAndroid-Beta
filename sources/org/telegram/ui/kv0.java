package org.telegram.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class kv0 implements org.telegram.ui.Components.d5, GenericProvider, org.telegram.ui.ActionBar.a2, MediaDataController.KeywordResultCallback, org.telegram.ui.Components.bl0, org.telegram.ui.Components.cl0, sv0, MessagesStorage.BooleanCallback, o11, OnSuccessListener, pa.a, OnFailureListener, t5.b, s5.e {
    public final int f34811a;
    public final Object f34812b;
    public final Object f34813c;

    public kv0(int i10, Object obj, Object obj2) {
        this.f34811a = i10;
        this.f34812b = obj;
        this.f34813c = obj2;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f34811a) {
            case 0:
                tv0 tv0Var = ((lv0) this.f34812b).f35097a;
                tv0Var.f37774e0.a((TLRPC.TL_messageMediaToDo) this.f34813c);
                tv0Var.finishFragment();
                return;
            default:
                tv0 tv0Var2 = ((lv0) this.f34812b).f35097a;
                tv0Var2.f37774e0.a((TLRPC.TL_messageMediaPoll) this.f34813c);
                tv0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void a(TLRPC.MessageMedia messageMedia) {
        de1 de1Var = (de1) this.f34812b;
        xn xnVar = (xn) this.f34813c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = de1Var.G.messageOwner.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        de1Var.G.messageOwner.media = messageMedia;
        xnVar.getSendMessagesHelper().editMessage(de1Var.G, null, null, null, null, null, null, false, false, null);
    }

    @Override
    public Object apply(Object obj) {
        i5.d[] values;
        s5.g gVar = (s5.g) this.f34812b;
        l5.i iVar = (l5.i) this.f34813c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        s5.a aVar = gVar.d;
        ArrayList d = gVar.d(sQLiteDatabase, iVar, aVar.f42798b);
        for (i5.d dVar : i5.d.values()) {
            if (dVar != iVar.f13885c) {
                int size = aVar.f42798b - d.size();
                if (size <= 0) {
                    break;
                }
                d.addAll(gVar.d(sQLiteDatabase, iVar.b(dVar), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < d.size(); i10++) {
            sb2.append(((s5.b) d.get(i10)).f42800a);
            if (i10 < d.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j3 = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j3));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j3), set);
                }
                set.add(new s5.f(query.getString(1), query.getString(2)));
            } catch (Throwable th2) {
                query.close();
                throw th2;
            }
        }
        query.close();
        ListIterator listIterator = d.listIterator();
        while (listIterator.hasNext()) {
            s5.b bVar = (s5.b) listIterator.next();
            long j10 = bVar.f42800a;
            if (hashMap.containsKey(Long.valueOf(j10))) {
                com.google.firebase.messaging.n c10 = bVar.f42802c.c();
                for (s5.f fVar : (Set) hashMap.get(Long.valueOf(j10))) {
                    c10.c(fVar.f42803a, fVar.f42804b);
                }
                listIterator.set(new s5.b(j10, bVar.f42801b, c10.g()));
            }
        }
        return d;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        ThemeActivity.W((ThemeActivity) this.f34812b, (Context) this.f34813c, view, i10, f7);
    }

    @Override
    public boolean d(int i10, View view) {
        String str;
        final yb1 yb1Var = (yb1) this.f34812b;
        final ac1 ac1Var = (ac1) this.f34813c;
        ThemeActivity themeActivity = yb1Var.e;
        if (i10 >= 0 && i10 < ac1Var.e.size()) {
            final org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) ac1Var.e.get(i10);
            if (f6Var.f18636a >= 100 && !f6Var.f18657z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String string = LocaleController.getString("OpenInEditor", R.string.OpenInEditor);
                String string2 = LocaleController.getString("ShareTheme", R.string.ShareTheme);
                TLRPC.TL_theme tL_theme = f6Var.f18650r;
                if (tL_theme != null && tL_theme.creator) {
                    str = LocaleController.getString("ThemeSetUrl", R.string.ThemeSetUrl);
                } else {
                    str = null;
                }
                CharSequence[] charSequenceArr = {string, string2, str, LocaleController.getString("DeleteTheme", R.string.DeleteTheme)};
                int[] iArr = {R.drawable.msg_edit, R.drawable.msg_share, R.drawable.msg_link, R.drawable.msg_delete};
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        yb1 yb1Var2 = yb1.this;
                        ThemeActivity themeActivity2 = yb1Var2.e;
                        if (themeActivity2.getParentActivity() != null) {
                            org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                            int i12 = 2;
                            if (i11 == 0) {
                                if (i11 != 1) {
                                    i12 = 1;
                                }
                                org.telegram.ui.Components.e5.W(themeActivity2, i12, f6Var2.f18637b, f6Var2);
                            } else if (i11 == 1) {
                                if (f6Var2.f18650r == null) {
                                    themeActivity2.getMessagesController().saveThemeToServer(f6Var2.f18637b, f6Var2);
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, f6Var2.f18637b, f6Var2);
                                    return;
                                }
                                String str2 = "https://" + themeActivity2.getMessagesController().linkPrefix + "/addtheme/" + f6Var2.f18650r.slug;
                                themeActivity2.showDialog(new org.telegram.ui.Components.hq0(themeActivity2.getParentActivity(), null, str2, false, str2, false, null));
                            } else if (i11 == 2) {
                                themeActivity2.presentFragment(new td1(f6Var2.f18637b, f6Var2, false));
                            } else if (i11 == 3 && themeActivity2.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                                String string3 = LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle);
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder2.f18409a;
                                b2Var.R = string3;
                                b2Var.T = LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert);
                                alertDialog$Builder2.k(LocaleController.getString("Delete", R.string.Delete), new b7(yb1Var2, ac1Var, f6Var2, 22));
                                alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                                themeActivity2.showDialog(b2Var);
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19026q7, false));
                                }
                            }
                        }
                    }
                };
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                b2Var.P = charSequenceArr;
                b2Var.Q = iArr;
                b2Var.M = onClickListener;
                themeActivity.showDialog(b2Var);
                b2Var.l(b2Var.N0.size() - 1, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19026q7, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19008p7, false));
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        boolean z10;
        boolean z11;
        switch (this.f34811a) {
            case 3:
                ((PrivacyControlActivity) this.f34812b).t0();
                ((SharedPreferences) this.f34813c).edit().putBoolean("privacyAlertShowed", true).commit();
                return;
            case 4:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f34812b;
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr = privacySettingsActivity.Z;
                tL_payments_clearSavedInfo.credentials = zArr[1];
                tL_payments_clearSavedInfo.info = zArr[0];
                privacySettingsActivity.getUserConfig().tmpPassword = null;
                privacySettingsActivity.getUserConfig().saveConfig(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new wb0(14, privacySettingsActivity, (org.telegram.ui.Cells.x8) this.f34813c));
                return;
            case 5:
                ProfileActivity.c0((ProfileActivity) this.f34812b, (org.telegram.ui.Cells.z1[]) this.f34813c);
                return;
            case 6:
                a01 a01Var = (a01) this.f34812b;
                TLRPC.User user = (TLRPC.User) this.f34813c;
                a01Var.getClass();
                ArrayList<TLRPC.User> arrayList = new ArrayList<>();
                arrayList.add(user);
                ProfileActivity profileActivity = a01Var.f31621b;
                profileActivity.getContactsController().deleteContact(arrayList, true);
                if (user != null) {
                    user.contact = false;
                    profileActivity.e5(false, false);
                    return;
                }
                return;
            case 7:
            case 8:
            case 12:
            case 13:
            case 15:
            case 16:
            case 17:
            case 20:
            default:
                rg.j0.Q((rg.j0) this.f34812b, (ArrayList) this.f34813c);
                return;
            case 9:
                j71 j71Var = (j71) this.f34812b;
                TLRPC.User user2 = (TLRPC.User) this.f34813c;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    j71Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    b7 b7Var = new b7(j71Var, user2, twoStepVerificationActivity, 20);
                    twoStepVerificationActivity.Z = 0;
                    twoStepVerificationActivity.f31562b0 = b7Var;
                    U.presentFragment(twoStepVerificationActivity);
                    return;
                }
                return;
            case 10:
                za1.m((za1) this.f34812b, (ry) this.f34813c);
                return;
            case 11:
                ThemeActivity.X((ThemeActivity) this.f34812b, (by0) this.f34813c);
                return;
            case 14:
                yb1 yb1Var = (yb1) this.f34812b;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f34813c;
                yb1Var.getClass();
                MessagesController messagesController = MessagesController.getInstance(g6Var.E);
                if (g6Var == org.telegram.ui.ActionBar.h6.J) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                messagesController.saveTheme(g6Var, null, z10, true);
                HashMap hashMap = org.telegram.ui.ActionBar.h6.H;
                if (g6Var.f18684b == null) {
                    z11 = false;
                } else {
                    if (org.telegram.ui.ActionBar.h6.I == g6Var) {
                        org.telegram.ui.ActionBar.h6.t(org.telegram.ui.ActionBar.h6.L, true, false);
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (g6Var == org.telegram.ui.ActionBar.h6.J) {
                        org.telegram.ui.ActionBar.h6.J = (org.telegram.ui.ActionBar.g6) hashMap.get("Dark Blue");
                    }
                    g6Var.t();
                    org.telegram.ui.ActionBar.h6.G.remove(g6Var);
                    hashMap.remove(g6Var.f18682a);
                    org.telegram.ui.ActionBar.a6 a6Var = g6Var.f18694i0;
                    if (a6Var != null) {
                        org.telegram.ui.ActionBar.a6.a(a6Var);
                    }
                    org.telegram.ui.ActionBar.h6.F.remove(g6Var);
                    new File(g6Var.f18684b).delete();
                    org.telegram.ui.ActionBar.h6.s1(true, false);
                }
                if (z11) {
                    ((ActionBarLayout) ThemeActivity.c0(yb1Var.e)).U(true, true);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
                return;
            case 18:
                zg1.W((zg1) this.f34812b, (byte[]) this.f34813c);
                return;
            case 19:
                mi1 mi1Var = (mi1) this.f34812b;
                mi1Var.getClass();
                ((boolean[]) this.f34813c)[0] = true;
                mi1Var.f35332p0 = 17;
                Intent intent = new Intent(mi1Var.f35304b, VoIPService.class);
                intent.putExtra("user_id", mi1Var.d.f18230id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", mi1Var.f35301a);
                try {
                    mi1Var.f35304b.startService(intent);
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 21:
                org.telegram.ui.web.o.Y((org.telegram.ui.web.o) this.f34812b, (HashSet) this.f34813c);
                return;
            case 22:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.f34812b;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = MessagesController.getInstance(b1Var.M).getInputUser(b1Var.U);
                ConnectionsManager.getInstance(b1Var.M).sendRequest(allowsendmessage, new ai.s5(b1Var, (String[]) this.f34813c, b2Var, 15));
                return;
            case 23:
                boolean[] zArr2 = (boolean[]) this.f34812b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f34813c;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    jsPromptResult.cancel();
                    return;
                }
                return;
        }
    }

    @Override
    public void g(pa.b bVar) {
        ((pa.a) this.f34812b).g(bVar);
        ((pa.a) this.f34813c).g(bVar);
    }

    @Override
    public Object i() {
        switch (this.f34811a) {
            case 26:
                Iterable iterable = (Iterable) this.f34813c;
                s5.g gVar = (s5.g) ((s5.d) ((da.b) this.f34812b).f7566c);
                gVar.getClass();
                if (iterable.iterator().hasNext()) {
                    gVar.a().compileStatement("DELETE FROM events WHERE _id in " + s5.g.g(iterable)).execute();
                    return null;
                }
                return null;
            default:
                da.b bVar = (da.b) this.f34812b;
                for (Map.Entry entry : ((HashMap) this.f34813c).entrySet()) {
                    ((s5.g) ((s5.c) bVar.f7569i)).e(((Integer) entry.getValue()).intValue(), o5.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                return null;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        qg.a2 a2Var = (qg.a2) this.f34812b;
        Bitmap bitmap = (Bitmap) this.f34813c;
        a2Var.B0 = false;
        FileLog.e(exc);
        if (Build.VERSION.SDK_INT >= 24 && (exc instanceof mb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && a2Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new p2.b(6, a2Var, bitmap), 2000L);
        } else {
            a2Var.C0 = true;
        }
    }

    @Override
    public void onSuccess(Object obj) {
        Integer num = (Integer) obj;
        FileLog.d("wear-auth: /token delivered to " + ((String) ((cf.c) this.f34812b).d));
        ((ci.d) this.f34813c).setLoading(false);
        dj1.d = null;
        org.telegram.ui.ActionBar.f3 f3Var = dj1.f32676c;
        if (f3Var != null) {
            f3Var.dismiss();
            dj1.f32676c = null;
        }
    }

    @Override
    public Object provide(Object obj) {
        ax0 ax0Var = (ax0) this.f34813c;
        Void r10 = (Void) obj;
        PremiumPreviewFragment premiumPreviewFragment = ((bx0) this.f34812b).d.f32435n;
        premiumPreviewFragment.f31143n0.d(0, 0.0f, 0, ax0Var.getMeasuredWidth(), -ax0Var.getTier().h, premiumPreviewFragment.O);
        return premiumPreviewFragment.f31143n0.f42507f;
    }

    @Override
    public void run(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f34813c;
        wf1 wf1Var = ((gf1) this.f34812b).f33557b;
        NotificationCenter notificationCenter = wf1Var.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(wf1Var, i10);
        wf1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        wf1Var.finishFragment();
        wf1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-chat.f18083id), null, chat, Boolean.valueOf(z10));
    }

    @Override
    public void v(nk0 nk0Var) {
        cg1 cg1Var = ((zf1) this.f34812b).f40121a;
        cg1Var.e.add(Integer.valueOf(((TLRPC.TL_forumTopic) this.f34813c).f18135id));
        cg1Var.V();
    }

    public kv0(lv0 lv0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.f34811a = 1;
        this.f34812b = lv0Var;
        this.f34813c = tL_messageMediaPoll;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f34812b;
        Runnable runnable = (Runnable) this.f34813c;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (!((MediaDataController.KeywordResult) arrayList.get(i10)).emoji.startsWith("animated_")) {
                    String fixEmoji = Emoji.fixEmoji(((MediaDataController.KeywordResult) arrayList.get(i10)).emoji);
                    if (Emoji.getEmojiDrawable(fixEmoji) != null) {
                        linkedHashSet.add(fixEmoji);
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }

    @Override
    public void c0() {
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
