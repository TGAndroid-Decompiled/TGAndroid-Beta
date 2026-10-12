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
public class dz0 extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f25481u0 = 0;
    public View E;
    public y9 F;
    public TextView G;
    public j H;
    public final AnimatorSet[] I;
    public final View[] J;
    public ai.f0 K;
    public final org.telegram.ui.ActionBar.m2 L;
    public bi.l M;
    public final Activity N;
    public int O;
    public int P;
    public boolean Q;
    public boolean R;
    public TLRPC.TL_messages_stickerSet S;
    public TLRPC.Document T;
    public SendMessagesHelper.ImportingSticker U;
    public TLRPC.InputStickerSet V;
    public ArrayList W;
    public final ArrayList X;
    public ArrayList Y;
    public HashMap Z;
    public final String f25482a0;
    public Pattern f25483b;
    public final az0 f25484b0;
    public ai.w0 f25485c;
    public bz0 f25486c0;
    public zy0 d;
    public org.telegram.ui.p70 f25487d0;
    public s4.z f25488e;
    public int f25489e0;
    public TLRPC.Document f25490f;
    public int f25491f0;
    public boolean f25492g0;
    public ia0 h;
    public boolean f25493h0;
    public boolean f25494i0;
    public boolean f25495j0;
    public int f25496k0;
    public final com.google.firebase.messaging.n f25497l0;
    public final sy0 m0;
    public org.telegram.ui.ActionBar.u0 f25498n;
    public mh0 f25499n0;
    public String f25500o0;
    public int f25501p0;
    public boolean f25502q0;
    public org.telegram.ui.ActionBar.e1 f25503r;
    public String f25504r0;
    public r6 f25505s;
    public Runnable f25506s0;
    public ArrayList f25507t0;
    public rg.q0 v;
    public FrameLayout f25508w;
    public FrameLayout f25509x;
    public TextView f25510y;

    public dz0(Context context, Object obj, TLObject tLObject, org.telegram.ui.ActionBar.c6 c6Var) {
        super(1, context, c6Var, false);
        this.I = new AnimatorSet[2];
        this.J = new View[2];
        this.f25495j0 = true;
        this.f25497l0 = new com.google.firebase.messaging.n(6);
        this.m0 = new sy0(this);
        this.resourcesProvider = c6Var;
        fixNavigationBar();
        this.N = (Activity) context;
        TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputStickeredMediaPhoto.f19873id = tL_inputPhoto;
            tL_inputPhoto.f19822id = photo.f19827id;
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
            tL_inputStickeredMediaDocument.f19872id = tL_inputDocument;
            tL_inputDocument.f19815id = document.f19809id;
            tL_inputDocument.access_hash = document.access_hash;
            byte[] bArr2 = document.file_reference;
            tL_inputDocument.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputDocument.file_reference = new byte[0];
            }
            tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
        }
        org.telegram.ui.ts0 ts0Var = (org.telegram.ui.ts0) this;
        this.f25491f0 = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getAttachedStickers, new ai.q3(ts0Var, obj, tL_messages_getAttachedStickers, new org.telegram.ui.so(15, ts0Var, tL_messages_getAttachedStickers), 7));
        s0(context);
    }

    public static void B(dz0 dz0Var) {
        dz0Var.dismiss();
        MediaDataController.getInstance(dz0Var.currentAccount).toggleStickerSet(dz0Var.getContext(), dz0Var.S, 1, dz0Var.L, true, dz0Var.f25495j0);
    }

    public static void D(dz0 dz0Var) {
        dz0Var.dismiss();
        bz0 bz0Var = dz0Var.f25486c0;
        if (bz0Var != null) {
            bz0Var.a();
        }
        if (dz0Var.V != null && !MediaDataController.getInstance(dz0Var.currentAccount).cancelRemovingStickerSet(dz0Var.V.f19823id)) {
            TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
            tL_messages_installStickerSet.stickerset = dz0Var.V;
            ConnectionsManager.getInstance(dz0Var.currentAccount).sendRequest(tL_messages_installStickerSet, new y1(dz0Var, 13));
        }
    }

    public static void E(dz0 dz0Var, int i10) {
        String str;
        org.telegram.ui.ActionBar.m2 m2Var = dz0Var.L;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = dz0Var.S;
        if (tL_messages_stickerSet != null) {
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null && stickerSet.emojis) {
                str = "https://" + MessagesController.getInstance(dz0Var.currentAccount).linkPrefix + "/addemoji/" + dz0Var.S.set.short_name;
            } else {
                str = "https://" + MessagesController.getInstance(dz0Var.currentAccount).linkPrefix + "/addstickers/" + dz0Var.S.set.short_name;
            }
            String str2 = str;
            if (i10 == 1) {
                Context context = dz0Var.N;
                if (context == null && m2Var != null) {
                    context = m2Var.getParentActivity();
                }
                if (context == null) {
                    context = dz0Var.getContext();
                }
                qy0 qy0Var = new qy0(dz0Var, context, str2, str2, dz0Var.resourcesProvider);
                if (m2Var != null) {
                    m2Var.showDialog(qy0Var);
                    if (m2Var instanceof org.telegram.ui.eo) {
                        qy0Var.setCalcMandatoryInsets(((org.telegram.ui.eo) m2Var).C9());
                        return;
                    }
                    return;
                }
                qy0Var.show();
            } else if (i10 == 2) {
                try {
                    AndroidUtilities.addToClipboard(str2);
                    new zc((FrameLayout) dz0Var.containerView, dz0Var.resourcesProvider).k(false).j();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            } else if (i10 == 3) {
                if (dz0Var.R) {
                    dz0Var.o0();
                } else {
                    dz0Var.q0();
                }
            } else if (i10 == 4) {
                iz0.c(dz0Var.S.set, dz0Var.resourcesProvider, dz0Var.getContext(), new d(dz0Var, 20));
            } else if (i10 == 5) {
                iz0.b(dz0Var.S.set, dz0Var.resourcesProvider, dz0Var.getContext(), new oy0(dz0Var, 2));
            }
        }
    }

    public static void F(dz0 dz0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        int i10;
        org.telegram.ui.ActionBar.m2 m2Var = dz0Var.L;
        TLRPC.StickerSet stickerSet = dz0Var.S.set;
        if (stickerSet.masks) {
            i10 = 1;
        } else if (stickerSet.emojis) {
            i10 = 5;
        } else {
            i10 = 0;
        }
        try {
            if (tL_error == null) {
                if (dz0Var.f25495j0) {
                    sc.g(m2Var, new iy0(dz0Var.f25508w.getContext(), dz0Var.S, 1, 2, null, dz0Var.resourcesProvider), 1500).j();
                }
                if (tLObject instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                    MediaDataController.getInstance(dz0Var.currentAccount).processStickerSetInstallResultArchive(m2Var, true, i10, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject);
                }
            } else {
                Toast.makeText(dz0Var.getContext(), LocaleController.getString(R.string.ErrorOccurred), 0).show();
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        MediaDataController.getInstance(dz0Var.currentAccount).loadStickers(i10, false, true);
    }

    public static void G(dz0 dz0Var, TLRPC.TL_error tL_error, TLObject tLObject, MediaDataController mediaDataController) {
        TLRPC.StickerSet stickerSet;
        boolean z10 = false;
        dz0Var.f25491f0 = 0;
        if (tL_error == null) {
            qn0 qn0Var = new qn0(dz0Var, 1);
            qn0Var.addTarget(dz0Var.containerView);
            TransitionManager.beginDelayedTransition(dz0Var.container, qn0Var);
            dz0Var.f25498n.setVisibility(0);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            dz0Var.S = tL_messages_stickerSet;
            mediaDataController.putStickerSet(tL_messages_stickerSet, false);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = dz0Var.S;
            if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents.isEmpty()) {
                dz0Var.dismiss();
                return;
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = dz0Var.S;
            if (tL_messages_stickerSet3 != null && (stickerSet = tL_messages_stickerSet3.set) != null && !stickerSet.masks) {
                z10 = true;
            }
            dz0Var.f25493h0 = z10;
            dz0Var.m0();
            mediaDataController.preloadStickerSetThumb(dz0Var.S);
            dz0Var.D0();
            dz0Var.C0();
            dz0Var.B0();
            dz0Var.d.l();
            return;
        }
        dz0Var.dismiss();
        org.telegram.ui.ActionBar.m2 m2Var = dz0Var.L;
        if (m2Var != null) {
            org.telegram.messenger.am.q(R.string.AddStickersNotFound, zc.a0(m2Var), null);
        }
    }

    public static void H(dz0 dz0Var, String str, TextView textView) {
        TLRPC.TL_stickers_checkShortName tL_stickers_checkShortName = new TLRPC.TL_stickers_checkShortName();
        tL_stickers_checkShortName.short_name = str;
        dz0Var.f25501p0 = ConnectionsManager.getInstance(dz0Var.currentAccount).sendRequest(tL_stickers_checkShortName, new ai.t5(dz0Var, str, textView, 12), 2);
    }

    public static void I(dz0 dz0Var) {
        boolean z10;
        TLRPC.StickerSet stickerSet;
        MediaDataController mediaDataController = MediaDataController.getInstance(dz0Var.currentAccount);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = dz0Var.S;
        if (tL_messages_stickerSet != null && mediaDataController.isStickerPackInstalled(tL_messages_stickerSet.set.f19830id)) {
            z10 = false;
        } else {
            z10 = true;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = dz0Var.S;
        if (tL_messages_stickerSet2 != null && (stickerSet = tL_messages_stickerSet2.set) != null && stickerSet.creator && dz0Var.f25503r == null) {
            dz0Var.f25498n.e(3, R.drawable.tabs_reorder, LocaleController.getString(R.string.StickersReorder));
            dz0Var.f25498n.e(4, R.drawable.msg_edit, LocaleController.getString(R.string.EditName));
            if (z10) {
                dz0Var.f25503r = dz0Var.f25498n.e(5, R.drawable.msg_delete, LocaleController.getString(R.string.Delete));
            } else {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, dz0Var.getContext(), dz0Var.resourcesProvider);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, dz0Var.resourcesProvider).setOnClickListener(new my0(dz0Var, 4));
                org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.StickersDeleteForEveryone), false, dz0Var.resourcesProvider);
                int themedColor = dz0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20800q7);
                c10.c(themedColor, themedColor);
                c10.setSelectorColor(org.telegram.ui.ActionBar.h6.m1(0.1f, themedColor));
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.StickersRemoveForMe), false, dz0Var.resourcesProvider).setOnClickListener(new my0(dz0Var, 6));
                c10.setOnClickListener(new my0(dz0Var, 7));
                dz0Var.f25503r = dz0Var.f25498n.i(R.drawable.msg_delete, null, LocaleController.getString(R.string.Delete), actionBarPopupWindow$ActionBarPopupWindowLayout);
            }
            dz0Var.f25498n.a(-1);
            zb0 zb0Var = new zb0(dz0Var.currentAccount, 4, dz0Var.getContext(), new ArrayList(), dz0Var.resourcesProvider);
            zb0Var.setOnClickListener(new my0(dz0Var, 8));
            zb0Var.setTag(R.id.fit_width_tag, 1);
            org.telegram.ui.ActionBar.u0 u0Var = dz0Var.f25498n;
            u0Var.o();
            u0Var.f21310b.a(zb0Var, new LinearLayout.LayoutParams(-1, -2));
            int themedColor2 = dz0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20800q7);
            dz0Var.f25503r.c(themedColor2, themedColor2);
            dz0Var.f25503r.setSelectorColor(org.telegram.ui.ActionBar.h6.m1(0.1f, themedColor2));
            if (dz0Var.f25503r.getRightIcon() != null) {
                dz0Var.f25503r.getRightIcon().setColorFilter(themedColor2);
            }
        }
        if (dz0Var.f25498n.getPopupLayout() != null) {
            dz0Var.f25498n.getPopupLayout().requestLayout();
        }
        dz0Var.f25498n.M(null, null);
    }

    public static void P(dz0 dz0Var) {
        if (dz0Var.f25485c.getChildCount() <= 0) {
            dz0Var.z0(dz0Var.f25485c.getPaddingTop());
            return;
        }
        int i10 = 0;
        View view = null;
        int i11 = -1;
        for (int i12 = 0; i12 < dz0Var.f25485c.getChildCount(); i12++) {
            View childAt = dz0Var.f25485c.getChildAt(i12);
            dz0Var.f25485c.getClass();
            int R = RecyclerView.R(childAt);
            if (i11 == -1 || i11 > R) {
                view = childAt;
                i11 = R;
            }
        }
        if (view != null && view.getTop() >= 0) {
            int top = view.getTop();
            dz0Var.w0(0, false);
            i10 = top;
        } else {
            dz0Var.w0(0, true);
        }
        dz0Var.w0(1, true);
        if (dz0Var.f25489e0 != i10) {
            dz0Var.z0(i10);
        }
    }

    public static void o(dz0 dz0Var, View view, int i10) {
        TLRPC.StickerSet stickerSet;
        String str;
        if (view instanceof xy0) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = dz0Var.S;
            org.telegram.ui.ActionBar.m2 m2Var = dz0Var.L;
            org.telegram.ui.ActionBar.c6 c6Var = dz0Var.resourcesProvider;
            if (m2Var != null) {
                Context context = m2Var.getContext();
                if (!(m2Var instanceof org.telegram.ui.eo)) {
                    iz0.a(tL_messages_stickerSet, m2Var, c6Var);
                    return;
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert3, 0, context, c6Var);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(LocaleController.getString(R.string.StickersCreateNewSticker));
                org.telegram.ui.Cells.c1.k(R.drawable.menu_sticker_add, 0, arrayList3, arrayList2);
                arrayList.add(LocaleController.getString(R.string.StickersAddAnExistingSticker));
                arrayList3.add(Integer.valueOf(R.drawable.menu_sticker_select));
                arrayList2.add(1);
                org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                ai.s0 s0Var = new ai.s0(m1Var, arrayList2, tL_messages_stickerSet, m2Var, c6Var, 11);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, ((Integer) arrayList3.get(i11)).intValue(), (CharSequence) arrayList.get(i11), false, c6Var);
                    c10.setTag(Integer.valueOf(i11));
                    c10.setOnClickListener(s0Var);
                }
                m1Var.f21146c = 100;
                m1Var.f21149g = true;
                m1Var.setOutsideTouchable(true);
                m1Var.setClippingEnabled(true);
                m1Var.setAnimationStyle(R.style.PopupContextAnimation);
                m1Var.setFocusable(true);
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                m1Var.setInputMethodMode(2);
                m1Var.getContentView().setFocusableInTouchMode(true);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                m1Var.showAtLocation(view, 0, ((view.getMeasuredWidth() / 2) + iArr[0]) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() / 2), ((view.getMeasuredHeight() / 2) + iArr[1]) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() / 2));
                m1Var.b();
            }
        } else if (!dz0Var.R) {
            if (dz0Var.W != null) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) dz0Var.d.f33524f.get(i10);
                if (stickerSetCovered != null) {
                    dz0Var.dismiss();
                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                    TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                    tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                    tL_inputStickerSetID.f19823id = stickerSet2.f19830id;
                    new dz0(dz0Var.N, dz0Var.L, tL_inputStickerSetID, null, null, dz0Var.resourcesProvider).show();
                    return;
                }
                return;
            }
            ArrayList arrayList4 = dz0Var.Y;
            if (arrayList4 != null) {
                if (i10 >= 0 && i10 < arrayList4.size()) {
                    SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) dz0Var.Y.get(i10);
                    dz0Var.U = importingSticker;
                    if (importingSticker.validated) {
                        TextView textView = dz0Var.G;
                        textView.setText(Emoji.replaceEmoji(importingSticker.emoji, textView.getPaint().getFontMetricsInt(), false));
                        y9 y9Var = dz0Var.F;
                        ImageLocation forPath = ImageLocation.getForPath(dz0Var.U.path);
                        if (dz0Var.U.animated) {
                            str = "tgs";
                        } else {
                            str = null;
                        }
                        y9Var.m(forPath, null, null, null, null, str, 0, null);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) dz0Var.f25509x.getLayoutParams();
                        layoutParams.topMargin = dz0Var.f25489e0;
                        dz0Var.f25509x.setLayoutParams(layoutParams);
                        dz0Var.f25509x.setVisibility(0);
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ObjectAnimator.ofFloat(dz0Var.f25509x, View.ALPHA, 0.0f, 1.0f));
                        animatorSet.setDuration(200L);
                        animatorSet.start();
                        return;
                    }
                    return;
                }
                return;
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = dz0Var.S;
            if (tL_messages_stickerSet2 != null && i10 >= 0 && i10 < tL_messages_stickerSet2.documents.size()) {
                dz0Var.T = dz0Var.S.documents.get(i10);
                int i12 = 0;
                while (true) {
                    if (i12 >= dz0Var.T.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = dz0Var.T.attributes.get(i12);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                        String str2 = documentAttribute.alt;
                        if (str2 != null && str2.length() > 0) {
                            TextView textView2 = dz0Var.G;
                            textView2.setText(Emoji.replaceEmoji(documentAttribute.alt, textView2.getPaint().getFontMetricsInt(), false));
                        }
                    } else {
                        i12++;
                    }
                }
                dz0Var.G.setText(Emoji.replaceEmoji(MediaDataController.getInstance(dz0Var.currentAccount).getEmojiForSticker(dz0Var.T.f19809id), dz0Var.G.getPaint().getFontMetricsInt(), false));
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = dz0Var.S;
                if ((tL_messages_stickerSet3 == null || (stickerSet = tL_messages_stickerSet3.set) == null || !stickerSet.emojis) && !org.telegram.ui.ut.q().y(view)) {
                    dz0Var.F.getImageReceiver().setImage(ImageLocation.getForDocument(dz0Var.T), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(dz0Var.T.thumbs, 90), dz0Var.T), (String) null, "webp", dz0Var.S, 1);
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) dz0Var.f25509x.getLayoutParams();
                    layoutParams2.topMargin = dz0Var.f25489e0;
                    dz0Var.f25509x.setLayoutParams(layoutParams2);
                    dz0Var.f25509x.setVisibility(0);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(dz0Var.f25509x, View.ALPHA, 0.0f, 1.0f));
                    animatorSet2.setDuration(200L);
                    animatorSet2.start();
                }
            }
        }
    }

    public static void p(dz0 dz0Var) {
        dz0Var.f25498n.n();
        iz0.b(dz0Var.S.set, dz0Var.resourcesProvider, dz0Var.getContext(), new oy0(dz0Var, 4));
    }

    public static void p0(org.telegram.ui.ActionBar.m2 m2Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, TLRPC.Document document) {
        org.telegram.ui.eo eoVar;
        boolean z10;
        TLRPC.StickerSet stickerSet;
        if (m2Var != null) {
            if (m2Var instanceof org.telegram.ui.eo) {
                eoVar = (org.telegram.ui.eo) m2Var;
            } else {
                eoVar = null;
            }
            org.telegram.ui.eo eoVar2 = eoVar;
            if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.creator) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (MessageObject.isStaticStickerDocument(document)) {
                ArrayList arrayList = new ArrayList();
                File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true);
                if (pathToAttach != null && pathToAttach.exists()) {
                    AndroidUtilities.runOnUIThread(new hg.r0(pathToAttach, arrayList, m2Var, eoVar2, document, z10, tL_messages_stickerSet), 300L);
                    return;
                }
                return;
            }
            AndroidUtilities.runOnUIThread(new ci.t1((Object) m2Var, (Object) tL_messages_stickerSet, (Object) document, (Object) eoVar2, z10, 18), 300L);
        }
    }

    public static void q(org.telegram.ui.ts0 ts0Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers) {
        ts0Var.f25491f0 = 0;
        if (tL_error == null && (tLObject instanceof Vector)) {
            Vector vector = (Vector) tLObject;
            if (vector.objects.isEmpty()) {
                ts0Var.dismiss();
                return;
            } else if (vector.objects.size() == 1) {
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                ts0Var.V = tL_inputStickerSetID;
                TLRPC.StickerSet stickerSet = ((TLRPC.StickerSetCovered) vector.objects.get(0)).set;
                tL_inputStickerSetID.f19823id = stickerSet.f19830id;
                tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                ts0Var.u0();
                return;
            } else {
                ArrayList arrayList = new ArrayList();
                ts0Var.W = arrayList;
                arrayList.addAll(vector.objects);
                ts0Var.f25485c.setLayoutParams(w7.w5.a(-1.0f, 0.0f, 0.0f, 0.0f, 48.0f, -1, 51));
                ts0Var.h.setVisibility(8);
                ts0Var.J[0].setVisibility(8);
                ts0Var.d.l();
                return;
            }
        }
        g5.e0(ts0Var.currentAccount, tL_error, ts0Var.L, tL_messages_getAttachedStickers, new Object[0]);
        ts0Var.dismiss();
    }

    public static void r(org.telegram.ui.ts0 ts0Var, Object obj, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers, org.telegram.ui.so soVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && obj != null) {
            FileRefController.getInstance(ts0Var.currentAccount).requestReference(obj, tL_messages_getAttachedStickers, soVar);
        } else {
            soVar.run(tLObject, tL_error);
        }
    }

    public static void s(dz0 dz0Var) {
        dz0Var.dismiss();
        MediaDataController.getInstance(dz0Var.currentAccount).toggleStickerSet(dz0Var.getContext(), dz0Var.S, 0, dz0Var.L, true, dz0Var.f25495j0);
    }

    public static void t(dz0 dz0Var) {
        dz0Var.f25498n.n();
        dz0Var.dismiss();
        MediaDataController.getInstance(dz0Var.currentAccount).toggleStickerSet(dz0Var.getContext(), dz0Var.S, 1, dz0Var.L, true, true);
    }

    public static void u(dz0 dz0Var) {
        dz0Var.dismiss();
        MediaDataController.getInstance(dz0Var.currentAccount).toggleStickerSet(dz0Var.getContext(), dz0Var.S, 1, dz0Var.L, false, false);
    }

    public static void v(dz0 dz0Var) {
        dz0Var.dismiss();
        MediaDataController.getInstance(dz0Var.currentAccount).toggleStickerSet(dz0Var.getContext(), dz0Var.S, 1, dz0Var.L, false, false);
    }

    public static boolean x(dz0 dz0Var, MotionEvent motionEvent) {
        if (dz0Var.R) {
            return false;
        }
        return org.telegram.ui.ut.q().s(motionEvent, dz0Var.f25485c, dz0Var.H, dz0Var.m0, dz0Var.resourcesProvider);
    }

    public static void y(dz0 dz0Var, ArrayList arrayList, Boolean bool) {
        dz0Var.Y = arrayList;
        if (arrayList.isEmpty()) {
            dz0Var.dismiss();
            return;
        }
        dz0Var.d.l();
        if (bool.booleanValue()) {
            dz0Var.Z = new HashMap();
            int size = dz0Var.Y.size();
            for (int i10 = 0; i10 < size; i10++) {
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) dz0Var.Y.get(i10);
                dz0Var.Z.put(importingSticker.path, importingSticker);
                FileLoader.getInstance(dz0Var.currentAccount).uploadFile(importingSticker.path, false, true, 67108864);
            }
        }
        dz0Var.C0();
    }

    public static void z(dz0 dz0Var, int[] iArr, EditTextBoldCursor editTextBoldCursor, TextView textView, TextView textView2, AlertDialog$Builder alertDialog$Builder) {
        int i10 = iArr[0];
        if (i10 != 1) {
            if (i10 == 0) {
                iArr[0] = 1;
                TLRPC.TL_stickers_suggestShortName tL_stickers_suggestShortName = new TLRPC.TL_stickers_suggestShortName();
                String obj = editTextBoldCursor.getText().toString();
                dz0Var.f25504r0 = obj;
                tL_stickers_suggestShortName.title = obj;
                ConnectionsManager.getInstance(dz0Var.currentAccount).sendRequest(tL_stickers_suggestShortName, new ci.hd(dz0Var, editTextBoldCursor, textView, textView2, iArr));
            } else if (i10 == 2) {
                iArr[0] = 3;
                if (!dz0Var.f25502q0) {
                    AndroidUtilities.shakeView(editTextBoldCursor);
                    try {
                        editTextBoldCursor.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                SendMessagesHelper.getInstance(dz0Var.currentAccount).prepareImportStickers(dz0Var.f25504r0, dz0Var.f25500o0, dz0Var.f25482a0, dz0Var.Y, new ny0(dz0Var));
                alertDialog$Builder.f20142a.L0.run();
                dz0Var.dismiss();
            }
        }
    }

    public final void A0(boolean z10) {
        dz0 dz0Var = this.d.f33526r;
        if (dz0Var.W != null) {
            int childCount = dz0Var.f25485c.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = dz0Var.f25485c.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.s3) {
                    ((org.telegram.ui.Cells.s3) childAt).d();
                }
            }
        }
        this.h.setHighlightColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20705l5));
        this.f25509x.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20631h5) & (-536870913));
        this.f25498n.setIconColor(getThemedColor(org.telegram.ui.ActionBar.h6.Ji));
        this.f25498n.G(getThemedColor(org.telegram.ui.ActionBar.h6.E8), false);
        this.f25498n.G(getThemedColor(org.telegram.ui.ActionBar.h6.F8), true);
        this.f25498n.setPopupItemsSelectorColor(getThemedColor(org.telegram.ui.ActionBar.h6.I5));
        this.f25498n.B(getThemedColor(org.telegram.ui.ActionBar.h6.G8));
        if (this.f25503r != null) {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.f20800q7);
            this.f25503r.c(themedColor, themedColor);
            this.f25503r.setSelectorColor(org.telegram.ui.ActionBar.h6.m1(0.1f, themedColor));
            if (this.f25503r.getRightIcon() != null) {
                this.f25503r.getRightIcon().setColorFilter(themedColor);
            }
        }
        if (z10) {
            if (org.telegram.ui.ActionBar.h6.vl != null && this.f25507t0 == null) {
                ArrayList themeDescriptions = getThemeDescriptions();
                this.f25507t0 = themeDescriptions;
                int size = themeDescriptions.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((org.telegram.ui.ActionBar.j6) this.f25507t0.get(i11)).h = null;
                }
            }
            int size2 = this.f25507t0.size();
            for (int i12 = 0; i12 < size2; i12++) {
                org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) this.f25507t0.get(i12);
                j6Var.e(getThemedColor(j6Var.f21022f), false, false);
            }
        }
        if (org.telegram.ui.ActionBar.h6.vl == null && this.f25507t0 != null) {
            this.f25507t0 = null;
        }
    }

    public final void B0() {
        if (this.containerView != null && !UserConfig.getInstance(this.currentAccount).isPremium()) {
            MessageObject.isPremiumEmojiPack(this.S);
        }
    }

    public final void C0() {
        int size;
        int size2;
        ArrayList<TLRPC.Document> arrayList;
        boolean z10;
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
        boolean z11;
        TLRPC.StickerSet stickerSet7;
        float f7;
        if (this.h == null) {
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.S;
        int i16 = 1;
        if (tL_messages_stickerSet != null && (arrayList = tL_messages_stickerSet.documents) != null && !arrayList.isEmpty()) {
            CharSequence replaceEmoji = Emoji.replaceEmoji(this.S.set.title, this.h.getPaint().getFontMetricsInt(), false);
            try {
                if (this.f25483b == null) {
                    this.f25483b = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
                }
                Matcher matcher = this.f25483b.matcher(replaceEmoji);
                SpannableStringBuilder spannableStringBuilder = null;
                while (matcher.find()) {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder(replaceEmoji);
                    }
                    int start = matcher.start();
                    int end = matcher.end();
                    if (this.S.set.title.charAt(start) != '@') {
                        start++;
                    }
                    spannableStringBuilder.setSpan(new o4(replaceEmoji.subSequence(start + 1, end).toString(), 1, this), start, end, 0);
                }
                if (spannableStringBuilder != null) {
                    replaceEmoji = spannableStringBuilder;
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            this.h.setText(replaceEmoji);
            if (t0()) {
                int measuredWidth = this.f25485c.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = AndroidUtilities.displaySize.x;
                }
                zy0 zy0Var = this.d;
                if (AndroidUtilities.isTablet()) {
                    f7 = 60.0f;
                } else {
                    f7 = 45.0f;
                }
                zy0Var.d = Math.max(1, measuredWidth / AndroidUtilities.dp(f7));
            } else {
                this.d.d = 5;
            }
            this.M.y1(this.d.d);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.S;
            int i17 = -1;
            if (tL_messages_stickerSet2 != null && (stickerSet7 = tL_messages_stickerSet2.set) != null && stickerSet7.emojis && !UserConfig.getInstance(this.currentAccount).isPremium() && this.f25487d0 == null) {
                if (this.S.documents != null) {
                    for (int i18 = 0; i18 < this.S.documents.size(); i18++) {
                        if (!MessageObject.isFreeEmoji(this.S.documents.get(i18))) {
                            this.v.setVisibility(0);
                            this.f25505s.setBackground(null);
                            x0(null, null, -1);
                            this.v.a(LocaleController.getString(R.string.UnlockPremiumEmoji), new my0(this, 0), false);
                            return;
                        }
                    }
                }
            } else {
                this.v.setVisibility(4);
            }
            MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = this.S;
            if (tL_messages_stickerSet3 != null && (stickerSet6 = tL_messages_stickerSet3.set) != null && stickerSet6.emojis) {
                ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = mediaDataController.getStickerSets(5);
                for (int i19 = 0; stickerSets != null && i19 < stickerSets.size(); i19++) {
                    if (stickerSets.get(i19) != null && stickerSets.get(i19).set != null && stickerSets.get(i19).set.f19830id == this.S.set.f19830id) {
                        z11 = true;
                        break;
                    }
                }
                z11 = false;
                z10 = !z11;
            } else if (tL_messages_stickerSet3 != null && (stickerSet = tL_messages_stickerSet3.set) != null && mediaDataController.isStickerPackInstalled(stickerSet.f19830id)) {
                z10 = false;
            } else {
                z10 = true;
            }
            org.telegram.ui.p70 p70Var = this.f25487d0;
            if (p70Var != null) {
                my0 my0Var = new my0(this, 5);
                boolean z12 = p70Var.f40868a;
                if (p70Var.f40870c.N) {
                    if (z12) {
                        i15 = R.string.RemoveGroupEmojiPackSet;
                    } else {
                        i15 = R.string.SetAsGroupEmojiPackSet;
                    }
                    string = LocaleController.getString(i15);
                } else {
                    if (z12) {
                        i12 = R.string.RemoveGroupStickerSet;
                    } else {
                        i12 = R.string.SetAsGroupStickerSet;
                    }
                    string = LocaleController.getString(i12);
                }
                String str = string;
                boolean z13 = this.f25487d0.f40868a;
                if (z13) {
                    i13 = org.telegram.ui.ActionBar.h6.f20800q7;
                } else {
                    i13 = org.telegram.ui.ActionBar.h6.Sh;
                }
                if (!z13) {
                    i14 = org.telegram.ui.ActionBar.h6.Oh;
                } else {
                    i14 = -1;
                }
                if (!z13) {
                    i17 = org.telegram.ui.ActionBar.h6.Qh;
                }
                y0(my0Var, str, i13, i14, i17);
                return;
            }
            if (z10) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = this.S;
                if (tL_messages_stickerSet4 != null && (stickerSet5 = tL_messages_stickerSet4.set) != null && stickerSet5.emojis) {
                    i16 = 5;
                } else if (tL_messages_stickerSet4 == null || (stickerSet4 = tL_messages_stickerSet4.set) == null || !stickerSet4.masks) {
                    i16 = 0;
                }
                if (!mediaDataController.areStickersLoaded(i16)) {
                    mediaDataController.checkStickers(i16);
                    y0(null, "", -1, -1, -1);
                    return;
                }
            }
            if (z10) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = this.S;
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
                y0(new my0(this, 9), formatPluralString2, org.telegram.ui.ActionBar.h6.Sh, org.telegram.ui.ActionBar.h6.Oh, org.telegram.ui.ActionBar.h6.Qh);
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet6 = this.S;
                TLRPC.StickerSet stickerSet8 = tL_messages_stickerSet6.set;
                boolean z14 = stickerSet8.creator;
                if (z14) {
                    if (this.R) {
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
                if (z14) {
                    y0(new my0(this, 10), formatPluralString, org.telegram.ui.ActionBar.h6.Sh, org.telegram.ui.ActionBar.h6.Oh, org.telegram.ui.ActionBar.h6.Qh);
                } else {
                    String str2 = formatPluralString;
                    if (this.S.set.official) {
                        x0(new my0(this, 11), str2, org.telegram.ui.ActionBar.h6.f20800q7);
                    } else {
                        x0(new my0(this, 12), str2, org.telegram.ui.ActionBar.h6.f20800q7);
                    }
                }
            }
            this.d.l();
            return;
        }
        ArrayList arrayList5 = this.X;
        if (arrayList5 != null) {
            ia0 ia0Var = this.h;
            ArrayList arrayList6 = this.Y;
            if (arrayList6 != null) {
                size = arrayList6.size();
            } else {
                size = arrayList5.size();
            }
            ia0Var.setText(LocaleController.formatPluralString("Stickers", size, new Object[0]));
            HashMap hashMap = this.Z;
            if (hashMap != null && !hashMap.isEmpty()) {
                x0(null, LocaleController.getString(R.string.ImportStickersProcessing), org.telegram.ui.ActionBar.h6.f20799q5);
                this.f25505s.setEnabled(false);
                return;
            }
            my0 my0Var2 = new my0(this, 13);
            int i20 = R.string.ImportStickers;
            ArrayList arrayList7 = this.Y;
            if (arrayList7 != null) {
                size2 = arrayList7.size();
            } else {
                size2 = arrayList5.size();
            }
            x0(my0Var2, LocaleController.formatString("ImportStickers", i20, LocaleController.formatPluralString("Stickers", size2, new Object[0])), org.telegram.ui.ActionBar.h6.f20744n5);
            this.f25505s.setEnabled(true);
            return;
        }
        x0(new my0(this, 14), LocaleController.getString(R.string.Close), org.telegram.ui.ActionBar.h6.f20744n5);
    }

    public final void D0() {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Point point = AndroidUtilities.displaySize;
        int min = (int) ((Math.min(point.x, point.y) / 2) / AndroidUtilities.density);
        if (this.X != null) {
            this.f25510y.setText(LocaleController.getString(R.string.ImportStickersRemove));
            this.f25510y.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20800q7));
            float f7 = min;
            this.F.setLayoutParams(w7.w5.a(f7, 0.0f, 0.0f, 0.0f, 30.0f, min, 17));
            this.G.setLayoutParams(w7.w5.a(f7, 0.0f, 0.0f, 0.0f, 30.0f, min, 17));
            this.f25510y.setVisibility(0);
            this.E.setVisibility(0);
        } else if (this.f25484b0 != null && ((tL_messages_stickerSet = this.S) == null || !tL_messages_stickerSet.set.masks)) {
            this.f25510y.setText(LocaleController.getString(R.string.SendSticker));
            float f10 = min;
            this.F.setLayoutParams(w7.w5.a(f10, 0.0f, 0.0f, 0.0f, 30.0f, min, 17));
            this.G.setLayoutParams(w7.w5.a(f10, 0.0f, 0.0f, 0.0f, 30.0f, min, 17));
            this.f25510y.setVisibility(0);
            this.E.setVisibility(0);
        } else {
            this.f25510y.setText(LocaleController.getString(R.string.Close));
            this.F.setLayoutParams(w7.w5.e(min, min, 17));
            this.G.setLayoutParams(w7.w5.e(min, min, 17));
            this.f25510y.setVisibility(8);
            this.E.setVisibility(8);
        }
    }

    public final void E0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.S = tL_messages_stickerSet;
        if (this.d != null) {
            D0();
            C0();
            this.d.l();
        }
        B0();
        MediaDataController.getInstance(this.currentAccount).preloadStickerSetThumb(this.S);
        m0();
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            ai.w0 w0Var = this.f25485c;
            if (w0Var != null) {
                int childCount = w0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    this.f25485c.getChildAt(i12).invalidate();
                }
            }
        } else if (i10 == NotificationCenter.fileUploaded) {
            HashMap hashMap = this.Z;
            if (hashMap != null) {
                String str = (String) objArr[0];
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) hashMap.get(str);
                if (importingSticker != null) {
                    importingSticker.uploadMedia(this.currentAccount, (TLRPC.InputFile) objArr[1], new mh0(this, str, importingSticker, 10));
                }
            }
        } else if (i10 == NotificationCenter.fileUploadFailed) {
            HashMap hashMap2 = this.Z;
            if (hashMap2 != null) {
                SendMessagesHelper.ImportingSticker importingSticker2 = (SendMessagesHelper.ImportingSticker) hashMap2.remove((String) objArr[0]);
                if (importingSticker2 != null) {
                    v0(importingSticker2);
                }
                if (this.Z.isEmpty()) {
                    C0();
                }
            }
        } else if (i10 == NotificationCenter.stickersDidLoad) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
            if (this.V != null) {
                MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
                String str2 = this.V.short_name;
                if (str2 != null) {
                    tL_messages_stickerSet = mediaDataController.getStickerSetByName(str2);
                }
                if (tL_messages_stickerSet == null) {
                    tL_messages_stickerSet = mediaDataController.getStickerSetById(this.V.f19823id);
                }
            }
            if (tL_messages_stickerSet != null && tL_messages_stickerSet != this.S) {
                this.S = tL_messages_stickerSet;
                u0();
            }
            C0();
        }
    }

    @Override
    public void dismiss() {
        super.dismiss();
        this.f25497l0.E(false);
        Runnable runnable = this.f25506s0;
        if (runnable != null) {
            runnable.run();
        }
        if (this.f25491f0 != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f25491f0, true);
            this.f25491f0 = 0;
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        if (this.X != null) {
            ArrayList arrayList = this.Y;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) this.Y.get(i10);
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
        a7 a7Var = new a7(this, 9);
        ViewGroup viewGroup = this.containerView;
        Drawable[] drawableArr = {this.shadowDrawable};
        int i10 = org.telegram.ui.ActionBar.h6.f20631h5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(viewGroup, 0, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.containerView, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Ii));
        dz0 dz0Var = this.d.f33526r;
        if (dz0Var.W != null) {
            org.telegram.ui.Cells.s3.a(arrayList, dz0Var.f25485c, a7Var);
        }
        View[] viewArr = this.J;
        View view = viewArr[0];
        int i11 = org.telegram.ui.ActionBar.h6.V5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(viewArr[1], 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f25485c, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f20668j5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 2, null, null, null, null, org.telegram.ui.ActionBar.h6.f20687k5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f25498n, 65568, null, null, null, null, org.telegram.ui.ActionBar.h6.Ni));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f25505s, 32, null, null, null, null, i10));
        r6 r6Var = this.f25505s;
        int i12 = org.telegram.ui.ActionBar.h6.f20651i6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(r6Var, 65568, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f25505s, 4, null, null, null, null, this.f25496k0));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f25510y, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f20744n5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f25510y, 32, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f25510y, 65568, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.E, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.h6.f20705l5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, a7Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.h6.Ji));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.h6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.h6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.h6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.h6.G8));
        return arrayList;
    }

    public final void m0() {
        if (this.S != null) {
            TLRPC.TL_messages_stickerSet filterPremiumStickers = MessagesController.getInstance(this.currentAccount).filterPremiumStickers(this.S);
            this.S = filterPremiumStickers;
            if (filterPremiumStickers == null) {
                dismiss();
            }
        }
    }

    public final void n0(TextView textView, String str, boolean z10) {
        if (z10) {
            textView.setText(LocaleController.getString(R.string.ImportStickersLinkAvailable));
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20911w6));
            this.f25502q0 = true;
            this.f25500o0 = str;
            return;
        }
        mh0 mh0Var = this.f25499n0;
        if (mh0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(mh0Var);
            this.f25499n0 = null;
            this.f25500o0 = null;
            if (this.f25501p0 != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f25501p0, true);
            }
        }
        if (TextUtils.isEmpty(str)) {
            textView.setText(LocaleController.getString(R.string.ImportStickersEnterUrlInfo));
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20799q5));
            return;
        }
        this.f25502q0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                int length = str.length();
                for (int i10 = 0; i10 < length; i10++) {
                    char charAt = str.charAt(i10);
                    if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        textView.setText(LocaleController.getString(R.string.ImportStickersEnterUrlInfo));
                        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20781p7));
                        return;
                    }
                }
            } else {
                textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalid));
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20781p7));
                return;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 32) {
                textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalidLong));
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20781p7));
                return;
            }
            textView.setText(LocaleController.getString(R.string.ImportStickersLinkChecking));
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.F6));
            this.f25500o0 = str;
            mh0 mh0Var2 = new mh0(this, str, textView, 13);
            this.f25499n0 = mh0Var2;
            AndroidUtilities.runOnUIThread(mh0Var2, 300L);
            return;
        }
        textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalidShort));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20781p7));
    }

    public final void o0() {
        if (!this.R) {
            return;
        }
        this.f25488e.e(null);
        this.R = false;
        this.f25497l0.E(true);
        AndroidUtilities.forEachViews((RecyclerView) this.f25485c, (Utilities.Callback<View>) new ai.i(14));
        this.f25498n.postDelayed(new oy0(this, 0), 200L);
        this.f25505s.c(LocaleController.getString(R.string.EditStickers), true, true);
    }

    @Override
    public final void onBackPressed() {
        if (org.telegram.ui.ut.q().E) {
            org.telegram.ui.ut.q().o();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onStart() {
        super.onStart();
        sc.a((FrameLayout) this.containerView, new ai.x4(this, 8));
    }

    @Override
    public final void onStop() {
        super.onStop();
        sc.h((FrameLayout) this.containerView);
    }

    public final void q0() {
        if (this.R) {
            return;
        }
        this.f25488e.e(this.f25485c);
        this.R = true;
        com.google.firebase.messaging.n nVar = this.f25497l0;
        char c10 = 0;
        nVar.E(false);
        float f7 = 0.0f;
        Float valueOf = Float.valueOf(0.0f);
        ArrayList arrayList = (ArrayList) nVar.d;
        if (arrayList.isEmpty()) {
            for (int i10 = 0; i10 < 6; i10++) {
                arrayList.add(valueOf);
                ((ArrayList) nVar.f7953e).add(valueOf);
                ((ArrayList) nVar.f7954f).add(valueOf);
            }
        }
        int i11 = 0;
        for (int i12 = 6; i11 < i12; i12 = 6) {
            long nextFloat = Utilities.random.nextFloat() * 300;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, -2.0f, 0.0f, 2.0f, 0.0f);
            ofFloat.addUpdateListener(new cz0(nVar, i11, 3));
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(1);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setCurrentPlayTime(nextFloat);
            long j3 = 300;
            ofFloat.setDuration(j3);
            ofFloat.start();
            char c11 = c10;
            float dp = AndroidUtilities.dp(0.5f);
            float f10 = f7;
            float[] fArr = new float[5];
            fArr[c11] = f10;
            fArr[1] = dp;
            fArr[2] = f10;
            fArr[3] = -dp;
            fArr[4] = f10;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr);
            ofFloat2.addUpdateListener(new cz0(nVar, i11, 4));
            ofFloat2.setRepeatCount(-1);
            ofFloat2.setRepeatMode(1);
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setCurrentPlayTime(nextFloat);
            ofFloat2.setDuration((long) (300 * 1.2d));
            ofFloat2.start();
            float[] fArr2 = new float[4];
            fArr2[c11] = f10;
            fArr2[1] = dp;
            fArr2[2] = f10 - dp;
            fArr2[3] = f10;
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fArr2);
            ofFloat3.addUpdateListener(new cz0(nVar, i11, 5));
            ofFloat3.setRepeatCount(-1);
            ofFloat3.setRepeatMode(1);
            ofFloat3.setInterpolator(new LinearInterpolator());
            ofFloat3.setCurrentPlayTime(nextFloat);
            ofFloat3.setDuration(j3);
            ofFloat3.start();
            ((ArrayList) nVar.f7950a).add(ofFloat);
            ((ArrayList) nVar.f7951b).add(ofFloat2);
            ((ArrayList) nVar.f7952c).add(ofFloat3);
            i11++;
            f7 = f10;
            c10 = c11;
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f25485c, (Utilities.Callback<View>) new ai.i(15));
        this.f25498n.postDelayed(new oy0(this, 1), 200L);
        this.f25505s.c(LocaleController.getString(R.string.Done), true, true);
    }

    public final void r0() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f25509x, View.ALPHA, 0.0f));
        animatorSet.setDuration(200L);
        animatorSet.addListener(new zd0(this, 18));
        animatorSet.start();
    }

    public final void s0(Context context) {
        int i10;
        vy0 vy0Var = new vy0(this, context);
        this.containerView = vy0Var;
        vy0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, 0, i11, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(context);
        View[] viewArr = this.J;
        viewArr[0] = view;
        int i12 = org.telegram.ui.ActionBar.h6.V5;
        view.setBackgroundColor(getThemedColor(i12));
        viewArr[0].setAlpha(0.0f);
        viewArr[0].setVisibility(4);
        viewArr[0].setTag(1);
        this.containerView.addView(viewArr[0], layoutParams);
        ai.w0 w0Var = new ai.w0(this, context, 23);
        this.f25485c = w0Var;
        w0Var.setTag(14);
        ai.w0 w0Var2 = this.f25485c;
        getContext();
        bi.l lVar = new bi.l(this);
        this.M = lVar;
        w0Var2.setLayoutManager(lVar);
        this.M.O = new ci.w1(this, 5);
        this.f25488e = new s4.z(new wy0(this));
        ai.w0 w0Var3 = this.f25485c;
        zy0 zy0Var = new zy0(this, context);
        this.d = zy0Var;
        w0Var3.setAdapter(zy0Var);
        this.f25485c.setVerticalScrollBarEnabled(false);
        this.f25485c.i(new ai.t(8));
        this.f25485c.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.f25485c.setClipToPadding(false);
        this.f25485c.setEnabled(true);
        this.f25485c.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.h6.A5));
        this.f25485c.setOnTouchListener(new yk(this, 6));
        this.f25485c.setOnScrollListener(new qh0(this, 6));
        j jVar = new j(this, 16);
        this.H = jVar;
        this.f25485c.setOnItemClickListener(jVar);
        this.containerView.addView(this.f25485c, w7.w5.a(-1.0f, 0.0f, 48.0f, 0.0f, 48.0f, -1, 51));
        ai.f0 f0Var = new ai.f0(this, context, 21);
        this.K = f0Var;
        this.containerView.addView(f0Var, w7.w5.a(-1.0f, 0.0f, 0.0f, 0.0f, 48.0f, -1, 51));
        this.f25485c.setEmptyView(this.K);
        this.K.setOnTouchListener(new bi.d(24));
        ia0 ia0Var = new ia0(context, null);
        this.h = ia0Var;
        ia0Var.setLines(1);
        this.h.setSingleLine(true);
        this.h.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20668j5));
        this.h.setTextSize(1, 20.0f);
        this.h.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20687k5));
        this.h.setEllipsize(TextUtils.TruncateAt.END);
        this.h.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f));
        this.h.setGravity(16);
        this.h.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(this.h, w7.w5.a(50.0f, 0.0f, 0.0f, 40.0f, 0.0f, -1, 51));
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(org.telegram.ui.ActionBar.h6.Ji), false, this.resourcesProvider);
        this.f25498n = u0Var;
        u0Var.setLongClickEnabled(false);
        this.f25498n.setSubMenuOpenSide(2);
        this.f25498n.setIcon(R.drawable.ic_ab_other);
        this.f25498n.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(getThemedColor(org.telegram.ui.ActionBar.h6.Ni), 1, -1));
        this.containerView.addView(this.f25498n, w7.w5.a(40.0f, 0.0f, 5.0f, 5.0f, 0.0f, 40, 53));
        this.f25498n.e(1, R.drawable.msg_share, LocaleController.getString(R.string.StickersShare));
        this.f25498n.e(2, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink));
        this.f25498n.setOnClickListener(new my0(this, 1));
        this.f25498n.setDelegate(new ny0(this));
        this.f25498n.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f25498n;
        if (this.V != null) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        u0Var2.setVisibility(i10);
        this.K.addView(new RadialProgressView(context, null), w7.w5.e(-2, -2, 17));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
        View view2 = new View(context);
        viewArr[1] = view2;
        view2.setBackgroundColor(getThemedColor(i12));
        this.containerView.addView(viewArr[1], layoutParams2);
        r6 r6Var = new r6(context, false, false, false);
        this.f25505s = r6Var;
        int i13 = org.telegram.ui.ActionBar.h6.f20631h5;
        int themedColor = getThemedColor(i13);
        int i14 = org.telegram.ui.ActionBar.h6.f20651i6;
        r6Var.setBackground(org.telegram.ui.ActionBar.h6.h0(themedColor, getThemedColor(i14)));
        r6 r6Var2 = this.f25505s;
        int i15 = org.telegram.ui.ActionBar.h6.f20744n5;
        this.f25496k0 = i15;
        r6Var2.setTextColor(getThemedColor(i15));
        this.f25505s.setTextSize(AndroidUtilities.dp(14.0f));
        this.f25505s.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        this.f25505s.setTypeface(AndroidUtilities.bold());
        this.f25505s.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f25508w = frameLayout;
        frameLayout.addView(this.f25505s, w7.w5.d(48.0f, -1));
        this.containerView.addView(this.f25508w, w7.w5.e(-1, -2, 83));
        rg.q0 q0Var = new rg.q0(AndroidUtilities.dp(24.0f), context, this.resourcesProvider, false);
        this.v = q0Var;
        q0Var.setIcon(R.raw.unlock_icon);
        this.v.setVisibility(4);
        this.containerView.addView(this.v, w7.w5.a(48.0f, 8.0f, 0.0f, 8.0f, 8.0f, -1, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f25509x = frameLayout2;
        frameLayout2.setVisibility(8);
        this.f25509x.setSoundEffectsEnabled(false);
        this.containerView.addView(this.f25509x, w7.w5.d(-1.0f, -1));
        this.f25509x.setOnClickListener(new my0(this, 2));
        y9 y9Var = new y9(context);
        this.F = y9Var;
        y9Var.setAspectFit(true);
        this.F.setLayerNum(7);
        this.f25509x.addView(this.F);
        TextView textView = new TextView(context);
        this.G = textView;
        textView.setTextSize(1, 30.0f);
        this.G.setGravity(85);
        this.f25509x.addView(this.G);
        TextView textView2 = new TextView(context);
        this.f25510y = textView2;
        textView2.setTextSize(1, 14.0f);
        this.f25510y.setTextColor(getThemedColor(i15));
        this.f25510y.setBackground(org.telegram.ui.ActionBar.h6.h0(getThemedColor(i13), getThemedColor(i14)));
        this.f25510y.setGravity(17);
        this.f25510y.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
        this.f25510y.setTypeface(AndroidUtilities.bold());
        this.f25509x.addView(this.f25510y, w7.w5.e(-1, 48, 83));
        this.f25510y.setOnClickListener(new my0(this, 3));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams3.bottomMargin = AndroidUtilities.dp(48.0f);
        View view3 = new View(context);
        this.E = view3;
        view3.setBackgroundColor(getThemedColor(i12));
        this.f25509x.addView(this.E, layoutParams3);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        if (this.X != null) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploaded);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploadFailed);
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        C0();
        D0();
        B0();
        A0(false);
        this.d.l();
    }

    @Override
    public final void setOnDismissListener(Runnable runnable) {
        this.f25506s0 = runnable;
    }

    @Override
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
    }

    public final boolean t0() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.S;
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis) {
            if (tL_messages_stickerSet == null && this.Q) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void u0() {
        String str;
        if (this.V != null) {
            MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
            if (this.S == null && (str = this.V.short_name) != null) {
                this.S = mediaDataController.getStickerSetByName(str);
            }
            if (this.S == null) {
                this.S = mediaDataController.getStickerSetById(this.V.f19823id);
            }
            if (this.S == null) {
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                tL_messages_getStickerSet.stickerset = this.V;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getStickerSet, new org.telegram.ui.so(14, this, mediaDataController));
            } else {
                if (this.d != null) {
                    D0();
                    C0();
                    this.d.l();
                }
                B0();
                mediaDataController.preloadStickerSetThumb(this.S);
                m0();
            }
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.S;
        if (tL_messages_stickerSet != null) {
            this.f25493h0 = !tL_messages_stickerSet.set.masks;
        }
        m0();
    }

    public final void v0(SendMessagesHelper.ImportingSticker importingSticker) {
        int indexOf = this.Y.indexOf(importingSticker);
        if (indexOf >= 0) {
            this.Y.remove(indexOf);
            this.d.u(indexOf);
            if (this.Y.isEmpty()) {
                dismiss();
            } else {
                C0();
            }
        }
    }

    public final void w0(int i10, boolean z10) {
        Integer num;
        float f7;
        if (this.W == null) {
            View[] viewArr = this.J;
            if ((z10 && viewArr[i10].getTag() != null) || (!z10 && viewArr[i10].getTag() == null)) {
                View view = viewArr[i10];
                if (z10) {
                    num = null;
                } else {
                    num = 1;
                }
                view.setTag(num);
                if (z10) {
                    viewArr[i10].setVisibility(0);
                }
                AnimatorSet[] animatorSetArr = this.I;
                AnimatorSet animatorSet = animatorSetArr[i10];
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[i10] = animatorSet2;
                View view2 = viewArr[i10];
                Property property = View.ALPHA;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                animatorSet2.playTogether(ObjectAnimator.ofFloat(view2, property, f7));
                animatorSetArr[i10].setDuration(150L);
                animatorSetArr[i10].addListener(new fb0(this, i10, z10, 1));
                animatorSetArr[i10].start();
            }
        }
    }

    public final void x0(View.OnClickListener onClickListener, String str, int i10) {
        y0(onClickListener, str, i10, -1, -1);
    }

    public final void y0(View.OnClickListener onClickListener, String str, int i10, int i11, int i12) {
        if (i10 >= 0) {
            r6 r6Var = this.f25505s;
            this.f25496k0 = i10;
            r6Var.setTextColor(getThemedColor(i10));
        }
        this.f25505s.c(str, false, true);
        this.f25505s.setOnClickListener(onClickListener);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f25505s.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.J[1].getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f25485c.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.K.getLayoutParams();
        if (onClickListener == null) {
            this.f25505s.setAlpha(0.0f);
        } else if (i11 >= 0 && i12 >= 0) {
            r6 r6Var2 = this.f25505s;
            int dp = AndroidUtilities.dp(24.0f);
            int themedColor = getThemedColor(i11);
            int themedColor2 = getThemedColor(i12);
            r6Var2.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, themedColor, themedColor2, themedColor2));
            this.f25508w.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20631h5));
            int dp2 = AndroidUtilities.dp(8.0f);
            marginLayoutParams.bottomMargin = dp2;
            marginLayoutParams.rightMargin = dp2;
            marginLayoutParams.topMargin = dp2;
            marginLayoutParams.leftMargin = dp2;
            int dp3 = AndroidUtilities.dp(64.0f);
            marginLayoutParams2.bottomMargin = dp3;
            marginLayoutParams3.bottomMargin = dp3;
            marginLayoutParams4.bottomMargin = dp3;
            if (this.f25505s.getAlpha() < 1.0f) {
                org.telegram.messenger.am.t(this.f25505s.animate().alpha(1.0f), js.h, 240L);
            }
        } else {
            this.f25505s.setBackground(org.telegram.ui.ActionBar.h6.h0(getThemedColor(org.telegram.ui.ActionBar.h6.f20631h5), org.telegram.ui.ActionBar.h6.m1(0.1f, getThemedColor(org.telegram.ui.ActionBar.h6.f20800q7))));
            this.f25508w.setBackgroundColor(0);
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            int dp4 = AndroidUtilities.dp(48.0f);
            marginLayoutParams2.bottomMargin = dp4;
            marginLayoutParams3.bottomMargin = dp4;
            marginLayoutParams4.bottomMargin = dp4;
            if (this.f25505s.getAlpha() < 1.0f) {
                org.telegram.messenger.am.t(this.f25505s.animate().alpha(1.0f), js.h, 240L);
            }
        }
        this.containerView.requestLayout();
    }

    public final void z0(int i10) {
        this.f25489e0 = i10;
        if (this.W == null) {
            float f7 = i10;
            this.h.setTranslationY(f7);
            if (this.X == null) {
                this.f25498n.setTranslationY(f7);
            }
            this.J[0].setTranslationY(f7);
        }
        this.containerView.invalidate();
    }

    public dz0(Context context, String str, ArrayList arrayList, ArrayList arrayList2) {
        super(1, context, (org.telegram.ui.ActionBar.c6) null, false);
        this.I = new AnimatorSet[2];
        this.J = new View[2];
        this.f25495j0 = true;
        this.f25497l0 = new com.google.firebase.messaging.n(6);
        this.m0 = new sy0(this);
        fixNavigationBar();
        this.N = (Activity) context;
        this.X = arrayList;
        this.f25482a0 = str;
        Utilities.globalQueue.postRunnable(new mh0(this, arrayList, arrayList2, 14));
        s0(context);
    }

    public dz0(Context context, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.InputStickerSet inputStickerSet, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, az0 az0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(1, context, c6Var, false);
        this.I = new AnimatorSet[2];
        this.J = new View[2];
        this.f25495j0 = true;
        this.f25497l0 = new com.google.firebase.messaging.n(6);
        this.m0 = new sy0(this);
        fixNavigationBar();
        this.f25484b0 = az0Var;
        this.V = inputStickerSet;
        this.S = tL_messages_stickerSet;
        this.L = m2Var;
        u0();
        s0(context);
    }
}
