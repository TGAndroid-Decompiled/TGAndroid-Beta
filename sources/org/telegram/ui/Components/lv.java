package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuffColorFilter;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public class lv extends org.telegram.ui.ActionBar.g3 implements NotificationCenter.NotificationCenterDelegate {
    public static Pattern S;
    public final c2.z B;
    public final qp C;
    public org.telegram.ui.ActionBar.p1 D;
    public final boolean E;
    public boolean F;
    public float G;
    public int H;
    public int I;
    public final z5 J;
    public final uu K;
    public int L;
    public boolean M;
    public long N;
    public ValueAnimator O;
    public boolean P;
    public PorterDuffColorFilter Q;
    public int R;
    public LongSparseArray f26878b;
    public final org.telegram.ui.ActionBar.p2 f26879c;
    public final gn d;
    public final vu e;
    public final bv f26880f;
    public final org.telegram.ui.m3 h;
    public zu f26881n;
    public final View f26882r;
    public final FrameLayout f26883s;
    public final TextView v;
    public final TextView f26884w;
    public final eg.c1 f26885x;
    public final f2.w f26886y;

    public lv(org.telegram.ui.ActionBar.p2 r21, android.content.Context r22, org.telegram.ui.ActionBar.f6 r23, java.util.ArrayList r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lv.<init>(org.telegram.ui.ActionBar.p2, android.content.Context, org.telegram.ui.ActionBar.f6, java.util.ArrayList):void");
    }

    public static void P(lv lvVar, int i10) {
        ArrayList arrayList;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        String str;
        Context context;
        org.telegram.ui.ActionBar.p2 p2Var = lvVar.f26879c;
        vu vuVar = lvVar.e;
        if (vuVar != null && (arrayList = vuVar.f25775b) != null && !arrayList.isEmpty()) {
            TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) vuVar.f25775b.get(0)).set;
            if (stickerSet != null && stickerSet.emojis) {
                str = "https://" + MessagesController.getInstance(lvVar.currentAccount).linkPrefix + "/addemoji/" + tL_messages_stickerSet.set.short_name;
            } else {
                str = "https://" + MessagesController.getInstance(lvVar.currentAccount).linkPrefix + "/addstickers/" + tL_messages_stickerSet.set.short_name;
            }
            String str2 = str;
            if (i10 == 1) {
                if (p2Var != null) {
                    context = p2Var.getParentActivity();
                } else {
                    context = null;
                }
                if (context == null) {
                    context = lvVar.getContext();
                }
                yu yuVar = new yu(lvVar, context, str2, str2, lvVar.resourcesProvider);
                if (p2Var != null) {
                    p2Var.showDialog(yuVar);
                } else {
                    yuVar.show();
                }
            } else if (i10 == 2) {
                try {
                    AndroidUtilities.addToClipboard(str2);
                    new qc((FrameLayout) lvVar.containerView, lvVar.resourcesProvider).k(false).j();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
    }

    public static int U(lv lvVar) {
        return lvVar.currentAccount;
    }

    public static void W(final org.telegram.ui.ActionBar.p2 p2Var, TLObject tLObject, final boolean z4, final lh.e8 e8Var, final up upVar) {
        int currentAccount;
        final View fragmentView;
        final TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (p2Var == null) {
            currentAccount = UserConfig.selectedAccount;
        } else {
            currentAccount = p2Var.getCurrentAccount();
        }
        final int i10 = currentAccount;
        TLRPC.StickerSet stickerSet = null;
        if (p2Var == null) {
            fragmentView = null;
        } else {
            fragmentView = p2Var.getFragmentView();
        }
        if (tLObject != null) {
            if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            } else {
                tL_messages_stickerSet = null;
            }
            if (tL_messages_stickerSet != null) {
                stickerSet = tL_messages_stickerSet.set;
            } else if (tLObject instanceof TLRPC.StickerSet) {
                stickerSet = (TLRPC.StickerSet) tLObject;
            }
            final TLRPC.StickerSet stickerSet2 = stickerSet;
            if (stickerSet2 != null) {
                if (MediaDataController.getInstance(i10).cancelRemovingStickerSet(stickerSet2.f19186id)) {
                    if (e8Var != null) {
                        e8Var.run(Boolean.TRUE);
                        return;
                    }
                    return;
                }
                TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                tL_messages_installStickerSet.stickerset = tL_inputStickerSetID;
                tL_inputStickerSetID.f19179id = stickerSet2.f19186id;
                tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_installStickerSet, new RequestDelegate() {
                    @Override
                    public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                        final TLRPC.StickerSet stickerSet3 = TLRPC.StickerSet.this;
                        final boolean z10 = z4;
                        final View view = fragmentView;
                        final org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        final TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                        final int i11 = i10;
                        final Utilities.Callback callback = e8Var;
                        final Runnable runnable = upVar;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                int i12;
                                TLObject tLObject3;
                                TLObject tLObject4 = tLObject2;
                                TLRPC.StickerSet stickerSet4 = TLRPC.StickerSet.this;
                                if (stickerSet4.masks) {
                                    i12 = 1;
                                } else if (stickerSet4.emojis) {
                                    i12 = 5;
                                } else {
                                    i12 = 0;
                                }
                                TLRPC.TL_error tL_error2 = tL_error;
                                View view2 = view;
                                org.telegram.ui.ActionBar.p2 p2Var3 = p2Var2;
                                int i13 = i11;
                                Utilities.Callback callback2 = callback;
                                try {
                                    if (tL_error2 == null) {
                                        if (z10 && view2 != null) {
                                            Context context = p2Var3.getFragmentView().getContext();
                                            TLObject tLObject5 = tL_messages_stickerSet2;
                                            if (tLObject5 == null) {
                                                tLObject3 = stickerSet4;
                                            } else {
                                                tLObject3 = tLObject5;
                                            }
                                            ic.g(p2Var3, new bx0(context, tLObject3, 1, 2, null, p2Var3.getResourceProvider()), 1500).j();
                                        }
                                        if (tLObject4 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                                            MediaDataController.getInstance(i13).processStickerSetInstallResultArchive(p2Var3, true, i12, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject4);
                                        }
                                        if (callback2 != null) {
                                            callback2.run(Boolean.TRUE);
                                        }
                                    } else if (view2 != null) {
                                        Toast.makeText(p2Var3.getFragmentView().getContext(), LocaleController.getString(R.string.ErrorOccurred), 0).show();
                                        if (callback2 != null) {
                                            callback2.run(Boolean.FALSE);
                                        }
                                    } else if (callback2 != null) {
                                        callback2.run(Boolean.FALSE);
                                    }
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                                MediaDataController.getInstance(i13).loadStickers(i12, false, true, false, new v2(runnable, 5));
                            }
                        });
                    }
                });
            }
        }
    }

    public static boolean m(lv lvVar, sm smVar, MotionEvent motionEvent) {
        return org.telegram.ui.rt.q().s(motionEvent, lvVar.h, smVar, lvVar.K, lvVar.resourcesProvider);
    }

    public static void n(lv lvVar, ArrayList arrayList, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var, View view, int i10) {
        vu vuVar = lvVar.e;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        int i11 = 0;
        if (arrayList != null && arrayList.size() > 1) {
            if (SystemClock.elapsedRealtime() - lvVar.N >= 250) {
                int i12 = 0;
                while (true) {
                    ArrayList[] arrayListArr = vuVar.f25776c;
                    if (i11 >= arrayListArr.length) {
                        break;
                    }
                    int size = arrayListArr[i11].size();
                    if (vuVar.f25776c.length > 1) {
                        size = Math.min(lvVar.f26886y.J * 2, size);
                    }
                    i12 += size + 2;
                    if (i10 < i12) {
                        break;
                    }
                    i11++;
                }
                ArrayList arrayList2 = vuVar.f25775b;
                if (arrayList2 != null && i11 < arrayList2.size()) {
                    tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) vuVar.f25775b.get(i11);
                }
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    ArrayList arrayList3 = new ArrayList();
                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    tL_inputStickerSetID.f19179id = stickerSet.f19186id;
                    tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                    arrayList3.add(tL_inputStickerSetID);
                    new wu(lvVar, p2Var, lvVar.getContext(), f6Var, arrayList3).show();
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.p1 p1Var = lvVar.D;
        if (p1Var != null) {
            p1Var.d(true);
            lvVar.D = null;
        } else if ((p2Var instanceof org.telegram.ui.zn) && ((org.telegram.ui.zn) p2Var).V.getVisibility() == 0 && (view instanceof cv)) {
            u5 u5Var = ((cv) view).f24045c;
            try {
                TLRPC.Document document = u5Var.document;
                if (document == null) {
                    document = l5.f(lvVar.currentAccount, u5Var.getDocumentId());
                }
                SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(document));
                spannableString.setSpan(u5Var, 0, spannableString.length(), 33);
                ((org.telegram.ui.zn) p2Var).V.B0.getText().append((CharSequence) spannableString);
                lvVar.Y();
                lvVar.dismiss();
            } catch (Exception unused) {
            }
            try {
                view.performHapticFeedback(3, 1);
            } catch (Exception unused2) {
            }
        }
    }

    public static void o(lv lvVar, u5 u5Var) {
        org.telegram.ui.ActionBar.p1 p1Var = lvVar.D;
        if (p1Var != null) {
            p1Var.d(true);
            lvVar.D = null;
            SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(l5.f(lvVar.currentAccount, u5Var.getDocumentId())));
            spannableString.setSpan(u5Var, 0, spannableString.length(), 33);
            if (AndroidUtilities.addToClipboard(spannableString)) {
                org.telegram.ui.b.m(R.string.EmojiCopied, new qc((FrameLayout) lvVar.containerView, lvVar.resourcesProvider));
            }
        }
    }

    public static void p(lv lvVar, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        lvVar.G = floatValue;
        lvVar.h.setAlpha(floatValue);
        lvVar.v.setAlpha(lvVar.G);
        lvVar.f26884w.setAlpha(lvVar.G);
        lvVar.containerView.invalidate();
    }

    public static ViewGroup r(lv lvVar) {
        return lvVar.containerView;
    }

    public static ViewGroup s(lv lvVar) {
        return lvVar.containerView;
    }

    public final int V() {
        if (this.containerView == null) {
            return 0;
        }
        org.telegram.ui.m3 m3Var = this.h;
        if (m3Var != null && m3Var.getChildCount() >= 1) {
            View childAt = m3Var.getChildAt(0);
            gn gnVar = this.d;
            if (childAt != gnVar) {
                return this.containerView.getPaddingTop();
            }
            return gnVar.getBottom() + ((int) m3Var.getY());
        }
        return this.containerView.getPaddingTop();
    }

    public final void Z() {
        org.telegram.ui.ActionBar.p2 p2Var = this.f26879c;
        if (p2Var != null) {
            new eg.o1(p2Var, 11, false).show();
        } else if (getContext() instanceof LaunchActivity) {
            ((LaunchActivity) getContext()).p0(new PremiumPreviewFragment(0, null));
        }
    }

    public final void a0() {
        ArrayList arrayList;
        boolean z4;
        int i10;
        int i11;
        TLRPC.StickerSet stickerSet;
        if (this.f26883s == null) {
            return;
        }
        vu vuVar = this.e;
        if (vuVar.f25775b == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(vuVar.f25775b);
        }
        int i12 = 0;
        while (i12 < arrayList.size()) {
            if (arrayList.get(i12) == null) {
                arrayList.remove(i12);
                i12--;
            }
            i12++;
        }
        MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
        final ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i13);
            if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
                if (!mediaDataController.isStickerPackInstalled(stickerSet.f19186id)) {
                    arrayList3.add(tL_messages_stickerSet);
                } else {
                    arrayList2.add(tL_messages_stickerSet);
                }
            }
        }
        final ArrayList arrayList4 = new ArrayList(arrayList3);
        if (vuVar.f25774a != null && arrayList.size() == vuVar.f25774a.size()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!this.P && z4 && this.O == null) {
            this.O = ValueAnimator.ofFloat(this.G, 1.0f);
            this.containerView.getY();
            this.O.addUpdateListener(new f6(this, 16));
            this.O.setDuration(250L);
            this.O.setInterpolator(mr.h);
            this.O.start();
        }
        this.P = z4;
        org.telegram.ui.m3 m3Var = this.h;
        if (!z4) {
            m3Var.setAlpha(0.0f);
        } else if (this.L >= 0) {
            int L0 = this.f26886y.L0();
            int E = this.f26881n.E(this.L);
            if (Math.abs(L0 - E) > 54) {
                if (L0 < E) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                c2.z zVar = this.B;
                zVar.f2062b = i11;
                zVar.c(E, (AndroidUtilities.displaySize.y / 2) - AndroidUtilities.dp(170.0f), false, false);
            } else {
                m3Var.x0(E);
            }
            this.H = this.f26881n.E(this.L);
            zu zuVar = this.f26881n;
            int i14 = this.L;
            lv lvVar = zuVar.f31468c;
            boolean z10 = lvVar.F;
            vu vuVar2 = lvVar.e;
            if (z10) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            int i15 = 0;
            while (true) {
                ArrayList[] arrayListArr = vuVar2.f25776c;
                if (i15 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i15].size();
                if (vuVar2.f25776c.length > 1) {
                    size = Math.min(lvVar.f26886y.J * 2, size);
                }
                if (i15 == i14) {
                    i10 = i10 + size + 1;
                    break;
                } else {
                    i10 += size + 2;
                    i15++;
                }
            }
            this.I = i10;
            this.J.d(1.0f, true);
            m3Var.invalidate();
            this.L = -1;
        }
        boolean z11 = this.P;
        eg.c1 c1Var = this.f26885x;
        TextView textView = this.f26884w;
        TextView textView2 = this.v;
        if (z11 && !this.E) {
            c1Var.setVisibility(4);
            if (arrayList4.size() > 0) {
                textView2.setVisibility(0);
                textView.setVisibility(8);
                if (arrayList4.size() == 1) {
                    textView2.setText(LocaleController.formatPluralString("AddManyEmojiCount", ((TLRPC.TL_messages_stickerSet) arrayList4.get(0)).documents.size(), new Object[0]));
                } else {
                    textView2.setText(LocaleController.formatPluralString("AddManyEmojiPacksCount", arrayList4.size(), new Object[0]));
                }
                textView2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        boolean z12;
                        lh.e8 e8Var;
                        boolean z13;
                        switch (r1) {
                            case 0:
                                ArrayList arrayList5 = arrayList4;
                                int size2 = arrayList5.size();
                                int[] iArr = new int[2];
                                int i16 = 0;
                                while (true) {
                                    int size3 = arrayList5.size();
                                    lv lvVar2 = this;
                                    if (i16 < size3) {
                                        org.telegram.ui.ActionBar.p2 p2Var = lvVar2.f26879c;
                                        TLObject tLObject = (TLObject) arrayList5.get(i16);
                                        if (size2 == 1) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        if (size2 > 1) {
                                            e8Var = new lh.e8(lvVar2, iArr, size2, arrayList5);
                                        } else {
                                            e8Var = null;
                                        }
                                        lv.W(p2Var, tLObject, z12, e8Var, null);
                                        i16++;
                                    } else {
                                        lvVar2.X(true);
                                        if (size2 <= 1) {
                                            lvVar2.dismiss();
                                            return;
                                        }
                                        return;
                                    }
                                }
                            default:
                                lv lvVar3 = this;
                                lvVar3.dismiss();
                                org.telegram.ui.ActionBar.p2 p2Var2 = lvVar3.f26879c;
                                ArrayList<TLRPC.TL_messages_stickerSet> arrayList6 = arrayList4;
                                if (p2Var2 != null) {
                                    MediaDataController.getInstance(p2Var2.getCurrentAccount()).removeMultipleStickerSets(p2Var2.getContext(), p2Var2, arrayList6);
                                } else {
                                    for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList6.get(i17);
                                        Context context = lvVar3.getContext();
                                        if (i17 == 0) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        if (tL_messages_stickerSet2 != null) {
                                            MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(context, tL_messages_stickerSet2, 0, null, true, z13, null, true);
                                        }
                                    }
                                }
                                lvVar3.X(false);
                                return;
                        }
                    }
                });
                b0(true);
                return;
            } else if (arrayList2.size() > 0) {
                textView2.setVisibility(8);
                textView.setVisibility(0);
                if (arrayList2.size() == 1) {
                    textView.setText(LocaleController.formatPluralString("RemoveManyEmojiCount", ((TLRPC.TL_messages_stickerSet) arrayList2.get(0)).documents.size(), new Object[0]));
                } else {
                    textView.setText(LocaleController.formatPluralString("RemoveManyEmojiPacksCount", arrayList2.size(), new Object[0]));
                }
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        boolean z12;
                        lh.e8 e8Var;
                        boolean z13;
                        switch (r1) {
                            case 0:
                                ArrayList arrayList5 = arrayList2;
                                int size2 = arrayList5.size();
                                int[] iArr = new int[2];
                                int i16 = 0;
                                while (true) {
                                    int size3 = arrayList5.size();
                                    lv lvVar2 = this;
                                    if (i16 < size3) {
                                        org.telegram.ui.ActionBar.p2 p2Var = lvVar2.f26879c;
                                        TLObject tLObject = (TLObject) arrayList5.get(i16);
                                        if (size2 == 1) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        if (size2 > 1) {
                                            e8Var = new lh.e8(lvVar2, iArr, size2, arrayList5);
                                        } else {
                                            e8Var = null;
                                        }
                                        lv.W(p2Var, tLObject, z12, e8Var, null);
                                        i16++;
                                    } else {
                                        lvVar2.X(true);
                                        if (size2 <= 1) {
                                            lvVar2.dismiss();
                                            return;
                                        }
                                        return;
                                    }
                                }
                            default:
                                lv lvVar3 = this;
                                lvVar3.dismiss();
                                org.telegram.ui.ActionBar.p2 p2Var2 = lvVar3.f26879c;
                                ArrayList<TLRPC.TL_messages_stickerSet> arrayList6 = arrayList2;
                                if (p2Var2 != null) {
                                    MediaDataController.getInstance(p2Var2.getCurrentAccount()).removeMultipleStickerSets(p2Var2.getContext(), p2Var2, arrayList6);
                                } else {
                                    for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList6.get(i17);
                                        Context context = lvVar3.getContext();
                                        if (i17 == 0) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        if (tL_messages_stickerSet2 != null) {
                                            MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(context, tL_messages_stickerSet2, 0, null, true, z13, null, true);
                                        }
                                    }
                                }
                                lvVar3.X(false);
                                return;
                        }
                    }
                });
                b0(true);
                return;
            } else {
                textView2.setVisibility(8);
                textView.setVisibility(8);
                b0(false);
                return;
            }
        }
        c1Var.setVisibility(8);
        textView2.setVisibility(8);
        textView.setVisibility(8);
        b0(false);
    }

    public final void b0(boolean z4) {
        boolean z10;
        float f10;
        float dp;
        float f11;
        float dp2;
        float f12;
        float f13;
        int i10 = 0;
        if (!this.M && z4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f26884w.getVisibility() == 0) {
            i10 = AndroidUtilities.dp(19.0f);
        }
        float f14 = i10;
        boolean z11 = this.E;
        org.telegram.ui.m3 m3Var = this.h;
        View view = this.f26882r;
        FrameLayout frameLayout = this.f26883s;
        float f15 = 1.0f;
        float f16 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = frameLayout.animate();
            if (z4) {
                dp2 = f14;
            } else {
                dp2 = AndroidUtilities.dp(16.0f);
            }
            ViewPropertyAnimator translationY = animate.translationY(dp2);
            if (z4) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ViewPropertyAnimator duration = translationY.alpha(f12).setDuration(250L);
            mr mrVar = mr.h;
            duration.setInterpolator(mrVar).start();
            ViewPropertyAnimator animate2 = view.animate();
            if (z4) {
                f13 = -(AndroidUtilities.dp(68.0f) - f14);
            } else {
                f13 = 0.0f;
            }
            ViewPropertyAnimator translationY2 = animate2.translationY(f13);
            if (!z4) {
                f15 = 0.0f;
            }
            translationY2.alpha(f15).setDuration(250L).setInterpolator(mrVar).start();
            ViewPropertyAnimator animate3 = m3Var.animate();
            if (!z11 && !z4) {
                f16 = AndroidUtilities.dp(68.0f) - f14;
            }
            animate3.translationY(f16).setDuration(250L).setInterpolator(mrVar).start();
        } else {
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            frameLayout.setAlpha(f10);
            if (z4) {
                dp = f14;
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            frameLayout.setTranslationY(dp);
            if (!z4) {
                f15 = 0.0f;
            }
            view.setAlpha(f15);
            if (z4) {
                f11 = -(AndroidUtilities.dp(68.0f) - f14);
            } else {
                f11 = 0.0f;
            }
            view.setTranslationY(f11);
            if (!z11 && !z4) {
                f16 = AndroidUtilities.dp(68.0f) - f14;
            }
            m3Var.setTranslationY(f16);
        }
        this.M = z4;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        gv gvVar;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (i10 == NotificationCenter.stickersDidLoad) {
            int i12 = 0;
            while (true) {
                org.telegram.ui.m3 m3Var = this.h;
                if (i12 < m3Var.getChildCount()) {
                    View childAt = m3Var.getChildAt(i12);
                    if ((childAt instanceof gv) && (tL_messages_stickerSet = (gvVar = (gv) childAt).f25244r) != null && tL_messages_stickerSet.set != null) {
                        gvVar.a(MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(gvVar.f25244r.set.f19186id), true);
                    }
                    i12++;
                } else {
                    a0();
                    return;
                }
            }
        }
    }

    @Override
    public void dismiss() {
        bv bvVar = this.f26880f;
        if (bvVar != null && bvVar.f23755w) {
            bvVar.f23755w = false;
            bvVar.invalidate();
        }
        super.dismiss();
        vu vuVar = this.e;
        if (vuVar != null) {
            NotificationCenter.getInstance(vuVar.d).removeObserver(vuVar, NotificationCenter.groupStickersDidLoad);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
    }

    @Override
    public final int getContainerViewHeight() {
        int measuredHeight;
        int i10 = 0;
        org.telegram.ui.m3 m3Var = this.h;
        if (m3Var == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = m3Var.getMeasuredHeight();
        }
        int V = measuredHeight - V();
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            i10 = viewGroup.getPaddingTop();
        }
        return AndroidUtilities.dp(8.0f) + V + i10 + AndroidUtilities.navigationBarHeight;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
    }

    @Override
    public final void onBackPressed() {
        if (org.telegram.ui.rt.q().E) {
            org.telegram.ui.rt.q().o();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
    }

    @Override
    public final void show() {
        int currentAccount;
        TLRPC.StickerSet stickerSet;
        super.show();
        zu zuVar = new zu(this);
        this.f26881n = zuVar;
        this.h.setAdapter(zuVar);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
        vu vuVar = this.e;
        if (!vuVar.e) {
            vuVar.e = true;
            lv lvVar = vuVar.f25777f;
            int i10 = vuVar.d;
            vuVar.f25775b = new ArrayList(vuVar.f25774a.size());
            vuVar.f25776c = new ArrayList[vuVar.f25774a.size()];
            NotificationCenter.getInstance(i10).addObserver(vuVar, NotificationCenter.groupStickersDidLoad);
            boolean[] zArr = new boolean[1];
            int i11 = 0;
            while (true) {
                if (i11 < vuVar.f25776c.length) {
                    org.telegram.ui.lk lkVar = null;
                    TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(i10).getStickerSet((TLRPC.InputStickerSet) vuVar.f25774a.get(i11), null, false, new vk(1, vuVar, zArr));
                    if (vuVar.f25776c.length == 1 && stickerSet2 != null && (stickerSet = stickerSet2.set) != null && !stickerSet.emojis) {
                        AndroidUtilities.runOnUIThread(new hv(vuVar, 0));
                        Context context = lvVar.getContext();
                        org.telegram.ui.ActionBar.p2 p2Var = lvVar.f26879c;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) vuVar.f25774a.get(i11);
                        org.telegram.ui.ActionBar.p2 p2Var2 = lvVar.f26879c;
                        if (p2Var2 instanceof org.telegram.ui.zn) {
                            lkVar = ((org.telegram.ui.zn) p2Var2).V;
                        }
                        new xx0(context, p2Var, inputStickerSet, null, lkVar, lvVar.resourcesProvider).show();
                    } else {
                        vuVar.f25775b.add(stickerSet2);
                        vuVar.a(i11, stickerSet2);
                        i11++;
                    }
                } else {
                    lv lvVar2 = vuVar.h;
                    lvVar2.a0();
                    org.telegram.ui.m3 m3Var = lvVar2.h;
                    if (m3Var != null && m3Var.getAdapter() != null) {
                        m3Var.getAdapter().l();
                    }
                }
            }
        }
        a0();
        org.telegram.ui.ActionBar.p2 p2Var3 = this.f26879c;
        if (p2Var3 == null) {
            currentAccount = UserConfig.selectedAccount;
        } else {
            currentAccount = p2Var3.getCurrentAccount();
        }
        MediaDataController.getInstance(currentAccount).checkStickers(5);
    }

    public void X(boolean z4) {
    }

    public void Y() {
    }
}
