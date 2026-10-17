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
public class oy0 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f29079u0 = 0;
    public View E;
    public w9 F;
    public TextView G;
    public j H;
    public final AnimatorSet[] I;
    public final View[] J;
    public ah.x K;
    public final org.telegram.ui.ActionBar.n2 L;
    public di.k M;
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
    public final String f29080a0;
    public Pattern f29081b;
    public final ly0 f29082b0;
    public ai.u1 f29083c;
    public my0 f29084c0;
    public ky0 d;
    public org.telegram.ui.x60 f29085d0;
    public s4.y e;
    public int f29086e0;
    public TLRPC.Document f29087f;
    public int f29088f0;
    public boolean f29089g0;
    public x90 h;
    public boolean f29090h0;
    public boolean f29091i0;
    public boolean f29092j0;
    public int f29093k0;
    public final com.google.firebase.messaging.l f29094l0;
    public final dy0 m0;
    public org.telegram.ui.ActionBar.u0 f29095n;
    public ay0 f29096n0;
    public String f29097o0;
    public int f29098p0;
    public boolean f29099q0;
    public org.telegram.ui.ActionBar.e1 f29100r;
    public String f29101r0;
    public q6 f29102s;
    public Runnable f29103s0;
    public ArrayList f29104t0;
    public sg.p0 v;
    public FrameLayout f29105w;
    public FrameLayout f29106x;
    public TextView f29107y;

    public oy0(Context context, Object obj, TLObject tLObject, org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, context, d6Var, false);
        this.I = new AnimatorSet[2];
        this.J = new View[2];
        this.f29092j0 = true;
        this.f29094l0 = new com.google.firebase.messaging.l(5);
        this.m0 = new dy0(this);
        this.resourcesProvider = d6Var;
        fixNavigationBar();
        this.N = (Activity) context;
        TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputStickeredMediaPhoto.f20342id = tL_inputPhoto;
            tL_inputPhoto.f20291id = photo.f20296id;
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
            tL_inputStickeredMediaDocument.f20341id = tL_inputDocument;
            tL_inputDocument.f20284id = document.f20278id;
            tL_inputDocument.access_hash = document.access_hash;
            byte[] bArr2 = document.file_reference;
            tL_inputDocument.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputDocument.file_reference = new byte[0];
            }
            tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
        }
        org.telegram.ui.zr0 zr0Var = (org.telegram.ui.zr0) this;
        this.f29088f0 = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getAttachedStickers, new ai.x2(zr0Var, obj, tL_messages_getAttachedStickers, new org.telegram.ui.xc(22, zr0Var, tL_messages_getAttachedStickers), 12));
        s0(context);
    }

    public static void B(oy0 oy0Var) {
        oy0Var.dismiss();
        MediaDataController.getInstance(oy0Var.currentAccount).toggleStickerSet(oy0Var.getContext(), oy0Var.S, 1, oy0Var.L, true, oy0Var.f29092j0);
    }

    public static void C(oy0 oy0Var) {
        oy0Var.dismiss();
        my0 my0Var = oy0Var.f29084c0;
        if (my0Var != null) {
            my0Var.a();
        }
        if (oy0Var.V != null && !MediaDataController.getInstance(oy0Var.currentAccount).cancelRemovingStickerSet(oy0Var.V.f20292id)) {
            TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
            tL_messages_installStickerSet.stickerset = oy0Var.V;
            ConnectionsManager.getInstance(oy0Var.currentAccount).sendRequest(tL_messages_installStickerSet, new y1(oy0Var, 13));
        }
    }

    public static void D(oy0 oy0Var, int i10) {
        String str;
        org.telegram.ui.ActionBar.n2 n2Var = oy0Var.L;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = oy0Var.S;
        if (tL_messages_stickerSet != null) {
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null && stickerSet.emojis) {
                str = "https://" + MessagesController.getInstance(oy0Var.currentAccount).linkPrefix + "/addemoji/" + oy0Var.S.set.short_name;
            } else {
                str = "https://" + MessagesController.getInstance(oy0Var.currentAccount).linkPrefix + "/addstickers/" + oy0Var.S.set.short_name;
            }
            String str2 = str;
            if (i10 == 1) {
                Context context = oy0Var.N;
                if (context == null && n2Var != null) {
                    context = n2Var.getParentActivity();
                }
                if (context == null) {
                    context = oy0Var.getContext();
                }
                by0 by0Var = new by0(oy0Var, context, str2, str2, oy0Var.resourcesProvider);
                if (n2Var != null) {
                    n2Var.showDialog(by0Var);
                    if (n2Var instanceof org.telegram.ui.sn) {
                        by0Var.setCalcMandatoryInsets(((org.telegram.ui.sn) n2Var).C9());
                        return;
                    }
                    return;
                }
                by0Var.show();
            } else if (i10 == 2) {
                try {
                    AndroidUtilities.addToClipboard(str2);
                    new xc((FrameLayout) oy0Var.containerView, oy0Var.resourcesProvider).k(false).j();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else if (i10 == 3) {
                if (oy0Var.R) {
                    oy0Var.o0();
                } else {
                    oy0Var.q0();
                }
            } else if (i10 == 4) {
                ty0.c(oy0Var.S.set, oy0Var.resourcesProvider, oy0Var.getContext(), new d(oy0Var, 20));
            } else if (i10 == 5) {
                ty0.b(oy0Var.S.set, oy0Var.resourcesProvider, oy0Var.getContext(), new zx0(oy0Var, 2));
            }
        }
    }

    public static void F(oy0 oy0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        int i10;
        org.telegram.ui.ActionBar.n2 n2Var = oy0Var.L;
        TLRPC.StickerSet stickerSet = oy0Var.S.set;
        if (stickerSet.masks) {
            i10 = 1;
        } else if (stickerSet.emojis) {
            i10 = 5;
        } else {
            i10 = 0;
        }
        try {
            if (tL_error == null) {
                if (oy0Var.f29092j0) {
                    qc.g(n2Var, new tx0(oy0Var.f29105w.getContext(), oy0Var.S, 1, 2, null, oy0Var.resourcesProvider), 1500).j();
                }
                if (tLObject instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                    MediaDataController.getInstance(oy0Var.currentAccount).processStickerSetInstallResultArchive(n2Var, true, i10, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject);
                }
            } else {
                Toast.makeText(oy0Var.getContext(), LocaleController.getString(R.string.ErrorOccurred), 0).show();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        MediaDataController.getInstance(oy0Var.currentAccount).loadStickers(i10, false, true);
    }

    public static void G(oy0 oy0Var, TLRPC.TL_error tL_error, TLObject tLObject, MediaDataController mediaDataController) {
        TLRPC.StickerSet stickerSet;
        boolean z10 = false;
        oy0Var.f29088f0 = 0;
        if (tL_error == null) {
            cn0 cn0Var = new cn0(oy0Var, 1);
            cn0Var.addTarget(oy0Var.containerView);
            TransitionManager.beginDelayedTransition(oy0Var.container, cn0Var);
            oy0Var.f29095n.setVisibility(0);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            oy0Var.S = tL_messages_stickerSet;
            mediaDataController.putStickerSet(tL_messages_stickerSet, false);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = oy0Var.S;
            if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents.isEmpty()) {
                oy0Var.dismiss();
                return;
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = oy0Var.S;
            if (tL_messages_stickerSet3 != null && (stickerSet = tL_messages_stickerSet3.set) != null && !stickerSet.masks) {
                z10 = true;
            }
            oy0Var.f29090h0 = z10;
            oy0Var.m0();
            mediaDataController.preloadStickerSetThumb(oy0Var.S);
            oy0Var.D0();
            oy0Var.C0();
            oy0Var.B0();
            oy0Var.d.l();
            return;
        }
        oy0Var.dismiss();
        org.telegram.ui.ActionBar.n2 n2Var = oy0Var.L;
        if (n2Var != null) {
            org.telegram.messenger.wh.q(R.string.AddStickersNotFound, xc.a0(n2Var), null);
        }
    }

    public static void H(oy0 oy0Var, String str, TextView textView) {
        TLRPC.TL_stickers_checkShortName tL_stickers_checkShortName = new TLRPC.TL_stickers_checkShortName();
        tL_stickers_checkShortName.short_name = str;
        oy0Var.f29098p0 = ConnectionsManager.getInstance(oy0Var.currentAccount).sendRequest(tL_stickers_checkShortName, new ai.p2(oy0Var, str, textView, 17), 2);
    }

    public static void I(oy0 oy0Var) {
        boolean z10;
        TLRPC.StickerSet stickerSet;
        MediaDataController mediaDataController = MediaDataController.getInstance(oy0Var.currentAccount);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = oy0Var.S;
        if (tL_messages_stickerSet != null && mediaDataController.isStickerPackInstalled(tL_messages_stickerSet.set.f20299id)) {
            z10 = false;
        } else {
            z10 = true;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = oy0Var.S;
        if (tL_messages_stickerSet2 != null && (stickerSet = tL_messages_stickerSet2.set) != null && stickerSet.creator && oy0Var.f29100r == null) {
            oy0Var.f29095n.e(3, R.drawable.tabs_reorder, LocaleController.getString(R.string.StickersReorder));
            oy0Var.f29095n.e(4, R.drawable.msg_edit, LocaleController.getString(R.string.EditName));
            if (z10) {
                oy0Var.f29100r = oy0Var.f29095n.e(5, R.drawable.msg_delete, LocaleController.getString(R.string.Delete));
            } else {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, oy0Var.getContext(), oy0Var.resourcesProvider);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, oy0Var.resourcesProvider).setOnClickListener(new xx0(oy0Var, 4));
                org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.StickersDeleteForEveryone), false, oy0Var.resourcesProvider);
                int themedColor = oy0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21224q7);
                c10.c(themedColor, themedColor);
                c10.setSelectorColor(org.telegram.ui.ActionBar.h6.m1(0.1f, themedColor));
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.StickersRemoveForMe), false, oy0Var.resourcesProvider).setOnClickListener(new xx0(oy0Var, 6));
                c10.setOnClickListener(new xx0(oy0Var, 7));
                oy0Var.f29100r = oy0Var.f29095n.i(R.drawable.msg_delete, null, LocaleController.getString(R.string.Delete), actionBarPopupWindow$ActionBarPopupWindowLayout);
            }
            oy0Var.f29095n.a(-1);
            ob0 ob0Var = new ob0(oy0Var.currentAccount, 4, oy0Var.getContext(), new ArrayList(), oy0Var.resourcesProvider);
            ob0Var.setOnClickListener(new xx0(oy0Var, 8));
            ob0Var.setTag(R.id.fit_width_tag, 1);
            org.telegram.ui.ActionBar.u0 u0Var = oy0Var.f29095n;
            u0Var.o();
            u0Var.f21728b.a(ob0Var, new LinearLayout.LayoutParams(-1, -2));
            int themedColor2 = oy0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21224q7);
            oy0Var.f29100r.c(themedColor2, themedColor2);
            oy0Var.f29100r.setSelectorColor(org.telegram.ui.ActionBar.h6.m1(0.1f, themedColor2));
            if (oy0Var.f29100r.getRightIcon() != null) {
                oy0Var.f29100r.getRightIcon().setColorFilter(themedColor2);
            }
        }
        if (oy0Var.f29095n.getPopupLayout() != null) {
            oy0Var.f29095n.getPopupLayout().requestLayout();
        }
        oy0Var.f29095n.M(null, null);
    }

    public static void P(oy0 oy0Var) {
        if (oy0Var.f29083c.getChildCount() <= 0) {
            oy0Var.z0(oy0Var.f29083c.getPaddingTop());
            return;
        }
        int i10 = 0;
        View view = null;
        int i11 = -1;
        for (int i12 = 0; i12 < oy0Var.f29083c.getChildCount(); i12++) {
            View childAt = oy0Var.f29083c.getChildAt(i12);
            oy0Var.f29083c.getClass();
            int R = RecyclerView.R(childAt);
            if (i11 == -1 || i11 > R) {
                view = childAt;
                i11 = R;
            }
        }
        if (view != null && view.getTop() >= 0) {
            int top = view.getTop();
            oy0Var.w0(0, false);
            i10 = top;
        } else {
            oy0Var.w0(0, true);
        }
        oy0Var.w0(1, true);
        if (oy0Var.f29086e0 != i10) {
            oy0Var.z0(i10);
        }
    }

    public static void n(oy0 oy0Var, View view, int i10) {
        TLRPC.StickerSet stickerSet;
        String str;
        if (view instanceof iy0) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = oy0Var.S;
            org.telegram.ui.ActionBar.n2 n2Var = oy0Var.L;
            org.telegram.ui.ActionBar.d6 d6Var = oy0Var.resourcesProvider;
            if (n2Var != null) {
                Context context = n2Var.getContext();
                if (!(n2Var instanceof org.telegram.ui.sn)) {
                    ty0.a(tL_messages_stickerSet, n2Var, d6Var);
                    return;
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert3, 0, context, d6Var);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(LocaleController.getString(R.string.StickersCreateNewSticker));
                org.telegram.ui.Cells.t0.m(R.drawable.menu_sticker_add, 0, arrayList3, arrayList2);
                arrayList.add(LocaleController.getString(R.string.StickersAddAnExistingSticker));
                arrayList3.add(Integer.valueOf(R.drawable.menu_sticker_select));
                arrayList2.add(1);
                org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                ci.e0 e0Var = new ci.e0(m1Var, arrayList2, tL_messages_stickerSet, n2Var, d6Var, 11);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, ((Integer) arrayList3.get(i11)).intValue(), (CharSequence) arrayList.get(i11), false, d6Var);
                    c10.setTag(Integer.valueOf(i11));
                    c10.setOnClickListener(e0Var);
                }
                m1Var.f21573c = 100;
                m1Var.f21575g = true;
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
        } else if (!oy0Var.R) {
            if (oy0Var.W != null) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) oy0Var.d.f28025f.get(i10);
                if (stickerSetCovered != null) {
                    oy0Var.dismiss();
                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                    TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                    tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                    tL_inputStickerSetID.f20292id = stickerSet2.f20299id;
                    new oy0(oy0Var.N, oy0Var.L, tL_inputStickerSetID, null, null, oy0Var.resourcesProvider).show();
                    return;
                }
                return;
            }
            ArrayList arrayList4 = oy0Var.Y;
            if (arrayList4 != null) {
                if (i10 >= 0 && i10 < arrayList4.size()) {
                    SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) oy0Var.Y.get(i10);
                    oy0Var.U = importingSticker;
                    if (importingSticker.validated) {
                        TextView textView = oy0Var.G;
                        textView.setText(Emoji.replaceEmoji(importingSticker.emoji, textView.getPaint().getFontMetricsInt(), false));
                        w9 w9Var = oy0Var.F;
                        ImageLocation forPath = ImageLocation.getForPath(oy0Var.U.path);
                        if (oy0Var.U.animated) {
                            str = "tgs";
                        } else {
                            str = null;
                        }
                        w9Var.m(forPath, null, null, null, null, str, 0, null);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) oy0Var.f29106x.getLayoutParams();
                        layoutParams.topMargin = oy0Var.f29086e0;
                        oy0Var.f29106x.setLayoutParams(layoutParams);
                        oy0Var.f29106x.setVisibility(0);
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ObjectAnimator.ofFloat(oy0Var.f29106x, View.ALPHA, 0.0f, 1.0f));
                        animatorSet.setDuration(200L);
                        animatorSet.start();
                        return;
                    }
                    return;
                }
                return;
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = oy0Var.S;
            if (tL_messages_stickerSet2 != null && i10 >= 0 && i10 < tL_messages_stickerSet2.documents.size()) {
                oy0Var.T = oy0Var.S.documents.get(i10);
                int i12 = 0;
                while (true) {
                    if (i12 >= oy0Var.T.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = oy0Var.T.attributes.get(i12);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                        String str2 = documentAttribute.alt;
                        if (str2 != null && str2.length() > 0) {
                            TextView textView2 = oy0Var.G;
                            textView2.setText(Emoji.replaceEmoji(documentAttribute.alt, textView2.getPaint().getFontMetricsInt(), false));
                        }
                    } else {
                        i12++;
                    }
                }
                oy0Var.G.setText(Emoji.replaceEmoji(MediaDataController.getInstance(oy0Var.currentAccount).getEmojiForSticker(oy0Var.T.f20278id), oy0Var.G.getPaint().getFontMetricsInt(), false));
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = oy0Var.S;
                if ((tL_messages_stickerSet3 == null || (stickerSet = tL_messages_stickerSet3.set) == null || !stickerSet.emojis) && !org.telegram.ui.gt.q().y(view)) {
                    oy0Var.F.getImageReceiver().setImage(ImageLocation.getForDocument(oy0Var.T), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(oy0Var.T.thumbs, 90), oy0Var.T), (String) null, "webp", oy0Var.S, 1);
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) oy0Var.f29106x.getLayoutParams();
                    layoutParams2.topMargin = oy0Var.f29086e0;
                    oy0Var.f29106x.setLayoutParams(layoutParams2);
                    oy0Var.f29106x.setVisibility(0);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(oy0Var.f29106x, View.ALPHA, 0.0f, 1.0f));
                    animatorSet2.setDuration(200L);
                    animatorSet2.start();
                }
            }
        }
    }

    public static void o(oy0 oy0Var) {
        oy0Var.f29095n.n();
        ty0.b(oy0Var.S.set, oy0Var.resourcesProvider, oy0Var.getContext(), new zx0(oy0Var, 4));
    }

    public static void p(org.telegram.ui.zr0 zr0Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers) {
        zr0Var.f29088f0 = 0;
        if (tL_error == null && (tLObject instanceof Vector)) {
            Vector vector = (Vector) tLObject;
            if (vector.objects.isEmpty()) {
                zr0Var.dismiss();
                return;
            } else if (vector.objects.size() == 1) {
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                zr0Var.V = tL_inputStickerSetID;
                TLRPC.StickerSet stickerSet = ((TLRPC.StickerSetCovered) vector.objects.get(0)).set;
                tL_inputStickerSetID.f20292id = stickerSet.f20299id;
                tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                zr0Var.u0();
                return;
            } else {
                ArrayList arrayList = new ArrayList();
                zr0Var.W = arrayList;
                arrayList.addAll(vector.objects);
                zr0Var.f29083c.setLayoutParams(w7.z5.a(-1.0f, 0.0f, 0.0f, 0.0f, 48.0f, -1, 51));
                zr0Var.h.setVisibility(8);
                zr0Var.J[0].setVisibility(8);
                zr0Var.d.l();
                return;
            }
        }
        f5.e0(zr0Var.currentAccount, tL_error, zr0Var.L, tL_messages_getAttachedStickers, new Object[0]);
        zr0Var.dismiss();
    }

    public static void p0(org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, TLRPC.Document document) {
        org.telegram.ui.sn snVar;
        boolean z10;
        TLRPC.StickerSet stickerSet;
        if (n2Var != null) {
            if (n2Var instanceof org.telegram.ui.sn) {
                snVar = (org.telegram.ui.sn) n2Var;
            } else {
                snVar = null;
            }
            org.telegram.ui.sn snVar2 = snVar;
            if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.creator) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (MessageObject.isStaticStickerDocument(document)) {
                ArrayList arrayList = new ArrayList();
                File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true);
                if (pathToAttach != null && pathToAttach.exists()) {
                    AndroidUtilities.runOnUIThread(new ai.m4(pathToAttach, arrayList, n2Var, snVar2, document, z10, tL_messages_stickerSet), 300L);
                    return;
                }
                return;
            }
            AndroidUtilities.runOnUIThread(new ai.e2(n2Var, tL_messages_stickerSet, document, snVar2, z10, 19), 300L);
        }
    }

    public static void q(org.telegram.ui.zr0 zr0Var, Object obj, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers, org.telegram.ui.xc xcVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && obj != null) {
            FileRefController.getInstance(zr0Var.currentAccount).requestReference(obj, tL_messages_getAttachedStickers, xcVar);
        } else {
            xcVar.run(tLObject, tL_error);
        }
    }

    public static void r(oy0 oy0Var) {
        oy0Var.dismiss();
        MediaDataController.getInstance(oy0Var.currentAccount).toggleStickerSet(oy0Var.getContext(), oy0Var.S, 0, oy0Var.L, true, oy0Var.f29092j0);
    }

    public static void s(oy0 oy0Var) {
        oy0Var.f29095n.n();
        oy0Var.dismiss();
        MediaDataController.getInstance(oy0Var.currentAccount).toggleStickerSet(oy0Var.getContext(), oy0Var.S, 1, oy0Var.L, true, true);
    }

    public static void t(oy0 oy0Var) {
        oy0Var.dismiss();
        MediaDataController.getInstance(oy0Var.currentAccount).toggleStickerSet(oy0Var.getContext(), oy0Var.S, 1, oy0Var.L, false, false);
    }

    public static void v(oy0 oy0Var) {
        oy0Var.dismiss();
        MediaDataController.getInstance(oy0Var.currentAccount).toggleStickerSet(oy0Var.getContext(), oy0Var.S, 1, oy0Var.L, false, false);
    }

    public static boolean x(oy0 oy0Var, MotionEvent motionEvent) {
        if (oy0Var.R) {
            return false;
        }
        return org.telegram.ui.gt.q().s(motionEvent, oy0Var.f29083c, oy0Var.H, oy0Var.m0, oy0Var.resourcesProvider);
    }

    public static void y(oy0 oy0Var, ArrayList arrayList, Boolean bool) {
        oy0Var.Y = arrayList;
        if (arrayList.isEmpty()) {
            oy0Var.dismiss();
            return;
        }
        oy0Var.d.l();
        if (bool.booleanValue()) {
            oy0Var.Z = new HashMap();
            int size = oy0Var.Y.size();
            for (int i10 = 0; i10 < size; i10++) {
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) oy0Var.Y.get(i10);
                oy0Var.Z.put(importingSticker.path, importingSticker);
                FileLoader.getInstance(oy0Var.currentAccount).uploadFile(importingSticker.path, false, true, 67108864);
            }
        }
        oy0Var.C0();
    }

    public static void z(oy0 oy0Var, int[] iArr, EditTextBoldCursor editTextBoldCursor, TextView textView, TextView textView2, AlertDialog$Builder alertDialog$Builder) {
        int i10 = iArr[0];
        if (i10 != 1) {
            if (i10 == 0) {
                iArr[0] = 1;
                TLRPC.TL_stickers_suggestShortName tL_stickers_suggestShortName = new TLRPC.TL_stickers_suggestShortName();
                String obj = editTextBoldCursor.getText().toString();
                oy0Var.f29101r0 = obj;
                tL_stickers_suggestShortName.title = obj;
                ConnectionsManager.getInstance(oy0Var.currentAccount).sendRequest(tL_stickers_suggestShortName, new ai.s9(oy0Var, editTextBoldCursor, textView, textView2, iArr, 7));
            } else if (i10 == 2) {
                iArr[0] = 3;
                if (!oy0Var.f29099q0) {
                    AndroidUtilities.shakeView(editTextBoldCursor);
                    try {
                        editTextBoldCursor.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                SendMessagesHelper.getInstance(oy0Var.currentAccount).prepareImportStickers(oy0Var.f29101r0, oy0Var.f29097o0, oy0Var.f29080a0, oy0Var.Y, new yx0(oy0Var));
                alertDialog$Builder.f20601a.L0.run();
                oy0Var.dismiss();
            }
        }
    }

    public final void A0(boolean z10) {
        oy0 oy0Var = this.d.f28027r;
        if (oy0Var.W != null) {
            int childCount = oy0Var.f29083c.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = oy0Var.f29083c.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.r3) {
                    ((org.telegram.ui.Cells.r3) childAt).d();
                }
            }
        }
        this.h.setHighlightColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21129l5));
        this.f29106x.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21057h5) & (-536870913));
        this.f29095n.setIconColor(getThemedColor(org.telegram.ui.ActionBar.h6.Ji));
        this.f29095n.G(getThemedColor(org.telegram.ui.ActionBar.h6.E8), false);
        this.f29095n.G(getThemedColor(org.telegram.ui.ActionBar.h6.F8), true);
        this.f29095n.setPopupItemsSelectorColor(getThemedColor(org.telegram.ui.ActionBar.h6.I5));
        this.f29095n.B(getThemedColor(org.telegram.ui.ActionBar.h6.G8));
        if (this.f29100r != null) {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.f21224q7);
            this.f29100r.c(themedColor, themedColor);
            this.f29100r.setSelectorColor(org.telegram.ui.ActionBar.h6.m1(0.1f, themedColor));
            if (this.f29100r.getRightIcon() != null) {
                this.f29100r.getRightIcon().setColorFilter(themedColor);
            }
        }
        if (z10) {
            if (org.telegram.ui.ActionBar.h6.vl != null && this.f29104t0 == null) {
                ArrayList themeDescriptions = getThemeDescriptions();
                this.f29104t0 = themeDescriptions;
                int size = themeDescriptions.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((org.telegram.ui.ActionBar.j6) this.f29104t0.get(i11)).h = null;
                }
            }
            int size2 = this.f29104t0.size();
            for (int i12 = 0; i12 < size2; i12++) {
                org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) this.f29104t0.get(i12);
                j6Var.e(getThemedColor(j6Var.f21455f), false, false);
            }
        }
        if (org.telegram.ui.ActionBar.h6.vl == null && this.f29104t0 != null) {
            this.f29104t0 = null;
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
                if (this.f29081b == null) {
                    this.f29081b = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
                }
                Matcher matcher = this.f29081b.matcher(replaceEmoji);
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
                    spannableStringBuilder.setSpan(new n4(replaceEmoji.subSequence(start + 1, end).toString(), 1, this), start, end, 0);
                }
                if (spannableStringBuilder != null) {
                    replaceEmoji = spannableStringBuilder;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            this.h.setText(replaceEmoji);
            if (t0()) {
                int measuredWidth = this.f29083c.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = AndroidUtilities.displaySize.x;
                }
                ky0 ky0Var = this.d;
                if (AndroidUtilities.isTablet()) {
                    f7 = 60.0f;
                } else {
                    f7 = 45.0f;
                }
                ky0Var.d = Math.max(1, measuredWidth / AndroidUtilities.dp(f7));
            } else {
                this.d.d = 5;
            }
            this.M.y1(this.d.d);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.S;
            int i17 = -1;
            if (tL_messages_stickerSet2 != null && (stickerSet7 = tL_messages_stickerSet2.set) != null && stickerSet7.emojis && !UserConfig.getInstance(this.currentAccount).isPremium() && this.f29085d0 == null) {
                if (this.S.documents != null) {
                    for (int i18 = 0; i18 < this.S.documents.size(); i18++) {
                        if (!MessageObject.isFreeEmoji(this.S.documents.get(i18))) {
                            this.v.setVisibility(0);
                            this.f29102s.setBackground(null);
                            x0(null, null, -1);
                            this.v.a(LocaleController.getString(R.string.UnlockPremiumEmoji), new xx0(this, 0), false);
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
                    if (stickerSets.get(i19) != null && stickerSets.get(i19).set != null && stickerSets.get(i19).set.f20299id == this.S.set.f20299id) {
                        z11 = true;
                        break;
                    }
                }
                z11 = false;
                z10 = !z11;
            } else if (tL_messages_stickerSet3 != null && (stickerSet = tL_messages_stickerSet3.set) != null && mediaDataController.isStickerPackInstalled(stickerSet.f20299id)) {
                z10 = false;
            } else {
                z10 = true;
            }
            org.telegram.ui.x60 x60Var = this.f29085d0;
            if (x60Var != null) {
                xx0 xx0Var = new xx0(this, 5);
                boolean z12 = x60Var.f43005a;
                if (x60Var.f43007c.N) {
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
                boolean z13 = this.f29085d0.f43005a;
                if (z13) {
                    i13 = org.telegram.ui.ActionBar.h6.f21224q7;
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
                y0(xx0Var, str, i13, i14, i17);
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
                y0(new xx0(this, 9), formatPluralString2, org.telegram.ui.ActionBar.h6.Sh, org.telegram.ui.ActionBar.h6.Oh, org.telegram.ui.ActionBar.h6.Qh);
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
                    y0(new xx0(this, 10), formatPluralString, org.telegram.ui.ActionBar.h6.Sh, org.telegram.ui.ActionBar.h6.Oh, org.telegram.ui.ActionBar.h6.Qh);
                } else {
                    String str2 = formatPluralString;
                    if (this.S.set.official) {
                        x0(new xx0(this, 11), str2, org.telegram.ui.ActionBar.h6.f21224q7);
                    } else {
                        x0(new xx0(this, 12), str2, org.telegram.ui.ActionBar.h6.f21224q7);
                    }
                }
            }
            this.d.l();
            return;
        }
        ArrayList arrayList5 = this.X;
        if (arrayList5 != null) {
            x90 x90Var = this.h;
            ArrayList arrayList6 = this.Y;
            if (arrayList6 != null) {
                size = arrayList6.size();
            } else {
                size = arrayList5.size();
            }
            x90Var.setText(LocaleController.formatPluralString("Stickers", size, new Object[0]));
            HashMap hashMap = this.Z;
            if (hashMap != null && !hashMap.isEmpty()) {
                x0(null, LocaleController.getString(R.string.ImportStickersProcessing), org.telegram.ui.ActionBar.h6.f21223q5);
                this.f29102s.setEnabled(false);
                return;
            }
            xx0 xx0Var2 = new xx0(this, 13);
            int i20 = R.string.ImportStickers;
            ArrayList arrayList7 = this.Y;
            if (arrayList7 != null) {
                size2 = arrayList7.size();
            } else {
                size2 = arrayList5.size();
            }
            x0(xx0Var2, LocaleController.formatString("ImportStickers", i20, LocaleController.formatPluralString("Stickers", size2, new Object[0])), org.telegram.ui.ActionBar.h6.f21168n5);
            this.f29102s.setEnabled(true);
            return;
        }
        x0(new xx0(this, 14), LocaleController.getString(R.string.Close), org.telegram.ui.ActionBar.h6.f21168n5);
    }

    public final void D0() {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Point point = AndroidUtilities.displaySize;
        int min = (int) ((Math.min(point.x, point.y) / 2) / AndroidUtilities.density);
        if (this.X != null) {
            this.f29107y.setText(LocaleController.getString(R.string.ImportStickersRemove));
            this.f29107y.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21224q7));
            float f7 = min;
            this.F.setLayoutParams(w7.z5.a(f7, 0.0f, 0.0f, 0.0f, 30.0f, min, 17));
            this.G.setLayoutParams(w7.z5.a(f7, 0.0f, 0.0f, 0.0f, 30.0f, min, 17));
            this.f29107y.setVisibility(0);
            this.E.setVisibility(0);
        } else if (this.f29082b0 != null && ((tL_messages_stickerSet = this.S) == null || !tL_messages_stickerSet.set.masks)) {
            this.f29107y.setText(LocaleController.getString(R.string.SendSticker));
            float f10 = min;
            this.F.setLayoutParams(w7.z5.a(f10, 0.0f, 0.0f, 0.0f, 30.0f, min, 17));
            this.G.setLayoutParams(w7.z5.a(f10, 0.0f, 0.0f, 0.0f, 30.0f, min, 17));
            this.f29107y.setVisibility(0);
            this.E.setVisibility(0);
        } else {
            this.f29107y.setText(LocaleController.getString(R.string.Close));
            this.F.setLayoutParams(w7.z5.e(min, min, 17));
            this.G.setLayoutParams(w7.z5.e(min, min, 17));
            this.f29107y.setVisibility(8);
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
            ai.u1 u1Var = this.f29083c;
            if (u1Var != null) {
                int childCount = u1Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    this.f29083c.getChildAt(i12).invalidate();
                }
            }
        } else if (i10 == NotificationCenter.fileUploaded) {
            HashMap hashMap = this.Z;
            if (hashMap != null) {
                String str = (String) objArr[0];
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) hashMap.get(str);
                if (importingSticker != null) {
                    importingSticker.uploadMedia(this.currentAccount, (TLRPC.InputFile) objArr[1], new lg(this, str, importingSticker, 27));
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
                    tL_messages_stickerSet = mediaDataController.getStickerSetById(this.V.f20292id);
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
        this.f29094l0.K(false);
        Runnable runnable = this.f29103s0;
        if (runnable != null) {
            runnable.run();
        }
        if (this.f29088f0 != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f29088f0, true);
            this.f29088f0 = 0;
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
        z6 z6Var = new z6(this, 9);
        ViewGroup viewGroup = this.containerView;
        Drawable[] drawableArr = {this.shadowDrawable};
        int i10 = org.telegram.ui.ActionBar.h6.f21057h5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(viewGroup, 0, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.containerView, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Ii));
        oy0 oy0Var = this.d.f28027r;
        if (oy0Var.W != null) {
            org.telegram.ui.Cells.r3.a(arrayList, oy0Var.f29083c, z6Var);
        }
        View[] viewArr = this.J;
        View view = viewArr[0];
        int i11 = org.telegram.ui.ActionBar.h6.V5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(viewArr[1], 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f29083c, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f21092j5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 2, null, null, null, null, org.telegram.ui.ActionBar.h6.f21112k5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f29095n, 65568, null, null, null, null, org.telegram.ui.ActionBar.h6.Ni));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f29102s, 32, null, null, null, null, i10));
        q6 q6Var = this.f29102s;
        int i12 = org.telegram.ui.ActionBar.h6.f21075i6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(q6Var, 65568, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f29102s, 4, null, null, null, null, this.f29093k0));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f29107y, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f21168n5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f29107y, 32, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f29107y, 65568, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.E, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.h6.f21129l5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.h6.Ji));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.h6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.h6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.h6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.h6.G8));
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
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21338w6));
            this.f29099q0 = true;
            this.f29097o0 = str;
            return;
        }
        ay0 ay0Var = this.f29096n0;
        if (ay0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ay0Var);
            this.f29096n0 = null;
            this.f29097o0 = null;
            if (this.f29098p0 != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f29098p0, true);
            }
        }
        if (TextUtils.isEmpty(str)) {
            textView.setText(LocaleController.getString(R.string.ImportStickersEnterUrlInfo));
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21223q5));
            return;
        }
        this.f29099q0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                int length = str.length();
                for (int i10 = 0; i10 < length; i10++) {
                    char charAt = str.charAt(i10);
                    if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        textView.setText(LocaleController.getString(R.string.ImportStickersEnterUrlInfo));
                        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21207p7));
                        return;
                    }
                }
            } else {
                textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalid));
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21207p7));
                return;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 32) {
                textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalidLong));
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21207p7));
                return;
            }
            textView.setText(LocaleController.getString(R.string.ImportStickersLinkChecking));
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.F6));
            this.f29097o0 = str;
            ay0 ay0Var2 = new ay0(this, str, textView, 0);
            this.f29096n0 = ay0Var2;
            AndroidUtilities.runOnUIThread(ay0Var2, 300L);
            return;
        }
        textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalidShort));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21207p7));
    }

    public final void o0() {
        if (!this.R) {
            return;
        }
        this.e.d(null);
        this.R = false;
        this.f29094l0.K(true);
        AndroidUtilities.forEachViews((RecyclerView) this.f29083c, (Utilities.Callback<View>) new ci.e(14));
        this.f29095n.postDelayed(new zx0(this, 0), 200L);
        this.f29102s.c(LocaleController.getString(R.string.EditStickers), true, true);
    }

    @Override
    public final void onBackPressed() {
        if (org.telegram.ui.gt.q().E) {
            org.telegram.ui.gt.q().o();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onStart() {
        super.onStart();
        qc.a((FrameLayout) this.containerView, new ah.m0(this, 9));
    }

    @Override
    public final void onStop() {
        super.onStop();
        qc.h((FrameLayout) this.containerView);
    }

    public final void q0() {
        if (this.R) {
            return;
        }
        this.e.d(this.f29083c);
        this.R = true;
        com.google.firebase.messaging.l lVar = this.f29094l0;
        char c10 = 0;
        lVar.K(false);
        float f7 = 0.0f;
        Float valueOf = Float.valueOf(0.0f);
        ArrayList arrayList = (ArrayList) lVar.d;
        if (arrayList.isEmpty()) {
            for (int i10 = 0; i10 < 6; i10++) {
                arrayList.add(valueOf);
                ((ArrayList) lVar.e).add(valueOf);
                ((ArrayList) lVar.f7650f).add(valueOf);
            }
        }
        int i11 = 0;
        for (int i12 = 6; i11 < i12; i12 = 6) {
            long nextFloat = Utilities.random.nextFloat() * 300;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, -2.0f, 0.0f, 2.0f, 0.0f);
            ofFloat.addUpdateListener(new ny0(lVar, i11, 3));
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(1);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setCurrentPlayTime(nextFloat);
            long j10 = 300;
            ofFloat.setDuration(j10);
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
            ofFloat2.addUpdateListener(new ny0(lVar, i11, 4));
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
            ofFloat3.addUpdateListener(new ny0(lVar, i11, 5));
            ofFloat3.setRepeatCount(-1);
            ofFloat3.setRepeatMode(1);
            ofFloat3.setInterpolator(new LinearInterpolator());
            ofFloat3.setCurrentPlayTime(nextFloat);
            ofFloat3.setDuration(j10);
            ofFloat3.start();
            ((ArrayList) lVar.f7647a).add(ofFloat);
            ((ArrayList) lVar.f7648b).add(ofFloat2);
            ((ArrayList) lVar.f7649c).add(ofFloat3);
            i11++;
            f7 = f10;
            c10 = c11;
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f29083c, (Utilities.Callback<View>) new ci.e(15));
        this.f29095n.postDelayed(new zx0(this, 1), 200L);
        this.f29102s.c(LocaleController.getString(R.string.Done), true, true);
    }

    public final void r0() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f29106x, View.ALPHA, 0.0f));
        animatorSet.setDuration(200L);
        animatorSet.addListener(new c80(this, 23));
        animatorSet.start();
    }

    public final void s0(Context context) {
        int i10;
        gy0 gy0Var = new gy0(this, context);
        this.containerView = gy0Var;
        gy0Var.setWillNotDraw(false);
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
        ai.u1 u1Var = new ai.u1(this, context, 24);
        this.f29083c = u1Var;
        u1Var.setTag(14);
        ai.u1 u1Var2 = this.f29083c;
        getContext();
        di.k kVar = new di.k(this);
        this.M = kVar;
        u1Var2.setLayoutManager(kVar);
        this.M.O = new ai.q1(this, 6);
        this.e = new s4.y(new hy0(this));
        ai.u1 u1Var3 = this.f29083c;
        ky0 ky0Var = new ky0(this, context);
        this.d = ky0Var;
        u1Var3.setAdapter(ky0Var);
        this.f29083c.setVerticalScrollBarEnabled(false);
        this.f29083c.i(new ci.l(8));
        this.f29083c.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.f29083c.setClipToPadding(false);
        this.f29083c.setEnabled(true);
        this.f29083c.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.h6.A5));
        this.f29083c.setOnTouchListener(new rk(this, 6));
        this.f29083c.setOnScrollListener(new kv(this, 11));
        j jVar = new j(this, 16);
        this.H = jVar;
        this.f29083c.setOnItemClickListener(jVar);
        this.containerView.addView(this.f29083c, w7.z5.a(-1.0f, 0.0f, 48.0f, 0.0f, 48.0f, -1, 51));
        ah.x xVar = new ah.x(this, context, 23);
        this.K = xVar;
        this.containerView.addView(xVar, w7.z5.a(-1.0f, 0.0f, 0.0f, 0.0f, 48.0f, -1, 51));
        this.f29083c.setEmptyView(this.K);
        this.K.setOnTouchListener(new di.d(24));
        x90 x90Var = new x90(context, null);
        this.h = x90Var;
        x90Var.setLines(1);
        this.h.setSingleLine(true);
        this.h.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21092j5));
        this.h.setTextSize(1, 20.0f);
        this.h.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21112k5));
        this.h.setEllipsize(TextUtils.TruncateAt.END);
        this.h.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f));
        this.h.setGravity(16);
        this.h.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(this.h, w7.z5.a(50.0f, 0.0f, 0.0f, 40.0f, 0.0f, -1, 51));
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(org.telegram.ui.ActionBar.h6.Ji), false, this.resourcesProvider);
        this.f29095n = u0Var;
        u0Var.setLongClickEnabled(false);
        this.f29095n.setSubMenuOpenSide(2);
        this.f29095n.setIcon(R.drawable.ic_ab_other);
        this.f29095n.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(getThemedColor(org.telegram.ui.ActionBar.h6.Ni), 1, -1));
        this.containerView.addView(this.f29095n, w7.z5.a(40.0f, 0.0f, 5.0f, 5.0f, 0.0f, 40, 53));
        this.f29095n.e(1, R.drawable.msg_share, LocaleController.getString(R.string.StickersShare));
        this.f29095n.e(2, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink));
        this.f29095n.setOnClickListener(new xx0(this, 1));
        this.f29095n.setDelegate(new yx0(this));
        this.f29095n.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f29095n;
        if (this.V != null) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        u0Var2.setVisibility(i10);
        this.K.addView(new RadialProgressView(context, null), w7.z5.e(-2, -2, 17));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
        View view2 = new View(context);
        viewArr[1] = view2;
        view2.setBackgroundColor(getThemedColor(i12));
        this.containerView.addView(viewArr[1], layoutParams2);
        q6 q6Var = new q6(context, false, false, false);
        this.f29102s = q6Var;
        int i13 = org.telegram.ui.ActionBar.h6.f21057h5;
        int themedColor = getThemedColor(i13);
        int i14 = org.telegram.ui.ActionBar.h6.f21075i6;
        q6Var.setBackground(org.telegram.ui.ActionBar.h6.h0(themedColor, getThemedColor(i14)));
        q6 q6Var2 = this.f29102s;
        int i15 = org.telegram.ui.ActionBar.h6.f21168n5;
        this.f29093k0 = i15;
        q6Var2.setTextColor(getThemedColor(i15));
        this.f29102s.setTextSize(AndroidUtilities.dp(14.0f));
        this.f29102s.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        this.f29102s.setTypeface(AndroidUtilities.bold());
        this.f29102s.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f29105w = frameLayout;
        frameLayout.addView(this.f29102s, w7.z5.d(48.0f, -1));
        this.containerView.addView(this.f29105w, w7.z5.e(-1, -2, 83));
        sg.p0 p0Var = new sg.p0(AndroidUtilities.dp(24.0f), context, this.resourcesProvider, false);
        this.v = p0Var;
        p0Var.setIcon(R.raw.unlock_icon);
        this.v.setVisibility(4);
        this.containerView.addView(this.v, w7.z5.a(48.0f, 8.0f, 0.0f, 8.0f, 8.0f, -1, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f29106x = frameLayout2;
        frameLayout2.setVisibility(8);
        this.f29106x.setSoundEffectsEnabled(false);
        this.containerView.addView(this.f29106x, w7.z5.d(-1.0f, -1));
        this.f29106x.setOnClickListener(new xx0(this, 2));
        w9 w9Var = new w9(context);
        this.F = w9Var;
        w9Var.setAspectFit(true);
        this.F.setLayerNum(7);
        this.f29106x.addView(this.F);
        TextView textView = new TextView(context);
        this.G = textView;
        textView.setTextSize(1, 30.0f);
        this.G.setGravity(85);
        this.f29106x.addView(this.G);
        TextView textView2 = new TextView(context);
        this.f29107y = textView2;
        textView2.setTextSize(1, 14.0f);
        this.f29107y.setTextColor(getThemedColor(i15));
        this.f29107y.setBackground(org.telegram.ui.ActionBar.h6.h0(getThemedColor(i13), getThemedColor(i14)));
        this.f29107y.setGravity(17);
        this.f29107y.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
        this.f29107y.setTypeface(AndroidUtilities.bold());
        this.f29106x.addView(this.f29107y, w7.z5.e(-1, 48, 83));
        this.f29107y.setOnClickListener(new xx0(this, 3));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams3.bottomMargin = AndroidUtilities.dp(48.0f);
        View view3 = new View(context);
        this.E = view3;
        view3.setBackgroundColor(getThemedColor(i12));
        this.f29106x.addView(this.E, layoutParams3);
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
        this.f29103s0 = runnable;
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
                this.S = mediaDataController.getStickerSetById(this.V.f20292id);
            }
            if (this.S == null) {
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                tL_messages_getStickerSet.stickerset = this.V;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getStickerSet, new org.telegram.ui.xc(21, this, mediaDataController));
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
            this.f29090h0 = !tL_messages_stickerSet.set.masks;
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
                animatorSetArr[i10].addListener(new ua0(this, i10, z10, 1));
                animatorSetArr[i10].start();
            }
        }
    }

    public final void x0(View.OnClickListener onClickListener, String str, int i10) {
        y0(onClickListener, str, i10, -1, -1);
    }

    public final void y0(View.OnClickListener onClickListener, String str, int i10, int i11, int i12) {
        if (i10 >= 0) {
            q6 q6Var = this.f29102s;
            this.f29093k0 = i10;
            q6Var.setTextColor(getThemedColor(i10));
        }
        this.f29102s.c(str, false, true);
        this.f29102s.setOnClickListener(onClickListener);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f29102s.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.J[1].getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f29083c.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.K.getLayoutParams();
        if (onClickListener == null) {
            this.f29102s.setAlpha(0.0f);
        } else if (i11 >= 0 && i12 >= 0) {
            q6 q6Var2 = this.f29102s;
            int dp = AndroidUtilities.dp(24.0f);
            int themedColor = getThemedColor(i11);
            int themedColor2 = getThemedColor(i12);
            q6Var2.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, themedColor, themedColor2, themedColor2));
            this.f29105w.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21057h5));
            int dp2 = AndroidUtilities.dp(8.0f);
            marginLayoutParams.bottomMargin = dp2;
            marginLayoutParams.rightMargin = dp2;
            marginLayoutParams.topMargin = dp2;
            marginLayoutParams.leftMargin = dp2;
            int dp3 = AndroidUtilities.dp(64.0f);
            marginLayoutParams2.bottomMargin = dp3;
            marginLayoutParams3.bottomMargin = dp3;
            marginLayoutParams4.bottomMargin = dp3;
            if (this.f29102s.getAlpha() < 1.0f) {
                org.telegram.messenger.wh.t(this.f29102s.animate().alpha(1.0f), bs.h, 240L);
            }
        } else {
            this.f29102s.setBackground(org.telegram.ui.ActionBar.h6.h0(getThemedColor(org.telegram.ui.ActionBar.h6.f21057h5), org.telegram.ui.ActionBar.h6.m1(0.1f, getThemedColor(org.telegram.ui.ActionBar.h6.f21224q7))));
            this.f29105w.setBackgroundColor(0);
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            int dp4 = AndroidUtilities.dp(48.0f);
            marginLayoutParams2.bottomMargin = dp4;
            marginLayoutParams3.bottomMargin = dp4;
            marginLayoutParams4.bottomMargin = dp4;
            if (this.f29102s.getAlpha() < 1.0f) {
                org.telegram.messenger.wh.t(this.f29102s.animate().alpha(1.0f), bs.h, 240L);
            }
        }
        this.containerView.requestLayout();
    }

    public final void z0(int i10) {
        this.f29086e0 = i10;
        if (this.W == null) {
            float f7 = i10;
            this.h.setTranslationY(f7);
            if (this.X == null) {
                this.f29095n.setTranslationY(f7);
            }
            this.J[0].setTranslationY(f7);
        }
        this.containerView.invalidate();
    }

    public oy0(Context context, String str, ArrayList arrayList, ArrayList arrayList2) {
        super(1, context, (org.telegram.ui.ActionBar.d6) null, false);
        this.I = new AnimatorSet[2];
        this.J = new View[2];
        this.f29092j0 = true;
        this.f29094l0 = new com.google.firebase.messaging.l(5);
        this.m0 = new dy0(this);
        fixNavigationBar();
        this.N = (Activity) context;
        this.X = arrayList;
        this.f29080a0 = str;
        Utilities.globalQueue.postRunnable(new ay0(this, arrayList, arrayList2, 1));
        s0(context);
    }

    public oy0(Context context, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.InputStickerSet inputStickerSet, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ly0 ly0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, context, d6Var, false);
        this.I = new AnimatorSet[2];
        this.J = new View[2];
        this.f29092j0 = true;
        this.f29094l0 = new com.google.firebase.messaging.l(5);
        this.m0 = new dy0(this);
        fixNavigationBar();
        this.f29082b0 = ly0Var;
        this.V = inputStickerSet;
        this.S = tL_messages_stickerSet;
        this.L = n2Var;
        u0();
        s0(context);
    }
}
