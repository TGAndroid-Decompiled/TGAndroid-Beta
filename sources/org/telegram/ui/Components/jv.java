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
public class jv extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static Pattern R;
    public final c2.z A;
    public final np B;
    public org.telegram.ui.ActionBar.o1 C;
    public final boolean D;
    public boolean E;
    public float F;
    public int G;
    public int H;
    public final d6 I;
    public final su J;
    public int K;
    public boolean L;
    public long M;
    public ValueAnimator N;
    public boolean O;
    public PorterDuffColorFilter P;
    public int Q;
    public LongSparseArray f29823b;
    public final org.telegram.ui.ActionBar.o2 f29824c;
    public final fn d;
    public final tu f29825e;
    public final zu f29826f;
    public final nh.v h;
    public xu f29827n;
    public final View f29828r;
    public final FrameLayout f29829s;
    public final TextView v;
    public final TextView f29830w;
    public final cg.d1 f29831x;
    public final f2.w f29832y;

    public jv(org.telegram.ui.ActionBar.o2 r21, android.content.Context r22, org.telegram.ui.ActionBar.c6 r23, java.util.ArrayList r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jv.<init>(org.telegram.ui.ActionBar.o2, android.content.Context, org.telegram.ui.ActionBar.c6, java.util.ArrayList):void");
    }

    public static void P(jv jvVar, int i10) {
        ArrayList arrayList;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        String str;
        Context context;
        org.telegram.ui.ActionBar.o2 o2Var = jvVar.f29824c;
        tu tuVar = jvVar.f29825e;
        if (tuVar != null && (arrayList = tuVar.f29000b) != null && !arrayList.isEmpty()) {
            TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) tuVar.f29000b.get(0)).set;
            if (stickerSet != null && stickerSet.emojis) {
                str = "https://" + MessagesController.getInstance(jvVar.currentAccount).linkPrefix + "/addemoji/" + tL_messages_stickerSet.set.short_name;
            } else {
                str = "https://" + MessagesController.getInstance(jvVar.currentAccount).linkPrefix + "/addstickers/" + tL_messages_stickerSet.set.short_name;
            }
            String str2 = str;
            if (i10 == 1) {
                if (o2Var != null) {
                    context = o2Var.getParentActivity();
                } else {
                    context = null;
                }
                if (context == null) {
                    context = jvVar.getContext();
                }
                wu wuVar = new wu(jvVar, context, str2, str2, jvVar.resourcesProvider);
                if (o2Var != null) {
                    o2Var.showDialog(wuVar);
                } else {
                    wuVar.show();
                }
            } else if (i10 == 2) {
                try {
                    AndroidUtilities.addToClipboard(str2);
                    new tc((FrameLayout) jvVar.containerView, jvVar.resourcesProvider).k(false).j();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
    }

    public static int U(jv jvVar) {
        return jvVar.currentAccount;
    }

    public static void W(final org.telegram.ui.ActionBar.o2 o2Var, TLObject tLObject, final boolean z10, final jh.d8 d8Var, final rp rpVar) {
        int currentAccount;
        final View fragmentView;
        final TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (o2Var == null) {
            currentAccount = UserConfig.selectedAccount;
        } else {
            currentAccount = o2Var.getCurrentAccount();
        }
        final int i10 = currentAccount;
        TLRPC.StickerSet stickerSet = null;
        if (o2Var == null) {
            fragmentView = null;
        } else {
            fragmentView = o2Var.getFragmentView();
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
                if (MediaDataController.getInstance(i10).cancelRemovingStickerSet(stickerSet2.f22419id)) {
                    if (d8Var != null) {
                        d8Var.run(Boolean.TRUE);
                        return;
                    }
                    return;
                }
                TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                tL_messages_installStickerSet.stickerset = tL_inputStickerSetID;
                tL_inputStickerSetID.f22412id = stickerSet2.f22419id;
                tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_installStickerSet, new RequestDelegate() {
                    @Override
                    public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                        final TLRPC.StickerSet stickerSet3 = TLRPC.StickerSet.this;
                        final boolean z11 = z10;
                        final View view = fragmentView;
                        final org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        final TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                        final int i11 = i10;
                        final Utilities.Callback callback = d8Var;
                        final Runnable runnable = rpVar;
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
                                org.telegram.ui.ActionBar.o2 o2Var3 = o2Var2;
                                int i13 = i11;
                                Utilities.Callback callback2 = callback;
                                try {
                                    if (tL_error2 == null) {
                                        if (z11 && view2 != null) {
                                            Context context = o2Var3.getFragmentView().getContext();
                                            TLObject tLObject5 = tL_messages_stickerSet2;
                                            if (tLObject5 == null) {
                                                tLObject3 = stickerSet4;
                                            } else {
                                                tLObject3 = tLObject5;
                                            }
                                            mc.g(o2Var3, new sw0(context, tLObject3, 1, 2, null, o2Var3.getResourceProvider()), 1500).j();
                                        }
                                        if (tLObject4 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                                            MediaDataController.getInstance(i13).processStickerSetInstallResultArchive(o2Var3, true, i12, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject4);
                                        }
                                        if (callback2 != null) {
                                            callback2.run(Boolean.TRUE);
                                        }
                                    } else if (view2 != null) {
                                        Toast.makeText(o2Var3.getFragmentView().getContext(), LocaleController.getString(R.string.ErrorOccurred), 0).show();
                                        if (callback2 != null) {
                                            callback2.run(Boolean.FALSE);
                                        }
                                    } else if (callback2 != null) {
                                        callback2.run(Boolean.FALSE);
                                    }
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                }
                                MediaDataController.getInstance(i13).loadStickers(i12, false, true, false, new y2(runnable, 5));
                            }
                        });
                    }
                });
            }
        }
    }

    public static boolean m(jv jvVar, qm qmVar, MotionEvent motionEvent) {
        return org.telegram.ui.ht.q().s(motionEvent, jvVar.h, qmVar, jvVar.J, jvVar.resourcesProvider);
    }

    public static void n(jv jvVar, ArrayList arrayList, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.c6 c6Var, View view, int i10) {
        tu tuVar = jvVar.f29825e;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        int i11 = 0;
        if (arrayList != null && arrayList.size() > 1) {
            if (SystemClock.elapsedRealtime() - jvVar.M >= 250) {
                int i12 = 0;
                while (true) {
                    ArrayList[] arrayListArr = tuVar.f29001c;
                    if (i11 >= arrayListArr.length) {
                        break;
                    }
                    int size = arrayListArr[i11].size();
                    if (tuVar.f29001c.length > 1) {
                        size = Math.min(jvVar.f29832y.J * 2, size);
                    }
                    i12 += size + 2;
                    if (i10 < i12) {
                        break;
                    }
                    i11++;
                }
                ArrayList arrayList2 = tuVar.f29000b;
                if (arrayList2 != null && i11 < arrayList2.size()) {
                    tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tuVar.f29000b.get(i11);
                }
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    ArrayList arrayList3 = new ArrayList();
                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    tL_inputStickerSetID.f22412id = stickerSet.f22419id;
                    tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                    arrayList3.add(tL_inputStickerSetID);
                    new uu(jvVar, o2Var, jvVar.getContext(), c6Var, arrayList3).show();
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.o1 o1Var = jvVar.C;
        if (o1Var != null) {
            o1Var.d(true);
            jvVar.C = null;
        } else if ((o2Var instanceof org.telegram.ui.tn) && ((org.telegram.ui.tn) o2Var).U.getVisibility() == 0 && (view instanceof av)) {
            y5 y5Var = ((av) view).f26895c;
            try {
                TLRPC.Document document = y5Var.document;
                if (document == null) {
                    document = p5.f(jvVar.currentAccount, y5Var.getDocumentId());
                }
                SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(document));
                spannableString.setSpan(y5Var, 0, spannableString.length(), 33);
                ((org.telegram.ui.tn) o2Var).U.A0.getText().append((CharSequence) spannableString);
                jvVar.Y();
                jvVar.dismiss();
            } catch (Exception unused) {
            }
            try {
                view.performHapticFeedback(3, 1);
            } catch (Exception unused2) {
            }
        }
    }

    public static void o(jv jvVar, y5 y5Var) {
        org.telegram.ui.ActionBar.o1 o1Var = jvVar.C;
        if (o1Var != null) {
            o1Var.d(true);
            jvVar.C = null;
            SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(p5.f(jvVar.currentAccount, y5Var.getDocumentId())));
            spannableString.setSpan(y5Var, 0, spannableString.length(), 33);
            if (AndroidUtilities.addToClipboard(spannableString)) {
                org.telegram.ui.b.n(R.string.EmojiCopied, new tc((FrameLayout) jvVar.containerView, jvVar.resourcesProvider));
            }
        }
    }

    public static void p(jv jvVar, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        jvVar.F = floatValue;
        jvVar.h.setAlpha(floatValue);
        jvVar.v.setAlpha(jvVar.F);
        jvVar.f29830w.setAlpha(jvVar.F);
        jvVar.containerView.invalidate();
    }

    public static ViewGroup r(jv jvVar) {
        return jvVar.containerView;
    }

    public static ViewGroup s(jv jvVar) {
        return jvVar.containerView;
    }

    public final int V() {
        if (this.containerView == null) {
            return 0;
        }
        nh.v vVar = this.h;
        if (vVar != null && vVar.getChildCount() >= 1) {
            View childAt = vVar.getChildAt(0);
            fn fnVar = this.d;
            if (childAt != fnVar) {
                return this.containerView.getPaddingTop();
            }
            return fnVar.getBottom() + ((int) vVar.getY());
        }
        return this.containerView.getPaddingTop();
    }

    public final void Z() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f29824c;
        if (o2Var != null) {
            new cg.p1(o2Var, 11, false).show();
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
        if (this.f29829s == null) {
            return;
        }
        tu tuVar = this.f29825e;
        if (tuVar.f29000b == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(tuVar.f29000b);
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
                if (!mediaDataController.isStickerPackInstalled(stickerSet.f22419id)) {
                    arrayList3.add(tL_messages_stickerSet);
                } else {
                    arrayList2.add(tL_messages_stickerSet);
                }
            }
        }
        final ArrayList arrayList4 = new ArrayList(arrayList3);
        if (tuVar.f28999a != null && arrayList.size() == tuVar.f28999a.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.O && z10 && this.N == null) {
            this.N = ValueAnimator.ofFloat(this.F, 1.0f);
            this.containerView.getY();
            this.N.addUpdateListener(new j6(this, 16));
            this.N.setDuration(250L);
            this.N.setInterpolator(jr.h);
            this.N.start();
        }
        this.O = z10;
        nh.v vVar = this.h;
        if (!z10) {
            vVar.setAlpha(0.0f);
        } else if (this.K >= 0) {
            int L0 = this.f29832y.L0();
            int E = this.f29827n.E(this.K);
            if (Math.abs(L0 - E) > 54) {
                if (L0 < E) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                c2.z zVar = this.A;
                zVar.f2933b = i11;
                zVar.c(E, (AndroidUtilities.displaySize.y / 2) - AndroidUtilities.dp(170.0f), false, false);
            } else {
                vVar.x0(E);
            }
            this.G = this.f29827n.E(this.K);
            xu xuVar = this.f29827n;
            int i14 = this.K;
            jv jvVar = xuVar.f34829c;
            boolean z11 = jvVar.E;
            tu tuVar2 = jvVar.f29825e;
            if (z11) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            int i15 = 0;
            while (true) {
                ArrayList[] arrayListArr = tuVar2.f29001c;
                if (i15 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i15].size();
                if (tuVar2.f29001c.length > 1) {
                    size = Math.min(jvVar.f29832y.J * 2, size);
                }
                if (i15 == i14) {
                    i10 = i10 + size + 1;
                    break;
                } else {
                    i10 += size + 2;
                    i15++;
                }
            }
            this.H = i10;
            this.I.d(1.0f, true);
            vVar.invalidate();
            this.K = -1;
        }
        boolean z12 = this.O;
        cg.d1 d1Var = this.f29831x;
        TextView textView = this.f29830w;
        TextView textView2 = this.v;
        if (z12 && !this.D) {
            d1Var.setVisibility(4);
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
                        jh.d8 d8Var;
                        boolean z14;
                        switch (r1) {
                            case 0:
                                ArrayList arrayList5 = arrayList4;
                                int size2 = arrayList5.size();
                                int[] iArr = new int[2];
                                int i16 = 0;
                                while (true) {
                                    int size3 = arrayList5.size();
                                    jv jvVar2 = this;
                                    if (i16 < size3) {
                                        org.telegram.ui.ActionBar.o2 o2Var = jvVar2.f29824c;
                                        TLObject tLObject = (TLObject) arrayList5.get(i16);
                                        if (size2 == 1) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        if (size2 > 1) {
                                            d8Var = new jh.d8(jvVar2, iArr, size2, arrayList5);
                                        } else {
                                            d8Var = null;
                                        }
                                        jv.W(o2Var, tLObject, z13, d8Var, null);
                                        i16++;
                                    } else {
                                        jvVar2.X(true);
                                        if (size2 <= 1) {
                                            jvVar2.dismiss();
                                            return;
                                        }
                                        return;
                                    }
                                }
                            default:
                                jv jvVar3 = this;
                                jvVar3.dismiss();
                                org.telegram.ui.ActionBar.o2 o2Var2 = jvVar3.f29824c;
                                ArrayList<TLRPC.TL_messages_stickerSet> arrayList6 = arrayList4;
                                if (o2Var2 != null) {
                                    MediaDataController.getInstance(o2Var2.getCurrentAccount()).removeMultipleStickerSets(o2Var2.getContext(), o2Var2, arrayList6);
                                } else {
                                    for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList6.get(i17);
                                        Context context = jvVar3.getContext();
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
                                jvVar3.X(false);
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
                        jh.d8 d8Var;
                        boolean z14;
                        switch (r1) {
                            case 0:
                                ArrayList arrayList5 = arrayList2;
                                int size2 = arrayList5.size();
                                int[] iArr = new int[2];
                                int i16 = 0;
                                while (true) {
                                    int size3 = arrayList5.size();
                                    jv jvVar2 = this;
                                    if (i16 < size3) {
                                        org.telegram.ui.ActionBar.o2 o2Var = jvVar2.f29824c;
                                        TLObject tLObject = (TLObject) arrayList5.get(i16);
                                        if (size2 == 1) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        if (size2 > 1) {
                                            d8Var = new jh.d8(jvVar2, iArr, size2, arrayList5);
                                        } else {
                                            d8Var = null;
                                        }
                                        jv.W(o2Var, tLObject, z13, d8Var, null);
                                        i16++;
                                    } else {
                                        jvVar2.X(true);
                                        if (size2 <= 1) {
                                            jvVar2.dismiss();
                                            return;
                                        }
                                        return;
                                    }
                                }
                            default:
                                jv jvVar3 = this;
                                jvVar3.dismiss();
                                org.telegram.ui.ActionBar.o2 o2Var2 = jvVar3.f29824c;
                                ArrayList<TLRPC.TL_messages_stickerSet> arrayList6 = arrayList2;
                                if (o2Var2 != null) {
                                    MediaDataController.getInstance(o2Var2.getCurrentAccount()).removeMultipleStickerSets(o2Var2.getContext(), o2Var2, arrayList6);
                                } else {
                                    for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList6.get(i17);
                                        Context context = jvVar3.getContext();
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
                                jvVar3.X(false);
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
        d1Var.setVisibility(8);
        textView2.setVisibility(8);
        textView.setVisibility(8);
        b0(false);
    }

    public final void b0(boolean z10) {
        boolean z11;
        float f9;
        float dp;
        float f10;
        float dp2;
        float f11;
        float f12;
        int i10 = 0;
        if (!this.L && z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f29830w.getVisibility() == 0) {
            i10 = AndroidUtilities.dp(19.0f);
        }
        float f13 = i10;
        boolean z12 = this.D;
        nh.v vVar = this.h;
        View view = this.f29828r;
        FrameLayout frameLayout = this.f29829s;
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
            jr jrVar = jr.h;
            duration.setInterpolator(jrVar).start();
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
            translationY2.alpha(f14).setDuration(250L).setInterpolator(jrVar).start();
            ViewPropertyAnimator animate3 = vVar.animate();
            if (!z12 && !z10) {
                f15 = AndroidUtilities.dp(68.0f) - f13;
            }
            animate3.translationY(f15).setDuration(250L).setInterpolator(jrVar).start();
        } else {
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            frameLayout.setAlpha(f9);
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
            vVar.setTranslationY(f15);
        }
        this.L = z10;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ev evVar;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (i10 == NotificationCenter.stickersDidLoad) {
            int i12 = 0;
            while (true) {
                nh.v vVar = this.h;
                if (i12 < vVar.getChildCount()) {
                    View childAt = vVar.getChildAt(i12);
                    if ((childAt instanceof ev) && (tL_messages_stickerSet = (evVar = (ev) childAt).f28189r) != null && tL_messages_stickerSet.set != null) {
                        evVar.a(MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(evVar.f28189r.set.f22419id), true);
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
        zu zuVar = this.f29826f;
        if (zuVar != null && zuVar.f35430w) {
            zuVar.f35430w = false;
            zuVar.invalidate();
        }
        super.dismiss();
        tu tuVar = this.f29825e;
        if (tuVar != null) {
            NotificationCenter.getInstance(tuVar.d).removeObserver(tuVar, NotificationCenter.groupStickersDidLoad);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
    }

    @Override
    public final int getContainerViewHeight() {
        int measuredHeight;
        int i10 = 0;
        nh.v vVar = this.h;
        if (vVar == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = vVar.getMeasuredHeight();
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
        if (org.telegram.ui.ht.q().E) {
            org.telegram.ui.ht.q().o();
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
        xu xuVar = new xu(this);
        this.f29827n = xuVar;
        this.h.setAdapter(xuVar);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
        tu tuVar = this.f29825e;
        if (!tuVar.f29002e) {
            tuVar.f29002e = true;
            jv jvVar = tuVar.f29003f;
            int i10 = tuVar.d;
            tuVar.f29000b = new ArrayList(tuVar.f28999a.size());
            tuVar.f29001c = new ArrayList[tuVar.f28999a.size()];
            NotificationCenter.getInstance(i10).addObserver(tuVar, NotificationCenter.groupStickersDidLoad);
            boolean[] zArr = new boolean[1];
            int i11 = 0;
            while (true) {
                if (i11 < tuVar.f29001c.length) {
                    org.telegram.ui.dk dkVar = null;
                    TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(i10).getStickerSet((TLRPC.InputStickerSet) tuVar.f28999a.get(i11), null, false, new org.telegram.ui.tm(9, tuVar, zArr));
                    if (tuVar.f29001c.length == 1 && stickerSet2 != null && (stickerSet = stickerSet2.set) != null && !stickerSet.emojis) {
                        AndroidUtilities.runOnUIThread(new fv(tuVar, 0));
                        Context context = jvVar.getContext();
                        org.telegram.ui.ActionBar.o2 o2Var = jvVar.f29824c;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) tuVar.f28999a.get(i11);
                        org.telegram.ui.ActionBar.o2 o2Var2 = jvVar.f29824c;
                        if (o2Var2 instanceof org.telegram.ui.tn) {
                            dkVar = ((org.telegram.ui.tn) o2Var2).U;
                        }
                        new nx0(context, o2Var, inputStickerSet, null, dkVar, jvVar.resourcesProvider).show();
                    } else {
                        tuVar.f29000b.add(stickerSet2);
                        tuVar.a(i11, stickerSet2);
                        i11++;
                    }
                } else {
                    jv jvVar2 = tuVar.h;
                    jvVar2.a0();
                    nh.v vVar = jvVar2.h;
                    if (vVar != null && vVar.getAdapter() != null) {
                        vVar.getAdapter().l();
                    }
                }
            }
        }
        a0();
        org.telegram.ui.ActionBar.o2 o2Var3 = this.f29824c;
        if (o2Var3 == null) {
            currentAccount = UserConfig.selectedAccount;
        } else {
            currentAccount = o2Var3.getCurrentAccount();
        }
        MediaDataController.getInstance(currentAccount).checkStickers(5);
    }

    public void X(boolean z10) {
    }

    public void Y() {
    }
}
