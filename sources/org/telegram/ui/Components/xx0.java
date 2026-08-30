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
public class xx0 extends org.telegram.ui.ActionBar.g3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f30766r0 = 0;
    public View B;
    public p9 C;
    public TextView D;
    public k E;
    public final AnimatorSet[] F;
    public final View[] G;
    public dg.u2 H;
    public final org.telegram.ui.ActionBar.p2 I;
    public oh.k J;
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
    public final ux0 Y;
    public vx0 Z;
    public org.telegram.ui.h70 f30767a0;
    public Pattern f30768b;
    public int f30769b0;
    public lh.e1 f30770c;
    public int f30771c0;
    public tx0 d;
    public boolean f30772d0;
    public f2.e0 e;
    public boolean f30773e0;
    public TLRPC.Document f30774f;
    public boolean f30775f0;
    public boolean f30776g0;
    public e90 h;
    public int f30777h0;
    public final a9.a f30778i0;
    public final lx0 f30779j0;
    public hp f30780k0;
    public String f30781l0;
    public int m0;
    public org.telegram.ui.ActionBar.w0 f30782n;
    public boolean f30783n0;
    public String f30784o0;
    public Runnable f30785p0;
    public ArrayList f30786q0;
    public org.telegram.ui.ActionBar.g1 f30787r;
    public k6 f30788s;
    public eg.c1 v;
    public FrameLayout f30789w;
    public FrameLayout f30790x;
    public TextView f30791y;

    public xx0(Context context, Object obj, TLObject tLObject, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, false, false);
        this.F = new AnimatorSet[2];
        this.G = new View[2];
        this.f30776g0 = true;
        this.f30778i0 = new a9.a(10);
        this.f30779j0 = new lx0(this);
        this.resourcesProvider = f6Var;
        fixNavigationBar();
        this.K = (Activity) context;
        TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputStickeredMediaPhoto.f19254id = tL_inputPhoto;
            tL_inputPhoto.f19203id = photo.f19208id;
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
            tL_inputStickeredMediaDocument.f19253id = tL_inputDocument;
            tL_inputDocument.f19196id = document.f19190id;
            tL_inputDocument.access_hash = document.access_hash;
            byte[] bArr2 = document.file_reference;
            tL_inputDocument.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputDocument.file_reference = new byte[0];
            }
            tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
        }
        org.telegram.ui.vr0 vr0Var = (org.telegram.ui.vr0) this;
        this.f30771c0 = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getAttachedStickers, new kh.b1(vr0Var, obj, tL_messages_getAttachedStickers, new org.telegram.ui.lo(15, vr0Var, tL_messages_getAttachedStickers), 10));
        r0(context);
    }

    public static void A(xx0 xx0Var) {
        xx0Var.dismiss();
        MediaDataController.getInstance(xx0Var.currentAccount).toggleStickerSet(xx0Var.getContext(), xx0Var.P, 1, xx0Var.I, true, xx0Var.f30776g0);
    }

    public static void B(xx0 xx0Var) {
        xx0Var.dismiss();
        vx0 vx0Var = xx0Var.Z;
        if (vx0Var != null) {
            vx0Var.a();
        }
        if (xx0Var.S != null && !MediaDataController.getInstance(xx0Var.currentAccount).cancelRemovingStickerSet(xx0Var.S.f19204id)) {
            TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
            tL_messages_installStickerSet.stickerset = xx0Var.S;
            ConnectionsManager.getInstance(xx0Var.currentAccount).sendRequest(tL_messages_installStickerSet, new y1(xx0Var, 13));
        }
    }

    public static void C(xx0 xx0Var, int i10) {
        String str;
        org.telegram.ui.ActionBar.p2 p2Var = xx0Var.I;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = xx0Var.P;
        if (tL_messages_stickerSet != null) {
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null && stickerSet.emojis) {
                str = "https://" + MessagesController.getInstance(xx0Var.currentAccount).linkPrefix + "/addemoji/" + xx0Var.P.set.short_name;
            } else {
                str = "https://" + MessagesController.getInstance(xx0Var.currentAccount).linkPrefix + "/addstickers/" + xx0Var.P.set.short_name;
            }
            String str2 = str;
            if (i10 == 1) {
                Context context = xx0Var.K;
                if (context == null && p2Var != null) {
                    context = p2Var.getParentActivity();
                }
                if (context == null) {
                    context = xx0Var.getContext();
                }
                jx0 jx0Var = new jx0(xx0Var, context, str2, str2, xx0Var.resourcesProvider);
                if (p2Var != null) {
                    p2Var.showDialog(jx0Var);
                    if (p2Var instanceof org.telegram.ui.xn) {
                        jx0Var.setCalcMandatoryInsets(((org.telegram.ui.xn) p2Var).x9());
                        return;
                    }
                    return;
                }
                jx0Var.show();
            } else if (i10 == 2) {
                try {
                    AndroidUtilities.addToClipboard(str2);
                    new qc((FrameLayout) xx0Var.containerView, xx0Var.resourcesProvider).k(false).j();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else if (i10 == 3) {
                if (xx0Var.O) {
                    xx0Var.n0();
                } else {
                    xx0Var.p0();
                }
            } else if (i10 == 4) {
                dy0.c(xx0Var.P.set, xx0Var.resourcesProvider, xx0Var.getContext(), new d(xx0Var, 20));
            } else if (i10 == 5) {
                dy0.b(xx0Var.P.set, xx0Var.resourcesProvider, xx0Var.getContext(), new ix0(xx0Var, 2));
            }
        }
    }

    public static void D(xx0 xx0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        int i10;
        org.telegram.ui.ActionBar.p2 p2Var = xx0Var.I;
        TLRPC.StickerSet stickerSet = xx0Var.P.set;
        if (stickerSet.masks) {
            i10 = 1;
        } else if (stickerSet.emojis) {
            i10 = 5;
        } else {
            i10 = 0;
        }
        try {
            if (tL_error == null) {
                if (xx0Var.f30776g0) {
                    ic.g(p2Var, new bx0(xx0Var.f30789w.getContext(), xx0Var.P, 1, 2, null, xx0Var.resourcesProvider), 1500).j();
                }
                if (tLObject instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                    MediaDataController.getInstance(xx0Var.currentAccount).processStickerSetInstallResultArchive(p2Var, true, i10, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject);
                }
            } else {
                Toast.makeText(xx0Var.getContext(), LocaleController.getString(R.string.ErrorOccurred), 0).show();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        MediaDataController.getInstance(xx0Var.currentAccount).loadStickers(i10, false, true);
    }

    public static void E(xx0 xx0Var, TLRPC.TL_error tL_error, TLObject tLObject, MediaDataController mediaDataController) {
        TLRPC.StickerSet stickerSet;
        boolean z4 = false;
        xx0Var.f30771c0 = 0;
        if (tL_error == null) {
            mm0 mm0Var = new mm0(xx0Var, 1);
            mm0Var.addTarget(xx0Var.containerView);
            TransitionManager.beginDelayedTransition(xx0Var.container, mm0Var);
            xx0Var.f30782n.setVisibility(0);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            xx0Var.P = tL_messages_stickerSet;
            mediaDataController.putStickerSet(tL_messages_stickerSet, false);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = xx0Var.P;
            if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents.isEmpty()) {
                xx0Var.dismiss();
                return;
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = xx0Var.P;
            if (tL_messages_stickerSet3 != null && (stickerSet = tL_messages_stickerSet3.set) != null && !stickerSet.masks) {
                z4 = true;
            }
            xx0Var.f30773e0 = z4;
            xx0Var.l0();
            mediaDataController.preloadStickerSetThumb(xx0Var.P);
            xx0Var.C0();
            xx0Var.B0();
            xx0Var.A0();
            xx0Var.d.l();
            return;
        }
        xx0Var.dismiss();
        org.telegram.ui.ActionBar.p2 p2Var = xx0Var.I;
        if (p2Var != null) {
            org.telegram.messenger.y3.s(R.string.AddStickersNotFound, qc.a0(p2Var), null);
        }
    }

    public static void F(xx0 xx0Var, String str, TextView textView) {
        TLRPC.TL_stickers_checkShortName tL_stickers_checkShortName = new TLRPC.TL_stickers_checkShortName();
        tL_stickers_checkShortName.short_name = str;
        xx0Var.m0 = ConnectionsManager.getInstance(xx0Var.currentAccount).sendRequest(tL_stickers_checkShortName, new gg.y(xx0Var, str, textView, 17), 2);
    }

    public static void G(xx0 xx0Var) {
        boolean z4;
        TLRPC.StickerSet stickerSet;
        MediaDataController mediaDataController = MediaDataController.getInstance(xx0Var.currentAccount);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = xx0Var.P;
        if (tL_messages_stickerSet != null && mediaDataController.isStickerPackInstalled(tL_messages_stickerSet.set.f19211id)) {
            z4 = false;
        } else {
            z4 = true;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = xx0Var.P;
        if (tL_messages_stickerSet2 != null && (stickerSet = tL_messages_stickerSet2.set) != null && stickerSet.creator && xx0Var.f30787r == null) {
            xx0Var.f30782n.e(3, R.drawable.tabs_reorder, LocaleController.getString(R.string.StickersReorder));
            xx0Var.f30782n.e(4, R.drawable.msg_edit, LocaleController.getString(R.string.EditName));
            if (z4) {
                xx0Var.f30787r = xx0Var.f30782n.e(5, R.drawable.msg_delete, LocaleController.getString(R.string.Delete));
            } else {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, xx0Var.getContext(), xx0Var.resourcesProvider);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, xx0Var.resourcesProvider).setOnClickListener(new gx0(xx0Var, 4));
                org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.StickersDeleteForEveryone), false, xx0Var.resourcesProvider);
                int themedColor = xx0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20141q7);
                c3.c(themedColor, themedColor);
                c3.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.1f, themedColor));
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.StickersRemoveForMe), false, xx0Var.resourcesProvider).setOnClickListener(new gx0(xx0Var, 6));
                c3.setOnClickListener(new gx0(xx0Var, 7));
                xx0Var.f30787r = xx0Var.f30782n.i(R.drawable.msg_delete, null, LocaleController.getString(R.string.Delete), actionBarPopupWindow$ActionBarPopupWindowLayout);
            }
            xx0Var.f30782n.a(-1);
            va0 va0Var = new va0(xx0Var.currentAccount, xx0Var.getContext(), xx0Var.resourcesProvider, new ArrayList(), 4);
            va0Var.setOnClickListener(new gx0(xx0Var, 8));
            va0Var.setTag(R.id.fit_width_tag, 1);
            org.telegram.ui.ActionBar.w0 w0Var = xx0Var.f30782n;
            w0Var.o();
            w0Var.f20649b.a(va0Var, new LinearLayout.LayoutParams(-1, -2));
            int themedColor2 = xx0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20141q7);
            xx0Var.f30787r.c(themedColor2, themedColor2);
            xx0Var.f30787r.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.1f, themedColor2));
            if (xx0Var.f30787r.getRightIcon() != null) {
                xx0Var.f30787r.getRightIcon().setColorFilter(themedColor2);
            }
        }
        if (xx0Var.f30782n.getPopupLayout() != null) {
            xx0Var.f30782n.getPopupLayout().requestLayout();
        }
        xx0Var.f30782n.M(null, null);
    }

    public static void O(xx0 xx0Var) {
        if (xx0Var.f30770c.getChildCount() <= 0) {
            xx0Var.y0(xx0Var.f30770c.getPaddingTop());
            return;
        }
        int i10 = 0;
        View view = null;
        int i11 = -1;
        for (int i12 = 0; i12 < xx0Var.f30770c.getChildCount(); i12++) {
            View childAt = xx0Var.f30770c.getChildAt(i12);
            xx0Var.f30770c.getClass();
            int R = RecyclerView.R(childAt);
            if (i11 == -1 || i11 > R) {
                view = childAt;
                i11 = R;
            }
        }
        if (view != null && view.getTop() >= 0) {
            int top = view.getTop();
            xx0Var.v0(0, false);
            i10 = top;
        } else {
            xx0Var.v0(0, true);
        }
        xx0Var.v0(1, true);
        if (xx0Var.f30769b0 != i10) {
            xx0Var.y0(i10);
        }
    }

    public static void m(xx0 xx0Var, View view, int i10) {
        TLRPC.StickerSet stickerSet;
        String str;
        if (view instanceof qx0) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = xx0Var.P;
            org.telegram.ui.ActionBar.p2 p2Var = xx0Var.I;
            org.telegram.ui.ActionBar.f6 f6Var = xx0Var.resourcesProvider;
            if (p2Var != null) {
                Context context = p2Var.getContext();
                if (!(p2Var instanceof org.telegram.ui.xn)) {
                    dy0.a(tL_messages_stickerSet, p2Var, f6Var);
                    return;
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert3, 0, context, f6Var);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(LocaleController.getString(R.string.StickersCreateNewSticker));
                org.telegram.ui.b.h(R.drawable.menu_sticker_add, 0, arrayList3, arrayList2);
                arrayList.add(LocaleController.getString(R.string.StickersAddAnExistingSticker));
                arrayList3.add(Integer.valueOf(R.drawable.menu_sticker_select));
                arrayList2.add(1);
                org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                nh.c0 c0Var = new nh.c0(p1Var, arrayList2, tL_messages_stickerSet, p2Var, f6Var, 10);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, ((Integer) arrayList3.get(i11)).intValue(), (CharSequence) arrayList.get(i11), false, f6Var);
                    c3.setTag(Integer.valueOf(i11));
                    c3.setOnClickListener(c0Var);
                }
                p1Var.f20517c = 100;
                p1Var.f20519g = true;
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
        } else if (!xx0Var.O) {
            if (xx0Var.T != null) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) xx0Var.d.f29065f.get(i10);
                if (stickerSetCovered != null) {
                    xx0Var.dismiss();
                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                    TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                    tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                    tL_inputStickerSetID.f19204id = stickerSet2.f19211id;
                    new xx0(xx0Var.K, xx0Var.I, tL_inputStickerSetID, null, null, xx0Var.resourcesProvider).show();
                    return;
                }
                return;
            }
            ArrayList arrayList4 = xx0Var.V;
            if (arrayList4 != null) {
                if (i10 >= 0 && i10 < arrayList4.size()) {
                    SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) xx0Var.V.get(i10);
                    xx0Var.R = importingSticker;
                    if (importingSticker.validated) {
                        TextView textView = xx0Var.D;
                        textView.setText(Emoji.replaceEmoji(importingSticker.emoji, textView.getPaint().getFontMetricsInt(), false));
                        p9 p9Var = xx0Var.C;
                        ImageLocation forPath = ImageLocation.getForPath(xx0Var.R.path);
                        if (xx0Var.R.animated) {
                            str = "tgs";
                        } else {
                            str = null;
                        }
                        p9Var.m(forPath, null, null, null, null, str, 0, null);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) xx0Var.f30790x.getLayoutParams();
                        layoutParams.topMargin = xx0Var.f30769b0;
                        xx0Var.f30790x.setLayoutParams(layoutParams);
                        xx0Var.f30790x.setVisibility(0);
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ObjectAnimator.ofFloat(xx0Var.f30790x, View.ALPHA, 0.0f, 1.0f));
                        animatorSet.setDuration(200L);
                        animatorSet.start();
                        return;
                    }
                    return;
                }
                return;
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = xx0Var.P;
            if (tL_messages_stickerSet2 != null && i10 >= 0 && i10 < tL_messages_stickerSet2.documents.size()) {
                xx0Var.Q = xx0Var.P.documents.get(i10);
                int i12 = 0;
                while (true) {
                    if (i12 >= xx0Var.Q.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = xx0Var.Q.attributes.get(i12);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                        String str2 = documentAttribute.alt;
                        if (str2 != null && str2.length() > 0) {
                            TextView textView2 = xx0Var.D;
                            textView2.setText(Emoji.replaceEmoji(documentAttribute.alt, textView2.getPaint().getFontMetricsInt(), false));
                        }
                    } else {
                        i12++;
                    }
                }
                xx0Var.D.setText(Emoji.replaceEmoji(MediaDataController.getInstance(xx0Var.currentAccount).getEmojiForSticker(xx0Var.Q.f19190id), xx0Var.D.getPaint().getFontMetricsInt(), false));
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = xx0Var.P;
                if ((tL_messages_stickerSet3 == null || (stickerSet = tL_messages_stickerSet3.set) == null || !stickerSet.emojis) && !org.telegram.ui.pt.q().y(view)) {
                    xx0Var.C.getImageReceiver().setImage(ImageLocation.getForDocument(xx0Var.Q), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(xx0Var.Q.thumbs, 90), xx0Var.Q), (String) null, "webp", xx0Var.P, 1);
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) xx0Var.f30790x.getLayoutParams();
                    layoutParams2.topMargin = xx0Var.f30769b0;
                    xx0Var.f30790x.setLayoutParams(layoutParams2);
                    xx0Var.f30790x.setVisibility(0);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(xx0Var.f30790x, View.ALPHA, 0.0f, 1.0f));
                    animatorSet2.setDuration(200L);
                    animatorSet2.start();
                }
            }
        }
    }

    public static void n(xx0 xx0Var) {
        xx0Var.f30782n.n();
        dy0.b(xx0Var.P.set, xx0Var.resourcesProvider, xx0Var.getContext(), new ix0(xx0Var, 4));
    }

    public static void o(org.telegram.ui.vr0 vr0Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers) {
        vr0Var.f30771c0 = 0;
        if (tL_error == null && (tLObject instanceof Vector)) {
            Vector vector = (Vector) tLObject;
            if (vector.objects.isEmpty()) {
                vr0Var.dismiss();
                return;
            } else if (vector.objects.size() == 1) {
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                vr0Var.S = tL_inputStickerSetID;
                TLRPC.StickerSet stickerSet = ((TLRPC.StickerSetCovered) vector.objects.get(0)).set;
                tL_inputStickerSetID.f19204id = stickerSet.f19211id;
                tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                vr0Var.t0();
                return;
            } else {
                ArrayList arrayList = new ArrayList();
                vr0Var.T = arrayList;
                arrayList.addAll(vector.objects);
                vr0Var.f30770c.setLayoutParams(k7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
                vr0Var.h.setVisibility(8);
                vr0Var.G[0].setVisibility(8);
                vr0Var.d.l();
                return;
            }
        }
        z4.f0(vr0Var.currentAccount, tL_error, vr0Var.I, tL_messages_getAttachedStickers, new Object[0]);
        vr0Var.dismiss();
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
                    AndroidUtilities.runOnUIThread(new jh.h(pathToAttach, arrayList, p2Var, xnVar2, document, z4, tL_messages_stickerSet), 300L);
                    return;
                }
                return;
            }
            AndroidUtilities.runOnUIThread(new gg.j(p2Var, (Object) tL_messages_stickerSet, (Object) document, (Object) xnVar2, z4, 15), 300L);
        }
    }

    public static void p(org.telegram.ui.vr0 vr0Var, Object obj, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers, org.telegram.ui.lo loVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && obj != null) {
            FileRefController.getInstance(vr0Var.currentAccount).requestReference(obj, tL_messages_getAttachedStickers, loVar);
        } else {
            loVar.run(tLObject, tL_error);
        }
    }

    public static void q(xx0 xx0Var) {
        xx0Var.dismiss();
        MediaDataController.getInstance(xx0Var.currentAccount).toggleStickerSet(xx0Var.getContext(), xx0Var.P, 0, xx0Var.I, true, xx0Var.f30776g0);
    }

    public static void r(xx0 xx0Var) {
        xx0Var.f30782n.n();
        xx0Var.dismiss();
        MediaDataController.getInstance(xx0Var.currentAccount).toggleStickerSet(xx0Var.getContext(), xx0Var.P, 1, xx0Var.I, true, true);
    }

    public static void s(xx0 xx0Var) {
        xx0Var.dismiss();
        MediaDataController.getInstance(xx0Var.currentAccount).toggleStickerSet(xx0Var.getContext(), xx0Var.P, 1, xx0Var.I, false, false);
    }

    public static void t(xx0 xx0Var) {
        xx0Var.dismiss();
        MediaDataController.getInstance(xx0Var.currentAccount).toggleStickerSet(xx0Var.getContext(), xx0Var.P, 1, xx0Var.I, false, false);
    }

    public static boolean v(xx0 xx0Var, MotionEvent motionEvent) {
        if (xx0Var.O) {
            return false;
        }
        return org.telegram.ui.pt.q().s(motionEvent, xx0Var.f30770c, xx0Var.E, xx0Var.f30779j0, xx0Var.resourcesProvider);
    }

    public static void w(xx0 xx0Var, ArrayList arrayList, Boolean bool) {
        xx0Var.V = arrayList;
        if (arrayList.isEmpty()) {
            xx0Var.dismiss();
            return;
        }
        xx0Var.d.l();
        if (bool.booleanValue()) {
            xx0Var.W = new HashMap();
            int size = xx0Var.V.size();
            for (int i10 = 0; i10 < size; i10++) {
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) xx0Var.V.get(i10);
                xx0Var.W.put(importingSticker.path, importingSticker);
                FileLoader.getInstance(xx0Var.currentAccount).uploadFile(importingSticker.path, false, true, 67108864);
            }
        }
        xx0Var.B0();
    }

    public static void x(xx0 xx0Var, int[] iArr, EditTextBoldCursor editTextBoldCursor, TextView textView, TextView textView2, AlertDialog$Builder alertDialog$Builder) {
        int i10 = iArr[0];
        if (i10 != 1) {
            if (i10 == 0) {
                iArr[0] = 1;
                TLRPC.TL_stickers_suggestShortName tL_stickers_suggestShortName = new TLRPC.TL_stickers_suggestShortName();
                String obj = editTextBoldCursor.getText().toString();
                xx0Var.f30784o0 = obj;
                tL_stickers_suggestShortName.title = obj;
                ConnectionsManager.getInstance(xx0Var.currentAccount).sendRequest(tL_stickers_suggestShortName, new gg.e0(xx0Var, editTextBoldCursor, textView, textView2, iArr, 8));
            } else if (i10 == 2) {
                iArr[0] = 3;
                if (!xx0Var.f30783n0) {
                    AndroidUtilities.shakeView(editTextBoldCursor);
                    try {
                        editTextBoldCursor.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                SendMessagesHelper.getInstance(xx0Var.currentAccount).prepareImportStickers(xx0Var.f30784o0, xx0Var.f30781l0, xx0Var.X, xx0Var.V, new hx0(xx0Var));
                alertDialog$Builder.f19503a.I0.run();
                xx0Var.dismiss();
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
                if (this.f30768b == null) {
                    this.f30768b = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
                }
                Matcher matcher = this.f30768b.matcher(replaceEmoji);
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
            } catch (Exception e) {
                FileLog.e(e);
            }
            this.h.setText(replaceEmoji);
            if (s0()) {
                int measuredWidth = this.f30770c.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = AndroidUtilities.displaySize.x;
                }
                tx0 tx0Var = this.d;
                if (AndroidUtilities.isTablet()) {
                    f10 = 60.0f;
                } else {
                    f10 = 45.0f;
                }
                tx0Var.d = Math.max(1, measuredWidth / AndroidUtilities.dp(f10));
            } else {
                this.d.d = 5;
            }
            this.J.y1(this.d.d);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.P;
            int i17 = -1;
            if (tL_messages_stickerSet2 != null && (stickerSet7 = tL_messages_stickerSet2.set) != null && stickerSet7.emojis && !UserConfig.getInstance(this.currentAccount).isPremium() && this.f30767a0 == null) {
                if (this.P.documents != null) {
                    for (int i18 = 0; i18 < this.P.documents.size(); i18++) {
                        if (!MessageObject.isFreeEmoji(this.P.documents.get(i18))) {
                            this.v.setVisibility(0);
                            this.f30788s.setBackground(null);
                            w0(null, null, -1);
                            this.v.a(LocaleController.getString(R.string.UnlockPremiumEmoji), new gx0(this, 0), false);
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
                    if (stickerSets.get(i19) != null && stickerSets.get(i19).set != null && stickerSets.get(i19).set.f19211id == this.P.set.f19211id) {
                        z10 = true;
                        break;
                    }
                }
                z10 = false;
                z4 = !z10;
            } else if (tL_messages_stickerSet3 != null && (stickerSet = tL_messages_stickerSet3.set) != null && mediaDataController.isStickerPackInstalled(stickerSet.f19211id)) {
                z4 = false;
            } else {
                z4 = true;
            }
            org.telegram.ui.h70 h70Var = this.f30767a0;
            if (h70Var != null) {
                gx0 gx0Var = new gx0(this, 5);
                boolean z11 = h70Var.f34774a;
                if (h70Var.f34776c.K) {
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
                boolean z12 = this.f30767a0.f34774a;
                if (z12) {
                    i13 = org.telegram.ui.ActionBar.j6.f20141q7;
                } else {
                    i13 = org.telegram.ui.ActionBar.j6.Sh;
                }
                if (!z12) {
                    i14 = org.telegram.ui.ActionBar.j6.Oh;
                } else {
                    i14 = -1;
                }
                if (!z12) {
                    i17 = org.telegram.ui.ActionBar.j6.Qh;
                }
                x0(gx0Var, str, i13, i14, i17);
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
                x0(new gx0(this, 9), formatPluralString2, org.telegram.ui.ActionBar.j6.Sh, org.telegram.ui.ActionBar.j6.Oh, org.telegram.ui.ActionBar.j6.Qh);
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
                    x0(new gx0(this, 10), formatPluralString, org.telegram.ui.ActionBar.j6.Sh, org.telegram.ui.ActionBar.j6.Oh, org.telegram.ui.ActionBar.j6.Qh);
                } else {
                    String str2 = formatPluralString;
                    if (this.P.set.official) {
                        w0(new gx0(this, 11), str2, org.telegram.ui.ActionBar.j6.f20141q7);
                    } else {
                        w0(new gx0(this, 12), str2, org.telegram.ui.ActionBar.j6.f20141q7);
                    }
                }
            }
            this.d.l();
            return;
        }
        ArrayList arrayList5 = this.U;
        if (arrayList5 != null) {
            e90 e90Var = this.h;
            ArrayList arrayList6 = this.V;
            if (arrayList6 != null) {
                size = arrayList6.size();
            } else {
                size = arrayList5.size();
            }
            e90Var.setText(LocaleController.formatPluralString("Stickers", size, new Object[0]));
            HashMap hashMap = this.W;
            if (hashMap != null && !hashMap.isEmpty()) {
                w0(null, LocaleController.getString(R.string.ImportStickersProcessing), org.telegram.ui.ActionBar.j6.f20139q5);
                this.f30788s.setEnabled(false);
                return;
            }
            gx0 gx0Var2 = new gx0(this, 13);
            int i20 = R.string.ImportStickers;
            ArrayList arrayList7 = this.V;
            if (arrayList7 != null) {
                size2 = arrayList7.size();
            } else {
                size2 = arrayList5.size();
            }
            w0(gx0Var2, LocaleController.formatString("ImportStickers", i20, LocaleController.formatPluralString("Stickers", size2, new Object[0])), org.telegram.ui.ActionBar.j6.f20084n5);
            this.f30788s.setEnabled(true);
            return;
        }
        w0(new gx0(this, 14), LocaleController.getString(R.string.Close), org.telegram.ui.ActionBar.j6.f20084n5);
    }

    public final void C0() {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Point point = AndroidUtilities.displaySize;
        int min = (int) ((Math.min(point.x, point.y) / 2) / AndroidUtilities.density);
        if (this.U != null) {
            this.f30791y.setText(LocaleController.getString(R.string.ImportStickersRemove));
            this.f30791y.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20141q7));
            float f10 = min;
            this.C.setLayoutParams(k7.b6.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.D.setLayoutParams(k7.b6.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.f30791y.setVisibility(0);
            this.B.setVisibility(0);
        } else if (this.Y != null && ((tL_messages_stickerSet = this.P) == null || !tL_messages_stickerSet.set.masks)) {
            this.f30791y.setText(LocaleController.getString(R.string.SendSticker));
            float f11 = min;
            this.C.setLayoutParams(k7.b6.d(min, f11, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.D.setLayoutParams(k7.b6.d(min, f11, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.f30791y.setVisibility(0);
            this.B.setVisibility(0);
        } else {
            this.f30791y.setText(LocaleController.getString(R.string.Close));
            this.C.setLayoutParams(k7.b6.e(min, min, 17));
            this.D.setLayoutParams(k7.b6.e(min, min, 17));
            this.f30791y.setVisibility(8);
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
            lh.e1 e1Var = this.f30770c;
            if (e1Var != null) {
                int childCount = e1Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    this.f30770c.getChildAt(i12).invalidate();
                }
            }
        } else if (i10 == NotificationCenter.fileUploaded) {
            HashMap hashMap = this.W;
            if (hashMap != null) {
                String str = (String) objArr[0];
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) hashMap.get(str);
                if (importingSticker != null) {
                    importingSticker.uploadMedia(this.currentAccount, (TLRPC.InputFile) objArr[1], new hp(this, str, importingSticker, 23));
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
                    tL_messages_stickerSet = mediaDataController.getStickerSetById(this.S.f19204id);
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
        this.f30778i0.C(false);
        Runnable runnable = this.f30785p0;
        if (runnable != null) {
            runnable.run();
        }
        if (this.f30771c0 != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f30771c0, true);
            this.f30771c0 = 0;
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
        int i10 = org.telegram.ui.ActionBar.j6.f19977h5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(viewGroup, 0, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.containerView, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Ii));
        xx0 xx0Var = this.d.f29067r;
        if (xx0Var.T != null) {
            org.telegram.ui.Cells.r3.a(arrayList, xx0Var.f30770c, t6Var);
        }
        View[] viewArr = this.G;
        View view = viewArr[0];
        int i11 = org.telegram.ui.ActionBar.j6.V5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(viewArr[1], 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30770c, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f20012j5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 2, null, null, null, null, org.telegram.ui.ActionBar.j6.f20030k5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30782n, 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.Ni));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30788s, 32, null, null, null, null, i10));
        k6 k6Var = this.f30788s;
        int i12 = org.telegram.ui.ActionBar.j6.f19996i6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(k6Var, 65568, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30788s, 4, null, null, null, null, this.f30777h0));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30791y, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f20084n5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30791y, 32, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30791y, 65568, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.j6.f20048l5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, t6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.j6.Ji));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.j6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.j6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.j6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.j6.G8));
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
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20244w6));
            this.f30783n0 = true;
            this.f30781l0 = str;
            return;
        }
        hp hpVar = this.f30780k0;
        if (hpVar != null) {
            AndroidUtilities.cancelRunOnUIThread(hpVar);
            this.f30780k0 = null;
            this.f30781l0 = null;
            if (this.m0 != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.m0, true);
            }
        }
        if (TextUtils.isEmpty(str)) {
            textView.setText(LocaleController.getString(R.string.ImportStickersEnterUrlInfo));
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20139q5));
            return;
        }
        this.f30783n0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                int length = str.length();
                for (int i10 = 0; i10 < length; i10++) {
                    char charAt = str.charAt(i10);
                    if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        textView.setText(LocaleController.getString(R.string.ImportStickersEnterUrlInfo));
                        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20122p7));
                        return;
                    }
                }
            } else {
                textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalid));
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20122p7));
                return;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 32) {
                textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalidLong));
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20122p7));
                return;
            }
            textView.setText(LocaleController.getString(R.string.ImportStickersLinkChecking));
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.F6));
            this.f30781l0 = str;
            hp hpVar2 = new hp(this, str, textView, 26);
            this.f30780k0 = hpVar2;
            AndroidUtilities.runOnUIThread(hpVar2, 300L);
            return;
        }
        textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalidShort));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20122p7));
    }

    public final void n0() {
        if (!this.O) {
            return;
        }
        this.e.d(null);
        this.O = false;
        this.f30778i0.C(true);
        AndroidUtilities.forEachViews((RecyclerView) this.f30770c, (h5.d) new nh.e(10));
        this.f30782n.postDelayed(new ix0(this, 0), 200L);
        this.f30788s.c(LocaleController.getString(R.string.EditStickers), true, true);
    }

    @Override
    public final void onBackPressed() {
        if (org.telegram.ui.pt.q().E) {
            org.telegram.ui.pt.q().o();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onStart() {
        super.onStart();
        ic.a((FrameLayout) this.containerView, new kh.t0(this, 9));
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
        this.e.d(this.f30770c);
        this.O = true;
        a9.a aVar = this.f30778i0;
        aVar.C(false);
        Float valueOf = Float.valueOf(0.0f);
        ArrayList arrayList = (ArrayList) aVar.d;
        if (arrayList.isEmpty()) {
            for (int i10 = 0; i10 < 6; i10++) {
                arrayList.add(valueOf);
                ((ArrayList) aVar.e).add(valueOf);
                ((ArrayList) aVar.f146f).add(valueOf);
            }
        }
        int i11 = 0;
        for (int i12 = 6; i11 < i12; i12 = 6) {
            long nextFloat = Utilities.random.nextFloat() * 300;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, -2.0f, 0.0f, 2.0f, 0.0f);
            ofFloat.addUpdateListener(new wx0(aVar, i11, 3));
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(1);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setCurrentPlayTime(nextFloat);
            long j10 = 300;
            ofFloat.setDuration(j10);
            ofFloat.start();
            float dp = AndroidUtilities.dp(0.5f);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, dp, 0.0f, -dp, 0.0f);
            ofFloat2.addUpdateListener(new wx0(aVar, i11, 4));
            ofFloat2.setRepeatCount(-1);
            ofFloat2.setRepeatMode(1);
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setCurrentPlayTime(nextFloat);
            ofFloat2.setDuration((long) (300 * 1.2d));
            ofFloat2.start();
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, dp, 0.0f - dp, 0.0f);
            ofFloat3.addUpdateListener(new wx0(aVar, i11, 5));
            ofFloat3.setRepeatCount(-1);
            ofFloat3.setRepeatMode(1);
            ofFloat3.setInterpolator(new LinearInterpolator());
            ofFloat3.setCurrentPlayTime(nextFloat);
            ofFloat3.setDuration(j10);
            ofFloat3.start();
            ((ArrayList) aVar.f143a).add(ofFloat);
            ((ArrayList) aVar.f144b).add(ofFloat2);
            ((ArrayList) aVar.f145c).add(ofFloat3);
            i11++;
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f30770c, (h5.d) new nh.e(11));
        this.f30782n.postDelayed(new ix0(this, 1), 200L);
        this.f30788s.c(LocaleController.getString(R.string.Done), true, true);
    }

    public final void q0() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f30790x, View.ALPHA, 0.0f));
        animatorSet.setDuration(200L);
        animatorSet.addListener(new nd0(this, 16));
        animatorSet.start();
    }

    public final void r0(Context context) {
        int i10;
        ox0 ox0Var = new ox0(this, context);
        this.containerView = ox0Var;
        ox0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, 0, i11, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(context);
        View[] viewArr = this.G;
        viewArr[0] = view;
        int i12 = org.telegram.ui.ActionBar.j6.V5;
        view.setBackgroundColor(getThemedColor(i12));
        viewArr[0].setAlpha(0.0f);
        viewArr[0].setVisibility(4);
        viewArr[0].setTag(1);
        this.containerView.addView(viewArr[0], layoutParams);
        lh.e1 e1Var = new lh.e1(this, context, 21);
        this.f30770c = e1Var;
        e1Var.setTag(14);
        lh.e1 e1Var2 = this.f30770c;
        getContext();
        oh.k kVar = new oh.k(this);
        this.J = kVar;
        e1Var2.setLayoutManager(kVar);
        this.J.O = new kh.n5(this, 5);
        this.e = new f2.e0(new px0(this));
        lh.e1 e1Var3 = this.f30770c;
        tx0 tx0Var = new tx0(this, context);
        this.d = tx0Var;
        e1Var3.setAdapter(tx0Var);
        this.f30770c.setVerticalScrollBarEnabled(false);
        this.f30770c.i(new nh.k(6));
        this.f30770c.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.f30770c.setClipToPadding(false);
        this.f30770c.setEnabled(true);
        this.f30770c.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.j6.A5));
        this.f30770c.setOnTouchListener(new tr(this, 4));
        this.f30770c.setOnScrollListener(new lb0(this, 7));
        k kVar2 = new k(this, 16);
        this.E = kVar2;
        this.f30770c.setOnItemClickListener(kVar2);
        this.containerView.addView(this.f30770c, k7.b6.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 48.0f));
        dg.u2 u2Var = new dg.u2(this, context, 26);
        this.H = u2Var;
        this.containerView.addView(u2Var, k7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.f30770c.setEmptyView(this.H);
        this.H.setOnTouchListener(new oh.d(24));
        e90 e90Var = new e90(context, null);
        this.h = e90Var;
        e90Var.setLines(1);
        this.h.setSingleLine(true);
        this.h.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20012j5));
        this.h.setTextSize(1, 20.0f);
        this.h.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20030k5));
        this.h.setEllipsize(TextUtils.TruncateAt.END);
        this.h.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f));
        this.h.setGravity(16);
        this.h.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(this.h, k7.b6.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(org.telegram.ui.ActionBar.j6.Ji), false, this.resourcesProvider);
        this.f30782n = w0Var;
        w0Var.setLongClickEnabled(false);
        this.f30782n.setSubMenuOpenSide(2);
        this.f30782n.setIcon(R.drawable.ic_ab_other);
        this.f30782n.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(getThemedColor(org.telegram.ui.ActionBar.j6.Ni), 1, -1));
        this.containerView.addView(this.f30782n, k7.b6.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        this.f30782n.e(1, R.drawable.msg_share, LocaleController.getString(R.string.StickersShare));
        this.f30782n.e(2, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink));
        this.f30782n.setOnClickListener(new gx0(this, 1));
        this.f30782n.setDelegate(new hx0(this));
        this.f30782n.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f30782n;
        if (this.S != null) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        w0Var2.setVisibility(i10);
        this.H.addView(new RadialProgressView(context, null), k7.b6.e(-2, -2, 17));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
        View view2 = new View(context);
        viewArr[1] = view2;
        view2.setBackgroundColor(getThemedColor(i12));
        this.containerView.addView(viewArr[1], layoutParams2);
        k6 k6Var = new k6(context, false, false, false);
        this.f30788s = k6Var;
        int i13 = org.telegram.ui.ActionBar.j6.f19977h5;
        int themedColor = getThemedColor(i13);
        int i14 = org.telegram.ui.ActionBar.j6.f19996i6;
        k6Var.setBackground(org.telegram.ui.ActionBar.j6.g0(themedColor, getThemedColor(i14)));
        k6 k6Var2 = this.f30788s;
        int i15 = org.telegram.ui.ActionBar.j6.f20084n5;
        this.f30777h0 = i15;
        k6Var2.setTextColor(getThemedColor(i15));
        this.f30788s.setTextSize(AndroidUtilities.dp(14.0f));
        this.f30788s.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        this.f30788s.setTypeface(AndroidUtilities.bold());
        this.f30788s.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f30789w = frameLayout;
        frameLayout.addView(this.f30788s, k7.b6.c(48.0f, -1));
        this.containerView.addView(this.f30789w, k7.b6.e(-1, -2, 83));
        eg.c1 c1Var = new eg.c1(AndroidUtilities.dp(24.0f), context, this.resourcesProvider, false);
        this.v = c1Var;
        c1Var.setIcon(R.raw.unlock_icon);
        this.v.setVisibility(4);
        this.containerView.addView(this.v, k7.b6.d(-1, 48.0f, 87, 8.0f, 0.0f, 8.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f30790x = frameLayout2;
        frameLayout2.setVisibility(8);
        this.f30790x.setSoundEffectsEnabled(false);
        this.containerView.addView(this.f30790x, k7.b6.c(-1.0f, -1));
        this.f30790x.setOnClickListener(new gx0(this, 2));
        p9 p9Var = new p9(context);
        this.C = p9Var;
        p9Var.setAspectFit(true);
        this.C.setLayerNum(7);
        this.f30790x.addView(this.C);
        TextView textView = new TextView(context);
        this.D = textView;
        textView.setTextSize(1, 30.0f);
        this.D.setGravity(85);
        this.f30790x.addView(this.D);
        TextView textView2 = new TextView(context);
        this.f30791y = textView2;
        textView2.setTextSize(1, 14.0f);
        this.f30791y.setTextColor(getThemedColor(i15));
        this.f30791y.setBackground(org.telegram.ui.ActionBar.j6.g0(getThemedColor(i13), getThemedColor(i14)));
        this.f30791y.setGravity(17);
        this.f30791y.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
        this.f30791y.setTypeface(AndroidUtilities.bold());
        this.f30790x.addView(this.f30791y, k7.b6.e(-1, 48, 83));
        this.f30791y.setOnClickListener(new gx0(this, 3));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams3.bottomMargin = AndroidUtilities.dp(48.0f);
        View view3 = new View(context);
        this.B = view3;
        view3.setBackgroundColor(getThemedColor(i12));
        this.f30790x.addView(this.B, layoutParams3);
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
        this.f30785p0 = runnable;
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
                this.P = mediaDataController.getStickerSetById(this.S.f19204id);
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
            this.f30773e0 = !tL_messages_stickerSet.set.masks;
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
                animatorSetArr[i10].addListener(new ba0(this, i10, z4, 1));
                animatorSetArr[i10].start();
            }
        }
    }

    public final void w0(View.OnClickListener onClickListener, String str, int i10) {
        x0(onClickListener, str, i10, -1, -1);
    }

    public final void x0(View.OnClickListener onClickListener, String str, int i10, int i11, int i12) {
        if (i10 >= 0) {
            k6 k6Var = this.f30788s;
            this.f30777h0 = i10;
            k6Var.setTextColor(getThemedColor(i10));
        }
        this.f30788s.c(str, false, true);
        this.f30788s.setOnClickListener(onClickListener);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f30788s.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.G[1].getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f30770c.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.H.getLayoutParams();
        if (onClickListener == null) {
            this.f30788s.setAlpha(0.0f);
        } else if (i11 >= 0 && i12 >= 0) {
            k6 k6Var2 = this.f30788s;
            int dp = AndroidUtilities.dp(24.0f);
            int themedColor = getThemedColor(i11);
            int themedColor2 = getThemedColor(i12);
            k6Var2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, themedColor, themedColor2, themedColor2));
            this.f30789w.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19977h5));
            int dp2 = AndroidUtilities.dp(8.0f);
            marginLayoutParams.bottomMargin = dp2;
            marginLayoutParams.rightMargin = dp2;
            marginLayoutParams.topMargin = dp2;
            marginLayoutParams.leftMargin = dp2;
            int dp3 = AndroidUtilities.dp(64.0f);
            marginLayoutParams2.bottomMargin = dp3;
            marginLayoutParams3.bottomMargin = dp3;
            marginLayoutParams4.bottomMargin = dp3;
            if (this.f30788s.getAlpha() < 1.0f) {
                org.telegram.ui.b.p(this.f30788s.animate().alpha(1.0f), nr.h, 240L);
            }
        } else {
            this.f30788s.setBackground(org.telegram.ui.ActionBar.j6.g0(getThemedColor(org.telegram.ui.ActionBar.j6.f19977h5), org.telegram.ui.ActionBar.j6.l1(0.1f, getThemedColor(org.telegram.ui.ActionBar.j6.f20141q7))));
            this.f30789w.setBackgroundColor(0);
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            int dp4 = AndroidUtilities.dp(48.0f);
            marginLayoutParams2.bottomMargin = dp4;
            marginLayoutParams3.bottomMargin = dp4;
            marginLayoutParams4.bottomMargin = dp4;
            if (this.f30788s.getAlpha() < 1.0f) {
                org.telegram.ui.b.p(this.f30788s.animate().alpha(1.0f), nr.h, 240L);
            }
        }
        this.containerView.requestLayout();
    }

    public final void y0(int i10) {
        this.f30769b0 = i10;
        if (this.T == null) {
            float f10 = i10;
            this.h.setTranslationY(f10);
            if (this.U == null) {
                this.f30782n.setTranslationY(f10);
            }
            this.G[0].setTranslationY(f10);
        }
        this.containerView.invalidate();
    }

    public final void z0(boolean z4) {
        xx0 xx0Var = this.d.f29067r;
        if (xx0Var.T != null) {
            int childCount = xx0Var.f30770c.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = xx0Var.f30770c.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.r3) {
                    ((org.telegram.ui.Cells.r3) childAt).d();
                }
            }
        }
        this.h.setHighlightColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20048l5));
        this.f30790x.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19977h5) & (-536870913));
        this.f30782n.setIconColor(getThemedColor(org.telegram.ui.ActionBar.j6.Ji));
        this.f30782n.G(getThemedColor(org.telegram.ui.ActionBar.j6.E8), false);
        this.f30782n.G(getThemedColor(org.telegram.ui.ActionBar.j6.F8), true);
        this.f30782n.setPopupItemsSelectorColor(getThemedColor(org.telegram.ui.ActionBar.j6.I5));
        this.f30782n.B(getThemedColor(org.telegram.ui.ActionBar.j6.G8));
        if (this.f30787r != null) {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f20141q7);
            this.f30787r.c(themedColor, themedColor);
            this.f30787r.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.1f, themedColor));
            if (this.f30787r.getRightIcon() != null) {
                this.f30787r.getRightIcon().setColorFilter(themedColor);
            }
        }
        if (z4) {
            if (org.telegram.ui.ActionBar.j6.sl != null && this.f30786q0 == null) {
                ArrayList themeDescriptions = getThemeDescriptions();
                this.f30786q0 = themeDescriptions;
                int size = themeDescriptions.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((org.telegram.ui.ActionBar.l6) this.f30786q0.get(i11)).h = null;
                }
            }
            int size2 = this.f30786q0.size();
            for (int i12 = 0; i12 < size2; i12++) {
                org.telegram.ui.ActionBar.l6 l6Var = (org.telegram.ui.ActionBar.l6) this.f30786q0.get(i12);
                l6Var.d(getThemedColor(l6Var.f20434f), false, false);
            }
        }
        if (org.telegram.ui.ActionBar.j6.sl == null && this.f30786q0 != null) {
            this.f30786q0 = null;
        }
    }

    public xx0(Context context, String str, ArrayList arrayList, ArrayList arrayList2) {
        super(context, null, false, false);
        this.F = new AnimatorSet[2];
        this.G = new View[2];
        this.f30776g0 = true;
        this.f30778i0 = new a9.a(10);
        this.f30779j0 = new lx0(this);
        fixNavigationBar();
        this.K = (Activity) context;
        this.U = arrayList;
        this.X = str;
        Utilities.globalQueue.postRunnable(new hp(this, arrayList, arrayList2, 27));
        r0(context);
    }

    public xx0(Context context, org.telegram.ui.ActionBar.p2 p2Var, TLRPC.InputStickerSet inputStickerSet, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ux0 ux0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, false, false);
        this.F = new AnimatorSet[2];
        this.G = new View[2];
        this.f30776g0 = true;
        this.f30778i0 = new a9.a(10);
        this.f30779j0 = new lx0(this);
        fixNavigationBar();
        this.Y = ux0Var;
        this.S = inputStickerSet;
        this.P = tL_messages_stickerSet;
        this.I = p2Var;
        t0();
        r0(context);
    }
}
