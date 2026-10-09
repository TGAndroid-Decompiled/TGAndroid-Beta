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
public class iw extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static Pattern V;
    public final tl0 E;
    public final jq F;
    public org.telegram.ui.ActionBar.n1 G;
    public final boolean H;
    public boolean I;
    public float J;
    public int K;
    public int L;
    public final g6 M;
    public final rv N;
    public int O;
    public boolean P;
    public long Q;
    public ValueAnimator R;
    public boolean S;
    public PorterDuffColorFilter T;
    public int U;
    public LongSparseArray f27495b;
    public final org.telegram.ui.ActionBar.n2 f27496c;
    public final ao d;
    public final sv f27497e;
    public final yv f27498f;
    public final ci.v h;
    public wv f27499n;
    public final View f27500r;
    public final FrameLayout f27501s;
    public final TextView v;
    public final TextView f27502w;
    public final rg.p0 f27503x;
    public final s4.s f27504y;

    public iw(org.telegram.ui.ActionBar.n2 r21, android.content.Context r22, org.telegram.ui.ActionBar.e6 r23, java.util.ArrayList r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.iw.<init>(org.telegram.ui.ActionBar.n2, android.content.Context, org.telegram.ui.ActionBar.e6, java.util.ArrayList):void");
    }

    public static void Q(iw iwVar, int i10) {
        ArrayList arrayList;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        String str;
        Context context;
        org.telegram.ui.ActionBar.n2 n2Var = iwVar.f27496c;
        sv svVar = iwVar.f27497e;
        if (svVar != null && (arrayList = svVar.f26495b) != null && !arrayList.isEmpty()) {
            TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) svVar.f26495b.get(0)).set;
            if (stickerSet != null && stickerSet.emojis) {
                str = "https://" + MessagesController.getInstance(iwVar.currentAccount).linkPrefix + "/addemoji/" + tL_messages_stickerSet.set.short_name;
            } else {
                str = "https://" + MessagesController.getInstance(iwVar.currentAccount).linkPrefix + "/addstickers/" + tL_messages_stickerSet.set.short_name;
            }
            String str2 = str;
            if (i10 == 1) {
                if (n2Var != null) {
                    context = n2Var.getParentActivity();
                } else {
                    context = null;
                }
                if (context == null) {
                    context = iwVar.getContext();
                }
                vv vvVar = new vv(iwVar, context, str2, str2, iwVar.resourcesProvider);
                if (n2Var != null) {
                    n2Var.showDialog(vvVar);
                } else {
                    vvVar.show();
                }
            } else if (i10 == 2) {
                try {
                    AndroidUtilities.addToClipboard(str2);
                    new ad((FrameLayout) iwVar.containerView, iwVar.resourcesProvider).k(false).j();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        }
    }

    public static int V(iw iwVar) {
        return iwVar.currentAccount;
    }

    public static void X(final org.telegram.ui.ActionBar.n2 n2Var, TLObject tLObject, final boolean z10, final fi.m0 m0Var, final nq nqVar) {
        int currentAccount;
        final View fragmentView;
        final TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (n2Var == null) {
            currentAccount = UserConfig.selectedAccount;
        } else {
            currentAccount = n2Var.getCurrentAccount();
        }
        final int i10 = currentAccount;
        TLRPC.StickerSet stickerSet = null;
        if (n2Var == null) {
            fragmentView = null;
        } else {
            fragmentView = n2Var.getFragmentView();
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
                if (MediaDataController.getInstance(i10).cancelRemovingStickerSet(stickerSet2.f20065id)) {
                    if (m0Var != null) {
                        m0Var.run(Boolean.TRUE);
                        return;
                    }
                    return;
                }
                TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                tL_messages_installStickerSet.stickerset = tL_inputStickerSetID;
                tL_inputStickerSetID.f20058id = stickerSet2.f20065id;
                tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_installStickerSet, new RequestDelegate() {
                    @Override
                    public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                        final TLRPC.StickerSet stickerSet3 = TLRPC.StickerSet.this;
                        final boolean z11 = z10;
                        final View view = fragmentView;
                        final org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        final TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                        final int i11 = i10;
                        final Utilities.Callback callback = m0Var;
                        final Runnable runnable = nqVar;
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
                                org.telegram.ui.ActionBar.n2 n2Var3 = n2Var2;
                                int i13 = i11;
                                Utilities.Callback callback2 = callback;
                                try {
                                    if (tL_error2 == null) {
                                        if (z11 && view2 != null) {
                                            Context context = n2Var3.getFragmentView().getContext();
                                            TLObject tLObject5 = tL_messages_stickerSet2;
                                            if (tLObject5 == null) {
                                                tLObject3 = stickerSet4;
                                            } else {
                                                tLObject3 = tLObject5;
                                            }
                                            tc.g(n2Var3, new cy0(context, tLObject3, 1, 2, null, n2Var3.getResourceProvider()), 1500).j();
                                        }
                                        if (tLObject4 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                                            MediaDataController.getInstance(i13).processStickerSetInstallResultArchive(n2Var3, true, i12, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject4);
                                        }
                                        if (callback2 != null) {
                                            callback2.run(Boolean.TRUE);
                                        }
                                    } else if (view2 != null) {
                                        Toast.makeText(n2Var3.getFragmentView().getContext(), LocaleController.getString(R.string.ErrorOccurred), 0).show();
                                        if (callback2 != null) {
                                            callback2.run(Boolean.FALSE);
                                        }
                                    } else if (callback2 != null) {
                                        callback2.run(Boolean.FALSE);
                                    }
                                } catch (Exception e7) {
                                    FileLog.e(e7);
                                }
                                MediaDataController.getInstance(i13).loadStickers(i12, false, true, false, new a3(runnable, 5));
                            }
                        });
                    }
                });
            }
        }
    }

    public static boolean o(iw iwVar, mn mnVar, MotionEvent motionEvent) {
        return org.telegram.ui.rt.q().s(motionEvent, iwVar.h, mnVar, iwVar.N, iwVar.resourcesProvider);
    }

    public static void p(iw iwVar, ArrayList arrayList, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.e6 e6Var, View view, int i10) {
        sv svVar = iwVar.f27497e;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        int i11 = 0;
        if (arrayList != null && arrayList.size() > 1) {
            if (SystemClock.elapsedRealtime() - iwVar.Q >= 250) {
                int i12 = 0;
                while (true) {
                    ArrayList[] arrayListArr = svVar.f26496c;
                    if (i11 >= arrayListArr.length) {
                        break;
                    }
                    int size = arrayListArr[i11].size();
                    if (svVar.f26496c.length > 1) {
                        size = Math.min(iwVar.f27504y.J * 2, size);
                    }
                    i12 += size + 2;
                    if (i10 < i12) {
                        break;
                    }
                    i11++;
                }
                ArrayList arrayList2 = svVar.f26495b;
                if (arrayList2 != null && i11 < arrayList2.size()) {
                    tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) svVar.f26495b.get(i11);
                }
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    ArrayList arrayList3 = new ArrayList();
                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    tL_inputStickerSetID.f20058id = stickerSet.f20065id;
                    tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                    arrayList3.add(tL_inputStickerSetID);
                    new tv(iwVar, n2Var, iwVar.getContext(), e6Var, arrayList3).show();
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.n1 n1Var = iwVar.G;
        if (n1Var != null) {
            n1Var.d(true);
            iwVar.G = null;
        } else if ((n2Var instanceof org.telegram.ui.zn) && ((org.telegram.ui.zn) n2Var).Y.getVisibility() == 0 && (view instanceof zv)) {
            b6 b6Var = ((zv) view).f33665c;
            try {
                TLRPC.Document document = b6Var.document;
                if (document == null) {
                    document = s5.f(iwVar.currentAccount, b6Var.getDocumentId());
                }
                SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(document));
                spannableString.setSpan(b6Var, 0, spannableString.length(), 33);
                ((org.telegram.ui.zn) n2Var).Y.E0.getText().append((CharSequence) spannableString);
                iwVar.Z();
                iwVar.dismiss();
            } catch (Exception unused) {
            }
            try {
                view.performHapticFeedback(3, 1);
            } catch (Exception unused2) {
            }
        }
    }

    public static void q(iw iwVar, b6 b6Var) {
        org.telegram.ui.ActionBar.n1 n1Var = iwVar.G;
        if (n1Var != null) {
            n1Var.d(true);
            iwVar.G = null;
            SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(s5.f(iwVar.currentAccount, b6Var.getDocumentId())));
            spannableString.setSpan(b6Var, 0, spannableString.length(), 33);
            if (AndroidUtilities.addToClipboard(spannableString)) {
                org.telegram.messenger.bi.p(R.string.EmojiCopied, new ad((FrameLayout) iwVar.containerView, iwVar.resourcesProvider));
            }
        }
    }

    public static void r(iw iwVar, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        iwVar.J = floatValue;
        iwVar.h.setAlpha(floatValue);
        iwVar.v.setAlpha(iwVar.J);
        iwVar.f27502w.setAlpha(iwVar.J);
        iwVar.containerView.invalidate();
    }

    public static ViewGroup t(iw iwVar) {
        return iwVar.containerView;
    }

    public static ViewGroup u(iw iwVar) {
        return iwVar.containerView;
    }

    public final int W() {
        if (this.containerView == null) {
            return 0;
        }
        ci.v vVar = this.h;
        if (vVar != null && vVar.getChildCount() >= 1) {
            View childAt = vVar.getChildAt(0);
            ao aoVar = this.d;
            if (childAt != aoVar) {
                return this.containerView.getPaddingTop();
            }
            return aoVar.getBottom() + ((int) vVar.getY());
        }
        return this.containerView.getPaddingTop();
    }

    public final void a0() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f27496c;
        if (n2Var != null) {
            new rg.y0(n2Var, 11, false).show();
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
        if (this.f27501s == null) {
            return;
        }
        sv svVar = this.f27497e;
        if (svVar.f26495b == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(svVar.f26495b);
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
                if (!mediaDataController.isStickerPackInstalled(stickerSet.f20065id)) {
                    arrayList3.add(tL_messages_stickerSet);
                } else {
                    arrayList2.add(tL_messages_stickerSet);
                }
            }
        }
        final ArrayList arrayList4 = new ArrayList(arrayList3);
        if (svVar.f26494a != null && arrayList.size() == svVar.f26494a.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.S && z10 && this.R == null) {
            this.R = ValueAnimator.ofFloat(this.J, 1.0f);
            this.containerView.getY();
            this.R.addUpdateListener(new m6(this, 17));
            this.R.setDuration(250L);
            this.R.setInterpolator(hs.h);
            this.R.start();
        }
        this.S = z10;
        ci.v vVar = this.h;
        if (!z10) {
            vVar.setAlpha(0.0f);
        } else if (this.O >= 0) {
            int L0 = this.f27504y.L0();
            int E = this.f27499n.E(this.O);
            if (Math.abs(L0 - E) > 54) {
                if (L0 < E) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                tl0 tl0Var = this.E;
                tl0Var.f31224b = i11;
                tl0Var.c(E, (AndroidUtilities.displaySize.y / 2) - AndroidUtilities.dp(170.0f), false, false);
            } else {
                vVar.x0(E);
            }
            this.K = this.f27499n.E(this.O);
            wv wvVar = this.f27499n;
            int i14 = this.O;
            iw iwVar = wvVar.f32679c;
            boolean z11 = iwVar.I;
            sv svVar2 = iwVar.f27497e;
            if (z11) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            int i15 = 0;
            while (true) {
                ArrayList[] arrayListArr = svVar2.f26496c;
                if (i15 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i15].size();
                if (svVar2.f26496c.length > 1) {
                    size = Math.min(iwVar.f27504y.J * 2, size);
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
        rg.p0 p0Var = this.f27503x;
        TextView textView = this.f27502w;
        TextView textView2 = this.v;
        if (z12 && !this.H) {
            p0Var.setVisibility(4);
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
                        fi.m0 m0Var;
                        boolean z14;
                        switch (r1) {
                            case 0:
                                ArrayList arrayList5 = arrayList4;
                                int size2 = arrayList5.size();
                                int[] iArr = new int[2];
                                int i16 = 0;
                                while (true) {
                                    int size3 = arrayList5.size();
                                    iw iwVar2 = this;
                                    if (i16 < size3) {
                                        org.telegram.ui.ActionBar.n2 n2Var = iwVar2.f27496c;
                                        TLObject tLObject = (TLObject) arrayList5.get(i16);
                                        if (size2 == 1) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        if (size2 > 1) {
                                            m0Var = new fi.m0(iwVar2, iArr, size2, arrayList5);
                                        } else {
                                            m0Var = null;
                                        }
                                        iw.X(n2Var, tLObject, z13, m0Var, null);
                                        i16++;
                                    } else {
                                        iwVar2.Y(true);
                                        if (size2 <= 1) {
                                            iwVar2.dismiss();
                                            return;
                                        }
                                        return;
                                    }
                                }
                            default:
                                iw iwVar3 = this;
                                iwVar3.dismiss();
                                org.telegram.ui.ActionBar.n2 n2Var2 = iwVar3.f27496c;
                                ArrayList<TLRPC.TL_messages_stickerSet> arrayList6 = arrayList4;
                                if (n2Var2 != null) {
                                    MediaDataController.getInstance(n2Var2.getCurrentAccount()).removeMultipleStickerSets(n2Var2.getContext(), n2Var2, arrayList6);
                                } else {
                                    for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList6.get(i17);
                                        Context context = iwVar3.getContext();
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
                                iwVar3.Y(false);
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
                        fi.m0 m0Var;
                        boolean z14;
                        switch (r1) {
                            case 0:
                                ArrayList arrayList5 = arrayList2;
                                int size2 = arrayList5.size();
                                int[] iArr = new int[2];
                                int i16 = 0;
                                while (true) {
                                    int size3 = arrayList5.size();
                                    iw iwVar2 = this;
                                    if (i16 < size3) {
                                        org.telegram.ui.ActionBar.n2 n2Var = iwVar2.f27496c;
                                        TLObject tLObject = (TLObject) arrayList5.get(i16);
                                        if (size2 == 1) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        if (size2 > 1) {
                                            m0Var = new fi.m0(iwVar2, iArr, size2, arrayList5);
                                        } else {
                                            m0Var = null;
                                        }
                                        iw.X(n2Var, tLObject, z13, m0Var, null);
                                        i16++;
                                    } else {
                                        iwVar2.Y(true);
                                        if (size2 <= 1) {
                                            iwVar2.dismiss();
                                            return;
                                        }
                                        return;
                                    }
                                }
                            default:
                                iw iwVar3 = this;
                                iwVar3.dismiss();
                                org.telegram.ui.ActionBar.n2 n2Var2 = iwVar3.f27496c;
                                ArrayList<TLRPC.TL_messages_stickerSet> arrayList6 = arrayList2;
                                if (n2Var2 != null) {
                                    MediaDataController.getInstance(n2Var2.getCurrentAccount()).removeMultipleStickerSets(n2Var2.getContext(), n2Var2, arrayList6);
                                } else {
                                    for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList6.get(i17);
                                        Context context = iwVar3.getContext();
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
                                iwVar3.Y(false);
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
        p0Var.setVisibility(8);
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
        if (this.f27502w.getVisibility() == 0) {
            i10 = AndroidUtilities.dp(19.0f);
        }
        float f13 = i10;
        boolean z12 = this.H;
        ci.v vVar = this.h;
        View view = this.f27500r;
        FrameLayout frameLayout = this.f27501s;
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
            hs hsVar = hs.h;
            duration.setInterpolator(hsVar).start();
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
            translationY2.alpha(f14).setDuration(250L).setInterpolator(hsVar).start();
            ViewPropertyAnimator animate3 = vVar.animate();
            if (!z12 && !z10) {
                f15 = AndroidUtilities.dp(68.0f) - f13;
            }
            animate3.translationY(f15).setDuration(250L).setInterpolator(hsVar).start();
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
        dw dwVar;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (i10 == NotificationCenter.stickersDidLoad) {
            int i12 = 0;
            while (true) {
                ci.v vVar = this.h;
                if (i12 < vVar.getChildCount()) {
                    View childAt = vVar.getChildAt(i12);
                    if ((childAt instanceof dw) && (tL_messages_stickerSet = (dwVar = (dw) childAt).f25826r) != null && tL_messages_stickerSet.set != null) {
                        dwVar.a(MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(dwVar.f25826r.set.f20065id), true);
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
        yv yvVar = this.f27498f;
        if (yvVar != null && yvVar.f33364w) {
            yvVar.f33364w = false;
            yvVar.invalidate();
        }
        super.dismiss();
        sv svVar = this.f27497e;
        if (svVar != null) {
            NotificationCenter.getInstance(svVar.d).removeObserver(svVar, NotificationCenter.groupStickersDidLoad);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
    }

    @Override
    public final int getContainerViewHeight() {
        int measuredHeight;
        int i10 = 0;
        ci.v vVar = this.h;
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
        wv wvVar = new wv(this);
        this.f27499n = wvVar;
        this.h.setAdapter(wvVar);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
        sv svVar = this.f27497e;
        if (!svVar.f26497e) {
            svVar.f26497e = true;
            iw iwVar = svVar.f26498f;
            int i10 = svVar.d;
            svVar.f26495b = new ArrayList(svVar.f26494a.size());
            svVar.f26496c = new ArrayList[svVar.f26494a.size()];
            NotificationCenter.getInstance(i10).addObserver(svVar, NotificationCenter.groupStickersDidLoad);
            boolean[] zArr = new boolean[1];
            int i11 = 0;
            while (true) {
                if (i11 < svVar.f26496c.length) {
                    org.telegram.ui.ok okVar = null;
                    TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(i10).getStickerSet((TLRPC.InputStickerSet) svVar.f26494a.get(i11), null, false, new org.telegram.ui.pc(21, svVar, zArr));
                    if (svVar.f26496c.length == 1 && stickerSet2 != null && (stickerSet = stickerSet2.set) != null && !stickerSet.emojis) {
                        AndroidUtilities.runOnUIThread(new ew(svVar, 0));
                        Context context = iwVar.getContext();
                        org.telegram.ui.ActionBar.n2 n2Var = iwVar.f27496c;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) svVar.f26494a.get(i11);
                        org.telegram.ui.ActionBar.n2 n2Var2 = iwVar.f27496c;
                        if (n2Var2 instanceof org.telegram.ui.zn) {
                            okVar = ((org.telegram.ui.zn) n2Var2).Y;
                        }
                        new xy0(context, n2Var, inputStickerSet, null, okVar, iwVar.resourcesProvider).show();
                    } else {
                        svVar.f26495b.add(stickerSet2);
                        svVar.a(i11, stickerSet2);
                        i11++;
                    }
                } else {
                    iw iwVar2 = svVar.h;
                    iwVar2.b0();
                    ci.v vVar = iwVar2.h;
                    if (vVar != null && vVar.getAdapter() != null) {
                        vVar.getAdapter().l();
                    }
                }
            }
        }
        b0();
        org.telegram.ui.ActionBar.n2 n2Var3 = this.f27496c;
        if (n2Var3 == null) {
            currentAccount = UserConfig.selectedAccount;
        } else {
            currentAccount = n2Var3.getCurrentAccount();
        }
        MediaDataController.getInstance(currentAccount).checkStickers(5);
    }

    public void Y(boolean z10) {
    }

    public void Z() {
    }
}
