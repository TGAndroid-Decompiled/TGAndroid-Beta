package org.telegram.ui.Components;

import android.graphics.RectF;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
public final class t90 implements Runnable {
    public final int f32918a;
    public final Object f32919b;
    public final Object f32920c;

    public t90(int i10, Object obj, Object obj2) {
        this.f32918a = i10;
        this.f32919b = obj;
        this.f32920c = obj2;
    }

    @Override
    public final void run() {
        bi.u7 u7Var;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int indexOf;
        int K;
        int i10;
        long j10;
        boolean z14 = false;
        int i11 = 2;
        boolean z15 = false;
        boolean z16 = true;
        switch (this.f32918a) {
            case 0:
                u90 u90Var = (u90) this.f32919b;
                if (u90Var.O0 == ((aa0) this.f32920c)) {
                    u90Var.performLongClick();
                    u90Var.O0 = null;
                    u90Var.M0.d(true);
                    return;
                }
                return;
            case 1:
                ((w90) this.f32919b).l((da0) this.f32920c, false);
                return;
            case 2:
                ta0 ta0Var = (ta0) this.f32919b;
                if (!((boolean[]) this.f32920c)[0] && (u7Var = ta0Var.Q) != null) {
                    u7Var.run();
                }
                ta0Var.Q = null;
                return;
            case 3:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f32920c;
                ((va0) this.f32919b).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new o70(editTextBoldCursor, 3));
                return;
            case 4:
                i2.c cVar = (i2.c) this.f32919b;
                Runnable runnable = (Runnable) this.f32920c;
                cVar.getClass();
                runnable.run();
                cVar.f13503a.remove(runnable);
                return;
            case 5:
                wh0 wh0Var = (wh0) this.f32919b;
                TLObject tLObject = (TLObject) this.f32920c;
                wh0Var.M = false;
                if (tLObject instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject;
                    wh0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        wh0Var.a(false);
                        return;
                    }
                    wh0Var.d();
                    wh0Var.f34444c.f32152g3.O(true);
                    return;
                }
                return;
            case 6:
                bi0 bi0Var = (bi0) this.f32919b;
                ArrayList arrayList = (ArrayList) this.f32920c;
                ArrayList arrayList2 = bi0Var.f26857a;
                int i12 = bi0Var.f26869x;
                int size = arrayList.size();
                bi0Var.f26869x = size;
                if (i12 != size && bi0Var.S != null) {
                    bi0Var.g();
                }
                int size2 = arrayList2.size();
                int i13 = 0;
                while (i13 < size2) {
                    yh0 yh0Var = (yh0) arrayList2.get(i13);
                    if (yh0Var.f35055o && !yh0Var.f35056p) {
                        arrayList.add(yh0Var);
                    } else if (bi0.j(yh0Var.f35044a, arrayList) == null) {
                        bi0 bi0Var2 = yh0Var.f35064y;
                        float f7 = bi0Var2.N;
                        RectF rectF = yh0Var.f35046c;
                        RectF rectF2 = yh0Var.f35047f;
                        da0 da0Var = yh0Var.f35058r;
                        if (da0Var != null) {
                            da0Var.a();
                            yh0Var.f35060t = z15;
                            yh0Var.f35059s = z15;
                        }
                        yh0Var.f35055o = z16;
                        if (rectF.left - 1.0f <= f7) {
                            z10 = z16;
                        } else {
                            z10 = z15;
                        }
                        if (rectF.right + 1.0f >= bi0Var2.getMeasuredWidth() - f7) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z10 && z11) {
                            z10 = false;
                            z11 = false;
                        }
                        yh0Var.f35048g.set(rectF);
                        rectF2.set(rectF);
                        if (z10) {
                            rectF2.right = rectF2.left;
                        } else if (z11) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i14 = yh0Var.f35044a;
                            if (i14 != 3 && i14 != 2) {
                                z12 = true;
                            } else {
                                z12 = true;
                                if (bi0Var2.H == 1) {
                                    rectF2.left = rectF2.right;
                                    z13 = false;
                                    yh0Var.e.d(0.0f, z12);
                                    arrayList.add(yh0Var);
                                    i13++;
                                    z14 = z13;
                                    z15 = false;
                                    z16 = true;
                                }
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            z13 = false;
                            yh0Var.e.d(0.0f, z12);
                            arrayList.add(yh0Var);
                            i13++;
                            z14 = z13;
                            z15 = false;
                            z16 = true;
                        }
                        z12 = true;
                        z13 = false;
                        yh0Var.e.d(0.0f, z12);
                        arrayList.add(yh0Var);
                        i13++;
                        z14 = z13;
                        z15 = false;
                        z16 = true;
                    }
                    z13 = z14;
                    i13++;
                    z14 = z13;
                    z15 = false;
                    z16 = true;
                }
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                bi0Var.invalidate();
                return;
            case 7:
                yh0 yh0Var2 = (yh0) this.f32920c;
                ai0 ai0Var = ((bi0) this.f32919b).F;
                int i15 = yh0Var2.f35044a;
                RectF rectF3 = yh0Var2.d;
                ProfileActivity.e0(((org.telegram.ui.wx0) ai0Var).f45585b, i15, rectF3.left, rectF3.top);
                return;
            case 8:
                RLottieNative rLottieNative = (RLottieNative) this.f32919b;
                RLottieNative rLottieNative2 = (RLottieNative) this.f32920c;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                if (rLottieNative2 != null) {
                    rLottieNative2.d();
                    return;
                }
                return;
            case 9:
                fk0 fk0Var = (fk0) this.f32919b;
                ArrayList arrayList3 = (ArrayList) this.f32920c;
                ArrayList arrayList4 = fk0Var.f28222r;
                fk0Var.f28221n.addAll(arrayList3);
                int size3 = arrayList3.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj = arrayList3.get(i16);
                    i16++;
                    ek0 ek0Var = (ek0) obj;
                    int i17 = 0;
                    while (true) {
                        if (i17 < arrayList4.size()) {
                            if (MessageObject.getObjectPeerId(((ek0) arrayList4.get(i17)).f27892a) == MessageObject.getObjectPeerId(ek0Var.f27892a)) {
                                if (ek0Var.f27894c > 0) {
                                    ((ek0) arrayList4.get(i17)).f27894c = ek0Var.f27894c;
                                }
                            } else {
                                i17++;
                            }
                        } else {
                            arrayList4.add(ek0Var);
                        }
                    }
                }
                q0.a aVar = fk0Var.f28224w;
                if (aVar != null) {
                    aVar.accept(arrayList3);
                }
                fk0Var.a();
                return;
            case 10:
                wo0 wo0Var = (wo0) this.f32919b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.f32920c;
                ArrayList arrayList5 = wo0Var.K;
                if (!arrayList5.isEmpty() && (indexOf = arrayList5.indexOf(tL_sponsoredPeer)) >= 0 && (K = wo0Var.K()) < wo0Var.h()) {
                    arrayList5.remove(indexOf);
                    wo0Var.u(K + 1 + indexOf);
                    int size4 = wo0Var.f14083j0.e.size();
                    int size5 = arrayList5.size();
                    if (wo0Var.G0) {
                        size4 = Math.min(3, size4);
                    }
                    if (size5 + size4 <= 0) {
                        wo0Var.u(K);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                ((wo0) this.f32919b).S();
                wc.b0((org.telegram.ui.cy) this.f32920c).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 12:
                ((jp0) this.f32919b).sendAccessibilityEvent((View) this.f32920c, 4);
                return;
            case 13:
                ef efVar = (ef) this.f32919b;
                org.telegram.ui.un unVar = (org.telegram.ui.un) this.f32920c;
                if (unVar != null) {
                    unVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    efVar.dismiss();
                    return;
                }
                return;
            case 14:
                ((WindowManager) this.f32920c).removeView(((ef) this.f32919b).B);
                return;
            case 15:
                mr0 mr0Var = (mr0) this.f32919b;
                TLObject tLObject2 = (TLObject) this.f32920c;
                if (tLObject2 != null) {
                    mr0Var.f30713l0 = (TLRPC.TL_exportedMessageLink) tLObject2;
                    mr0Var.c1();
                    if (mr0Var.f30715n0) {
                        mr0Var.O0();
                    }
                }
                mr0Var.m0 = false;
                return;
            case 16:
                tu0 tu0Var = (tu0) this.f32919b;
                sr0 sr0Var = (sr0) this.f32920c;
                tu0Var.F = null;
                tu0Var.G = null;
                sr0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new i10(sr0Var, 21)).start();
                return;
            case 17:
                bi.t9 t9Var = (bi.t9) this.f32919b;
                t9Var.e = !t9Var.e;
                ((Runnable[]) this.f32920c)[0].run();
                t9Var.j(true);
                return;
            case 18:
                di.a7 a7Var = (di.a7) this.f32920c;
                zs0 zs0Var = ((aw0) this.f32919b).f26640b0;
                if (zs0Var != null) {
                    int i18 = a7Var.f8375a;
                    zs0Var.f41112b.d(i18, zs0Var.d.i(i18));
                    return;
                }
                return;
            case 19:
                wc.b0(((ju0) this.f32919b).f29725f.f26704x1).R(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.f32920c).title)).k(true);
                return;
            case 20:
                wu0 wu0Var = (wu0) this.f32919b;
                String str = (String) this.f32920c;
                if (!wu0Var.v.f26698v1[wu0Var.f34539r].f31706a.isEmpty() && ((i10 = wu0Var.f34539r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) ic.a.g(1, wu0Var.v.f26698v1[i10].f31706a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    aw0 aw0Var = wu0Var.v;
                    if (aw0Var.l1 == aw0Var.f26704x1.getUserConfig().getClientUserId()) {
                        j10 = messageObject.getSavedDialogId();
                    } else {
                        j10 = 0;
                    }
                    wu0Var.F(id2, str, dialogId, j10);
                } else if (wu0Var.f34539r == 3) {
                    aw0 aw0Var2 = wu0Var.v;
                    wu0Var.F(0, str, aw0Var2.l1, aw0Var2.F);
                }
                int i19 = wu0Var.f34539r;
                if (i19 == 1 || i19 == 4) {
                    ArrayList arrayList6 = new ArrayList(wu0Var.v.f26698v1[wu0Var.f34539r].f31706a);
                    wu0Var.f34540s++;
                    Utilities.searchQueue.postRunnable(new kg(wu0Var, str, arrayList6, 26));
                    return;
                }
                return;
            case 21:
                wu0 wu0Var2 = (wu0) this.f32919b;
                ArrayList arrayList7 = (ArrayList) this.f32920c;
                aw0 aw0Var3 = wu0Var2.v;
                boolean z17 = aw0Var3.X0;
                tu0[] tu0VarArr = aw0Var3.m0;
                if (z17) {
                    wu0Var2.f34540s--;
                    int h = wu0Var2.h();
                    wu0Var2.d = arrayList7;
                    int h10 = wu0Var2.h();
                    if (wu0Var2.f34540s == 0 || h10 != 0) {
                        aw0Var3.v1(false);
                    }
                    for (int i20 = 0; i20 < tu0VarArr.length; i20++) {
                        tu0 tu0Var2 = tu0VarArr[i20];
                        if (tu0Var2.E == wu0Var2.f34539r) {
                            if (wu0Var2.f34540s == 0 && h10 == 0) {
                                tu0Var2.v.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                tu0VarArr[i20].v.f28017f.setVisibility(8);
                                tu0VarArr[i20].v.e(false, true);
                            } else if (h == 0) {
                                aw0Var3.C(tu0Var2.h, 0, null);
                            }
                        }
                    }
                    wu0Var2.l();
                    return;
                }
                return;
            case 22:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i21 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i21, bool, (TLObject) this.f32919b, (TLRPC.Document) this.f32920c, null, bool);
                return;
            case 23:
                MessagesController.getInstance(((oz0) this.f32919b).f31396a.f33172a).updateEmojiStatus((TLRPC.EmojiStatus) this.f32920c);
                return;
            case 24:
                e41 e41Var = (e41) this.f32919b;
                MessagesController.getInstance(e41Var.f27727b).getTopicsController().deleteTopics(-e41Var.f27729c, (ArrayList) this.f32920c);
                int i22 = e41.f27724i0;
                return;
            case 25:
                e41 e41Var2 = (e41) this.f32919b;
                e41Var2.getClass();
                MessagesController.getInstance(e41Var2.f27727b).loadFullChat(((TLRPC.Updates) this.f32920c).chats.get(0).f22027id, 0, true);
                return;
            case 26:
                org.telegram.ui.Cells.j1 j1Var = (org.telegram.ui.Cells.j1) this.f32919b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f32920c;
                if (j1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i11 = 1;
                    }
                    j1Var.Z(i11);
                    return;
                }
                return;
            case 27:
                f51.o((f51) this.f32919b, (TLObject) this.f32920c);
                return;
            case 28:
                org.telegram.ui.tk tkVar = (org.telegram.ui.tk) this.f32919b;
                ((org.telegram.ui.ActionBar.o1) this.f32920c).d(true);
                x51.a(tkVar.getContext(), tkVar.d);
                return;
            default:
                ((TranslateController) this.f32920c).setHideTranslateDialog(((org.telegram.ui.tk) this.f32919b).f34633b, false);
                return;
        }
    }

    public t90(Object obj, Object obj2, Object obj3, int i10) {
        this.f32918a = i10;
        this.f32919b = obj;
        this.f32920c = obj2;
    }
}
