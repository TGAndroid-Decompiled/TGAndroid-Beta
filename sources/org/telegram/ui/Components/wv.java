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
public class wv extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate {
    public static Pattern V;
    public final yk0 E;
    public final zp F;
    public org.telegram.ui.ActionBar.p1 G;
    public final boolean H;
    public boolean I;
    public float J;
    public int K;
    public int L;
    public final d6 M;
    public final fv N;
    public int O;
    public boolean P;
    public long Q;
    public ValueAnimator R;
    public boolean S;
    public PorterDuffColorFilter T;
    public int U;
    public LongSparseArray f28841b;
    public final org.telegram.ui.ActionBar.p2 f28842c;
    public final qn d;
    public final gv e;
    public final mv f28843f;
    public final bi.z h;
    public kv f28844n;
    public final View f28845r;
    public final FrameLayout f28846s;
    public final TextView v;
    public final TextView f28847w;
    public final qg.s0 f28848x;
    public final s4.s f28849y;

    public wv(org.telegram.ui.ActionBar.p2 r21, android.content.Context r22, org.telegram.ui.ActionBar.f6 r23, java.util.ArrayList r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wv.<init>(org.telegram.ui.ActionBar.p2, android.content.Context, org.telegram.ui.ActionBar.f6, java.util.ArrayList):void");
    }

