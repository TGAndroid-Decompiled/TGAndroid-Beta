package org.telegram.ui.Components;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProxyListActivity;
import org.telegram.ui.lh1;

public final class xh0 implements View.OnClickListener {

    public final int f34616a;

    public final Object f34617b;

    public final Object f34618c;

    public xh0(int i10, Object obj, Object obj2) {
        this.f34616a = i10;
        this.f34618c = obj;
        this.f34617b = obj2;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        ArrayList arrayList = null;
        int i11 = 4;
        switch (this.f34616a) {
            case 0:
                yh0 yh0Var = (yh0) this.f34618c;
                Context context = (Context) this.f34617b;
                Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(yh0Var.f34904b, "qr_tmp.png", Bitmap.CompressFormat.PNG);
                if (bitmapShareUri != null) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("image/*");
                    intent.putExtra("android.intent.extra.STREAM", bitmapShareUri);
                    try {
                        AndroidUtilities.findActivity(context).startActivityForResult(Intent.createChooser(intent, yh0Var.getTitleView().getText()), 500);
                    } catch (ActivityNotFoundException e9) {
                        e9.printStackTrace();
                        return;
                    }
                }
                break;
            case 1:
                String str = (String) this.f34618c;
                Context context2 = (Context) this.f34617b;
                Intent intent2 = new Intent("android.intent.action.SEND");
                intent2.setType("text/plain");
                intent2.putExtra("android.intent.extra.TEXT", str);
                Intent intentCreateChooser = Intent.createChooser(intent2, LocaleController.getString(R.string.ShareLink));
                intentCreateChooser.setFlags(268435456);
                context2.startActivity(intentCreateChooser);
                break;
            case 2:
                hh.m7 m7Var = (hh.m7) this.f34618c;
                gh.u3 u3Var = (gh.u3) this.f34617b;
                m7Var.f9747e = !m7Var.f9747e;
                u3Var.run();
                m7Var.i(true);
                break;
            case 3:
                ax0 ax0Var = (ax0) this.f34618c;
                org.telegram.ui.Cells.a8 a8Var = (org.telegram.ui.Cells.a8) this.f34617b;
                org.telegram.ui.kt.q().v(ax0Var.f26838r.f28182i0);
                org.telegram.ui.kt.q().y(a8Var);
                break;
            case 4:
                CharSequence charSequence = (CharSequence) this.f34618c;
                hh.m5 m5Var = (hh.m5) this.f34617b;
                AndroidUtilities.addToClipboard(charSequence);
                m5Var.run();
                break;
            case 5:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f34618c;
                boolean[] zArr = (boolean[]) this.f34617b;
                e3Var.dismiss();
                if (!zArr[0]) {
                    MessagesController.getGlobalMainSettings().edit().putInt("showchattagsinfo", 0).apply();
                    zArr[0] = true;
                }
                break;
            case 6:
                m31 m31Var = (m31) this.f34618c;
                b51 b51Var = (b51) this.f34617b;
                m31Var.f30551g0 = false;
                m31Var.J();
                b51Var.N(true);
                m31Var.t();
                break;
            case 7:
                h31 h31Var = (h31) this.f34618c;
                View.OnClickListener onClickListener = (View.OnClickListener) this.f34617b;
                ImageView imageView = h31Var.f28922s;
                imageView.animate().rotation(imageView.getRotation() + 180.0f).setDuration(380L).setInterpolator(er.h).start();
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                break;
            case 8:
                org.telegram.ui.pk pkVar = (org.telegram.ui.pk) this.f34618c;
                ((org.telegram.ui.ActionBar.n1) this.f34617b).d(true);
                r31.a(pkVar.getContext(), pkVar.d);
                break;
            case 9:
                UndoView undoView = (UndoView) this.f34618c;
                TLRPC.Message message = (TLRPC.Message) this.f34617b;
                int i12 = UndoView.f26571a0;
                undoView.e(1, true);
                TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
                tL_payments_getPaymentReceipt.msg_id = message.f22401id;
                org.telegram.ui.ActionBar.n2 n2Var = undoView.f26579s;
                tL_payments_getPaymentReceipt.peer = n2Var.getMessagesController().getInputPeer(message.peer_id);
                n2Var.getConnectionsManager().sendRequest(tL_payments_getPaymentReceipt, new w1(undoView, 18), 2);
                break;
            case 10:
                q51 q51Var = (q51) this.f34618c;
                File file = (File) this.f34617b;
                if (file == null) {
                    q51Var.getClass();
                    break;
                } else {
                    Activity activityFindActivity = AndroidUtilities.findActivity(q51Var.getContext());
                    if (activityFindActivity != null) {
                        AndroidUtilities.openForView(file, "Telegram.apk", "application/vnd.android.package-archive", activityFindActivity, null, false);
                        q51Var.dismiss();
                        break;
                    }
                }
                break;
            case 11:
                org.telegram.ui.j30 j30Var = (org.telegram.ui.j30) this.f34618c;
                org.telegram.ui.s50 s50Var = (org.telegram.ui.s50) this.f34617b;
                if (j30Var.h()) {
                    if (bf.d.a(s50Var.f42427e0) > 0) {
                        org.telegram.ui.Components.voip.g1.n(s50Var.f42427e0);
                        s50Var.dismiss();
                    } else {
                        y4.B(s50Var.f42427e0, null, true).o();
                    }
                } else if (AndroidUtilities.checkInlinePermissions(s50Var.f42427e0)) {
                    n20.f30818a0 = false;
                    s50Var.dismiss();
                } else {
                    y4.A(j30Var.getContext()).o();
                }
                break;
            case 12:
                org.telegram.ui.Components.voip.u0 u0Var = (org.telegram.ui.Components.voip.u0) this.f34618c;
                oi0 oi0Var = (oi0) this.f34617b;
                boolean z10 = u0Var.v;
                u0Var.v = !z10;
                if (z10) {
                    oi0Var.K(69);
                    oi0Var.N(99);
                } else {
                    oi0Var.K(36);
                    oi0Var.N(69);
                }
                oi0Var.start();
                break;
            case 13:
                boolean[] zArr2 = (boolean[]) this.f34618c;
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) this.f34617b;
                boolean z11 = !zArr2[0];
                zArr2[0] = z11;
                y1Var.c(z11, true);
                break;
            case 14:
                org.telegram.ui.Components.voip.l2 l2Var = (org.telegram.ui.Components.voip.l2) this.f34618c;
                Context context3 = (Context) this.f34617b;
                l2Var.getClass();
                boolean z12 = context3 instanceof LaunchActivity;
                if (z12 && !ApplicationLoader.mainInterfacePaused) {
                    lh1.w((Activity) context3, l2Var.H);
                } else if (z12) {
                    Intent intent3 = new Intent(context3, (Class<?>) LaunchActivity.class);
                    intent3.setAction("voip");
                    context3.startActivity(intent3);
                }
                break;
            case 15:
                org.telegram.ui.js jsVar = (org.telegram.ui.js) this.f34618c;
                jsVar.showDialog(y4.m(jsVar.getParentActivity(), LocaleController.formatString(R.string.UserSuggestBirthdayTitle, UserObject.getForcedFirstName((TLRPC.User) this.f34617b)), LocaleController.getString(R.string.UserSuggestBirthdayButton), null, new org.telegram.ui.x3(jsVar, i11), null, false, false, jsVar.f39489r).f23994a);
                break;
            case 16:
                org.telegram.ui.ft ftVar = (org.telegram.ui.ft) this.f34618c;
                ArrayList arrayList2 = (ArrayList) this.f34617b;
                org.telegram.ui.kt ktVar = ftVar.f38203a;
                if (ktVar.f39878w != null) {
                    int iIntValue = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList2.get(iIntValue)).intValue() == 0) {
                        org.telegram.ui.ht htVar = ktVar.f39868l;
                        TLObject tLObject = ktVar.W;
                        if (tLObject == null) {
                            tLObject = ktVar.Z;
                        }
                        htVar.r(0, 0, ktVar.f39857b0, tLObject, true);
                    } else if (((Integer) arrayList2.get(iIntValue)).intValue() == 4) {
                        org.telegram.ui.ht htVar2 = ktVar.f39868l;
                        TLObject tLObject2 = ktVar.W;
                        if (tLObject2 == null) {
                            tLObject2 = ktVar.Z;
                        }
                        htVar2.r(0, 0, ktVar.f39857b0, tLObject2, false);
                    } else if (((Integer) arrayList2.get(iIntValue)).intValue() == 1) {
                        MediaDataController.getInstance(ktVar.f39874r).removeRecentGif(ktVar.W);
                        ktVar.f39868l.K();
                    } else if (((Integer) arrayList2.get(iIntValue)).intValue() == 2) {
                        MediaDataController.getInstance(ktVar.f39874r).addRecentGif(ktVar.W, (int) (System.currentTimeMillis() / 1000), true);
                        MessagesController.getInstance(ktVar.f39874r).saveGif("gif", ktVar.W);
                        ktVar.f39868l.K();
                    } else if (((Integer) arrayList2.get(iIntValue)).intValue() == 3) {
                        TLRPC.Document document = ktVar.W;
                        TLRPC.BotInlineResult botInlineResult = ktVar.Z;
                        Object obj = ktVar.f39857b0;
                        org.telegram.ui.ht htVar3 = ktVar.f39868l;
                        y4.M(ktVar.f39878w, htVar3.a(), new a1.d(htVar3, document, botInlineResult, obj, 11), ktVar.f39859c0);
                    } else if (((Integer) arrayList2.get(iIntValue)).intValue() == 11) {
                        org.telegram.ui.ht htVar4 = ktVar.f39868l;
                        TLObject tLObject3 = ktVar.W;
                        if (tLObject3 == null) {
                            tLObject3 = ktVar.Z;
                        }
                        htVar4.v(tLObject3, ktVar.f39857b0);
                    }
                    ktVar.p();
                    break;
                }
                break;
            case 17:
                org.telegram.ui.av avVar = (org.telegram.ui.av) this.f34618c;
                ih.b bVar = (ih.b) this.f34617b;
                org.telegram.ui.zu zuVar = avVar.T;
                lx0[] lx0VarArr = avVar.X;
                for (lx0 lx0Var : lx0VarArr) {
                    if (lx0Var != null) {
                        boolean z13 = lx0Var.f30485c;
                    }
                }
                org.telegram.ui.Cells.y1 y1Var2 = (org.telegram.ui.Cells.y1) view;
                int iIntValue2 = ((Integer) y1Var2.getTag()).intValue();
                lx0 lx0Var2 = lx0VarArr[iIntValue2];
                boolean z14 = lx0Var2.f30485c;
                boolean z15 = !z14;
                if (z14 != z15) {
                    lx0Var2.f30485c = z15;
                    lx0Var2.d = true;
                }
                y1Var2.c(lx0Var2.f30485c, true);
                boolean z16 = lx0VarArr[iIntValue2].f30485c;
                ArrayList arrayList3 = bVar.d;
                HashSet hashSet = bVar.f11489j;
                if (iIntValue2 != 0) {
                    if (iIntValue2 == 1) {
                        bVar.f11493n = z16;
                    } else if (iIntValue2 == 2) {
                        arrayList = bVar.f11485e;
                        bVar.f11494o = z16;
                    } else if (iIntValue2 == 3) {
                        arrayList = bVar.f11486f;
                        bVar.f11495p = z16;
                    } else if (iIntValue2 == 4) {
                        arrayList = bVar.f11487g;
                        bVar.f11496q = z16;
                    } else if (iIntValue2 == 7) {
                        arrayList = bVar.h;
                    }
                    if (arrayList != null) {
                        for (i10 = 0; i10 < arrayList.size(); i10++) {
                            if (((ih.a) arrayList.get(i10)).d != iIntValue2) {
                                if (z16) {
                                    if (!hashSet.contains(arrayList.get(i10))) {
                                        hashSet.add((ih.a) arrayList.get(i10));
                                        bVar.g((ih.a) arrayList.get(i10), true);
                                    }
                                } else if (hashSet.contains(arrayList.get(i10))) {
                                    hashSet.remove(arrayList.get(i10));
                                    bVar.g((ih.a) arrayList.get(i10), false);
                                }
                            }
                        }
                    }
                    avVar.f36637a0.c();
                    avVar.W.a(zuVar.d(), true);
                    zuVar.c(true);
                } else {
                    bVar.f11492m = z16;
                }
                arrayList = arrayList3;
                if (arrayList != null) {
                    while (i10 < arrayList.size()) {
                        if (((ih.a) arrayList.get(i10)).d != iIntValue2) {
                            if (z16) {
                                if (!hashSet.contains(arrayList.get(i10))) {
                                    hashSet.add((ih.a) arrayList.get(i10));
                                    bVar.g((ih.a) arrayList.get(i10), true);
                                }
                            } else if (hashSet.contains(arrayList.get(i10))) {
                                hashSet.remove(arrayList.get(i10));
                                bVar.g((ih.a) arrayList.get(i10), false);
                            }
                        }
                    }
                }
                avVar.f36637a0.c();
                avVar.W.a(zuVar.d(), true);
                zuVar.c(true);
                break;
            case 18:
                org.telegram.ui.gy gyVar = (org.telegram.ui.gy) this.f34618c;
                b70 b70Var = (b70) this.f34617b;
                gyVar.getClass();
                b70Var.u();
                gyVar.presentFragment(new ProxyListActivity());
                break;
            case 19:
                org.telegram.ui.gy gyVar2 = (org.telegram.ui.gy) this.f34618c;
                oh.r0.e((org.telegram.ui.ActionBar.b2[]) this.f34617b, gyVar2, gyVar2.currentAccount, gyVar2.U2);
                break;
            case 20:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.f34618c)[0].getSwipeBack().e(((int[]) this.f34617b)[0]);
                break;
            case 21:
                org.telegram.ui.gy gyVar3 = (org.telegram.ui.gy) this.f34618c;
                gyVar3.r4((ArrayList) this.f34617b, 102, false, false, null);
                gyVar3.finishPreviewFragment();
                break;
            case 22:
                org.telegram.ui.gy.H0((org.telegram.ui.gy) this.f34618c, (BirthdayController.BirthdayState) this.f34617b);
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new r61(9, (org.telegram.ui.gy) this.f34618c, (String) this.f34617b), 250L);
                break;
            case 24:
                org.telegram.ui.o10 o10Var = (org.telegram.ui.o10) this.f34618c;
                TLRPC.TL_dialogFilterSuggested suggestedFilter = ((org.telegram.ui.p10) this.f34617b).getSuggestedFilter();
                MessagesController.DialogFilter dialogFilter = new MessagesController.DialogFilter();
                TLRPC.TL_textWithEntities tL_textWithEntities = suggestedFilter.filter.title;
                dialogFilter.name = tL_textWithEntities.text;
                dialogFilter.entities = tL_textWithEntities.entities;
                dialogFilter.f19622id = 2;
                while (o10Var.f40974e.getMessagesController().dialogFiltersById.get(dialogFilter.f19622id) != null) {
                    dialogFilter.f19622id++;
                }
                dialogFilter.order = o10Var.f40974e.getMessagesController().getDialogFilters().size();
                dialogFilter.unreadCount = -1;
                dialogFilter.pendingUnreadCount = -1;
                int i13 = 0;
                while (i13 < 2) {
                    TLRPC.DialogFilter dialogFilter2 = suggestedFilter.filter;
                    ArrayList<TLRPC.InputPeer> arrayList4 = i13 == 0 ? dialogFilter2.include_peers : dialogFilter2.exclude_peers;
                    ArrayList<Long> arrayList5 = i13 == 0 ? dialogFilter.alwaysShow : dialogFilter.neverShow;
                    int size = arrayList4.size();
                    int iF = 0;
                    while (iF < size) {
                        TLRPC.InputPeer inputPeer = arrayList4.get(iF);
                        long j10 = inputPeer.user_id;
                        if (j10 == 0) {
                            long j11 = inputPeer.chat_id;
                            j10 = j11 != 0 ? -j11 : -inputPeer.channel_id;
                        }
                        iF = com.google.android.recaptcha.internal.a.f(j10, arrayList5, iF, 1);
                    }
                    i13++;
                }
                TLRPC.DialogFilter dialogFilter3 = suggestedFilter.filter;
                if (dialogFilter3.groups) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_GROUPS;
                }
                if (dialogFilter3.bots) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_BOTS;
                }
                if (dialogFilter3.contacts) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
                }
                if (dialogFilter3.non_contacts) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
                }
                if (dialogFilter3.broadcasts) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
                }
                if (dialogFilter3.exclude_archived) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
                }
                if (dialogFilter3.exclude_read) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
                }
                if (dialogFilter3.exclude_muted) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
                }
                org.telegram.ui.q00.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, true, true, true, true, true, o10Var.f40974e, new r61(26, o10Var, suggestedFilter));
                break;
            case 25:
                we.e.s((Context) this.f34617b, ((TL_fragment.TL_collectibleInfo) this.f34618c).url);
                break;
            case 26:
                org.telegram.ui.xs xsVar = (org.telegram.ui.xs) this.f34618c;
                org.telegram.ui.ActionBar.e3 e3Var2 = (org.telegram.ui.ActionBar.e3) this.f34617b;
                xsVar.run();
                e3Var2.dismiss();
                break;
            case 27:
                org.telegram.ui.b30 b30Var = (org.telegram.ui.b30) this.f34618c;
                TextView textView = (TextView) this.f34617b;
                org.telegram.ui.s50 s50Var2 = b30Var.A;
                ChatObject.Call call = s50Var2.W0;
                if (call != null && call.recording) {
                    s50Var2.G1(textView);
                    break;
                }
                break;
            case 28:
                new org.telegram.ui.b50((Context) this.f34617b, (ag.s0) this.f34618c).show();
                break;
            default:
                org.telegram.ui.l70 l70Var = (org.telegram.ui.l70) this.f34618c;
                ri0 ri0Var = (ri0) this.f34617b;
                l70Var.getClass();
                if (!org.telegram.ui.gy.f38494t4) {
                    org.telegram.ui.gy.f38494t4 = true;
                    boolean zQ = org.telegram.ui.ActionBar.g6.I.q();
                    boolean z17 = !zQ;
                    org.telegram.ui.ActionBar.f6 f6VarN0 = !zQ ? org.telegram.ui.ActionBar.g6.N0("Night") : org.telegram.ui.ActionBar.g6.N0("Blue");
                    org.telegram.ui.ActionBar.g6.f23244o = 0;
                    org.telegram.ui.ActionBar.g6.q1();
                    org.telegram.ui.ActionBar.g6.A();
                    oi0 oi0Var2 = l70Var.v;
                    oi0Var2.N(!zQ ? oi0Var2.f31312e[0] - 1 : 0);
                    ri0Var.d();
                    int[] iArr = {(ri0Var.getMeasuredWidth() / 2) + i, (ri0Var.getMeasuredHeight() / 2) + i};
                    ri0Var.getLocationInWindow(iArr);
                    int i14 = iArr[0];
                    int i15 = iArr[1];
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, f6VarN0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z17), ri0Var);
                    ri0Var.setContentDescription(LocaleController.getString(!zQ ? R.string.AccDescrSwitchToDayTheme : R.string.AccDescrSwitchToNightTheme));
                    break;
                }
                break;
        }
    }

    public xh0(Context context, TL_fragment.TL_collectibleInfo tL_collectibleInfo) {
        this.f34616a = 25;
        this.f34617b = context;
        this.f34618c = tL_collectibleInfo;
    }
}
