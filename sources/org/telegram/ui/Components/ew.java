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
public class ew extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate {
    public static Pattern V;
    public final pl0 E;
    public final gq F;
    public org.telegram.ui.ActionBar.m1 G;
    public final boolean H;
    public boolean I;
    public float J;
    public int K;
    public int L;
    public final g6 M;
    public final nv N;
    public int O;
    public boolean P;
    public long Q;
    public ValueAnimator R;
    public boolean S;
    public PorterDuffColorFilter T;
    public int U;
    public LongSparseArray f24802b;
    public final org.telegram.ui.ActionBar.m2 f24803c;
    public final xn d;
    public final ov e;
    public final uv f24804f;
    public final di.v h;
    public sv f24805n;
    public final View f24806r;
    public final FrameLayout f24807s;
    public final TextView v;
    public final TextView f24808w;
    public final sg.q0 f24809x;
    public final s4.s f24810y;

    public ew(org.telegram.ui.ActionBar.m2 r21, android.content.Context r22, org.telegram.ui.ActionBar.c6 r23, java.util.ArrayList r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ew.<init>(org.telegram.ui.ActionBar.m2, android.content.Context, org.telegram.ui.ActionBar.c6, java.util.ArrayList):void");
    }

    public static void Q(ew ewVar, int i10) {
        ArrayList arrayList;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        String str;
        Context context;
        org.telegram.ui.ActionBar.m2 m2Var = ewVar.f24803c;
        ov ovVar = ewVar.e;
        if (ovVar != null && (arrayList = ovVar.f23863b) != null && !arrayList.isEmpty()) {
            TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) ovVar.f23863b.get(0)).set;
            if (stickerSet != null && stickerSet.emojis) {
                str = "https://" + MessagesController.getInstance(ewVar.currentAccount).linkPrefix + "/addemoji/" + tL_messages_stickerSet.set.short_name;
            } else {
                str = "https://" + MessagesController.getInstance(ewVar.currentAccount).linkPrefix + "/addstickers/" + tL_messages_stickerSet.set.short_name;
            }
            String str2 = str;
            if (i10 == 1) {
                if (m2Var != null) {
                    context = m2Var.getParentActivity();
                } else {
                    context = null;
                }
                if (context == null) {
                    context = ewVar.getContext();
                }
                rv rvVar = new rv(ewVar, context, str2, str2, ewVar.resourcesProvider);
                if (m2Var != null) {
                    m2Var.showDialog(rvVar);
                } else {
                    rvVar.show();
                }
            } else if (i10 == 2) {
                try {
                    AndroidUtilities.addToClipboard(str2);
                    new zc((FrameLayout) ewVar.containerView, ewVar.resourcesProvider).k(false).j();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
    }

    public static void X(final org.telegram.ui.ActionBar.m2 m2Var, TLObject tLObject, final boolean z10, final gi.m0 m0Var, final kq kqVar) {
        int currentAccount;
        final View fragmentView;
        final TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (m2Var == null) {
            currentAccount = UserConfig.selectedAccount;
        } else {
            currentAccount = m2Var.getCurrentAccount();
        }
        final int i10 = currentAccount;
        TLRPC.StickerSet stickerSet = null;
        if (m2Var == null) {
            fragmentView = null;
        } else {
            fragmentView = m2Var.getFragmentView();
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
                if (MediaDataController.getInstance(i10).cancelRemovingStickerSet(stickerSet2.f19243id)) {
                    if (m0Var != null) {
                        m0Var.run(Boolean.TRUE);
                        return;
                    }
                    return;
                }
                TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                tL_messages_installStickerSet.stickerset = tL_inputStickerSetID;
                tL_inputStickerSetID.f19236id = stickerSet2.f19243id;
                tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_installStickerSet, new RequestDelegate() {
                    @Override
                    public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                        final TLRPC.StickerSet stickerSet3 = TLRPC.StickerSet.this;
                        final boolean z11 = z10;
                        final View view = fragmentView;
                        final org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        final TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                        final int i11 = i10;
                        final Utilities.Callback callback = m0Var;
                        final Runnable runnable = kqVar;
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
                                org.telegram.ui.ActionBar.m2 m2Var3 = m2Var2;
                                int i13 = i11;
                                Utilities.Callback callback2 = callback;
                                try {
                                    if (tL_error2 == null) {
                                        if (z11 && view2 != null) {
                                            Context context = m2Var3.getFragmentView().getContext();
                                            TLObject tLObject5 = tL_messages_stickerSet2;
                                            if (tLObject5 == null) {
                                                tLObject3 = stickerSet4;
                                            } else {
                                                tLObject3 = tLObject5;
                                            }
                                            sc.g(m2Var3, new yx0(context, tLObject3, 1, 2, null, m2Var3.getResourceProvider()), 1500).j();
                                        }
                                        if (tLObject4 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                                            MediaDataController.getInstance(i13).processStickerSetInstallResultArchive(m2Var3, true, i12, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject4);
                                        }
                                        if (callback2 != null) {
                                            callback2.run(Boolean.TRUE);
                                        }
                                    } else if (view2 != null) {
                                        Toast.makeText(m2Var3.getFragmentView().getContext(), LocaleController.getString(R.string.ErrorOccurred), 0).show();
                                        if (callback2 != null) {
                                            callback2.run(Boolean.FALSE);
                                        }
                                    } else if (callback2 != null) {
                                        callback2.run(Boolean.FALSE);
                                    }
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                                MediaDataController.getInstance(i13).loadStickers(i12, false, true, false, new a3(runnable, 5));
                            }
                        });
                    }
                });
            }
        }
    }

    public static boolean n(ew ewVar, jn jnVar, MotionEvent motionEvent) {
        return org.telegram.ui.xt.q().s(motionEvent, ewVar.h, jnVar, ewVar.N, ewVar.resourcesProvider);
    }

    public static void o(ew ewVar, ArrayList arrayList, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.c6 c6Var, View view, int i10) {
        ov ovVar = ewVar.e;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        int i11 = 0;
        if (arrayList != null && arrayList.size() > 1) {
            if (SystemClock.elapsedRealtime() - ewVar.Q >= 250) {
                int i12 = 0;
                while (true) {
                    ArrayList[] arrayListArr = ovVar.f23864c;
                    if (i11 >= arrayListArr.length) {
                        break;
                    }
                    int size = arrayListArr[i11].size();
                    if (ovVar.f23864c.length > 1) {
                        size = Math.min(ewVar.f24810y.J * 2, size);
                    }
                    i12 += size + 2;
                    if (i10 < i12) {
                        break;
                    }
                    i11++;
                }
                ArrayList arrayList2 = ovVar.f23863b;
                if (arrayList2 != null && i11 < arrayList2.size()) {
                    tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) ovVar.f23863b.get(i11);
                }
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    ArrayList arrayList3 = new ArrayList();
                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    tL_inputStickerSetID.f19236id = stickerSet.f19243id;
                    tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                    arrayList3.add(tL_inputStickerSetID);
                    new pv(ewVar, m2Var, ewVar.getContext(), c6Var, arrayList3).show();
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.m1 m1Var = ewVar.G;
        if (m1Var != null) {
            m1Var.d(true);
            ewVar.G = null;
        } else if ((m2Var instanceof org.telegram.ui.fo) && ((org.telegram.ui.fo) m2Var).Y.getVisibility() == 0 && (view instanceof vv)) {
            b6 b6Var = ((vv) view).f30664c;
            try {
                TLRPC.Document document = b6Var.document;
                if (document == null) {
                    document = s5.f(ewVar.currentAccount, b6Var.getDocumentId());
                }
                SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(document));
                spannableString.setSpan(b6Var, 0, spannableString.length(), 33);
                ((org.telegram.ui.fo) m2Var).Y.E0.getText().append((CharSequence) spannableString);
                ewVar.Z();
                ewVar.dismiss();
            } catch (Exception unused) {
            }
            try {
                view.performHapticFeedback(3, 1);
            } catch (Exception unused2) {
            }
        }
    }

    public static void q(ew ewVar, b6 b6Var) {
        org.telegram.ui.ActionBar.m1 m1Var = ewVar.G;
        if (m1Var != null) {
            m1Var.d(true);
            ewVar.G = null;
            SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(s5.f(ewVar.currentAccount, b6Var.getDocumentId())));
            spannableString.setSpan(b6Var, 0, spannableString.length(), 33);
            if (AndroidUtilities.addToClipboard(spannableString)) {
                org.telegram.messenger.yh.o(R.string.EmojiCopied, new zc((FrameLayout) ewVar.containerView, ewVar.resourcesProvider));
            }
        }
    }

    public static void r(ew ewVar, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ewVar.J = floatValue;
        ewVar.h.setAlpha(floatValue);
        ewVar.v.setAlpha(ewVar.J);
        ewVar.f24808w.setAlpha(ewVar.J);
        ewVar.containerView.invalidate();
    }

    public static ViewGroup t(ew ewVar) {
        return ewVar.containerView;
    }

    public static ViewGroup u(ew ewVar) {
        return ewVar.containerView;
    }

    public final int W() {
        if (this.containerView == null) {
            return 0;
        }
        di.v vVar = this.h;
        if (vVar != null && vVar.getChildCount() >= 1) {
            View childAt = vVar.getChildAt(0);
            xn xnVar = this.d;
            if (childAt != xnVar) {
                return this.containerView.getPaddingTop();
            }
            return xnVar.getBottom() + ((int) vVar.getY());
        }
        return this.containerView.getPaddingTop();
    }

    public final void a0() {
        org.telegram.ui.ActionBar.m2 m2Var = this.f24803c;
        if (m2Var != null) {
            new sg.y0(m2Var, 11, false).show();
        } else if (getContext() instanceof LaunchActivity) {
            ((LaunchActivity) getContext()).p0(new PremiumPreviewFragment(0, null));
        }
    }

    public final void b0() {
        ArrayList arrayList;
        boolean z10;
        int i10;
        int i11;
        TLRPC.StickerSet stickerSet;
        if (this.f24807s == null) {
            return;
        }
        ov ovVar = this.e;
        if (ovVar.f23863b == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(ovVar.f23863b);
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
                if (!mediaDataController.isStickerPackInstalled(stickerSet.f19243id)) {
                    arrayList3.add(tL_messages_stickerSet);
                } else {
                    arrayList2.add(tL_messages_stickerSet);
                }
            }
        }
        final ArrayList arrayList4 = new ArrayList(arrayList3);
        if (ovVar.f23862a != null && arrayList.size() == ovVar.f23862a.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.S && z10 && this.R == null) {
            this.R = ValueAnimator.ofFloat(this.J, 1.0f);
            this.containerView.getY();
            this.R.addUpdateListener(new n6(this, 17));
            this.R.setDuration(250L);
            this.R.setInterpolator(es.h);
            this.R.start();
        }
        this.S = z10;
        di.v vVar = this.h;
        if (!z10) {
            vVar.setAlpha(0.0f);
        } else if (this.O >= 0) {
            int L0 = this.f24810y.L0();
            int E = this.f24805n.E(this.O);
            if (Math.abs(L0 - E) > 54) {
                if (L0 < E) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                pl0 pl0Var = this.E;
                pl0Var.f28360b = i11;
                pl0Var.c(E, (AndroidUtilities.displaySize.y / 2) - AndroidUtilities.dp(170.0f), false, false);
            } else {
                vVar.x0(E);
            }
            this.K = this.f24805n.E(this.O);
            sv svVar = this.f24805n;
            int i14 = this.O;
            ew ewVar = svVar.f29215c;
            boolean z11 = ewVar.I;
            ov ovVar2 = ewVar.e;
            if (z11) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            int i15 = 0;
            while (true) {
                ArrayList[] arrayListArr = ovVar2.f23864c;
                if (i15 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i15].size();
                if (ovVar2.f23864c.length > 1) {
                    size = Math.min(ewVar.f24810y.J * 2, size);
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
            vVar.invalidate();
            this.O = -1;
        }
        boolean z12 = this.S;
        sg.q0 q0Var = this.f24809x;
        TextView textView = this.f24808w;
        TextView textView2 = this.v;
        if (z12 && !this.H) {
            q0Var.setVisibility(4);
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
                        gi.m0 m0Var;
                        boolean z14;
                        switch (r1) {
                            case 0:
                                ArrayList arrayList5 = arrayList4;
                                int size2 = arrayList5.size();
                                int[] iArr = new int[2];
                                int i16 = 0;
                                while (true) {
                                    int size3 = arrayList5.size();
                                    ew ewVar2 = this;
                                    if (i16 < size3) {
                                        org.telegram.ui.ActionBar.m2 m2Var = ewVar2.f24803c;
                                        TLObject tLObject = (TLObject) arrayList5.get(i16);
                                        if (size2 == 1) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        if (size2 > 1) {
                                            m0Var = new gi.m0(ewVar2, iArr, size2, arrayList5);
                                        } else {
                                            m0Var = null;
                                        }
                                        ew.X(m2Var, tLObject, z13, m0Var, null);
                                        i16++;
                                    } else {
                                        ewVar2.Y(true);
                                        if (size2 <= 1) {
                                            ewVar2.dismiss();
                                            return;
                                        }
                                        return;
                                    }
                                }
                            default:
                                ew ewVar3 = this;
                                ewVar3.dismiss();
                                org.telegram.ui.ActionBar.m2 m2Var2 = ewVar3.f24803c;
                                ArrayList<TLRPC.TL_messages_stickerSet> arrayList6 = arrayList4;
                                if (m2Var2 != null) {
                                    MediaDataController.getInstance(m2Var2.getCurrentAccount()).removeMultipleStickerSets(m2Var2.getContext(), m2Var2, arrayList6);
                                } else {
                                    for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList6.get(i17);
                                        Context context = ewVar3.getContext();
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
                                ewVar3.Y(false);
                                return;
                        }
                    }
                });
                c0(true);
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
                        gi.m0 m0Var;
                        boolean z14;
                        switch (r1) {
                            case 0:
                                ArrayList arrayList5 = arrayList2;
                                int size2 = arrayList5.size();
                                int[] iArr = new int[2];
                                int i16 = 0;
                                while (true) {
                                    int size3 = arrayList5.size();
                                    ew ewVar2 = this;
                                    if (i16 < size3) {
                                        org.telegram.ui.ActionBar.m2 m2Var = ewVar2.f24803c;
                                        TLObject tLObject = (TLObject) arrayList5.get(i16);
                                        if (size2 == 1) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        if (size2 > 1) {
                                            m0Var = new gi.m0(ewVar2, iArr, size2, arrayList5);
                                        } else {
                                            m0Var = null;
                                        }
                                        ew.X(m2Var, tLObject, z13, m0Var, null);
                                        i16++;
                                    } else {
                                        ewVar2.Y(true);
                                        if (size2 <= 1) {
                                            ewVar2.dismiss();
                                            return;
                                        }
                                        return;
                                    }
                                }
                            default:
                                ew ewVar3 = this;
                                ewVar3.dismiss();
                                org.telegram.ui.ActionBar.m2 m2Var2 = ewVar3.f24803c;
                                ArrayList<TLRPC.TL_messages_stickerSet> arrayList6 = arrayList2;
                                if (m2Var2 != null) {
                                    MediaDataController.getInstance(m2Var2.getCurrentAccount()).removeMultipleStickerSets(m2Var2.getContext(), m2Var2, arrayList6);
                                } else {
                                    for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList6.get(i17);
                                        Context context = ewVar3.getContext();
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
                                ewVar3.Y(false);
                                return;
                        }
                    }
                });
                c0(true);
                return;
            } else {
                textView2.setVisibility(8);
                textView.setVisibility(8);
                c0(false);
                return;
            }
        }
        q0Var.setVisibility(8);
        textView2.setVisibility(8);
        textView.setVisibility(8);
        c0(false);
    }

    public final void c0(boolean z10) {
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
        if (this.f24808w.getVisibility() == 0) {
            i10 = AndroidUtilities.dp(19.0f);
        }
        float f13 = i10;
        boolean z12 = this.H;
        di.v vVar = this.h;
        View view = this.f24806r;
        FrameLayout frameLayout = this.f24807s;
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
            es esVar = es.h;
            duration.setInterpolator(esVar).start();
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
            translationY2.alpha(f14).setDuration(250L).setInterpolator(esVar).start();
            ViewPropertyAnimator animate3 = vVar.animate();
            if (!z12 && !z10) {
                f15 = AndroidUtilities.dp(68.0f) - f13;
            }
            animate3.translationY(f15).setDuration(250L).setInterpolator(esVar).start();
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
            vVar.setTranslationY(f15);
        }
        this.P = z10;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        zv zvVar;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (i10 == NotificationCenter.stickersDidLoad) {
            int i12 = 0;
            while (true) {
                di.v vVar = this.h;
                if (i12 < vVar.getChildCount()) {
                    View childAt = vVar.getChildAt(i12);
                    if ((childAt instanceof zv) && (tL_messages_stickerSet = (zvVar = (zv) childAt).f31992r) != null && tL_messages_stickerSet.set != null) {
                        zvVar.a(MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(zvVar.f31992r.set.f19243id), true);
                    }
                    i12++;
                } else {
                    b0();
                    return;
                }
            }
        }
    }

    @Override
    public void dismiss() {
        uv uvVar = this.f24804f;
        if (uvVar != null && uvVar.f29779w) {
            uvVar.f29779w = false;
            uvVar.invalidate();
        }
        super.dismiss();
        ov ovVar = this.e;
        if (ovVar != null) {
            NotificationCenter.getInstance(ovVar.d).removeObserver(ovVar, NotificationCenter.groupStickersDidLoad);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
    }

    @Override
    public final int getContainerViewHeight() {
        int measuredHeight;
        int i10 = 0;
        di.v vVar = this.h;
        if (vVar == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = vVar.getMeasuredHeight();
        }
        int W = measuredHeight - W();
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            i10 = viewGroup.getPaddingTop();
        }
        return AndroidUtilities.dp(8.0f) + W + i10 + AndroidUtilities.navigationBarHeight;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
    }

    @Override
    public final void onBackPressed() {
        if (org.telegram.ui.xt.q().E) {
            org.telegram.ui.xt.q().o();
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
        sv svVar = new sv(this);
        this.f24805n = svVar;
        this.h.setAdapter(svVar);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
        ov ovVar = this.e;
        if (!ovVar.e) {
            ovVar.e = true;
            ew ewVar = ovVar.f23865f;
            int i10 = ovVar.d;
            ovVar.f23863b = new ArrayList(ovVar.f23862a.size());
            ovVar.f23864c = new ArrayList[ovVar.f23862a.size()];
            NotificationCenter.getInstance(i10).addObserver(ovVar, NotificationCenter.groupStickersDidLoad);
            boolean[] zArr = new boolean[1];
            int i11 = 0;
            while (true) {
                if (i11 < ovVar.f23864c.length) {
                    org.telegram.ui.sk skVar = null;
                    TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(i10).getStickerSet((TLRPC.InputStickerSet) ovVar.f23862a.get(i11), null, false, new org.telegram.ui.vc(21, ovVar, zArr));
                    if (ovVar.f23864c.length == 1 && stickerSet2 != null && (stickerSet = stickerSet2.set) != null && !stickerSet.emojis) {
                        AndroidUtilities.runOnUIThread(new aw(ovVar, 0));
                        Context context = ewVar.getContext();
                        org.telegram.ui.ActionBar.m2 m2Var = ewVar.f24803c;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) ovVar.f23862a.get(i11);
                        org.telegram.ui.ActionBar.m2 m2Var2 = ewVar.f24803c;
                        if (m2Var2 instanceof org.telegram.ui.fo) {
                            skVar = ((org.telegram.ui.fo) m2Var2).Y;
                        }
                        new ty0(context, m2Var, inputStickerSet, null, skVar, ewVar.resourcesProvider).show();
                    } else {
                        ovVar.f23863b.add(stickerSet2);
                        ovVar.a(i11, stickerSet2);
                        i11++;
                    }
                } else {
                    ew ewVar2 = ovVar.h;
                    ewVar2.b0();
                    di.v vVar = ewVar2.h;
                    if (vVar != null && vVar.getAdapter() != null) {
                        vVar.getAdapter().l();
                    }
                }
            }
        }
        b0();
        org.telegram.ui.ActionBar.m2 m2Var3 = this.f24803c;
        if (m2Var3 == null) {
            currentAccount = UserConfig.selectedAccount;
        } else {
            currentAccount = m2Var3.getCurrentAccount();
        }
        MediaDataController.getInstance(currentAccount).checkStickers(5);
    }

    public void Y(boolean z10) {
    }

    public void Z() {
    }
}