    public static void P(wv wvVar, int i10) {
        ArrayList arrayList;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        String str;
        Context context;
        org.telegram.ui.ActionBar.p2 p2Var = wvVar.f28842c;
        gv gvVar = wvVar.e;
        if (gvVar != null && (arrayList = gvVar.f27496b) != null && !arrayList.isEmpty()) {
            TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) gvVar.f27496b.get(0)).set;
            if (stickerSet != null && stickerSet.emojis) {
                str = "https://" + MessagesController.getInstance(wvVar.currentAccount).linkPrefix + "/addemoji/" + tL_messages_stickerSet.set.short_name;
            } else {
                str = "https://" + MessagesController.getInstance(wvVar.currentAccount).linkPrefix + "/addstickers/" + tL_messages_stickerSet.set.short_name;
            }
            String str2 = str;
            if (i10 == 1) {
                if (p2Var != null) {
                    context = p2Var.getParentActivity();
                } else {
                    context = null;
                }
                if (context == null) {
                    context = wvVar.getContext();
                }
                jv jvVar = new jv(wvVar, context, str2, str2, wvVar.resourcesProvider);
                if (p2Var != null) {
                    p2Var.showDialog(jvVar);
                } else {
                    jvVar.show();
                }
            } else if (i10 == 2) {
                try {
                    AndroidUtilities.addToClipboard(str2);
                    new wc((FrameLayout) wvVar.containerView, wvVar.resourcesProvider).k(false).j();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
    }

    public static int U(wv wvVar) {
        return wvVar.currentAccount;
    }

    public static void W(final org.telegram.ui.ActionBar.p2 p2Var, TLObject tLObject, final boolean z10, final ei.m0 m0Var, final dq dqVar) {
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
                if (MediaDataController.getInstance(i10).cancelRemovingStickerSet(stickerSet2.f17222id)) {
                    if (m0Var != null) {
                        m0Var.run(Boolean.TRUE);
                        return;
                    }
                    return;
                }
                TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                tL_messages_installStickerSet.stickerset = tL_inputStickerSetID;
                tL_inputStickerSetID.f17215id = stickerSet2.f17222id;
                tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_installStickerSet, new RequestDelegate() {
                    @Override
                    public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                        final TLRPC.StickerSet stickerSet3 = TLRPC.StickerSet.this;
                        final boolean z11 = z10;
                        final View view = fragmentView;
                        final org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        final TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                        final int i11 = i10;
                        final Utilities.Callback callback = m0Var;
                        final Runnable runnable = dqVar;
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
                                        if (z11 && view2 != null) {
                                            Context context = p2Var3.getFragmentView().getContext();
                                            TLObject tLObject5 = tL_messages_stickerSet2;
                                            if (tLObject5 == null) {
                                                tLObject3 = stickerSet4;
                                            } else {
                                                tLObject3 = tLObject5;
                                            }
                                            pc.g(p2Var3, new lx0(context, tLObject3, 1, 2, null, p2Var3.getResourceProvider()), 1500).j();
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
                                MediaDataController.getInstance(i13).loadStickers(i12, false, true, false, new y2(runnable, 5));
                            }
                        });
                    }
                });
            }
        }
    }

    public static boolean m(wv wvVar, cn cnVar, MotionEvent motionEvent) {
        return org.telegram.ui.tt.q().s(motionEvent, wvVar.h, cnVar, wvVar.N, wvVar.resourcesProvider);
    }

    public static void n(wv wvVar, ArrayList arrayList, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var, View view, int i10) {
        gv gvVar = wvVar.e;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        int i11 = 0;
        if (arrayList != null && arrayList.size() > 1) {
            if (SystemClock.elapsedRealtime() - wvVar.Q >= 250) {
                int i12 = 0;
                while (true) {
                    ArrayList[] arrayListArr = gvVar.f27497c;
                    if (i11 >= arrayListArr.length) {
                        break;
                    }
                    int size = arrayListArr[i11].size();
                    if (gvVar.f27497c.length > 1) {
                        size = Math.min(wvVar.f28849y.J * 2, size);
                    }
                    i12 += size + 2;
                    if (i10 < i12) {
                        break;
                    }
                    i11++;
                }
                ArrayList arrayList2 = gvVar.f27496b;
                if (arrayList2 != null && i11 < arrayList2.size()) {
                    tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) gvVar.f27496b.get(i11);
                }
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    ArrayList arrayList3 = new ArrayList();
                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    tL_inputStickerSetID.f17215id = stickerSet.f17222id;
                    tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                    arrayList3.add(tL_inputStickerSetID);
                    new hv(wvVar, p2Var, wvVar.getContext(), f6Var, arrayList3).show();
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.p1 p1Var = wvVar.G;
        if (p1Var != null) {
            p1Var.d(true);
            wvVar.G = null;
        } else if ((p2Var instanceof org.telegram.ui.eo) && ((org.telegram.ui.eo) p2Var).Y.getVisibility() == 0 && (view instanceof nv)) {
            y5 y5Var = ((nv) view).f25607c;
            try {
                TLRPC.Document document = y5Var.document;
                if (document == null) {
                    document = p5.f(wvVar.currentAccount, y5Var.getDocumentId());
                }
                SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(document));
                spannableString.setSpan(y5Var, 0, spannableString.length(), 33);
                ((org.telegram.ui.eo) p2Var).Y.E0.getText().append((CharSequence) spannableString);
                wvVar.Y();
                wvVar.dismiss();
            } catch (Exception unused) {
            }
            try {
                view.performHapticFeedback(3, 1);
            } catch (Exception unused2) {
            }
        }
    }

    public static void o(wv wvVar, y5 y5Var) {
        org.telegram.ui.ActionBar.p1 p1Var = wvVar.G;
        if (p1Var != null) {
            p1Var.d(true);
            wvVar.G = null;
            SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(p5.f(wvVar.currentAccount, y5Var.getDocumentId())));
            spannableString.setSpan(y5Var, 0, spannableString.length(), 33);
            if (AndroidUtilities.addToClipboard(spannableString)) {
                org.telegram.messenger.em.o(R.string.EmojiCopied, new wc((FrameLayout) wvVar.containerView, wvVar.resourcesProvider));
            }
        }
    }

    public static void p(wv wvVar, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        wvVar.J = floatValue;
        wvVar.h.setAlpha(floatValue);
        wvVar.v.setAlpha(wvVar.J);
        wvVar.f28847w.setAlpha(wvVar.J);
        wvVar.containerView.invalidate();
    }

    public static ViewGroup r(wv wvVar) {
        return wvVar.containerView;
    }

    public static ViewGroup s(wv wvVar) {
        return wvVar.containerView;
    }

    public final int V() {
        if (this.containerView == null) {
            return 0;
        }
        bi.z zVar = this.h;
        if (zVar != null && zVar.getChildCount() >= 1) {
            View childAt = zVar.getChildAt(0);
            qn qnVar = this.d;
            if (childAt != qnVar) {
                return this.containerView.getPaddingTop();
            }
            return qnVar.getBottom() + ((int) zVar.getY());
        }
        return this.containerView.getPaddingTop();
    }

    public final void Z() {
        org.telegram.ui.ActionBar.p2 p2Var = this.f28842c;
        if (p2Var != null) {
            new qg.a1(p2Var, 11, false).show();
        } else if (getContext() instanceof LaunchActivity) {
            ((LaunchActivity) getContext()).p0(new PremiumPreviewFragment(0, null));
        }
    }

    public final void a0() {
        ArrayList arrayList;
        boolean z10;
        int i10;
        int i11;
        TLRPC.StickerSet stickerSet;
        if (this.f28846s == null) {
            return;
        }
        gv gvVar = this.e;
        if (gvVar.f27496b == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(gvVar.f27496b);
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
                if (!mediaDataController.isStickerPackInstalled(stickerSet.f17222id)) {
                    arrayList3.add(tL_messages_stickerSet);
                } else {
                    arrayList2.add(tL_messages_stickerSet);
                }
            }
        }
        final ArrayList arrayList4 = new ArrayList(arrayList3);
        if (gvVar.f27495a != null && arrayList.size() == gvVar.f27495a.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.S && z10 && this.R == null) {
            this.R = ValueAnimator.ofFloat(this.J, 1.0f);
            this.containerView.getY();
            this.R.addUpdateListener(new j6(this, 16));
            this.R.setDuration(250L);
            this.R.setInterpolator(wr.h);
            this.R.start();
        }
        this.S = z10;
        bi.z zVar = this.h;
        if (!z10) {
            zVar.setAlpha(0.0f);
        } else if (this.O >= 0) {
            int L0 = this.f28849y.L0();
            int E = this.f28844n.E(this.O);
            if (Math.abs(L0 - E) > 54) {
                if (L0 < E) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                yk0 yk0Var = this.E;
                yk0Var.f29444b = i11;
                yk0Var.c(E, (AndroidUtilities.displaySize.y / 2) - AndroidUtilities.dp(170.0f), false, false);
            } else {
                zVar.x0(E);
            }
            this.K = this.f28844n.E(this.O);
            kv kvVar = this.f28844n;
            int i14 = this.O;
            wv wvVar = kvVar.f24813c;
            boolean z11 = wvVar.I;
            gv gvVar2 = wvVar.e;
            if (z11) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            int i15 = 0;
            while (true) {
                ArrayList[] arrayListArr = gvVar2.f27497c;
                if (i15 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i15].size();
                if (gvVar2.f27497c.length > 1) {
                    size = Math.min(wvVar.f28849y.J * 2, size);
                }
                if (i15 == i14) {
                    i10 = i10 + size + 1;
                    break;
                } else {
                    i10 += size + 2;
                    i15++;
                }
            }
            this.L = i10;
            this.M.d(1.0f, true);
            zVar.invalidate();
            this.O = -1;
        }
        boolean z12 = this.S;
        qg.s0 s0Var = this.f28848x;
        TextView textView = this.f28847w;
        TextView textView2 = this.v;
        if (z12 && !this.H) {
            s0Var.setVisibility(4);
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
                        boolean z13;
                        ei.m0 m0Var;
                        boolean z14;
                        switch (r1) {
                            case 0:
                                ArrayList arrayList5 = arrayList4;
                                int size2 = arrayList5.size();
                                int[] iArr = new int[2];
                                int i16 = 0;
                                while (true) {
                                    int size3 = arrayList5.size();
                                    wv wvVar2 = this;
                                    if (i16 < size3) {
                                        org.telegram.ui.ActionBar.p2 p2Var = wvVar2.f28842c;
                                        TLObject tLObject = (TLObject) arrayList5.get(i16);
                                        if (size2 == 1) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        if (size2 > 1) {
                                            m0Var = new ei.m0(wvVar2, iArr, size2, arrayList5);
                                        } else {
                                            m0Var = null;
                                        }
                                        wv.W(p2Var, tLObject, z13, m0Var, null);
                                        i16++;
                                    } else {
                                        wvVar2.X(true);
                                        if (size2 <= 1) {
                                            wvVar2.dismiss();
                                            return;
                                        }
                                        return;
                                    }
                                }
                            default:
                                wv wvVar3 = this;
                                wvVar3.dismiss();
                                org.telegram.ui.ActionBar.p2 p2Var2 = wvVar3.f28842c;
                                ArrayList<TLRPC.TL_messages_stickerSet> arrayList6 = arrayList4;
                                if (p2Var2 != null) {
                                    MediaDataController.getInstance(p2Var2.getCurrentAccount()).removeMultipleStickerSets(p2Var2.getContext(), p2Var2, arrayList6);
                                } else {
                                    for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList6.get(i17);
                                        Context context = wvVar3.getContext();
                                        if (i17 == 0) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        if (tL_messages_stickerSet2 != null) {
                                            MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(context, tL_messages_stickerSet2, 0, null, true, z14, null, true);
                                        }
                                    }
                                }
                                wvVar3.X(false);
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
                        boolean z13;
                        ei.m0 m0Var;
                        boolean z14;
                        switch (r1) {
                            case 0:
                                ArrayList arrayList5 = arrayList2;
                                int size2 = arrayList5.size();
                                int[] iArr = new int[2];
                                int i16 = 0;
                                while (true) {
                                    int size3 = arrayList5.size();
                                    wv wvVar2 = this;
                                    if (i16 < size3) {
                                        org.telegram.ui.ActionBar.p2 p2Var = wvVar2.f28842c;
                                        TLObject tLObject = (TLObject) arrayList5.get(i16);
                                        if (size2 == 1) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        if (size2 > 1) {
                                            m0Var = new ei.m0(wvVar2, iArr, size2, arrayList5);
                                        } else {
                                            m0Var = null;
                                        }
                                        wv.W(p2Var, tLObject, z13, m0Var, null);
                                        i16++;
                                    } else {
                                        wvVar2.X(true);
                                        if (size2 <= 1) {
                                            wvVar2.dismiss();
                                            return;
                                        }
                                        return;
                                    }
                                }
                            default:
                                wv wvVar3 = this;
                                wvVar3.dismiss();
                                org.telegram.ui.ActionBar.p2 p2Var2 = wvVar3.f28842c;
                                ArrayList<TLRPC.TL_messages_stickerSet> arrayList6 = arrayList2;
                                if (p2Var2 != null) {
                                    MediaDataController.getInstance(p2Var2.getCurrentAccount()).removeMultipleStickerSets(p2Var2.getContext(), p2Var2, arrayList6);
                                } else {
                                    for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList6.get(i17);
                                        Context context = wvVar3.getContext();
                                        if (i17 == 0) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        if (tL_messages_stickerSet2 != null) {
                                            MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(context, tL_messages_stickerSet2, 0, null, true, z14, null, true);
                                        }
                                    }
                                }
                                wvVar3.X(false);
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
        s0Var.setVisibility(8);
        textView2.setVisibility(8);
        textView.setVisibility(8);
        b0(false);
    }

    public final void b0(boolean z10) {
        boolean z11;
        float f7;
        float dp;
        float f10;
        float dp2;
        float f11;
        float f12;
        int i10 = 0;
        if (!this.P && z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f28847w.getVisibility() == 0) {
            i10 = AndroidUtilities.dp(19.0f);
        }
        float f13 = i10;
        boolean z12 = this.H;
        bi.z zVar = this.h;
        View view = this.f28845r;
        FrameLayout frameLayout = this.f28846s;
        float f14 = 1.0f;
        float f15 = 0.0f;
        if (z11) {
            ViewPropertyAnimator animate = frameLayout.animate();
            if (z10) {
                dp2 = f13;
            } else {
                dp2 = AndroidUtilities.dp(16.0f);
            }
            ViewPropertyAnimator translationY = animate.translationY(dp2);
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator duration = translationY.alpha(f11).setDuration(250L);
            wr wrVar = wr.h;
            duration.setInterpolator(wrVar).start();
            ViewPropertyAnimator animate2 = view.animate();
            if (z10) {
                f12 = -(AndroidUtilities.dp(68.0f) - f13);
            } else {
                f12 = 0.0f;
            }
            ViewPropertyAnimator translationY2 = animate2.translationY(f12);
            if (!z10) {
                f14 = 0.0f;
            }
            translationY2.alpha(f14).setDuration(250L).setInterpolator(wrVar).start();
            ViewPropertyAnimator animate3 = zVar.animate();
            if (!z12 && !z10) {
                f15 = AndroidUtilities.dp(68.0f) - f13;
            }
            animate3.translationY(f15).setDuration(250L).setInterpolator(wrVar).start();
        } else {
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            frameLayout.setAlpha(f7);
            if (z10) {
                dp = f13;
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            frameLayout.setTranslationY(dp);
            if (!z10) {
                f14 = 0.0f;
            }
            view.setAlpha(f14);
            if (z10) {
                f10 = -(AndroidUtilities.dp(68.0f) - f13);
            } else {
                f10 = 0.0f;
            }
            view.setTranslationY(f10);
            if (!z12 && !z10) {
                f15 = AndroidUtilities.dp(68.0f) - f13;
            }
            zVar.setTranslationY(f15);
        }
        this.P = z10;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        rv rvVar;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (i10 == NotificationCenter.stickersDidLoad) {
            int i12 = 0;
            while (true) {
                bi.z zVar = this.h;
                if (i12 < zVar.getChildCount()) {
                    View childAt = zVar.getChildAt(i12);
                    if ((childAt instanceof rv) && (tL_messages_stickerSet = (rvVar = (rv) childAt).f26767r) != null && tL_messages_stickerSet.set != null) {
                        rvVar.a(MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(rvVar.f26767r.set.f17222id), true);
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
        mv mvVar = this.f28843f;
        if (mvVar != null && mvVar.f25296w) {
            mvVar.f25296w = false;
            mvVar.invalidate();
        }
        super.dismiss();
        gv gvVar = this.e;
        if (gvVar != null) {
            NotificationCenter.getInstance(gvVar.d).removeObserver(gvVar, NotificationCenter.groupStickersDidLoad);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
    }

    @Override
    public final int getContainerViewHeight() {
        int measuredHeight;
        int i10 = 0;
        bi.z zVar = this.h;
        if (zVar == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = zVar.getMeasuredHeight();
        }
        int V2 = measuredHeight - V();
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            i10 = viewGroup.getPaddingTop();
        }
        return AndroidUtilities.dp(8.0f) + V2 + i10 + AndroidUtilities.navigationBarHeight;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
    }

    @Override
    public final void onBackPressed() {
        if (org.telegram.ui.tt.q().E) {
            org.telegram.ui.tt.q().o();
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
        kv kvVar = new kv(this);
        this.f28844n = kvVar;
        this.h.setAdapter(kvVar);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
        gv gvVar = this.e;
        if (!gvVar.e) {
            gvVar.e = true;
            wv wvVar = gvVar.f27498f;
            int i10 = gvVar.d;
            gvVar.f27496b = new ArrayList(gvVar.f27495a.size());
            gvVar.f27497c = new ArrayList[gvVar.f27495a.size()];
            NotificationCenter.getInstance(i10).addObserver(gvVar, NotificationCenter.groupStickersDidLoad);
            boolean[] zArr = new boolean[1];
            int i11 = 0;
            while (true) {
                if (i11 < gvVar.f27497c.length) {
                    org.telegram.ui.ok okVar = null;
                    TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(i10).getStickerSet((TLRPC.InputStickerSet) gvVar.f27495a.get(i11), null, false, new org.telegram.ui.pf(14, gvVar, zArr));
                    if (gvVar.f27497c.length == 1 && stickerSet2 != null && (stickerSet = stickerSet2.set) != null && !stickerSet.emojis) {
                        AndroidUtilities.runOnUIThread(new sv(gvVar, 0));
                        Context context = wvVar.getContext();
                        org.telegram.ui.ActionBar.p2 p2Var = wvVar.f28842c;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) gvVar.f27495a.get(i11);
                        org.telegram.ui.ActionBar.p2 p2Var2 = wvVar.f28842c;
                        if (p2Var2 instanceof org.telegram.ui.eo) {
                            okVar = ((org.telegram.ui.eo) p2Var2).Y;
                        }
                        new hy0(context, p2Var, inputStickerSet, null, okVar, wvVar.resourcesProvider).show();
                    } else {
                        gvVar.f27496b.add(stickerSet2);
                        gvVar.a(i11, stickerSet2);
                        i11++;
                    }
                } else {
                    wv wvVar2 = gvVar.h;
                    wvVar2.a0();
                    bi.z zVar = wvVar2.h;
                    if (zVar != null && zVar.getAdapter() != null) {
                        zVar.getAdapter().l();
                    }
                }
            }
        }
        a0();
        org.telegram.ui.ActionBar.p2 p2Var3 = this.f28842c;
        if (p2Var3 == null) {
            currentAccount = UserConfig.selectedAccount;
        } else {
            currentAccount = p2Var3.getCurrentAccount();
        }
        MediaDataController.getInstance(currentAccount).checkStickers(5);
    }

    public void X(boolean z10) {
    }

    public void Y() {
    }
}
