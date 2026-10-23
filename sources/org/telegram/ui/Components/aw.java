package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
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
public class aw extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate {
    public static Pattern V;
    public final pl0 E;
    public final eq F;
    public org.telegram.ui.ActionBar.m1 G;
    public final boolean H;
    public boolean I;
    public float J;
    public int K;
    public int L;
    public final f6 M;
    public final iv N;
    public int O;
    public boolean P;
    public long Q;
    public ValueAnimator R;
    public boolean S;
    public PorterDuffColorFilter T;
    public int U;
    public LongSparseArray f24854b;
    public final org.telegram.ui.ActionBar.o2 f24855c;
    public final un d;
    public final jv e;
    public final qv f24856f;
    public final ei.v h;
    public ov f24857n;
    public final View f24858r;
    public final FrameLayout f24859s;
    public final TextView v;
    public final TextView f24860w;
    public final sg.p0 f24861x;
    public final s4.s f24862y;

    public aw(org.telegram.ui.ActionBar.o2 r21, android.content.Context r22, org.telegram.ui.ActionBar.g6 r23, java.util.ArrayList r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.aw.<init>(org.telegram.ui.ActionBar.o2, android.content.Context, org.telegram.ui.ActionBar.g6, java.util.ArrayList):void");
    }

    public static void Z(aw awVar, int i10) {
        ArrayList arrayList;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        String str;
        Context context;
        org.telegram.ui.ActionBar.o2 o2Var = awVar.f24855c;
        jv jvVar = awVar.e;
        if (jvVar != null && (arrayList = jvVar.f32653b) != null && !arrayList.isEmpty()) {
            TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) jvVar.f32653b.get(0)).set;
            if (stickerSet != null && stickerSet.emojis) {
                str = "https://" + MessagesController.getInstance(awVar.currentAccount).linkPrefix + "/addemoji/" + tL_messages_stickerSet.set.short_name;
            } else {
                str = "https://" + MessagesController.getInstance(awVar.currentAccount).linkPrefix + "/addstickers/" + tL_messages_stickerSet.set.short_name;
            }
            String str2 = str;
            if (i10 == 1) {
                if (o2Var != null) {
                    context = o2Var.getParentActivity();
                } else {
                    context = null;
                }
                if (context == null) {
                    context = awVar.getContext();
                }
                nv nvVar = new nv(awVar, context, str2, str2, awVar.resourcesProvider);
                if (o2Var != null) {
                    o2Var.showDialog(nvVar);
                } else {
                    nvVar.show();
                }
            } else if (i10 == 2) {
                try {
                    AndroidUtilities.addToClipboard(str2);
                    new xc((FrameLayout) awVar.containerView, awVar.resourcesProvider).k(false).j();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
    }

    public static int e0(aw awVar) {
        return awVar.currentAccount;
    }

    public static void g0(final org.telegram.ui.ActionBar.o2 o2Var, TLObject tLObject, final boolean z10, final ai.va vaVar, final zp zpVar) {
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
                if (MediaDataController.getInstance(i10).cancelRemovingStickerSet(stickerSet2.f20370id)) {
                    if (vaVar != null) {
                        vaVar.run(Boolean.TRUE);
                        return;
                    }
                    return;
                }
                TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                tL_messages_installStickerSet.stickerset = tL_inputStickerSetID;
                tL_inputStickerSetID.f20363id = stickerSet2.f20370id;
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
                        final Utilities.Callback callback = vaVar;
                        final Runnable runnable = zpVar;
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
                                            qc.g(o2Var3, new yx0(context, tLObject3, 1, 2, null, o2Var3.getResourceProvider()), 1500).j();
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

    public static boolean m(aw awVar, gn gnVar, MotionEvent motionEvent) {
        return org.telegram.ui.ht.o().q(motionEvent, awVar.h, gnVar, awVar.N, awVar.resourcesProvider);
    }

    public static void n(aw awVar, ArrayList arrayList, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.g6 g6Var, View view, int i10) {
        jv jvVar = awVar.e;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        int i11 = 0;
        if (arrayList != null && arrayList.size() > 1) {
            if (SystemClock.elapsedRealtime() - awVar.Q >= 250) {
                int i12 = 0;
                while (true) {
                    ArrayList[] arrayListArr = jvVar.f32654c;
                    if (i11 >= arrayListArr.length) {
                        break;
                    }
                    int size = arrayListArr[i11].size();
                    if (jvVar.f32654c.length > 1) {
                        size = Math.min(awVar.f24862y.J * 2, size);
                    }
                    i12 += size + 2;
                    if (i10 < i12) {
                        break;
                    }
                    i11++;
                }
                ArrayList arrayList2 = jvVar.f32653b;
                if (arrayList2 != null && i11 < arrayList2.size()) {
                    tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) jvVar.f32653b.get(i11);
                }
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    ArrayList arrayList3 = new ArrayList();
                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    tL_inputStickerSetID.f20363id = stickerSet.f20370id;
                    tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                    arrayList3.add(tL_inputStickerSetID);
                    new lv(awVar, o2Var, awVar.getContext(), g6Var, arrayList3).show();
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.m1 m1Var = awVar.G;
        if (m1Var != null) {
            m1Var.d(true);
            awVar.G = null;
        } else if ((o2Var instanceof org.telegram.ui.sn) && ((org.telegram.ui.sn) o2Var).Y.getVisibility() == 0 && (view instanceof rv)) {
            a6 a6Var = ((rv) view).f30281c;
            try {
                TLRPC.Document document = a6Var.document;
                if (document == null) {
                    document = r5.f(awVar.currentAccount, a6Var.getDocumentId());
                }
                SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(document));
                spannableString.setSpan(a6Var, 0, spannableString.length(), 33);
                ((org.telegram.ui.sn) o2Var).Y.E0.getText().append((CharSequence) spannableString);
                awVar.i0();
                awVar.dismiss();
            } catch (Exception unused) {
            }
            try {
                view.performHapticFeedback(3, 1);
            } catch (Exception unused2) {
            }
        }
    }

    public static void p(aw awVar, a6 a6Var) {
        org.telegram.ui.ActionBar.m1 m1Var = awVar.G;
        if (m1Var != null) {
            m1Var.d(true);
            awVar.G = null;
            SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(r5.f(awVar.currentAccount, a6Var.getDocumentId())));
            spannableString.setSpan(a6Var, 0, spannableString.length(), 33);
            if (AndroidUtilities.addToClipboard(spannableString)) {
                org.telegram.messenger.sl.p(R.string.EmojiCopied, new xc((FrameLayout) awVar.containerView, awVar.resourcesProvider));
            }
        }
    }

    public static void q(aw awVar, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        awVar.J = floatValue;
        awVar.h.setAlpha(floatValue);
        awVar.v.setAlpha(awVar.J);
        awVar.f24860w.setAlpha(awVar.J);
        awVar.containerView.invalidate();
    }

    public static boolean r(aw awVar, Context context, View view) {
        a6 a6Var;
        if (!(view instanceof rv) || (a6Var = ((rv) view).f30281c) == null) {
            return false;
        }
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(awVar.getContext(), true, true);
        e1Var.setItemHeight(48);
        e1Var.setPadding(AndroidUtilities.dp(26.0f), 0, AndroidUtilities.dp(26.0f), 0);
        e1Var.setText(LocaleController.getString(R.string.Copy));
        e1Var.getTextView().setTextSize(1, 14.4f);
        e1Var.getTextView().setTypeface(AndroidUtilities.bold());
        e1Var.setOnClickListener(new ca(12, awVar, a6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        Drawable mutate = awVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
        org.telegram.ui.ActionBar.r6.z(linearLayout, mutate, org.telegram.ui.ActionBar.k6.G8, awVar.resourcesProvider, PorterDuff.Mode.MULTIPLY);
        linearLayout.setBackground(mutate);
        linearLayout.addView(e1Var);
        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(linearLayout, -2, -2);
        awVar.G = m1Var;
        m1Var.setClippingEnabled(true);
        awVar.G.g();
        awVar.G.setInputMethodMode(2);
        awVar.G.setSoftInputMode(0);
        awVar.G.setOutsideTouchable(true);
        awVar.G.setAnimationStyle(R.style.PopupAnimation);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        awVar.G.showAtLocation(view, 51, (view.getMeasuredWidth() / 2) + (iArr[0] - AndroidUtilities.dp(49.0f)), iArr[1] - AndroidUtilities.dp(52.0f));
        try {
            view.performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        return true;
    }

    public static ViewGroup t(aw awVar) {
        return awVar.containerView;
    }

    public static ViewGroup u(aw awVar) {
        return awVar.containerView;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        vv vvVar;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (i10 == NotificationCenter.stickersDidLoad) {
            int i12 = 0;
            while (true) {
                ei.v vVar = this.h;
                if (i12 < vVar.getChildCount()) {
                    View childAt = vVar.getChildAt(i12);
                    if ((childAt instanceof vv) && (tL_messages_stickerSet = (vvVar = (vv) childAt).f32062r) != null && tL_messages_stickerSet.set != null) {
                        vvVar.a(MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(vvVar.f32062r.set.f20370id), true);
                    }
                    i12++;
                } else {
                    k0();
                    return;
                }
            }
        }
    }

    @Override
    public void dismiss() {
        qv qvVar = this.f24856f;
        if (qvVar != null && qvVar.f30016w) {
            qvVar.f30016w = false;
            qvVar.invalidate();
        }
        super.dismiss();
        jv jvVar = this.e;
        if (jvVar != null) {
            NotificationCenter.getInstance(jvVar.d).removeObserver(jvVar, NotificationCenter.groupStickersDidLoad);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
    }

    public final int f0() {
        if (this.containerView == null) {
            return 0;
        }
        ei.v vVar = this.h;
        if (vVar != null && vVar.getChildCount() >= 1) {
            View childAt = vVar.getChildAt(0);
            un unVar = this.d;
            if (childAt != unVar) {
                return this.containerView.getPaddingTop();
            }
            return unVar.getBottom() + ((int) vVar.getY());
        }
        return this.containerView.getPaddingTop();
    }

    @Override
    public final int getContainerViewHeight() {
        int measuredHeight;
        int i10 = 0;
        ei.v vVar = this.h;
        if (vVar == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = vVar.getMeasuredHeight();
        }
        int f02 = measuredHeight - f0();
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            i10 = viewGroup.getPaddingTop();
        }
        return AndroidUtilities.dp(8.0f) + f02 + i10 + AndroidUtilities.navigationBarHeight;
    }

    public final void j0() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f24855c;
        if (o2Var != null) {
            new sg.y0(o2Var, 11, false).show();
        } else if (getContext() instanceof LaunchActivity) {
            ((LaunchActivity) getContext()).u0(new PremiumPreviewFragment(0, null));
        }
    }

    public final void k0() {
        ArrayList arrayList;
        boolean z10;
        int i10;
        int i11;
        TLRPC.StickerSet stickerSet;
        if (this.f24859s == null) {
            return;
        }
        jv jvVar = this.e;
        if (jvVar.f32653b == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(jvVar.f32653b);
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
                if (!mediaDataController.isStickerPackInstalled(stickerSet.f20370id)) {
                    arrayList3.add(tL_messages_stickerSet);
                } else {
                    arrayList2.add(tL_messages_stickerSet);
                }
            }
        }
        final ArrayList arrayList4 = new ArrayList(arrayList3);
        if (jvVar.f32652a != null && arrayList.size() == jvVar.f32652a.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.S && z10 && this.R == null) {
            this.R = ValueAnimator.ofFloat(this.J, 1.0f);
            this.containerView.getY();
            this.R.addUpdateListener(new l6(this, 17));
            this.R.setDuration(250L);
            this.R.setInterpolator(bs.h);
            this.R.start();
        }
        this.S = z10;
        ei.v vVar = this.h;
        if (!z10) {
            vVar.setAlpha(0.0f);
        } else if (this.O >= 0) {
            int L0 = this.f24862y.L0();
            int E = this.f24857n.E(this.O);
            if (Math.abs(L0 - E) > 54) {
                if (L0 < E) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                pl0 pl0Var = this.E;
                pl0Var.f29589b = i11;
                pl0Var.c(E, (AndroidUtilities.displaySize.y / 2) - AndroidUtilities.dp(170.0f), false, false);
            } else {
                vVar.x0(E);
            }
            this.K = this.f24857n.E(this.O);
            ov ovVar = this.f24857n;
            int i14 = this.O;
            aw awVar = ovVar.f29320c;
            boolean z11 = awVar.I;
            jv jvVar2 = awVar.e;
            if (z11) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            int i15 = 0;
            while (true) {
                ArrayList[] arrayListArr = jvVar2.f32654c;
                if (i15 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i15].size();
                if (jvVar2.f32654c.length > 1) {
                    size = Math.min(awVar.f24862y.J * 2, size);
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
        sg.p0 p0Var = this.f24861x;
        TextView textView = this.f24860w;
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
                        ai.va vaVar;
                        boolean z14;
                        switch (r1) {
                            case 0:
                                ArrayList arrayList5 = arrayList4;
                                int size2 = arrayList5.size();
                                int[] iArr = new int[2];
                                int i16 = 0;
                                while (true) {
                                    int size3 = arrayList5.size();
                                    aw awVar2 = this;
                                    if (i16 < size3) {
                                        org.telegram.ui.ActionBar.o2 o2Var = awVar2.f24855c;
                                        TLObject tLObject = (TLObject) arrayList5.get(i16);
                                        if (size2 == 1) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        if (size2 > 1) {
                                            vaVar = new ai.va(awVar2, iArr, size2, arrayList5);
                                        } else {
                                            vaVar = null;
                                        }
                                        aw.g0(o2Var, tLObject, z13, vaVar, null);
                                        i16++;
                                    } else {
                                        awVar2.h0(true);
                                        if (size2 <= 1) {
                                            awVar2.dismiss();
                                            return;
                                        }
                                        return;
                                    }
                                }
                            default:
                                aw awVar3 = this;
                                awVar3.dismiss();
                                org.telegram.ui.ActionBar.o2 o2Var2 = awVar3.f24855c;
                                ArrayList<TLRPC.TL_messages_stickerSet> arrayList6 = arrayList4;
                                if (o2Var2 != null) {
                                    MediaDataController.getInstance(o2Var2.getCurrentAccount()).removeMultipleStickerSets(o2Var2.getContext(), o2Var2, arrayList6);
                                } else {
                                    for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList6.get(i17);
                                        Context context = awVar3.getContext();
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
                                awVar3.h0(false);
                                return;
                        }
                    }
                });
                m0(true);
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
                        ai.va vaVar;
                        boolean z14;
                        switch (r1) {
                            case 0:
                                ArrayList arrayList5 = arrayList2;
                                int size2 = arrayList5.size();
                                int[] iArr = new int[2];
                                int i16 = 0;
                                while (true) {
                                    int size3 = arrayList5.size();
                                    aw awVar2 = this;
                                    if (i16 < size3) {
                                        org.telegram.ui.ActionBar.o2 o2Var = awVar2.f24855c;
                                        TLObject tLObject = (TLObject) arrayList5.get(i16);
                                        if (size2 == 1) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        if (size2 > 1) {
                                            vaVar = new ai.va(awVar2, iArr, size2, arrayList5);
                                        } else {
                                            vaVar = null;
                                        }
                                        aw.g0(o2Var, tLObject, z13, vaVar, null);
                                        i16++;
                                    } else {
                                        awVar2.h0(true);
                                        if (size2 <= 1) {
                                            awVar2.dismiss();
                                            return;
                                        }
                                        return;
                                    }
                                }
                            default:
                                aw awVar3 = this;
                                awVar3.dismiss();
                                org.telegram.ui.ActionBar.o2 o2Var2 = awVar3.f24855c;
                                ArrayList<TLRPC.TL_messages_stickerSet> arrayList6 = arrayList2;
                                if (o2Var2 != null) {
                                    MediaDataController.getInstance(o2Var2.getCurrentAccount()).removeMultipleStickerSets(o2Var2.getContext(), o2Var2, arrayList6);
                                } else {
                                    for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList6.get(i17);
                                        Context context = awVar3.getContext();
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
                                awVar3.h0(false);
                                return;
                        }
                    }
                });
                m0(true);
                return;
            } else {
                textView2.setVisibility(8);
                textView.setVisibility(8);
                m0(false);
                return;
            }
        }
        p0Var.setVisibility(8);
        textView2.setVisibility(8);
        textView.setVisibility(8);
        m0(false);
    }

    public final void l0(boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.k6.f21254h5)) > 0.721f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.v(getThemedColor(org.telegram.ui.ActionBar.k6.f21462s8), 855638016)) > 0.721f) {
            z12 = true;
        }
        if (!z10) {
            z11 = z12;
        }
        AndroidUtilities.setLightStatusBar(this, z11);
    }

    public final void m0(boolean z10) {
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
        if (this.f24860w.getVisibility() == 0) {
            i10 = AndroidUtilities.dp(19.0f);
        }
        float f13 = i10;
        boolean z12 = this.H;
        ei.v vVar = this.h;
        View view = this.f24858r;
        FrameLayout frameLayout = this.f24859s;
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
            bs bsVar = bs.h;
            duration.setInterpolator(bsVar).start();
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
            translationY2.alpha(f14).setDuration(250L).setInterpolator(bsVar).start();
            ViewPropertyAnimator animate3 = vVar.animate();
            if (!z12 && !z10) {
                f15 = AndroidUtilities.dp(68.0f) - f13;
            }
            animate3.translationY(f15).setDuration(250L).setInterpolator(bsVar).start();
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
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
    }

    @Override
    public final void onBackPressed() {
        if (org.telegram.ui.ht.o().E) {
            org.telegram.ui.ht.o().m();
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
    public final void onThemeColorsChanged() {
        Boolean bool;
        try {
            super.onThemeColorsChanged();
            eq eqVar = this.F;
            if (eqVar != null) {
                eqVar.b(getThemedColor(org.telegram.ui.ActionBar.k6.Oh));
            }
            qv qvVar = this.f24856f;
            if (qvVar != null && (bool = qvVar.f30011c) != null) {
                l0(bool.booleanValue());
            }
            ViewGroup viewGroup = this.containerView;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void show() {
        int currentAccount;
        TLRPC.StickerSet stickerSet;
        super.show();
        ov ovVar = new ov(this);
        this.f24857n = ovVar;
        this.h.setAdapter(ovVar);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
        jv jvVar = this.e;
        if (!jvVar.e) {
            jvVar.e = true;
            aw awVar = jvVar.f32655f;
            int i10 = jvVar.d;
            jvVar.f32653b = new ArrayList(jvVar.f32652a.size());
            jvVar.f32654c = new ArrayList[jvVar.f32652a.size()];
            NotificationCenter.getInstance(i10).addObserver(jvVar, NotificationCenter.groupStickersDidLoad);
            boolean[] zArr = new boolean[1];
            int i11 = 0;
            while (true) {
                if (i11 < jvVar.f32654c.length) {
                    org.telegram.ui.gk gkVar = null;
                    TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(i10).getStickerSet((TLRPC.InputStickerSet) jvVar.f32652a.get(i11), null, false, new org.telegram.ui.ActionBar.m3(27, jvVar, zArr));
                    if (jvVar.f32654c.length == 1 && stickerSet2 != null && (stickerSet = stickerSet2.set) != null && !stickerSet.emojis) {
                        AndroidUtilities.runOnUIThread(new wv(jvVar, 0));
                        Context context = awVar.getContext();
                        org.telegram.ui.ActionBar.o2 o2Var = awVar.f24855c;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) jvVar.f32652a.get(i11);
                        org.telegram.ui.ActionBar.o2 o2Var2 = awVar.f24855c;
                        if (o2Var2 instanceof org.telegram.ui.sn) {
                            gkVar = ((org.telegram.ui.sn) o2Var2).Y;
                        }
                        new ty0(context, o2Var, inputStickerSet, null, gkVar, awVar.resourcesProvider).show();
                    } else {
                        jvVar.f32653b.add(stickerSet2);
                        jvVar.a(i11, stickerSet2);
                        i11++;
                    }
                } else {
                    aw awVar2 = jvVar.h;
                    awVar2.k0();
                    ei.v vVar = awVar2.h;
                    if (vVar != null && vVar.getAdapter() != null) {
                        vVar.getAdapter().l();
                    }
                }
            }
        }
        k0();
        org.telegram.ui.ActionBar.o2 o2Var3 = this.f24855c;
        if (o2Var3 == null) {
            currentAccount = UserConfig.selectedAccount;
        } else {
            currentAccount = o2Var3.getCurrentAccount();
        }
        MediaDataController.getInstance(currentAccount).checkStickers(5);
    }

    public void h0(boolean z10) {
    }

    public void i0() {
    }
}
