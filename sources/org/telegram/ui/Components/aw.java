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
public class aw extends org.telegram.ui.ActionBar.k3 implements NotificationCenter.NotificationCenterDelegate {
    public static Pattern V;
    public final pl0 E;
    public final gq F;
    public org.telegram.ui.ActionBar.o1 G;
    public final boolean H;
    public boolean I;
    public float J;
    public int K;
    public int L;
    public final h6 M;
    public final jv N;
    public int O;
    public boolean P;
    public long Q;
    public ValueAnimator R;
    public boolean S;
    public PorterDuffColorFilter T;
    public int U;
    public LongSparseArray f26623b;
    public final org.telegram.ui.ActionBar.r2 f26624c;
    public final vn d;
    public final kv e;
    public final qv f26625f;
    public final fi.v h;
    public ov f26626n;
    public final View f26627r;
    public final FrameLayout f26628s;
    public final TextView v;
    public final TextView f26629w;
    public final tg.p0 f26630x;
    public final s4.t f26631y;

    public aw(org.telegram.ui.ActionBar.r2 r21, android.content.Context r22, org.telegram.ui.ActionBar.u6 r23, java.util.ArrayList r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.aw.<init>(org.telegram.ui.ActionBar.r2, android.content.Context, org.telegram.ui.ActionBar.u6, java.util.ArrayList):void");
    }

