package org.telegram.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
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
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class fz0 implements org.telegram.ui.ActionBar.c2, MediaDataController.KeywordResultCallback, org.telegram.ui.Components.kl0, org.telegram.ui.Components.ll0, aw0, MessagesStorage.BooleanCallback, b21, OnSuccessListener, OnFailureListener, pa.a, t5.b, s5.e, vo0 {
    public final int f32946a;
    public final Object f32947b;
    public final Object f32948c;

    public fz0(int i10, Object obj, Object obj2) {
        this.f32946a = i10;
        this.f32947b = obj;
        this.f32948c = obj2;
    }

    @Override
    public void a(int i10) {
        switch (this.f32946a) {
            case 28:
                sg.v vVar = (sg.v) this.f32947b;
                sg.v vVar2 = (sg.v) this.f32948c;
                if (i10 == 1) {
                    vVar.run(null);
                    return;
                } else if (i10 != 3) {
                    vVar2.run(null);
                    return;
                } else {
                    return;
                }
            default:
                Utilities.Callback callback = (Utilities.Callback) this.f32947b;
                Utilities.Callback callback2 = (Utilities.Callback) this.f32948c;
                if (i10 == 1) {
                    callback.run(null);
                    return;
                } else if (i10 != 3) {
                    callback2.run(null);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public Object apply(Object obj) {
        i5.d[] values;
        s5.g gVar = (s5.g) this.f32947b;
        l5.i iVar = (l5.i) this.f32948c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        s5.a aVar = gVar.d;
        ArrayList d = gVar.d(sQLiteDatabase, iVar, aVar.f41781b);
        for (i5.d dVar : i5.d.values()) {
            if (dVar != iVar.f12795c) {
                int size = aVar.f41781b - d.size();
                if (size <= 0) {
                    break;
                }
                d.addAll(gVar.d(sQLiteDatabase, iVar.b(dVar), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < d.size(); i10++) {
            sb2.append(((s5.b) d.get(i10)).f41783a);
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
            long j10 = bVar.f41783a;
            if (hashMap.containsKey(Long.valueOf(j10))) {
                com.google.firebase.messaging.n c10 = bVar.f41785c.c();
                for (s5.f fVar : (Set) hashMap.get(Long.valueOf(j10))) {
                    c10.c(fVar.f41786a, fVar.f41787b);
                }
                listIterator.set(new s5.b(j10, bVar.f41784b, c10.g()));
            }
        }
        return d;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia) {
        pe1 pe1Var = (pe1) this.f32947b;
        eo eoVar = (eo) this.f32948c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = pe1Var.G.messageOwner.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        pe1Var.G.messageOwner.media = messageMedia;
        eoVar.getSendMessagesHelper().editMessage(pe1Var.G, null, null, null, null, null, null, false, false, null);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        ThemeActivity.W((ThemeActivity) this.f32947b, (Context) this.f32948c, view, i10, f7);
    }

    @Override
    public boolean d(int i10, View view) {
        String str;
        final kc1 kc1Var = (kc1) this.f32947b;
        final mc1 mc1Var = (mc1) this.f32948c;
        ThemeActivity themeActivity = kc1Var.e;
        if (i10 >= 0 && i10 < mc1Var.e.size()) {
            final org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) mc1Var.e.get(i10);
            if (h6Var.f17792a >= 100 && !h6Var.f17813z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String string = LocaleController.getString("OpenInEditor", R.string.OpenInEditor);
                String string2 = LocaleController.getString("ShareTheme", R.string.ShareTheme);
                TLRPC.TL_theme tL_theme = h6Var.f17806r;
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
                        kc1 kc1Var2 = kc1.this;
                        ThemeActivity themeActivity2 = kc1Var2.e;
                        if (themeActivity2.getParentActivity() != null) {
                            org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                            int i12 = 2;
                            if (i11 == 0) {
                                if (i11 != 1) {
                                    i12 = 1;
                                }
                                org.telegram.ui.Components.d5.W(themeActivity2, i12, h6Var2.f17793b, h6Var2);
                            } else if (i11 == 1) {
                                if (h6Var2.f17806r == null) {
                                    themeActivity2.getMessagesController().saveThemeToServer(h6Var2.f17793b, h6Var2);
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, h6Var2.f17793b, h6Var2);
                                    return;
                                }
                                String str2 = "https://" + themeActivity2.getMessagesController().linkPrefix + "/addtheme/" + h6Var2.f17806r.slug;
                                themeActivity2.showDialog(new org.telegram.ui.Components.sq0(themeActivity2.getParentActivity(), null, str2, false, str2, false, null));
                            } else if (i11 == 2) {
                                themeActivity2.presentFragment(new fe1(h6Var2.f17793b, h6Var2, false));
                            } else if (i11 == 3 && themeActivity2.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                                String string3 = LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle);
                                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder2.f17528a;
                                d2Var.R = string3;
                                d2Var.T = LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert);
                                alertDialog$Builder2.k(LocaleController.getString("Delete", R.string.Delete), new a7(kc1Var2, mc1Var, h6Var2, 22));
                                alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                                themeActivity2.showDialog(d2Var);
                                TextView textView = (TextView) d2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
                                }
                            }
                        }
                    }
                };
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                d2Var.P = charSequenceArr;
                d2Var.Q = iArr;
                d2Var.M = onClickListener;
                themeActivity.showDialog(d2Var);
                d2Var.l(d2Var.N0.size() - 1, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18144p7, false));
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
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        boolean z10;
        boolean z11;
        switch (this.f32946a) {
            case 0:
                ProfileActivity.c0((ProfileActivity) this.f32947b, (org.telegram.ui.Cells.z1[]) this.f32948c);
                return;
            case 1:
                n01 n01Var = (n01) this.f32947b;
                TLRPC.User user = (TLRPC.User) this.f32948c;
                n01Var.getClass();
                ArrayList<TLRPC.User> arrayList = new ArrayList<>();
                arrayList.add(user);
                ProfileActivity profileActivity = n01Var.f35089b;
                profileActivity.getContactsController().deleteContact(arrayList, true);
                if (user != null) {
                    user.contact = false;
                    profileActivity.e5(false, false);
                    return;
                }
                return;
            case 2:
            case 3:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 15:
            case 20:
            case 21:
            case 23:
            case 24:
            case 25:
            default:
                ((sg.v) this.f32947b).run((TLRPC.TL_premiumGiftCodeOption) this.f32948c);
                return;
            case 4:
                v71 v71Var = (v71) this.f32947b;
                TLRPC.User user2 = (TLRPC.User) this.f32948c;
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    v71Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    a7 a7Var = new a7(v71Var, user2, twoStepVerificationActivity, 20);
                    twoStepVerificationActivity.Z = 0;
                    twoStepVerificationActivity.f30703b0 = a7Var;
                    U.presentFragment(twoStepVerificationActivity);
                    return;
                }
                return;
            case 5:
                nb1.m((nb1) this.f32947b, (wy) this.f32948c);
                return;
            case 6:
                ThemeActivity.X((ThemeActivity) this.f32947b, (r91) this.f32948c);
                return;
            case 9:
                kc1 kc1Var = (kc1) this.f32947b;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.f32948c;
                kc1Var.getClass();
                MessagesController messagesController = MessagesController.getInstance(i6Var.E);
                if (i6Var == org.telegram.ui.ActionBar.j6.J) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                messagesController.saveTheme(i6Var, null, z10, true);
                HashMap hashMap = org.telegram.ui.ActionBar.j6.H;
                if (i6Var.f17836b == null) {
                    z11 = false;
                } else {
                    if (org.telegram.ui.ActionBar.j6.I == i6Var) {
                        org.telegram.ui.ActionBar.j6.t(org.telegram.ui.ActionBar.j6.L, true, false);
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (i6Var == org.telegram.ui.ActionBar.j6.J) {
                        org.telegram.ui.ActionBar.j6.J = (org.telegram.ui.ActionBar.i6) hashMap.get("Dark Blue");
                    }
                    i6Var.t();
                    org.telegram.ui.ActionBar.j6.G.remove(i6Var);
                    hashMap.remove(i6Var.f17834a);
                    org.telegram.ui.ActionBar.c6 c6Var = i6Var.f17846i0;
                    if (c6Var != null) {
                        org.telegram.ui.ActionBar.c6.a(c6Var);
                    }
                    org.telegram.ui.ActionBar.j6.F.remove(i6Var);
                    new File(i6Var.f17836b).delete();
                    org.telegram.ui.ActionBar.j6.s1(true, false);
                }
                if (z11) {
                    ((ActionBarLayout) ThemeActivity.c0(kc1Var.e)).U(true, true);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
                return;
            case 13:
                mh1.W((mh1) this.f32947b, (byte[]) this.f32948c);
                return;
            case 14:
                zi1 zi1Var = (zi1) this.f32947b;
                zi1Var.getClass();
                ((boolean[]) this.f32948c)[0] = true;
                zi1Var.f39387p0 = 17;
                Intent intent = new Intent(zi1Var.f39359b, VoIPService.class);
                intent.putExtra("user_id", zi1Var.d.f17342id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", zi1Var.f39356a);
                try {
                    zi1Var.f39359b.startService(intent);
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 16:
                ((e2.h) this.f32947b).accept(Boolean.TRUE);
                ((boolean[]) this.f32948c)[0] = true;
                d2Var.dismiss();
                return;
            case 17:
                org.telegram.ui.web.p.Y((org.telegram.ui.web.p) this.f32947b, (HashSet) this.f32948c);
                return;
            case 18:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.f32947b;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = MessagesController.getInstance(c1Var.M).getInputUser(c1Var.U);
                ConnectionsManager.getInstance(c1Var.M).sendRequest(allowsendmessage, new bi.wa((Object) c1Var, (Object) ((String[]) this.f32948c), d2Var, 14));
                return;
            case 19:
                boolean[] zArr = (boolean[]) this.f32947b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f32948c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.cancel();
                    return;
                }
                return;
            case 22:
                qg.k0.Q((qg.k0) this.f32947b, (ArrayList) this.f32948c);
                return;
            case 26:
                ((AtomicBoolean) this.f32947b).set(true);
                ((sg.v0) this.f32948c).run();
                return;
        }
    }

    @Override
    public Object g() {
        switch (this.f32946a) {
            case 23:
                Iterable iterable = (Iterable) this.f32948c;
                s5.g gVar = (s5.g) ((s5.d) ((da.b) this.f32947b).f6354c);
                gVar.getClass();
                if (iterable.iterator().hasNext()) {
                    gVar.a().compileStatement("DELETE FROM events WHERE _id in " + s5.g.g(iterable)).execute();
                    return null;
                }
                return null;
            default:
                da.b bVar = (da.b) this.f32947b;
                for (Map.Entry entry : ((HashMap) this.f32948c).entrySet()) {
                    ((s5.g) ((s5.c) bVar.f6357i)).e(((Integer) entry.getValue()).intValue(), o5.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                return null;
        }
    }

    @Override
    public void j(pa.b bVar) {
        ((pa.a) this.f32947b).j(bVar);
        ((pa.a) this.f32948c).j(bVar);
    }

    @Override
    public void onFailure(Exception exc) {
        pg.x1 x1Var = (pg.x1) this.f32947b;
        Bitmap bitmap = (Bitmap) this.f32948c;
        x1Var.B0 = false;
        FileLog.e(exc);
        if (Build.VERSION.SDK_INT >= 24 && (exc instanceof mb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && x1Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.x1(5, x1Var, bitmap), 2000L);
        } else {
            x1Var.C0 = true;
        }
    }

    @Override
    public void onSuccess(Object obj) {
        Integer num = (Integer) obj;
        FileLog.d("wear-auth: /token delivered to " + ((String) ((bi.u6) this.f32947b).f3721c));
        ((bi.d) this.f32948c).setLoading(false);
        pj1.d = null;
        org.telegram.ui.ActionBar.h3 h3Var = pj1.f35854c;
        if (h3Var != null) {
            h3Var.dismiss();
            pj1.f35854c = null;
        }
    }

    @Override
    public void run(boolean z10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.f32948c;
        ig1 ig1Var = ((sf1) this.f32947b).f36673b;
        NotificationCenter notificationCenter = ig1Var.getNotificationCenter();
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(ig1Var, i10);
        ig1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        ig1Var.finishFragment();
        ig1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-chat.f17195id), null, chat, Boolean.valueOf(z10));
    }

    @Override
    public void u(vk0 vk0Var) {
        og1 og1Var = ((lg1) this.f32947b).f34714a;
        og1Var.e.add(Integer.valueOf(((TLRPC.TL_forumTopic) this.f32948c).f17247id));
        og1Var.V();
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f32947b;
        Runnable runnable = (Runnable) this.f32948c;
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
    public void Z() {
    }

    @Override
    public void p0(View view, float f7, float f10) {
    }
}
