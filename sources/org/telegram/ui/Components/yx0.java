package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.transition.TransitionManager;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileRefController;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public class yx0 extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f33613r0 = 0;
    public View B;
    public p9 C;
    public TextView D;
    public k E;
    public final AnimatorSet[] F;
    public final View[] G;
    public eg.s2 H;
    public final org.telegram.ui.ActionBar.p2 I;
    public zi J;
    public final Activity K;
    public int L;
    public int M;
    public boolean N;
    public boolean O;
    public TLRPC.TL_messages_stickerSet P;
    public TLRPC.Document Q;
    public SendMessagesHelper.ImportingSticker R;
    public TLRPC.InputStickerSet S;
    public ArrayList T;
    public final ArrayList U;
    public ArrayList V;
    public HashMap W;
    public final String X;
    public final vx0 Y;
    public wx0 Z;
    public org.telegram.ui.i70 f33614a0;
    public Pattern f33615b;
    public int f33616b0;
    public mh.d1 f33617c;
    public int f33618c0;
    public ux0 d;
    public boolean f33619d0;
    public f2.f0 f33620e;
    public boolean f33621e0;
    public TLRPC.Document f33622f;
    public boolean f33623f0;
    public boolean f33624g0;
    public g90 h;
    public int f33625h0;
    public final a9.a f33626i0;
    public final mx0 f33627j0;
    public jp f33628k0;
    public String f33629l0;
    public int m0;
    public org.telegram.ui.ActionBar.w0 f33630n;
    public boolean f33631n0;
    public String f33632o0;
    public Runnable f33633p0;
    public ArrayList f33634q0;
    public org.telegram.ui.ActionBar.g1 f33635r;
    public k6 f33636s;
    public fg.b1 v;
    public FrameLayout f33637w;
    public FrameLayout f33638x;
    public TextView f33639y;

    public yx0(Context context, Object obj, TLObject tLObject, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, false, false);
        this.F = new AnimatorSet[2];
        this.G = new View[2];
        this.f33624g0 = true;
        this.f33626i0 = new a9.a(10);
        this.f33627j0 = new mx0(this);
        this.resourcesProvider = g6Var;
        fixNavigationBar();
        this.K = (Activity) context;
        TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputStickeredMediaPhoto.f20913id = tL_inputPhoto;
            tL_inputPhoto.f20862id = photo.f20867id;
            tL_inputPhoto.access_hash = photo.access_hash;
            byte[] bArr = photo.file_reference;
            tL_inputPhoto.file_reference = bArr;
            if (bArr == null) {
                tL_inputPhoto.file_reference = new byte[0];
            }
            tL_messages_getAttachedStickers.media = tL_inputStickeredMediaPhoto;
        } else if (tLObject instanceof TLRPC.Document) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = new TLRPC.TL_inputStickeredMediaDocument();
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputStickeredMediaDocument.f20912id = tL_inputDocument;
            tL_inputDocument.f20855id = document.f20849id;
            tL_inputDocument.access_hash = document.access_hash;
            byte[] bArr2 = document.file_reference;
            tL_inputDocument.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputDocument.file_reference = new byte[0];
            }
            tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
        }
        org.telegram.ui.xr0 xr0Var = (org.telegram.ui.xr0) this;
        this.f33618c0 = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getAttachedStickers, new lh.b1(xr0Var, obj, tL_messages_getAttachedStickers, new org.telegram.ui.lo(15, xr0Var, tL_messages_getAttachedStickers), 10));
        r0(context);
    }

    public static void A(yx0 yx0Var) {
        yx0Var.dismiss();
        MediaDataController.getInstance(yx0Var.currentAccount).toggleStickerSet(yx0Var.getContext(), yx0Var.P, 1, yx0Var.I, true, yx0Var.f33624g0);
    }

    public static void B(yx0 yx0Var) {
        yx0Var.dismiss();
        wx0 wx0Var = yx0Var.Z;
        if (wx0Var != null) {
            wx0Var.a();
        }
        if (yx0Var.S != null && !MediaDataController.getInstance(yx0Var.currentAccount).cancelRemovingStickerSet(yx0Var.S.f20863id)) {
            TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
            tL_messages_installStickerSet.stickerset = yx0Var.S;
            ConnectionsManager.getInstance(yx0Var.currentAccount).sendRequest(tL_messages_installStickerSet, new y1(yx0Var, 13));
        }
    }

    public static void C(yx0 yx0Var, int i10) {
        String str;
        org.telegram.ui.ActionBar.p2 p2Var = yx0Var.I;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = yx0Var.P;
        if (tL_messages_stickerSet != null) {
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null && stickerSet.emojis) {
                str = "https://" + MessagesController.getInstance(yx0Var.currentAccount).linkPrefix + "/addemoji/" + yx0Var.P.set.short_name;
            } else {
                str = "https://" + MessagesController.getInstance(yx0Var.currentAccount).linkPrefix + "/addstickers/" + yx0Var.P.set.short_name;
            }
            String str2 = str;
            if (i10 == 1) {
                Context context = yx0Var.K;
                if (context == null && p2Var != null) {
                    context = p2Var.getParentActivity();
                }
                if (context == null) {
                    context = yx0Var.getContext();
                }
                kx0 kx0Var = new kx0(yx0Var, context, str2, str2, yx0Var.resourcesProvider);
                if (p2Var != null) {
                    p2Var.showDialog(kx0Var);
                    if (p2Var instanceof org.telegram.ui.xn) {
                        kx0Var.setCalcMandatoryInsets(((org.telegram.ui.xn) p2Var).x9());
                        return;
                    }
                    return;
                }
                kx0Var.show();
            } else if (i10 == 2) {
                try {
                    AndroidUtilities.addToClipboard(str2);
                    new qc((FrameLayout) yx0Var.containerView, yx0Var.resourcesProvider).k(false).j();
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            } else if (i10 == 3) {
                if (yx0Var.O) {
                    yx0Var.n0();
                } else {
                    yx0Var.p0();
                }
            } else if (i10 == 4) {
                ey0.c(yx0Var.P.set, yx0Var.resourcesProvider, yx0Var.getContext(), new d(yx0Var, 20));
            } else if (i10 == 5) {
                ey0.b(yx0Var.P.set, yx0Var.resourcesProvider, yx0Var.getContext(), new jx0(yx0Var, 2));
            }
        }
    }

    public static void D(yx0 yx0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        int i10;
        org.telegram.ui.ActionBar.p2 p2Var = yx0Var.I;
        TLRPC.StickerSet stickerSet = yx0Var.P.set;
        if (stickerSet.masks) {
            i10 = 1;
        } else if (stickerSet.emojis) {
            i10 = 5;
        } else {
            i10 = 0;
        }
        try {
            if (tL_error == null) {
                if (yx0Var.f33624g0) {
                    ic.g(p2Var, new cx0(yx0Var.f33637w.getContext(), yx0Var.P, 1, 2, null, yx0Var.resourcesProvider), 1500).j();
                }
                if (tLObject instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                    MediaDataController.getInstance(yx0Var.currentAccount).processStickerSetInstallResultArchive(p2Var, true, i10, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject);
                }
            } else {
                Toast.makeText(yx0Var.getContext(), LocaleController.getString(R.string.ErrorOccurred), 0).show();
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        MediaDataController.getInstance(yx0Var.currentAccount).loadStickers(i10, false, true);
    }

    public static void E(yx0 yx0Var, TLRPC.TL_error tL_error, TLObject tLObject, MediaDataController mediaDataController) {
        TLRPC.StickerSet stickerSet;
        boolean z4 = false;
        yx0Var.f33618c0 = 0;
        if (tL_error == null) {
            nm0 nm0Var = new nm0(yx0Var, 1);
            nm0Var.addTarget(yx0Var.containerView);
            TransitionManager.beginDelayedTransition(yx0Var.container, nm0Var);
            yx0Var.f33630n.setVisibility(0);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            yx0Var.P = tL_messages_stickerSet;
            mediaDataController.putStickerSet(tL_messages_stickerSet, false);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = yx0Var.P;
            if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents.isEmpty()) {
                yx0Var.dismiss();
                return;
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = yx0Var.P;
            if (tL_messages_stickerSet3 != null && (stickerSet = tL_messages_stickerSet3.set) != null && !stickerSet.masks) {
                z4 = true;
            }
            yx0Var.f33621e0 = z4;
            yx0Var.l0();
            mediaDataController.preloadStickerSetThumb(yx0Var.P);
            yx0Var.C0();
            yx0Var.B0();
            yx0Var.A0();
            yx0Var.d.l();
            return;
        }
        yx0Var.dismiss();
        org.telegram.ui.ActionBar.p2 p2Var = yx0Var.I;
        if (p2Var != null) {
            org.telegram.messenger.y3.s(R.string.AddStickersNotFound, qc.a0(p2Var), null);
        }
    }

    public static void F(yx0 yx0Var, String str, TextView textView) {
        TLRPC.TL_stickers_checkShortName tL_stickers_checkShortName = new TLRPC.TL_stickers_checkShortName();
        tL_stickers_checkShortName.short_name = str;
        yx0Var.m0 = ConnectionsManager.getInstance(yx0Var.currentAccount).sendRequest(tL_stickers_checkShortName, new hg.y(yx0Var, str, textView, 17), 2);
    }

    public static void G(yx0 yx0Var) {
        boolean z4;
        TLRPC.StickerSet stickerSet;
        MediaDataController mediaDataController = MediaDataController.getInstance(yx0Var.currentAccount);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = yx0Var.P;
        if (tL_messages_stickerSet != null && mediaDataController.isStickerPackInstalled(tL_messages_stickerSet.set.f20870id)) {
            z4 = false;
        } else {
            z4 = true;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = yx0Var.P;
        if (tL_messages_stickerSet2 != null && (stickerSet = tL_messages_stickerSet2.set) != null && stickerSet.creator && yx0Var.f33635r == null) {
            yx0Var.f33630n.e(3, R.drawable.tabs_reorder, LocaleController.getString(R.string.StickersReorder));
            yx0Var.f33630n.e(4, R.drawable.msg_edit, LocaleController.getString(R.string.EditName));
            if (z4) {
                yx0Var.f33635r = yx0Var.f33630n.e(5, R.drawable.msg_delete, LocaleController.getString(R.string.Delete));
            } else {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, yx0Var.getContext(), yx0Var.resourcesProvider);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, yx0Var.resourcesProvider).setOnClickListener(new hx0(yx0Var, 4));
                org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.StickersDeleteForEveryone), false, yx0Var.resourcesProvider);
                int themedColor = yx0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21895q7);
                c3.c(themedColor, themedColor);
                c3.setSelectorColor(org.telegram.ui.ActionBar.k6.l1(0.1f, themedColor));
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.StickersRemoveForMe), false, yx0Var.resourcesProvider).setOnClickListener(new hx0(yx0Var, 6));
                c3.setOnClickListener(new hx0(yx0Var, 7));
                yx0Var.f33635r = yx0Var.f33630n.i(R.drawable.msg_delete, null, LocaleController.getString(R.string.Delete), actionBarPopupWindow$ActionBarPopupWindowLayout);
            }
            yx0Var.f33630n.a(-1);
            xa0 xa0Var = new xa0(yx0Var.currentAccount, yx0Var.getContext(), yx0Var.resourcesProvider, new ArrayList(), 4);
            xa0Var.setOnClickListener(new hx0(yx0Var, 8));
            xa0Var.setTag(R.id.fit_width_tag, 1);
            org.telegram.ui.ActionBar.w0 w0Var = yx0Var.f33630n;
            w0Var.o();
            w0Var.f22344b.a(xa0Var, new LinearLayout.LayoutParams(-1, -2));
            int themedColor2 = yx0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21895q7);
            yx0Var.f33635r.c(themedColor2, themedColor2);
            yx0Var.f33635r.setSelectorColor(org.telegram.ui.ActionBar.k6.l1(0.1f, themedColor2));
            if (yx0Var.f33635r.getRightIcon() != null) {
                yx0Var.f33635r.getRightIcon().setColorFilter(themedColor2);
            }
        }
        if (yx0Var.f33630n.getPopupLayout() != null) {
            yx0Var.f33630n.getPopupLayout().requestLayout();
        }
        yx0Var.f33630n.M(null, null);
    }

    public static void O(yx0 yx0Var) {
        if (yx0Var.f33617c.getChildCount() <= 0) {
            yx0Var.y0(yx0Var.f33617c.getPaddingTop());
            return;
        }
        int i10 = 0;
        View view = null;
        int i11 = -1;
        for (int i12 = 0; i12 < yx0Var.f33617c.getChildCount(); i12++) {
            View childAt = yx0Var.f33617c.getChildAt(i12);
            yx0Var.f33617c.getClass();
            int R = RecyclerView.R(childAt);
            if (i11 == -1 || i11 > R) {
                view = childAt;
                i11 = R;
            }
        }
        if (view != null && view.getTop() >= 0) {
            int top = view.getTop();
            yx0Var.v0(0, false);
            i10 = top;
        } else {
            yx0Var.v0(0, true);
        }
        yx0Var.v0(1, true);
        if (yx0Var.f33616b0 != i10) {
            yx0Var.y0(i10);
        }
    }

    public static void m(yx0 yx0Var, View view, int i10) {
        TLRPC.StickerSet stickerSet;
        String str;
        if (view instanceof rx0) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = yx0Var.P;
            org.telegram.ui.ActionBar.p2 p2Var = yx0Var.I;
            org.telegram.ui.ActionBar.g6 g6Var = yx0Var.resourcesProvider;
            if (p2Var != null) {
                Context context = p2Var.getContext();
                if (!(p2Var instanceof org.telegram.ui.xn)) {
                    ey0.a(tL_messages_stickerSet, p2Var, g6Var);
                    return;
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert3, 0, context, g6Var);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(LocaleController.getString(R.string.StickersCreateNewSticker));
                org.telegram.ui.b.h(R.drawable.menu_sticker_add, 0, arrayList3, arrayList2);
                arrayList.add(LocaleController.getString(R.string.StickersAddAnExistingSticker));
                arrayList3.add(Integer.valueOf(R.drawable.menu_sticker_select));
                arrayList2.add(1);
                org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                oh.b0 b0Var = new oh.b0(p1Var, arrayList2, tL_messages_stickerSet, p2Var, g6Var, 10);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, ((Integer) arrayList3.get(i11)).intValue(), (CharSequence) arrayList.get(i11), false, g6Var);
                    c3.setTag(Integer.valueOf(i11));
                    c3.setOnClickListener(b0Var);
                }
                p1Var.f22217c = 100;
                p1Var.f22220g = true;
                p1Var.setOutsideTouchable(true);
                p1Var.setClippingEnabled(true);
                p1Var.setAnimationStyle(R.style.PopupContextAnimation);
                p1Var.setFocusable(true);
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                p1Var.setInputMethodMode(2);
                p1Var.getContentView().setFocusableInTouchMode(true);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                p1Var.showAtLocation(view, 0, ((view.getMeasuredWidth() / 2) + iArr[0]) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() / 2), ((view.getMeasuredHeight() / 2) + iArr[1]) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() / 2));
                p1Var.b();
            }
        } else if (!yx0Var.O) {
            if (yx0Var.T != null) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) yx0Var.d.f31743f.get(i10);
                if (stickerSetCovered != null) {
                    yx0Var.dismiss();
                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                    TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                    tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                    tL_inputStickerSetID.f20863id = stickerSet2.f20870id;
                    new yx0(yx0Var.K, yx0Var.I, tL_inputStickerSetID, null, null, yx0Var.resourcesProvider).show();
                    return;
                }
                return;
            }
            ArrayList arrayList4 = yx0Var.V;
            if (arrayList4 != null) {
                if (i10 >= 0 && i10 < arrayList4.size()) {
                    SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) yx0Var.V.get(i10);
                    yx0Var.R = importingSticker;
                    if (importingSticker.validated) {
                        TextView textView = yx0Var.D;
                        textView.setText(Emoji.replaceEmoji(importingSticker.emoji, textView.getPaint().getFontMetricsInt(), false));
                        p9 p9Var = yx0Var.C;
                        ImageLocation forPath = ImageLocation.getForPath(yx0Var.R.path);
                        if (yx0Var.R.animated) {
                            str = "tgs";
                        } else {
                            str = null;
                        }
                        p9Var.m(forPath, null, null, null, null, str, 0, null);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) yx0Var.f33638x.getLayoutParams();
                        layoutParams.topMargin = yx0Var.f33616b0;
                        yx0Var.f33638x.setLayoutParams(layoutParams);
                        yx0Var.f33638x.setVisibility(0);
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ObjectAnimator.ofFloat(yx0Var.f33638x, View.ALPHA, 0.0f, 1.0f));
                        animatorSet.setDuration(200L);
                        animatorSet.start();
                        return;
                    }
                    return;
                }
                return;
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = yx0Var.P;
            if (tL_messages_stickerSet2 != null && i10 >= 0 && i10 < tL_messages_stickerSet2.documents.size()) {
                yx0Var.Q = yx0Var.P.documents.get(i10);
                int i12 = 0;
                while (true) {
                    if (i12 >= yx0Var.Q.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = yx0Var.Q.attributes.get(i12);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                        String str2 = documentAttribute.alt;
                        if (str2 != null && str2.length() > 0) {
                            TextView textView2 = yx0Var.D;
                            textView2.setText(Emoji.replaceEmoji(documentAttribute.alt, textView2.getPaint().getFontMetricsInt(), false));
                        }
                    } else {
                        i12++;
                    }
                }
                yx0Var.D.setText(Emoji.replaceEmoji(MediaDataController.getInstance(yx0Var.currentAccount).getEmojiForSticker(yx0Var.Q.f20849id), yx0Var.D.getPaint().getFontMetricsInt(), false));
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = yx0Var.P;
                if ((tL_messages_stickerSet3 == null || (stickerSet = tL_messages_stickerSet3.set) == null || !stickerSet.emojis) && !org.telegram.ui.qt.q().y(view)) {
                    yx0Var.C.getImageReceiver().setImage(ImageLocation.getForDocument(yx0Var.Q), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(yx0Var.Q.thumbs, 90), yx0Var.Q), (String) null, "webp", yx0Var.P, 1);
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) yx0Var.f33638x.getLayoutParams();
                    layoutParams2.topMargin = yx0Var.f33616b0;
                    yx0Var.f33638x.setLayoutParams(layoutParams2);
                    yx0Var.f33638x.setVisibility(0);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(yx0Var.f33638x, View.ALPHA, 0.0f, 1.0f));
                    animatorSet2.setDuration(200L);
                    animatorSet2.start();
                }
            }
        }
    }

    public static void n(yx0 yx0Var) {
        yx0Var.f33630n.n();
        ey0.b(yx0Var.P.set, yx0Var.resourcesProvider, yx0Var.getContext(), new jx0(yx0Var, 4));
    }

    public static void o(org.telegram.ui.xr0 xr0Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers) {
        xr0Var.f33618c0 = 0;
        if (tL_error == null && (tLObject instanceof Vector)) {
            Vector vector = (Vector) tLObject;
            if (vector.objects.isEmpty()) {
                xr0Var.dismiss();
                return;
            } else if (vector.objects.size() == 1) {
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                xr0Var.S = tL_inputStickerSetID;
                TLRPC.StickerSet stickerSet = ((TLRPC.StickerSetCovered) vector.objects.get(0)).set;
                tL_inputStickerSetID.f20863id = stickerSet.f20870id;
                tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                xr0Var.t0();
                return;
            } else {
                ArrayList arrayList = new ArrayList();
                xr0Var.T = arrayList;
                arrayList.addAll(vector.objects);
                xr0Var.f33617c.setLayoutParams(k7.c6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
                xr0Var.h.setVisibility(8);
                xr0Var.G[0].setVisibility(8);
                xr0Var.d.l();
                return;
            }
        }
        z4.f0(xr0Var.currentAccount, tL_error, xr0Var.I, tL_messages_getAttachedStickers, new Object[0]);
        xr0Var.dismiss();
    }

    public static void o0(org.telegram.ui.ActionBar.p2 p2Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, TLRPC.Document document) {
        org.telegram.ui.xn xnVar;
        boolean z4;
        TLRPC.StickerSet stickerSet;
        if (p2Var != null) {
            if (p2Var instanceof org.telegram.ui.xn) {
                xnVar = (org.telegram.ui.xn) p2Var;
            } else {
                xnVar = null;
            }
            org.telegram.ui.xn xnVar2 = xnVar;
            if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.creator) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (MessageObject.isStaticStickerDocument(document)) {
                ArrayList arrayList = new ArrayList();
                File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true);
                if (pathToAttach != null && pathToAttach.exists()) {
                    AndroidUtilities.runOnUIThread(new kh.h(pathToAttach, arrayList, p2Var, xnVar2, document, z4, tL_messages_stickerSet), 300L);
                    return;
                }
                return;
            }
            AndroidUtilities.runOnUIThread(new hg.j(p2Var, (Object) tL_messages_stickerSet, (Object) document, (Object) xnVar2, z4, 15), 300L);
        }
    }

    public static void p(org.telegram.ui.xr0 xr0Var, Object obj, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers, org.telegram.ui.lo loVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && obj != null) {
            FileRefController.getInstance(xr0Var.currentAccount).requestReference(obj, tL_messages_getAttachedStickers, loVar);
        } else {
            loVar.run(tLObject, tL_error);
        }
    }

    public static void q(yx0 yx0Var) {
        yx0Var.dismiss();
        MediaDataController.getInstance(yx0Var.currentAccount).toggleStickerSet(yx0Var.getContext(), yx0Var.P, 0, yx0Var.I, true, yx0Var.f33624g0);
    }

    public static void r(yx0 yx0Var) {
        yx0Var.f33630n.n();
        yx0Var.dismiss();
        MediaDataController.getInstance(yx0Var.currentAccount).toggleStickerSet(yx0Var.getContext(), yx0Var.P, 1, yx0Var.I, true, true);
    }

    public static void s(yx0 yx0Var) {
        yx0Var.dismiss();
        MediaDataController.getInstance(yx0Var.currentAccount).toggleStickerSet(yx0Var.getContext(), yx0Var.P, 1, yx0Var.I, false, false);
    }

    public static void t(yx0 yx0Var) {
        yx0Var.dismiss();
        MediaDataController.getInstance(yx0Var.currentAccount).toggleStickerSet(yx0Var.getContext(), yx0Var.P, 1, yx0Var.I, false, false);
    }

    public static boolean v(yx0 yx0Var, MotionEvent motionEvent) {
        if (yx0Var.O) {
            return false;
        }
        return org.telegram.ui.qt.q().s(motionEvent, yx0Var.f33617c, yx0Var.E, yx0Var.f33627j0, yx0Var.resourcesProvider);
    }

    public static void w(yx0 yx0Var, ArrayList arrayList, Boolean bool) {
        yx0Var.V = arrayList;
        if (arrayList.isEmpty()) {
            yx0Var.dismiss();
            return;
        }
        yx0Var.d.l();
        if (bool.booleanValue()) {
            yx0Var.W = new HashMap();
            int size = yx0Var.V.size();
            for (int i10 = 0; i10 < size; i10++) {
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) yx0Var.V.get(i10);
                yx0Var.W.put(importingSticker.path, importingSticker);
                FileLoader.getInstance(yx0Var.currentAccount).uploadFile(importingSticker.path, false, true, 67108864);
            }
        }
        yx0Var.B0();
    }

    public static void x(yx0 yx0Var, int[] iArr, EditTextBoldCursor editTextBoldCursor, TextView textView, TextView textView2, AlertDialog$Builder alertDialog$Builder) {
        int i10 = iArr[0];
        if (i10 != 1) {
            if (i10 == 0) {
                iArr[0] = 1;
                TLRPC.TL_stickers_suggestShortName tL_stickers_suggestShortName = new TLRPC.TL_stickers_suggestShortName();
                String obj = editTextBoldCursor.getText().toString();
                yx0Var.f33632o0 = obj;
                tL_stickers_suggestShortName.title = obj;
                ConnectionsManager.getInstance(yx0Var.currentAccount).sendRequest(tL_stickers_suggestShortName, new hg.e0(yx0Var, editTextBoldCursor, textView, textView2, iArr, 8));
            } else if (i10 == 2) {
                iArr[0] = 3;
                if (!yx0Var.f33631n0) {
                    AndroidUtilities.shakeView(editTextBoldCursor);
                    try {
                        editTextBoldCursor.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                SendMessagesHelper.getInstance(yx0Var.currentAccount).prepareImportStickers(yx0Var.f33632o0, yx0Var.f33629l0, yx0Var.X, yx0Var.V, new ix0(yx0Var));
                alertDialog$Builder.f21166a.I0.run();
                yx0Var.dismiss();
            }
        }
    }

    public final void A0() {
        if (this.containerView != null && !UserConfig.getInstance(this.currentAccount).isPremium()) {
            MessageObject.isPremiumEmojiPack(this.P);
        }
    }

    public final void B0() {
        int size;
        int size2;
        ArrayList<TLRPC.Document> arrayList;
        boolean z4;
        TLRPC.StickerSet stickerSet;
        String formatPluralString;
        int i10;
        int i11;
        String formatPluralString2;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet2;
        int size3;
        TLRPC.StickerSet stickerSet3;
        int size4;
        TLRPC.StickerSet stickerSet4;
        TLRPC.StickerSet stickerSet5;
        int i12;
        String string;
        int i13;
        int i14;
        int i15;
        TLRPC.StickerSet stickerSet6;
        boolean z10;
        TLRPC.StickerSet stickerSet7;
        float f10;
        if (this.h == null) {
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.P;
        int i16 = 1;
        if (tL_messages_stickerSet != null && (arrayList = tL_messages_stickerSet.documents) != null && !arrayList.isEmpty()) {
            CharSequence replaceEmoji = Emoji.replaceEmoji(this.P.set.title, this.h.getPaint().getFontMetricsInt(), false);
            try {
                if (this.f33615b == null) {
                    this.f33615b = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
                }
                Matcher matcher = this.f33615b.matcher(replaceEmoji);
                SpannableStringBuilder spannableStringBuilder = null;
                while (matcher.find()) {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder(replaceEmoji);
                    }
                    int start = matcher.start();
                    int end = matcher.end();
                    if (this.P.set.title.charAt(start) != '@') {
                        start++;
                    }
                    spannableStringBuilder.setSpan(new h4(replaceEmoji.subSequence(start + 1, end).toString(), 1, this), start, end, 0);
                }
                if (spannableStringBuilder != null) {
                    replaceEmoji = spannableStringBuilder;
                }
            } catch (Exception e6) {
                FileLog.e(e6);
            }
            this.h.setText(replaceEmoji);
            if (s0()) {
                int measuredWidth = this.f33617c.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = AndroidUtilities.displaySize.x;
                }
                ux0 ux0Var = this.d;
                if (AndroidUtilities.isTablet()) {
                    f10 = 60.0f;
                } else {
                    f10 = 45.0f;
                }
                ux0Var.d = Math.max(1, measuredWidth / AndroidUtilities.dp(f10));
            } else {
                this.d.d = 5;
            }
            this.J.y1(this.d.d);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.P;
            int i17 = -1;
            if (tL_messages_stickerSet2 != null && (stickerSet7 = tL_messages_stickerSet2.set) != null && stickerSet7.emojis && !UserConfig.getInstance(this.currentAccount).isPremium() && this.f33614a0 == null) {
                if (this.P.documents != null) {
                    for (int i18 = 0; i18 < this.P.documents.size(); i18++) {
                        if (!MessageObject.isFreeEmoji(this.P.documents.get(i18))) {
                            this.v.setVisibility(0);
                            this.f33636s.setBackground(null);
                            w0(null, null, -1);
                            this.v.a(LocaleController.getString(R.string.UnlockPremiumEmoji), new hx0(this, 0), false);
                            return;
                        }
                    }
                }
            } else {
                this.v.setVisibility(4);
            }
            MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = this.P;
            if (tL_messages_stickerSet3 != null && (stickerSet6 = tL_messages_stickerSet3.set) != null && stickerSet6.emojis) {
                ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = mediaDataController.getStickerSets(5);
                for (int i19 = 0; stickerSets != null && i19 < stickerSets.size(); i19++) {
                    if (stickerSets.get(i19) != null && stickerSets.get(i19).set != null && stickerSets.get(i19).set.f20870id == this.P.set.f20870id) {
                        z10 = true;
                        break;
                    }
                }
                z10 = false;
                z4 = !z10;
            } else if (tL_messages_stickerSet3 != null && (stickerSet = tL_messages_stickerSet3.set) != null && mediaDataController.isStickerPackInstalled(stickerSet.f20870id)) {
                z4 = false;
            } else {
                z4 = true;
            }
            org.telegram.ui.i70 i70Var = this.f33614a0;
            if (i70Var != null) {
                hx0 hx0Var = new hx0(this, 5);
                boolean z11 = i70Var.f37764a;
                if (i70Var.f37766c.K) {
                    if (z11) {
                        i15 = R.string.RemoveGroupEmojiPackSet;
                    } else {
                        i15 = R.string.SetAsGroupEmojiPackSet;
                    }
                    string = LocaleController.getString(i15);
                } else {
                    if (z11) {
                        i12 = R.string.RemoveGroupStickerSet;
                    } else {
                        i12 = R.string.SetAsGroupStickerSet;
                    }
                    string = LocaleController.getString(i12);
                }
                String str = string;
                boolean z12 = this.f33614a0.f37764a;
                if (z12) {
                    i13 = org.telegram.ui.ActionBar.k6.f21895q7;
                } else {
                    i13 = org.telegram.ui.ActionBar.k6.Sh;
                }
                if (!z12) {
                    i14 = org.telegram.ui.ActionBar.k6.Oh;
                } else {
                    i14 = -1;
                }
                if (!z12) {
                    i17 = org.telegram.ui.ActionBar.k6.Qh;
                }
                x0(hx0Var, str, i13, i14, i17);
                return;
            }
            if (z4) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = this.P;
                if (tL_messages_stickerSet4 != null && (stickerSet5 = tL_messages_stickerSet4.set) != null && stickerSet5.emojis) {
                    i16 = 5;
                } else if (tL_messages_stickerSet4 == null || (stickerSet4 = tL_messages_stickerSet4.set) == null || !stickerSet4.masks) {
                    i16 = 0;
                }
                if (!mediaDataController.areStickersLoaded(i16)) {
                    mediaDataController.checkStickers(i16);
                    x0(null, "", -1, -1, -1);
                    return;
                }
            }
            if (z4) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = this.P;
                if (tL_messages_stickerSet5 != null && (stickerSet3 = tL_messages_stickerSet5.set) != null && stickerSet3.masks) {
                    ArrayList<TLRPC.Document> arrayList3 = tL_messages_stickerSet5.documents;
                    if (arrayList3 == null) {
                        size4 = 0;
                    } else {
                        size4 = arrayList3.size();
                    }
                    formatPluralString2 = LocaleController.formatPluralString("AddManyMasksCount", size4, new Object[0]);
                } else if (tL_messages_stickerSet5 != null && (stickerSet2 = tL_messages_stickerSet5.set) != null && stickerSet2.emojis) {
                    ArrayList<TLRPC.Document> arrayList4 = tL_messages_stickerSet5.documents;
                    if (arrayList4 == null) {
                        size3 = 0;
                    } else {
                        size3 = arrayList4.size();
                    }
                    formatPluralString2 = LocaleController.formatPluralString("AddManyEmojiCount", size3, new Object[0]);
                } else {
                    if (tL_messages_stickerSet5 != null && (arrayList2 = tL_messages_stickerSet5.documents) != null) {
                        i11 = arrayList2.size();
                    } else {
                        i11 = 0;
                    }
                    formatPluralString2 = LocaleController.formatPluralString("AddManyStickersCount", i11, new Object[0]);
                }
                x0(new hx0(this, 9), formatPluralString2, org.telegram.ui.ActionBar.k6.Sh, org.telegram.ui.ActionBar.k6.Oh, org.telegram.ui.ActionBar.k6.Qh);
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet6 = this.P;
                TLRPC.StickerSet stickerSet8 = tL_messages_stickerSet6.set;
                boolean z13 = stickerSet8.creator;
                if (z13) {
                    if (this.O) {
                        i10 = R.string.Done;
                    } else {
                        i10 = R.string.EditStickers;
                    }
                    formatPluralString = LocaleController.getString(i10);
                } else if (stickerSet8.masks) {
                    formatPluralString = LocaleController.formatPluralString("RemoveManyMasksCount", tL_messages_stickerSet6.documents.size(), new Object[0]);
                } else if (stickerSet8.emojis) {
                    formatPluralString = LocaleController.formatPluralString("RemoveManyEmojiCount", tL_messages_stickerSet6.documents.size(), new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("RemoveManyStickersCount", tL_messages_stickerSet6.documents.size(), new Object[0]);
                }
                if (z13) {
                    x0(new hx0(this, 10), formatPluralString, org.telegram.ui.ActionBar.k6.Sh, org.telegram.ui.ActionBar.k6.Oh, org.telegram.ui.ActionBar.k6.Qh);
                } else {
                    String str2 = formatPluralString;
                    if (this.P.set.official) {
                        w0(new hx0(this, 11), str2, org.telegram.ui.ActionBar.k6.f21895q7);
                    } else {
                        w0(new hx0(this, 12), str2, org.telegram.ui.ActionBar.k6.f21895q7);
                    }
                }
            }
            this.d.l();
            return;
        }
        ArrayList arrayList5 = this.U;
        if (arrayList5 != null) {
            g90 g90Var = this.h;
            ArrayList arrayList6 = this.V;
            if (arrayList6 != null) {
                size = arrayList6.size();
            } else {
                size = arrayList5.size();
            }
            g90Var.setText(LocaleController.formatPluralString("Stickers", size, new Object[0]));
            HashMap hashMap = this.W;
            if (hashMap != null && !hashMap.isEmpty()) {
                w0(null, LocaleController.getString(R.string.ImportStickersProcessing), org.telegram.ui.ActionBar.k6.f21893q5);
                this.f33636s.setEnabled(false);
                return;
            }
            hx0 hx0Var2 = new hx0(this, 13);
            int i20 = R.string.ImportStickers;
            ArrayList arrayList7 = this.V;
            if (arrayList7 != null) {
                size2 = arrayList7.size();
            } else {
                size2 = arrayList5.size();
            }
            w0(hx0Var2, LocaleController.formatString("ImportStickers", i20, LocaleController.formatPluralString("Stickers", size2, new Object[0])), org.telegram.ui.ActionBar.k6.f21838n5);
            this.f33636s.setEnabled(true);
            return;
        }
        w0(new hx0(this, 14), LocaleController.getString(R.string.Close), org.telegram.ui.ActionBar.k6.f21838n5);
    }

    public final void C0() {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Point point = AndroidUtilities.displaySize;
        int min = (int) ((Math.min(point.x, point.y) / 2) / AndroidUtilities.density);
        if (this.U != null) {
            this.f33639y.setText(LocaleController.getString(R.string.ImportStickersRemove));
            this.f33639y.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21895q7));
            float f10 = min;
            this.C.setLayoutParams(k7.c6.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.D.setLayoutParams(k7.c6.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.f33639y.setVisibility(0);
            this.B.setVisibility(0);
        } else if (this.Y != null && ((tL_messages_stickerSet = this.P) == null || !tL_messages_stickerSet.set.masks)) {
            this.f33639y.setText(LocaleController.getString(R.string.SendSticker));
            float f11 = min;
            this.C.setLayoutParams(k7.c6.d(min, f11, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.D.setLayoutParams(k7.c6.d(min, f11, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.f33639y.setVisibility(0);
            this.B.setVisibility(0);
        } else {
            this.f33639y.setText(LocaleController.getString(R.string.Close));
            this.C.setLayoutParams(k7.c6.e(min, min, 17));
            this.D.setLayoutParams(k7.c6.e(min, min, 17));
            this.f33639y.setVisibility(8);
            this.B.setVisibility(8);
        }
    }

    public final void D0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.P = tL_messages_stickerSet;
        if (this.d != null) {
            C0();
            B0();
            this.d.l();
        }
        A0();
        MediaDataController.getInstance(this.currentAccount).preloadStickerSetThumb(this.P);
        l0();
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            mh.d1 d1Var = this.f33617c;
            if (d1Var != null) {
                int childCount = d1Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    this.f33617c.getChildAt(i12).invalidate();
                }
            }
        } else if (i10 == NotificationCenter.fileUploaded) {
            HashMap hashMap = this.W;
            if (hashMap != null) {
                String str = (String) objArr[0];
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) hashMap.get(str);
                if (importingSticker != null) {
                    importingSticker.uploadMedia(this.currentAccount, (TLRPC.InputFile) objArr[1], new jp(this, str, importingSticker, 23));
                }
            }
        } else if (i10 == NotificationCenter.fileUploadFailed) {
            HashMap hashMap2 = this.W;
            if (hashMap2 != null) {
                SendMessagesHelper.ImportingSticker importingSticker2 = (SendMessagesHelper.ImportingSticker) hashMap2.remove((String) objArr[0]);
                if (importingSticker2 != null) {
                    u0(importingSticker2);
                }
                if (this.W.isEmpty()) {
                    B0();
                }
            }
        } else if (i10 == NotificationCenter.stickersDidLoad) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
            if (this.S != null) {
                MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
                String str2 = this.S.short_name;
                if (str2 != null) {
                    tL_messages_stickerSet = mediaDataController.getStickerSetByName(str2);
                }
                if (tL_messages_stickerSet == null) {
                    tL_messages_stickerSet = mediaDataController.getStickerSetById(this.S.f20863id);
                }
            }
            if (tL_messages_stickerSet != null && tL_messages_stickerSet != this.P) {
                this.P = tL_messages_stickerSet;
                t0();
            }
            B0();
        }
    }

    @Override
    public void dismiss() {
        super.dismiss();
        this.f33626i0.C(false);
        Runnable runnable = this.f33633p0;
        if (runnable != null) {
            runnable.run();
        }
        if (this.f33618c0 != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f33618c0, true);
            this.f33618c0 = 0;
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        if (this.U != null) {
            ArrayList arrayList = this.V;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) this.V.get(i10);
                    if (!importingSticker.validated) {
                        FileLoader.getInstance(this.currentAccount).cancelFileUpload(importingSticker.path, false);
                    }
                    if (importingSticker.animated) {
                        new File(importingSticker.path).delete();
                    }
                }
            }
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileUploaded);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileUploadFailed);
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        t6 t6Var = new t6(this, 9);
        ViewGroup viewGroup = this.containerView;
        Drawable[] drawableArr = {this.shadowDrawable};
        int i10 = org.telegram.ui.ActionBar.k6.f21731h5;
        arrayList.add(new org.telegram.ui.ActionBar.m6(viewGroup, 0, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.containerView, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.Ii));
        yx0 yx0Var = this.d.f31745r;
        if (yx0Var.T != null) {
            org.telegram.ui.Cells.r3.a(arrayList, yx0Var.f33617c, t6Var);
        }
        View[] viewArr = this.G;
        View view = viewArr[0];
        int i11 = org.telegram.ui.ActionBar.k6.V5;
        arrayList.add(new org.telegram.ui.ActionBar.m6(view, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(viewArr[1], 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f33617c, 32768, null, null, null, null, org.telegram.ui.ActionBar.k6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.f21766j5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h, 2, null, null, null, null, org.telegram.ui.ActionBar.k6.f21784k5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f33630n, 65568, null, null, null, null, org.telegram.ui.ActionBar.k6.Ni));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f33636s, 32, null, null, null, null, i10));
        k6 k6Var = this.f33636s;
        int i12 = org.telegram.ui.ActionBar.k6.f21750i6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(k6Var, 65568, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f33636s, 4, null, null, null, null, this.f33625h0));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f33639y, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.f21838n5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f33639y, 32, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f33639y, 65568, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.k6.f21802l5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, t6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.k6.Ji));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.k6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.k6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.k6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.k6.G8));
        return arrayList;
    }

    public final void l0() {
        if (this.P != null) {
            TLRPC.TL_messages_stickerSet filterPremiumStickers = MessagesController.getInstance(this.currentAccount).filterPremiumStickers(this.P);
            this.P = filterPremiumStickers;
            if (filterPremiumStickers == null) {
                dismiss();
            }
        }
    }

    public final void m0(TextView textView, String str, boolean z4) {
        if (z4) {
            textView.setText(LocaleController.getString(R.string.ImportStickersLinkAvailable));
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21998w6));
            this.f33631n0 = true;
            this.f33629l0 = str;
            return;
        }
        jp jpVar = this.f33628k0;
        if (jpVar != null) {
            AndroidUtilities.cancelRunOnUIThread(jpVar);
            this.f33628k0 = null;
            this.f33629l0 = null;
            if (this.m0 != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.m0, true);
            }
        }
        if (TextUtils.isEmpty(str)) {
            textView.setText(LocaleController.getString(R.string.ImportStickersEnterUrlInfo));
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21893q5));
            return;
        }
        this.f33631n0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                int length = str.length();
                for (int i10 = 0; i10 < length; i10++) {
                    char charAt = str.charAt(i10);
                    if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        textView.setText(LocaleController.getString(R.string.ImportStickersEnterUrlInfo));
                        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21876p7));
                        return;
                    }
                }
            } else {
                textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalid));
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21876p7));
                return;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 32) {
                textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalidLong));
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21876p7));
                return;
            }
            textView.setText(LocaleController.getString(R.string.ImportStickersLinkChecking));
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.F6));
            this.f33629l0 = str;
            jp jpVar2 = new jp(this, str, textView, 26);
            this.f33628k0 = jpVar2;
            AndroidUtilities.runOnUIThread(jpVar2, 300L);
            return;
        }
        textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalidShort));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21876p7));
    }

    public final void n0() {
        if (!this.O) {
            return;
        }
        this.f33620e.d(null);
        this.O = false;
        this.f33626i0.C(true);
        AndroidUtilities.forEachViews((RecyclerView) this.f33617c, (h5.d) new ag.d(11));
        this.f33630n.postDelayed(new jx0(this, 0), 200L);
        this.f33636s.c(LocaleController.getString(R.string.EditStickers), true, true);
    }

    @Override
    public final void onBackPressed() {
        if (org.telegram.ui.qt.q().E) {
            org.telegram.ui.qt.q().o();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onStart() {
        super.onStart();
        ic.a((FrameLayout) this.containerView, new lh.t0(this, 9));
    }

    @Override
    public final void onStop() {
        super.onStop();
        ic.h((FrameLayout) this.containerView);
    }

    public final void p0() {
        if (this.O) {
            return;
        }
        this.f33620e.d(this.f33617c);
        this.O = true;
        a9.a aVar = this.f33626i0;
        aVar.C(false);
        Float valueOf = Float.valueOf(0.0f);
        ArrayList arrayList = (ArrayList) aVar.d;
        if (arrayList.isEmpty()) {
            for (int i10 = 0; i10 < 6; i10++) {
                arrayList.add(valueOf);
                ((ArrayList) aVar.f158e).add(valueOf);
                ((ArrayList) aVar.f159f).add(valueOf);
            }
        }
        int i11 = 0;
        for (int i12 = 6; i11 < i12; i12 = 6) {
            long nextFloat = Utilities.random.nextFloat() * 300;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, -2.0f, 0.0f, 2.0f, 0.0f);
            ofFloat.addUpdateListener(new xx0(aVar, i11, 3));
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(1);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setCurrentPlayTime(nextFloat);
            long j10 = 300;
            ofFloat.setDuration(j10);
            ofFloat.start();
            float dp = AndroidUtilities.dp(0.5f);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, dp, 0.0f, -dp, 0.0f);
            ofFloat2.addUpdateListener(new xx0(aVar, i11, 4));
            ofFloat2.setRepeatCount(-1);
            ofFloat2.setRepeatMode(1);
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setCurrentPlayTime(nextFloat);
            ofFloat2.setDuration((long) (300 * 1.2d));
            ofFloat2.start();
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, dp, 0.0f - dp, 0.0f);
            ofFloat3.addUpdateListener(new xx0(aVar, i11, 5));
            ofFloat3.setRepeatCount(-1);
            ofFloat3.setRepeatMode(1);
            ofFloat3.setInterpolator(new LinearInterpolator());
            ofFloat3.setCurrentPlayTime(nextFloat);
            ofFloat3.setDuration(j10);
            ofFloat3.start();
            ((ArrayList) aVar.f155a).add(ofFloat);
            ((ArrayList) aVar.f156b).add(ofFloat2);
            ((ArrayList) aVar.f157c).add(ofFloat3);
            i11++;
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f33617c, (h5.d) new ag.d(12));
        this.f33630n.postDelayed(new jx0(this, 1), 200L);
        this.f33636s.c(LocaleController.getString(R.string.Done), true, true);
    }

    public final void q0() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f33638x, View.ALPHA, 0.0f));
        animatorSet.setDuration(200L);
        animatorSet.addListener(new pd0(this, 16));
        animatorSet.start();
    }

    public final void r0(Context context) {
        int i10;
        px0 px0Var = new px0(this, context);
        this.containerView = px0Var;
        px0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, 0, i11, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(context);
        View[] viewArr = this.G;
        viewArr[0] = view;
        int i12 = org.telegram.ui.ActionBar.k6.V5;
        view.setBackgroundColor(getThemedColor(i12));
        viewArr[0].setAlpha(0.0f);
        viewArr[0].setVisibility(4);
        viewArr[0].setTag(1);
        this.containerView.addView(viewArr[0], layoutParams);
        mh.d1 d1Var = new mh.d1(this, context, 21);
        this.f33617c = d1Var;
        d1Var.setTag(14);
        mh.d1 d1Var2 = this.f33617c;
        getContext();
        zi ziVar = new zi(this);
        this.J = ziVar;
        d1Var2.setLayoutManager(ziVar);
        this.J.O = new lh.n5(this, 5);
        this.f33620e = new f2.f0(new qx0(this));
        mh.d1 d1Var3 = this.f33617c;
        ux0 ux0Var = new ux0(this, context);
        this.d = ux0Var;
        d1Var3.setAdapter(ux0Var);
        this.f33617c.setVerticalScrollBarEnabled(false);
        this.f33617c.i(new oh.j(6));
        this.f33617c.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.f33617c.setClipToPadding(false);
        this.f33617c.setEnabled(true);
        this.f33617c.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.k6.A5));
        this.f33617c.setOnTouchListener(new vr(this, 4));
        this.f33617c.setOnScrollListener(new nb0(this, 7));
        k kVar = new k(this, 16);
        this.E = kVar;
        this.f33617c.setOnItemClickListener(kVar);
        this.containerView.addView(this.f33617c, k7.c6.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 48.0f));
        eg.s2 s2Var = new eg.s2(this, context, 26);
        this.H = s2Var;
        this.containerView.addView(s2Var, k7.c6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.f33617c.setEmptyView(this.H);
        this.H.setOnTouchListener(new org.telegram.ui.ActionBar.s2(23));
        g90 g90Var = new g90(context, null);
        this.h = g90Var;
        g90Var.setLines(1);
        this.h.setSingleLine(true);
        this.h.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21766j5));
        this.h.setTextSize(1, 20.0f);
        this.h.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21784k5));
        this.h.setEllipsize(TextUtils.TruncateAt.END);
        this.h.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f));
        this.h.setGravity(16);
        this.h.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(this.h, k7.c6.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(org.telegram.ui.ActionBar.k6.Ji), false, this.resourcesProvider);
        this.f33630n = w0Var;
        w0Var.setLongClickEnabled(false);
        this.f33630n.setSubMenuOpenSide(2);
        this.f33630n.setIcon(R.drawable.ic_ab_other);
        this.f33630n.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.f0(getThemedColor(org.telegram.ui.ActionBar.k6.Ni), 1, -1));
        this.containerView.addView(this.f33630n, k7.c6.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        this.f33630n.e(1, R.drawable.msg_share, LocaleController.getString(R.string.StickersShare));
        this.f33630n.e(2, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink));
        this.f33630n.setOnClickListener(new hx0(this, 1));
        this.f33630n.setDelegate(new ix0(this));
        this.f33630n.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f33630n;
        if (this.S != null) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        w0Var2.setVisibility(i10);
        this.H.addView(new RadialProgressView(context, null), k7.c6.e(-2, -2, 17));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
        View view2 = new View(context);
        viewArr[1] = view2;
        view2.setBackgroundColor(getThemedColor(i12));
        this.containerView.addView(viewArr[1], layoutParams2);
        k6 k6Var = new k6(context, false, false, false);
        this.f33636s = k6Var;
        int i13 = org.telegram.ui.ActionBar.k6.f21731h5;
        int themedColor = getThemedColor(i13);
        int i14 = org.telegram.ui.ActionBar.k6.f21750i6;
        k6Var.setBackground(org.telegram.ui.ActionBar.k6.g0(themedColor, getThemedColor(i14)));
        k6 k6Var2 = this.f33636s;
        int i15 = org.telegram.ui.ActionBar.k6.f21838n5;
        this.f33625h0 = i15;
        k6Var2.setTextColor(getThemedColor(i15));
        this.f33636s.setTextSize(AndroidUtilities.dp(14.0f));
        this.f33636s.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        this.f33636s.setTypeface(AndroidUtilities.bold());
        this.f33636s.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f33637w = frameLayout;
        frameLayout.addView(this.f33636s, k7.c6.c(48.0f, -1));
        this.containerView.addView(this.f33637w, k7.c6.e(-1, -2, 83));
        fg.b1 b1Var = new fg.b1(AndroidUtilities.dp(24.0f), context, this.resourcesProvider, false);
        this.v = b1Var;
        b1Var.setIcon(R.raw.unlock_icon);
        this.v.setVisibility(4);
        this.containerView.addView(this.v, k7.c6.d(-1, 48.0f, 87, 8.0f, 0.0f, 8.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f33638x = frameLayout2;
        frameLayout2.setVisibility(8);
        this.f33638x.setSoundEffectsEnabled(false);
        this.containerView.addView(this.f33638x, k7.c6.c(-1.0f, -1));
        this.f33638x.setOnClickListener(new hx0(this, 2));
        p9 p9Var = new p9(context);
        this.C = p9Var;
        p9Var.setAspectFit(true);
        this.C.setLayerNum(7);
        this.f33638x.addView(this.C);
        TextView textView = new TextView(context);
        this.D = textView;
        textView.setTextSize(1, 30.0f);
        this.D.setGravity(85);
        this.f33638x.addView(this.D);
        TextView textView2 = new TextView(context);
        this.f33639y = textView2;
        textView2.setTextSize(1, 14.0f);
        this.f33639y.setTextColor(getThemedColor(i15));
        this.f33639y.setBackground(org.telegram.ui.ActionBar.k6.g0(getThemedColor(i13), getThemedColor(i14)));
        this.f33639y.setGravity(17);
        this.f33639y.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
        this.f33639y.setTypeface(AndroidUtilities.bold());
        this.f33638x.addView(this.f33639y, k7.c6.e(-1, 48, 83));
        this.f33639y.setOnClickListener(new hx0(this, 3));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams3.bottomMargin = AndroidUtilities.dp(48.0f);
        View view3 = new View(context);
        this.B = view3;
        view3.setBackgroundColor(getThemedColor(i12));
        this.f33638x.addView(this.B, layoutParams3);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        if (this.U != null) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploaded);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploadFailed);
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        B0();
        C0();
        A0();
        z0(false);
        this.d.l();
    }

    public final boolean s0() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.P;
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis) {
            if (tL_messages_stickerSet == null && this.N) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final void setOnDismissListener(Runnable runnable) {
        this.f33633p0 = runnable;
    }

    @Override
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
    }

    public final void t0() {
        String str;
        if (this.S != null) {
            MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
            if (this.P == null && (str = this.S.short_name) != null) {
                this.P = mediaDataController.getStickerSetByName(str);
            }
            if (this.P == null) {
                this.P = mediaDataController.getStickerSetById(this.S.f20863id);
            }
            if (this.P == null) {
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                tL_messages_getStickerSet.stickerset = this.S;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getStickerSet, new org.telegram.ui.lo(14, this, mediaDataController));
            } else {
                if (this.d != null) {
                    C0();
                    B0();
                    this.d.l();
                }
                A0();
                mediaDataController.preloadStickerSetThumb(this.P);
                l0();
            }
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.P;
        if (tL_messages_stickerSet != null) {
            this.f33621e0 = !tL_messages_stickerSet.set.masks;
        }
        l0();
    }

    public final void u0(SendMessagesHelper.ImportingSticker importingSticker) {
        int indexOf = this.V.indexOf(importingSticker);
        if (indexOf >= 0) {
            this.V.remove(indexOf);
            this.d.u(indexOf);
            if (this.V.isEmpty()) {
                dismiss();
            } else {
                B0();
            }
        }
    }

    public final void v0(int i10, boolean z4) {
        Integer num;
        float f10;
        if (this.T == null) {
            View[] viewArr = this.G;
            if ((z4 && viewArr[i10].getTag() != null) || (!z4 && viewArr[i10].getTag() == null)) {
                View view = viewArr[i10];
                if (z4) {
                    num = null;
                } else {
                    num = 1;
                }
                view.setTag(num);
                if (z4) {
                    viewArr[i10].setVisibility(0);
                }
                AnimatorSet[] animatorSetArr = this.F;
                AnimatorSet animatorSet = animatorSetArr[i10];
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[i10] = animatorSet2;
                View view2 = viewArr[i10];
                Property property = View.ALPHA;
                if (z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                animatorSet2.playTogether(ObjectAnimator.ofFloat(view2, property, f10));
                animatorSetArr[i10].setDuration(150L);
                animatorSetArr[i10].addListener(new da0(this, i10, z4, 1));
                animatorSetArr[i10].start();
            }
        }
    }

    public final void w0(View.OnClickListener onClickListener, String str, int i10) {
        x0(onClickListener, str, i10, -1, -1);
    }

    public final void x0(View.OnClickListener onClickListener, String str, int i10, int i11, int i12) {
        if (i10 >= 0) {
            k6 k6Var = this.f33636s;
            this.f33625h0 = i10;
            k6Var.setTextColor(getThemedColor(i10));
        }
        this.f33636s.c(str, false, true);
        this.f33636s.setOnClickListener(onClickListener);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f33636s.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.G[1].getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f33617c.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.H.getLayoutParams();
        if (onClickListener == null) {
            this.f33636s.setAlpha(0.0f);
        } else if (i11 >= 0 && i12 >= 0) {
            k6 k6Var2 = this.f33636s;
            int dp = AndroidUtilities.dp(24.0f);
            int themedColor = getThemedColor(i11);
            int themedColor2 = getThemedColor(i12);
            k6Var2.setBackground(org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, themedColor, themedColor2, themedColor2));
            this.f33637w.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21731h5));
            int dp2 = AndroidUtilities.dp(8.0f);
            marginLayoutParams.bottomMargin = dp2;
            marginLayoutParams.rightMargin = dp2;
            marginLayoutParams.topMargin = dp2;
            marginLayoutParams.leftMargin = dp2;
            int dp3 = AndroidUtilities.dp(64.0f);
            marginLayoutParams2.bottomMargin = dp3;
            marginLayoutParams3.bottomMargin = dp3;
            marginLayoutParams4.bottomMargin = dp3;
            if (this.f33636s.getAlpha() < 1.0f) {
                org.telegram.ui.b.p(this.f33636s.animate().alpha(1.0f), pr.h, 240L);
            }
        } else {
            this.f33636s.setBackground(org.telegram.ui.ActionBar.k6.g0(getThemedColor(org.telegram.ui.ActionBar.k6.f21731h5), org.telegram.ui.ActionBar.k6.l1(0.1f, getThemedColor(org.telegram.ui.ActionBar.k6.f21895q7))));
            this.f33637w.setBackgroundColor(0);
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            int dp4 = AndroidUtilities.dp(48.0f);
            marginLayoutParams2.bottomMargin = dp4;
            marginLayoutParams3.bottomMargin = dp4;
            marginLayoutParams4.bottomMargin = dp4;
            if (this.f33636s.getAlpha() < 1.0f) {
                org.telegram.ui.b.p(this.f33636s.animate().alpha(1.0f), pr.h, 240L);
            }
        }
        this.containerView.requestLayout();
    }

    public final void y0(int i10) {
        this.f33616b0 = i10;
        if (this.T == null) {
            float f10 = i10;
            this.h.setTranslationY(f10);
            if (this.U == null) {
                this.f33630n.setTranslationY(f10);
            }
            this.G[0].setTranslationY(f10);
        }
        this.containerView.invalidate();
    }

    public final void z0(boolean z4) {
        yx0 yx0Var = this.d.f31745r;
        if (yx0Var.T != null) {
            int childCount = yx0Var.f33617c.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = yx0Var.f33617c.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.r3) {
                    ((org.telegram.ui.Cells.r3) childAt).d();
                }
            }
        }
        this.h.setHighlightColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21802l5));
        this.f33638x.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21731h5) & (-536870913));
        this.f33630n.setIconColor(getThemedColor(org.telegram.ui.ActionBar.k6.Ji));
        this.f33630n.G(getThemedColor(org.telegram.ui.ActionBar.k6.E8), false);
        this.f33630n.G(getThemedColor(org.telegram.ui.ActionBar.k6.F8), true);
        this.f33630n.setPopupItemsSelectorColor(getThemedColor(org.telegram.ui.ActionBar.k6.I5));
        this.f33630n.B(getThemedColor(org.telegram.ui.ActionBar.k6.G8));
        if (this.f33635r != null) {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21895q7);
            this.f33635r.c(themedColor, themedColor);
            this.f33635r.setSelectorColor(org.telegram.ui.ActionBar.k6.l1(0.1f, themedColor));
            if (this.f33635r.getRightIcon() != null) {
                this.f33635r.getRightIcon().setColorFilter(themedColor);
            }
        }
        if (z4) {
            if (org.telegram.ui.ActionBar.k6.sl != null && this.f33634q0 == null) {
                ArrayList themeDescriptions = getThemeDescriptions();
                this.f33634q0 = themeDescriptions;
                int size = themeDescriptions.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((org.telegram.ui.ActionBar.m6) this.f33634q0.get(i11)).h = null;
                }
            }
            int size2 = this.f33634q0.size();
            for (int i12 = 0; i12 < size2; i12++) {
                org.telegram.ui.ActionBar.m6 m6Var = (org.telegram.ui.ActionBar.m6) this.f33634q0.get(i12);
                m6Var.d(getThemedColor(m6Var.f22143f), false, false);
            }
        }
        if (org.telegram.ui.ActionBar.k6.sl == null && this.f33634q0 != null) {
            this.f33634q0 = null;
        }
    }

    public yx0(Context context, String str, ArrayList arrayList, ArrayList arrayList2) {
        super(context, null, false, false);
        this.F = new AnimatorSet[2];
        this.G = new View[2];
        this.f33624g0 = true;
        this.f33626i0 = new a9.a(10);
        this.f33627j0 = new mx0(this);
        fixNavigationBar();
        this.K = (Activity) context;
        this.U = arrayList;
        this.X = str;
        Utilities.globalQueue.postRunnable(new jp(this, arrayList, arrayList2, 27));
        r0(context);
    }

    public yx0(Context context, org.telegram.ui.ActionBar.p2 p2Var, TLRPC.InputStickerSet inputStickerSet, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, vx0 vx0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, false, false);
        this.F = new AnimatorSet[2];
        this.G = new View[2];
        this.f33624g0 = true;
        this.f33626i0 = new a9.a(10);
        this.f33627j0 = new mx0(this);
        fixNavigationBar();
        this.Y = vx0Var;
        this.S = inputStickerSet;
        this.P = tL_messages_stickerSet;
        this.I = p2Var;
        t0();
        r0(context);
    }
}