    public static void Z(aw awVar, int i10) {
        ArrayList arrayList;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        String str;
        Context context;
        org.telegram.ui.ActionBar.r2 r2Var = awVar.f26624c;
        kv kvVar = awVar.e;
        if (kvVar != null && (arrayList = kvVar.f34825b) != null && !arrayList.isEmpty()) {
            TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) kvVar.f34825b.get(0)).set;
            if (stickerSet != null && stickerSet.emojis) {
                str = "https://" + MessagesController.getInstance(awVar.currentAccount).linkPrefix + "/addemoji/" + tL_messages_stickerSet.set.short_name;
            } else {
                str = "https://" + MessagesController.getInstance(awVar.currentAccount).linkPrefix + "/addstickers/" + tL_messages_stickerSet.set.short_name;
            }
            String str2 = str;
            if (i10 == 1) {
                if (r2Var != null) {
                    context = r2Var.getParentActivity();
                } else {
                    context = null;
                }
                if (context == null) {
                    context = awVar.getContext();
                }
                nv nvVar = new nv(awVar, context, str2, str2, awVar.resourcesProvider);
                if (r2Var != null) {
                    r2Var.showDialog(nvVar);
                } else {
                    nvVar.show();
                }
            } else if (i10 == 2) {
                try {
                    AndroidUtilities.addToClipboard(str2);
                    new wc((FrameLayout) awVar.containerView, awVar.resourcesProvider).k(false).j();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
    }

    public static void g0(final org.telegram.ui.ActionBar.r2 r2Var, TLObject tLObject, final boolean z10, final bi.ua uaVar, final bq bqVar) {
        int currentAccount;
        final View fragmentView;
        final TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (r2Var == null) {
            currentAccount = UserConfig.selectedAccount;
        } else {
            currentAccount = r2Var.getCurrentAccount();
        }
        final int i10 = currentAccount;
        TLRPC.StickerSet stickerSet = null;
        if (r2Var == null) {
            fragmentView = null;
        } else {
            fragmentView = r2Var.getFragmentView();
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
                if (MediaDataController.getInstance(i10).cancelRemovingStickerSet(stickerSet2.f22054id)) {
                    if (uaVar != null) {
                        uaVar.run(Boolean.TRUE);
                        return;
                    }
                    return;
                }
                TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                tL_messages_installStickerSet.stickerset = tL_inputStickerSetID;
                tL_inputStickerSetID.f22047id = stickerSet2.f22054id;
                tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_installStickerSet, new RequestDelegate() {
                    @Override
                    public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                        final TLRPC.StickerSet stickerSet3 = TLRPC.StickerSet.this;
                        final boolean z11 = z10;
                        final View view = fragmentView;
                        final org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        final TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                        final int i11 = i10;
                        final Utilities.Callback callback = uaVar;
                        final Runnable runnable = bqVar;
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
                                org.telegram.ui.ActionBar.r2 r2Var3 = r2Var2;
                                int i13 = i11;
                                Utilities.Callback callback2 = callback;
                                try {
                                    if (tL_error2 == null) {
                                        if (z11 && view2 != null) {
                                            Context context = r2Var3.getFragmentView().getContext();
                                            TLObject tLObject5 = tL_messages_stickerSet2;
                                            if (tLObject5 == null) {
                                                tLObject3 = stickerSet4;
                                            } else {
                                                tLObject3 = tLObject5;
                                            }
                                            qc.g(r2Var3, new gy0(context, tLObject3, 1, 2, null, r2Var3.getResourceProvider()), 1500).j();
                                        }
                                        if (tLObject4 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                                            MediaDataController.getInstance(i13).processStickerSetInstallResultArchive(r2Var3, true, i12, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject4);
                                        }
                                        if (callback2 != null) {
                                            callback2.run(Boolean.TRUE);
                                        }
                                    } else if (view2 != null) {
                                        Toast.makeText(r2Var3.getFragmentView().getContext(), LocaleController.getString(R.string.ErrorOccurred), 0).show();
                                        if (callback2 != null) {
                                            callback2.run(Boolean.FALSE);
                                        }
                                    } else if (callback2 != null) {
                                        callback2.run(Boolean.FALSE);
                                    }
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                                MediaDataController.getInstance(i13).loadStickers(i12, false, true, false, new b3(runnable, 5));
                            }
                        });
                    }
                });
            }
        }
    }

    public static boolean m(aw awVar, hn hnVar, MotionEvent motionEvent) {
        return org.telegram.ui.ft.o().q(motionEvent, awVar.h, hnVar, awVar.N, awVar.resourcesProvider);
    }

    public static void n(aw awVar, ArrayList arrayList, org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.ActionBar.u6 u6Var, View view, int i10) {
        kv kvVar = awVar.e;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        int i11 = 0;
        if (arrayList != null && arrayList.size() > 1) {
            if (SystemClock.elapsedRealtime() - awVar.Q >= 250) {
                int i12 = 0;
                while (true) {
                    ArrayList[] arrayListArr = kvVar.f34826c;
                    if (i11 >= arrayListArr.length) {
                        break;
                    }
                    int size = arrayListArr[i11].size();
                    if (kvVar.f34826c.length > 1) {
                        size = Math.min(awVar.f26631y.J * 2, size);
                    }
                    i12 += size + 2;
                    if (i10 < i12) {
                        break;
                    }
                    i11++;
                }
                ArrayList arrayList2 = kvVar.f34825b;
                if (arrayList2 != null && i11 < arrayList2.size()) {
                    tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) kvVar.f34825b.get(i11);
                }
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    ArrayList arrayList3 = new ArrayList();
                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    tL_inputStickerSetID.f22047id = stickerSet.f22054id;
                    tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                    arrayList3.add(tL_inputStickerSetID);
                    new lv(awVar, r2Var, awVar.getContext(), u6Var, arrayList3).show();
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.o1 o1Var = awVar.G;
        if (o1Var != null) {
            o1Var.d(true);
            awVar.G = null;
        } else if ((r2Var instanceof org.telegram.ui.un) && ((org.telegram.ui.un) r2Var).Y.getVisibility() == 0 && (view instanceof rv)) {
            c6 c6Var = ((rv) view).f32340c;
            try {
                TLRPC.Document document = c6Var.document;
                if (document == null) {
                    document = t5.f(awVar.currentAccount, c6Var.getDocumentId());
                }
                SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(document));
                spannableString.setSpan(c6Var, 0, spannableString.length(), 33);
                ((org.telegram.ui.un) r2Var).Y.E0.getText().append((CharSequence) spannableString);
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

    public static void o(aw awVar, c6 c6Var) {
        org.telegram.ui.ActionBar.o1 o1Var = awVar.G;
        if (o1Var != null) {
            o1Var.d(true);
            awVar.G = null;
            SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(t5.f(awVar.currentAccount, c6Var.getDocumentId())));
            spannableString.setSpan(c6Var, 0, spannableString.length(), 33);
            if (AndroidUtilities.addToClipboard(spannableString)) {
                org.telegram.messenger.vh.m(R.string.EmojiCopied, new wc((FrameLayout) awVar.containerView, awVar.resourcesProvider));
            }
        }
    }

    public static void p(aw awVar, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        awVar.J = floatValue;
        awVar.h.setAlpha(floatValue);
        awVar.v.setAlpha(awVar.J);
        awVar.f26629w.setAlpha(awVar.J);
        awVar.containerView.invalidate();
    }

    public static boolean q(aw awVar, Context context, View view) {
        c6 c6Var;
        if (!(view instanceof rv) || (c6Var = ((rv) view).f32340c) == null) {
            return false;
        }
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(awVar.getContext(), true, true);
        g1Var.setItemHeight(48);
        g1Var.setPadding(AndroidUtilities.dp(26.0f), 0, AndroidUtilities.dp(26.0f), 0);
        g1Var.setText(LocaleController.getString(R.string.Copy));
        g1Var.getTextView().setTextSize(1, 14.4f);
        g1Var.getTextView().setTypeface(AndroidUtilities.bold());
        g1Var.setOnClickListener(new ga(13, awVar, c6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        Drawable mutate = awVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
        org.telegram.ui.ActionBar.f7.y(linearLayout, mutate, org.telegram.ui.ActionBar.y6.G8, awVar.resourcesProvider, PorterDuff.Mode.MULTIPLY);
        linearLayout.setBackground(mutate);
        linearLayout.addView(g1Var);
        org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(linearLayout, -2, -2);
        awVar.G = o1Var;
        o1Var.setClippingEnabled(true);
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

    public static ViewGroup s(aw awVar) {
        return awVar.containerView;
    }

    public static ViewGroup t(aw awVar) {
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
                fi.v vVar = this.h;
                if (i12 < vVar.getChildCount()) {
                    View childAt = vVar.getChildAt(i12);
                    if ((childAt instanceof vv) && (tL_messages_stickerSet = (vvVar = (vv) childAt).f34266r) != null && tL_messages_stickerSet.set != null) {
                        vvVar.a(MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(vvVar.f34266r.set.f22054id), true);
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
        qv qvVar = this.f26625f;
        if (qvVar != null && qvVar.f32034w) {
            qvVar.f32034w = false;
            qvVar.invalidate();
        }
        super.dismiss();
        kv kvVar = this.e;
        if (kvVar != null) {
            NotificationCenter.getInstance(kvVar.d).removeObserver(kvVar, NotificationCenter.groupStickersDidLoad);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
    }

    public final int f0() {
        if (this.containerView == null) {
            return 0;
        }
        fi.v vVar = this.h;
        if (vVar != null && vVar.getChildCount() >= 1) {
            View childAt = vVar.getChildAt(0);
            vn vnVar = this.d;
            if (childAt != vnVar) {
                return this.containerView.getPaddingTop();
            }
            return vnVar.getBottom() + ((int) vVar.getY());
        }
        return this.containerView.getPaddingTop();
    }

    @Override
    public final int getContainerViewHeight() {
        int measuredHeight;
        int i10 = 0;
        fi.v vVar = this.h;
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
        org.telegram.ui.ActionBar.r2 r2Var = this.f26624c;
        if (r2Var != null) {
            new tg.y0(r2Var, 11, false).show();
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
        if (this.f26628s == null) {
            return;
        }
        kv kvVar = this.e;
        if (kvVar.f34825b == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(kvVar.f34825b);
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
                if (!mediaDataController.isStickerPackInstalled(stickerSet.f22054id)) {
                    arrayList3.add(tL_messages_stickerSet);
                } else {
                    arrayList2.add(tL_messages_stickerSet);
                }
            }
        }
        final ArrayList arrayList4 = new ArrayList(arrayList3);
        if (kvVar.f34824a != null && arrayList.size() == kvVar.f34824a.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.S && z10 && this.R == null) {
            this.R = ValueAnimator.ofFloat(this.J, 1.0f);
            this.containerView.getY();
            this.R.addUpdateListener(new n6(this, 17));
            this.R.setDuration(250L);
            this.R.setInterpolator(ds.h);
            this.R.start();
        }
        this.S = z10;
        fi.v vVar = this.h;
        if (!z10) {
            vVar.setAlpha(0.0f);
        } else if (this.O >= 0) {
            int L0 = this.f26631y.L0();
            int E = this.f26626n.E(this.O);
            if (Math.abs(L0 - E) > 54) {
                if (L0 < E) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                pl0 pl0Var = this.E;
                pl0Var.f31595b = i11;
                pl0Var.c(E, (AndroidUtilities.displaySize.y / 2) - AndroidUtilities.dp(170.0f), false, false);
            } else {
                vVar.y0(E);
            }
            this.K = this.f26626n.E(this.O);
            ov ovVar = this.f26626n;
            int i14 = this.O;
            aw awVar = ovVar.f31379c;
            boolean z11 = awVar.I;
            kv kvVar2 = awVar.e;
            if (z11) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            int i15 = 0;
            while (true) {
                ArrayList[] arrayListArr = kvVar2.f34826c;
                if (i15 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i15].size();
                if (kvVar2.f34826c.length > 1) {
                    size = Math.min(awVar.f26631y.J * 2, size);
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
        tg.p0 p0Var = this.f26630x;
        TextView textView = this.f26629w;
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
                        bi.ua uaVar;
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
                                        org.telegram.ui.ActionBar.r2 r2Var = awVar2.f26624c;
                                        TLObject tLObject = (TLObject) arrayList5.get(i16);
                                        if (size2 == 1) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        if (size2 > 1) {
                                            uaVar = new bi.ua(awVar2, iArr, size2, arrayList5);
                                        } else {
                                            uaVar = null;
                                        }
                                        aw.g0(r2Var, tLObject, z13, uaVar, null);
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
                                org.telegram.ui.ActionBar.r2 r2Var2 = awVar3.f26624c;
                                ArrayList<TLRPC.TL_messages_stickerSet> arrayList6 = arrayList4;
                                if (r2Var2 != null) {
                                    MediaDataController.getInstance(r2Var2.getCurrentAccount()).removeMultipleStickerSets(r2Var2.getContext(), r2Var2, arrayList6);
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
                        bi.ua uaVar;
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
                                        org.telegram.ui.ActionBar.r2 r2Var = awVar2.f26624c;
                                        TLObject tLObject = (TLObject) arrayList5.get(i16);
                                        if (size2 == 1) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        if (size2 > 1) {
                                            uaVar = new bi.ua(awVar2, iArr, size2, arrayList5);
                                        } else {
                                            uaVar = null;
                                        }
                                        aw.g0(r2Var, tLObject, z13, uaVar, null);
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
                                org.telegram.ui.ActionBar.r2 r2Var2 = awVar3.f26624c;
                                ArrayList<TLRPC.TL_messages_stickerSet> arrayList6 = arrayList2;
                                if (r2Var2 != null) {
                                    MediaDataController.getInstance(r2Var2.getCurrentAccount()).removeMultipleStickerSets(r2Var2.getContext(), r2Var2, arrayList6);
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
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.y6.f23425h5)) > 0.721f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.v(getThemedColor(org.telegram.ui.ActionBar.y6.f23634s8), 855638016)) > 0.721f) {
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
        if (this.f26629w.getVisibility() == 0) {
            i10 = AndroidUtilities.dp(19.0f);
        }
        float f13 = i10;
        boolean z12 = this.H;
        fi.v vVar = this.h;
        View view = this.f26627r;
        FrameLayout frameLayout = this.f26628s;
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
            ds dsVar = ds.h;
            duration.setInterpolator(dsVar).start();
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
            translationY2.alpha(f14).setDuration(250L).setInterpolator(dsVar).start();
            ViewPropertyAnimator animate3 = vVar.animate();
            if (!z12 && !z10) {
                f15 = AndroidUtilities.dp(68.0f) - f13;
            }
            animate3.translationY(f15).setDuration(250L).setInterpolator(dsVar).start();
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
        if (org.telegram.ui.ft.o().E) {
            org.telegram.ui.ft.o().m();
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
            gq gqVar = this.F;
            if (gqVar != null) {
                gqVar.b(getThemedColor(org.telegram.ui.ActionBar.y6.Oh));
            }
            qv qvVar = this.f26625f;
            if (qvVar != null && (bool = qvVar.f32029c) != null) {
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
        this.f26626n = ovVar;
        this.h.setAdapter(ovVar);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
        kv kvVar = this.e;
        if (!kvVar.e) {
            kvVar.e = true;
            aw awVar = kvVar.f34827f;
            int i10 = kvVar.d;
            kvVar.f34825b = new ArrayList(kvVar.f34824a.size());
            kvVar.f34826c = new ArrayList[kvVar.f34824a.size()];
            NotificationCenter.getInstance(i10).addObserver(kvVar, NotificationCenter.groupStickersDidLoad);
            boolean[] zArr = new boolean[1];
            int i11 = 0;
            while (true) {
                if (i11 < kvVar.f34826c.length) {
                    org.telegram.ui.hk hkVar = null;
                    TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(i10).getStickerSet((TLRPC.InputStickerSet) kvVar.f34824a.get(i11), null, false, new li.s2(29, kvVar, zArr));
                    if (kvVar.f34826c.length == 1 && stickerSet2 != null && (stickerSet = stickerSet2.set) != null && !stickerSet.emojis) {
                        AndroidUtilities.runOnUIThread(new wv(kvVar, 0));
                        Context context = awVar.getContext();
                        org.telegram.ui.ActionBar.r2 r2Var = awVar.f26624c;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) kvVar.f34824a.get(i11);
                        org.telegram.ui.ActionBar.r2 r2Var2 = awVar.f26624c;
                        if (r2Var2 instanceof org.telegram.ui.un) {
                            hkVar = ((org.telegram.ui.un) r2Var2).Y;
                        }
                        new cz0(context, r2Var, inputStickerSet, null, hkVar, awVar.resourcesProvider).show();
                    } else {
                        kvVar.f34825b.add(stickerSet2);
                        kvVar.a(i11, stickerSet2);
                        i11++;
                    }
                } else {
                    aw awVar2 = kvVar.h;
                    awVar2.k0();
                    fi.v vVar = awVar2.h;
                    if (vVar != null && vVar.getAdapter() != null) {
                        vVar.getAdapter().l();
                    }
                }
            }
        }
        k0();
        org.telegram.ui.ActionBar.r2 r2Var3 = this.f26624c;
        if (r2Var3 == null) {
            currentAccount = UserConfig.selectedAccount;
        } else {
            currentAccount = r2Var3.getCurrentAccount();
        }
        MediaDataController.getInstance(currentAccount).checkStickers(5);
    }

    public void i0() {
    }

    public void h0(boolean z10) {
    }
}
