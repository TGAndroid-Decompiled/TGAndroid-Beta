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
public class py0 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f29414u0 = 0;
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
    public final String f29415a0;
    public Pattern f29416b;
    public final my0 f29417b0;
    public ai.u1 f29418c;
    public ny0 f29419c0;
    public ly0 d;
    public org.telegram.ui.v60 f29420d0;
    public s4.y e;
    public int f29421e0;
    public TLRPC.Document f29422f;
    public int f29423f0;
    public boolean f29424g0;
    public x90 h;
    public boolean f29425h0;
    public boolean f29426i0;
    public boolean f29427j0;
    public int f29428k0;
    public final com.google.firebase.messaging.l f29429l0;
    public final ey0 m0;
    public org.telegram.ui.ActionBar.u0 f29430n;
    public by0 f29431n0;
    public String f29432o0;
    public int f29433p0;
    public boolean f29434q0;
    public org.telegram.ui.ActionBar.e1 f29435r;
    public String f29436r0;
    public q6 f29437s;
    public Runnable f29438s0;
    public ArrayList f29439t0;
    public sg.q0 v;
    public FrameLayout f29440w;
    public FrameLayout f29441x;
    public TextView f29442y;

    public py0(Context context, Object obj, TLObject tLObject, org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, context, d6Var, false);
        this.I = new AnimatorSet[2];
        this.J = new View[2];
        this.f29427j0 = true;
        this.f29429l0 = new com.google.firebase.messaging.l(5);
        this.m0 = new ey0(this);
        this.resourcesProvider = d6Var;
        fixNavigationBar();
        this.N = (Activity) context;
        TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputStickeredMediaPhoto.f20343id = tL_inputPhoto;
            tL_inputPhoto.f20292id = photo.f20297id;
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
            tL_inputStickeredMediaDocument.f20342id = tL_inputDocument;
            tL_inputDocument.f20285id = document.f20279id;
            tL_inputDocument.access_hash = document.access_hash;
            byte[] bArr2 = document.file_reference;
            tL_inputDocument.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputDocument.file_reference = new byte[0];
            }
            tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
        }
        org.telegram.ui.xr0 xr0Var = (org.telegram.ui.xr0) this;
        this.f29423f0 = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getAttachedStickers, new ai.k2(xr0Var, obj, tL_messages_getAttachedStickers, new org.telegram.ui.vc(22, xr0Var, tL_messages_getAttachedStickers), 12));
        s0(context);
    }

    public static void B(py0 py0Var) {
        py0Var.dismiss();
        MediaDataController.getInstance(py0Var.currentAccount).toggleStickerSet(py0Var.getContext(), py0Var.S, 1, py0Var.L, true, py0Var.f29427j0);
    }

    public static void C(py0 py0Var) {
        py0Var.dismiss();
        ny0 ny0Var = py0Var.f29419c0;
        if (ny0Var != null) {
            ny0Var.a();
        }
        if (py0Var.V != null && !MediaDataController.getInstance(py0Var.currentAccount).cancelRemovingStickerSet(py0Var.V.f20293id)) {
            TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
            tL_messages_installStickerSet.stickerset = py0Var.V;
            ConnectionsManager.getInstance(py0Var.currentAccount).sendRequest(tL_messages_installStickerSet, new y1(py0Var, 13));
        }
    }

    public static void D(py0 py0Var, int i10) {
        String str;
        org.telegram.ui.ActionBar.n2 n2Var = py0Var.L;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = py0Var.S;
        if (tL_messages_stickerSet != null) {
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null && stickerSet.emojis) {
                str = "https://" + MessagesController.getInstance(py0Var.currentAccount).linkPrefix + "/addemoji/" + py0Var.S.set.short_name;
            } else {
                str = "https://" + MessagesController.getInstance(py0Var.currentAccount).linkPrefix + "/addstickers/" + py0Var.S.set.short_name;
            }
            String str2 = str;
            if (i10 == 1) {
                Context context = py0Var.N;
                if (context == null && n2Var != null) {
                    context = n2Var.getParentActivity();
                }
                if (context == null) {
                    context = py0Var.getContext();
                }
                cy0 cy0Var = new cy0(py0Var, context, str2, str2, py0Var.resourcesProvider);
                if (n2Var != null) {
                    n2Var.showDialog(cy0Var);
                    if (n2Var instanceof org.telegram.ui.qn) {
                        cy0Var.setCalcMandatoryInsets(((org.telegram.ui.qn) n2Var).C9());
                        return;
                    }
                    return;
                }
                cy0Var.show();
            } else if (i10 == 2) {
                try {
                    AndroidUtilities.addToClipboard(str2);
                    new xc((FrameLayout) py0Var.containerView, py0Var.resourcesProvider).k(false).j();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else if (i10 == 3) {
                if (py0Var.R) {
                    py0Var.o0();
                } else {
                    py0Var.q0();
                }
            } else if (i10 == 4) {
                uy0.c(py0Var.S.set, py0Var.resourcesProvider, py0Var.getContext(), new d(py0Var, 20));
            } else if (i10 == 5) {
                uy0.b(py0Var.S.set, py0Var.resourcesProvider, py0Var.getContext(), new ay0(py0Var, 2));
            }
        }
    }

    public static void E(py0 py0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        int i10;
        org.telegram.ui.ActionBar.n2 n2Var = py0Var.L;
        TLRPC.StickerSet stickerSet = py0Var.S.set;
        if (stickerSet.masks) {
            i10 = 1;
        } else if (stickerSet.emojis) {
            i10 = 5;
        } else {
            i10 = 0;
        }
        try {
            if (tL_error == null) {
                if (py0Var.f29427j0) {
                    qc.g(n2Var, new ux0(py0Var.f29440w.getContext(), py0Var.S, 1, 2, null, py0Var.resourcesProvider), 1500).j();
                }
                if (tLObject instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                    MediaDataController.getInstance(py0Var.currentAccount).processStickerSetInstallResultArchive(n2Var, true, i10, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject);
                }
            } else {
                Toast.makeText(py0Var.getContext(), LocaleController.getString(R.string.ErrorOccurred), 0).show();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        MediaDataController.getInstance(py0Var.currentAccount).loadStickers(i10, false, true);
    }

    public static void F(py0 py0Var, TLRPC.TL_error tL_error, TLObject tLObject, MediaDataController mediaDataController) {
        TLRPC.StickerSet stickerSet;
        boolean z10 = false;
        py0Var.f29423f0 = 0;
        if (tL_error == null) {
            cn0 cn0Var = new cn0(py0Var, 1);
            cn0Var.addTarget(py0Var.containerView);
            TransitionManager.beginDelayedTransition(py0Var.container, cn0Var);
            py0Var.f29430n.setVisibility(0);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            py0Var.S = tL_messages_stickerSet;
            mediaDataController.putStickerSet(tL_messages_stickerSet, false);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = py0Var.S;
            if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents.isEmpty()) {
                py0Var.dismiss();
                return;
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = py0Var.S;
            if (tL_messages_stickerSet3 != null && (stickerSet = tL_messages_stickerSet3.set) != null && !stickerSet.masks) {
                z10 = true;
            }
            py0Var.f29425h0 = z10;
            py0Var.m0();
            mediaDataController.preloadStickerSetThumb(py0Var.S);
            py0Var.D0();
            py0Var.C0();
            py0Var.B0();
            py0Var.d.l();
            return;
        }
        py0Var.dismiss();
        org.telegram.ui.ActionBar.n2 n2Var = py0Var.L;
        if (n2Var != null) {
            org.telegram.messenger.kk.q(R.string.AddStickersNotFound, xc.a0(n2Var), null);
        }
    }

    public static void G(py0 py0Var, String str, TextView textView) {
        TLRPC.TL_stickers_checkShortName tL_stickers_checkShortName = new TLRPC.TL_stickers_checkShortName();
        tL_stickers_checkShortName.short_name = str;
        py0Var.f29433p0 = ConnectionsManager.getInstance(py0Var.currentAccount).sendRequest(tL_stickers_checkShortName, new ai.j2(py0Var, str, textView, 17), 2);
    }

    public static void I(py0 py0Var) {
        boolean z10;
        TLRPC.StickerSet stickerSet;
        MediaDataController mediaDataController = MediaDataController.getInstance(py0Var.currentAccount);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = py0Var.S;
        if (tL_messages_stickerSet != null && mediaDataController.isStickerPackInstalled(tL_messages_stickerSet.set.f20300id)) {
            z10 = false;
        } else {
            z10 = true;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = py0Var.S;
        if (tL_messages_stickerSet2 != null && (stickerSet = tL_messages_stickerSet2.set) != null && stickerSet.creator && py0Var.f29435r == null) {
            py0Var.f29430n.e(3, R.drawable.tabs_reorder, LocaleController.getString(R.string.StickersReorder));
            py0Var.f29430n.e(4, R.drawable.msg_edit, LocaleController.getString(R.string.EditName));
            if (z10) {
                py0Var.f29435r = py0Var.f29430n.e(5, R.drawable.msg_delete, LocaleController.getString(R.string.Delete));
            } else {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, py0Var.getContext(), py0Var.resourcesProvider);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, py0Var.resourcesProvider).setOnClickListener(new yx0(py0Var, 4));
                org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.StickersDeleteForEveryone), false, py0Var.resourcesProvider);
                int themedColor = py0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21225q7);
                c10.c(themedColor, themedColor);
                c10.setSelectorColor(org.telegram.ui.ActionBar.h6.m1(0.1f, themedColor));
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.StickersRemoveForMe), false, py0Var.resourcesProvider).setOnClickListener(new yx0(py0Var, 6));
                c10.setOnClickListener(new yx0(py0Var, 7));
                py0Var.f29435r = py0Var.f29430n.i(R.drawable.msg_delete, null, LocaleController.getString(R.string.Delete), actionBarPopupWindow$ActionBarPopupWindowLayout);
            }
            py0Var.f29430n.a(-1);
            ob0 ob0Var = new ob0(py0Var.currentAccount, 4, py0Var.getContext(), new ArrayList(), py0Var.resourcesProvider);
            ob0Var.setOnClickListener(new yx0(py0Var, 8));
            ob0Var.setTag(R.id.fit_width_tag, 1);
            org.telegram.ui.ActionBar.u0 u0Var = py0Var.f29430n;
            u0Var.o();
            u0Var.f21729b.a(ob0Var, new LinearLayout.LayoutParams(-1, -2));
            int themedColor2 = py0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21225q7);
            py0Var.f29435r.c(themedColor2, themedColor2);
            py0Var.f29435r.setSelectorColor(org.telegram.ui.ActionBar.h6.m1(0.1f, themedColor2));
            if (py0Var.f29435r.getRightIcon() != null) {
                py0Var.f29435r.getRightIcon().setColorFilter(themedColor2);
            }
        }
        if (py0Var.f29430n.getPopupLayout() != null) {
            py0Var.f29430n.getPopupLayout().requestLayout();
        }
        py0Var.f29430n.M(null, null);
    }

    public static void P(py0 py0Var) {
        if (py0Var.f29418c.getChildCount() <= 0) {
            py0Var.z0(py0Var.f29418c.getPaddingTop());
            return;
        }
        int i10 = 0;
        View view = null;
        int i11 = -1;
        for (int i12 = 0; i12 < py0Var.f29418c.getChildCount(); i12++) {
            View childAt = py0Var.f29418c.getChildAt(i12);
            py0Var.f29418c.getClass();
            int R = RecyclerView.R(childAt);
            if (i11 == -1 || i11 > R) {
                view = childAt;
                i11 = R;
            }
        }
        if (view != null && view.getTop() >= 0) {
            int top = view.getTop();
            py0Var.w0(0, false);
            i10 = top;
        } else {
            py0Var.w0(0, true);
        }
        py0Var.w0(1, true);
        if (py0Var.f29421e0 != i10) {
            py0Var.z0(i10);
        }
    }

    public static void n(py0 py0Var, View view, int i10) {
        TLRPC.StickerSet stickerSet;
        String str;
        if (view instanceof jy0) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = py0Var.S;
            org.telegram.ui.ActionBar.n2 n2Var = py0Var.L;
            org.telegram.ui.ActionBar.d6 d6Var = py0Var.resourcesProvider;
            if (n2Var != null) {
                Context context = n2Var.getContext();
                if (!(n2Var instanceof org.telegram.ui.qn)) {
                    uy0.a(tL_messages_stickerSet, n2Var, d6Var);
                    return;
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert3, 0, context, d6Var);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(LocaleController.getString(R.string.StickersCreateNewSticker));
                org.telegram.ui.Cells.c1.m(R.drawable.menu_sticker_add, 0, arrayList3, arrayList2);
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
                m1Var.f21574c = 100;
                m1Var.f21576g = true;
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
        } else if (!py0Var.R) {
            if (py0Var.W != null) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) py0Var.d.f28333f.get(i10);
                if (stickerSetCovered != null) {
                    py0Var.dismiss();
                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                    TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                    tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                    tL_inputStickerSetID.f20293id = stickerSet2.f20300id;
                    new py0(py0Var.N, py0Var.L, tL_inputStickerSetID, null, null, py0Var.resourcesProvider).show();
                    return;
                }
                return;
            }
            ArrayList arrayList4 = py0Var.Y;
            if (arrayList4 != null) {
                if (i10 >= 0 && i10 < arrayList4.size()) {
                    SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) py0Var.Y.get(i10);
                    py0Var.U = importingSticker;
                    if (importingSticker.validated) {
                        TextView textView = py0Var.G;
                        textView.setText(Emoji.replaceEmoji(importingSticker.emoji, textView.getPaint().getFontMetricsInt(), false));
                        w9 w9Var = py0Var.F;
                        ImageLocation forPath = ImageLocation.getForPath(py0Var.U.path);
                        if (py0Var.U.animated) {
                            str = "tgs";
                        } else {
                            str = null;
                        }
                        w9Var.m(forPath, null, null, null, null, str, 0, null);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) py0Var.f29441x.getLayoutParams();
                        layoutParams.topMargin = py0Var.f29421e0;
                        py0Var.f29441x.setLayoutParams(layoutParams);
                        py0Var.f29441x.setVisibility(0);
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ObjectAnimator.ofFloat(py0Var.f29441x, View.ALPHA, 0.0f, 1.0f));
                        animatorSet.setDuration(200L);
                        animatorSet.start();
                        return;
                    }
                    return;
                }
                return;
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = py0Var.S;
            if (tL_messages_stickerSet2 != null && i10 >= 0 && i10 < tL_messages_stickerSet2.documents.size()) {
                py0Var.T = py0Var.S.documents.get(i10);
                int i12 = 0;
                while (true) {
                    if (i12 >= py0Var.T.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = py0Var.T.attributes.get(i12);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                        String str2 = documentAttribute.alt;
                        if (str2 != null && str2.length() > 0) {
                            TextView textView2 = py0Var.G;
                            textView2.setText(Emoji.replaceEmoji(documentAttribute.alt, textView2.getPaint().getFontMetricsInt(), false));
                        }
                    } else {
                        i12++;
                    }
                }
                py0Var.G.setText(Emoji.replaceEmoji(MediaDataController.getInstance(py0Var.currentAccount).getEmojiForSticker(py0Var.T.f20279id), py0Var.G.getPaint().getFontMetricsInt(), false));
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = py0Var.S;
                if ((tL_messages_stickerSet3 == null || (stickerSet = tL_messages_stickerSet3.set) == null || !stickerSet.emojis) && !org.telegram.ui.et.q().y(view)) {
                    py0Var.F.getImageReceiver().setImage(ImageLocation.getForDocument(py0Var.T), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(py0Var.T.thumbs, 90), py0Var.T), (String) null, "webp", py0Var.S, 1);
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) py0Var.f29441x.getLayoutParams();
                    layoutParams2.topMargin = py0Var.f29421e0;
                    py0Var.f29441x.setLayoutParams(layoutParams2);
                    py0Var.f29441x.setVisibility(0);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(py0Var.f29441x, View.ALPHA, 0.0f, 1.0f));
                    animatorSet2.setDuration(200L);
                    animatorSet2.start();
                }
            }
        }
    }

    public static void o(py0 py0Var) {
        py0Var.f29430n.n();
        uy0.b(py0Var.S.set, py0Var.resourcesProvider, py0Var.getContext(), new ay0(py0Var, 4));
    }

    public static void p(org.telegram.ui.xr0 xr0Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers) {
        xr0Var.f29423f0 = 0;
        if (tL_error == null && (tLObject instanceof Vector)) {
            Vector vector = (Vector) tLObject;
            if (vector.objects.isEmpty()) {
                xr0Var.dismiss();
                return;
            } else if (vector.objects.size() == 1) {
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                xr0Var.V = tL_inputStickerSetID;
                TLRPC.StickerSet stickerSet = ((TLRPC.StickerSetCovered) vector.objects.get(0)).set;
                tL_inputStickerSetID.f20293id = stickerSet.f20300id;
                tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                xr0Var.u0();
                return;
            } else {
                ArrayList arrayList = new ArrayList();
                xr0Var.W = arrayList;
                arrayList.addAll(vector.objects);
                xr0Var.f29418c.setLayoutParams(w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
                xr0Var.h.setVisibility(8);
                xr0Var.J[0].setVisibility(8);
                xr0Var.d.l();
                return;
            }
        }
        f5.e0(xr0Var.currentAccount, tL_error, xr0Var.L, tL_messages_getAttachedStickers, new Object[0]);
        xr0Var.dismiss();
    }

    public static void p0(org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, TLRPC.Document document) {
        org.telegram.ui.qn qnVar;
        boolean z10;
        TLRPC.StickerSet stickerSet;
        if (n2Var != null) {
            if (n2Var instanceof org.telegram.ui.qn) {
                qnVar = (org.telegram.ui.qn) n2Var;
            } else {
                qnVar = null;
            }
            org.telegram.ui.qn qnVar2 = qnVar;
            if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.creator) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (MessageObject.isStaticStickerDocument(document)) {
                ArrayList arrayList = new ArrayList();
                File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true);
                if (pathToAttach != null && pathToAttach.exists()) {
                    AndroidUtilities.runOnUIThread(new ig.r0(pathToAttach, arrayList, n2Var, qnVar2, document, z10, tL_messages_stickerSet), 300L);
                    return;
                }
                return;
            }
            AndroidUtilities.runOnUIThread(new ei.s1((Object) n2Var, (Object) tL_messages_stickerSet, (Object) document, (Object) qnVar2, z10, 18), 300L);
        }
    }

    public static void q(org.telegram.ui.xr0 xr0Var, Object obj, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers, org.telegram.ui.vc vcVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && obj != null) {
            FileRefController.getInstance(xr0Var.currentAccount).requestReference(obj, tL_messages_getAttachedStickers, vcVar);
        } else {
            vcVar.run(tLObject, tL_error);
        }
    }

    public static void s(py0 py0Var) {
        py0Var.dismiss();
        MediaDataController.getInstance(py0Var.currentAccount).toggleStickerSet(py0Var.getContext(), py0Var.S, 0, py0Var.L, true, py0Var.f29427j0);
    }

    public static void t(py0 py0Var) {
        py0Var.f29430n.n();
        py0Var.dismiss();
        MediaDataController.getInstance(py0Var.currentAccount).toggleStickerSet(py0Var.getContext(), py0Var.S, 1, py0Var.L, true, true);
    }

    public static void u(py0 py0Var) {
        py0Var.dismiss();
        MediaDataController.getInstance(py0Var.currentAccount).toggleStickerSet(py0Var.getContext(), py0Var.S, 1, py0Var.L, false, false);
    }

    public static void v(py0 py0Var) {
        py0Var.dismiss();
        MediaDataController.getInstance(py0Var.currentAccount).toggleStickerSet(py0Var.getContext(), py0Var.S, 1, py0Var.L, false, false);
    }

    public static boolean x(py0 py0Var, MotionEvent motionEvent) {
        if (py0Var.R) {
            return false;
        }
        return org.telegram.ui.et.q().s(motionEvent, py0Var.f29418c, py0Var.H, py0Var.m0, py0Var.resourcesProvider);
    }

    public static void y(py0 py0Var, ArrayList arrayList, Boolean bool) {
        py0Var.Y = arrayList;
        if (arrayList.isEmpty()) {
            py0Var.dismiss();
            return;
        }
        py0Var.d.l();
        if (bool.booleanValue()) {
            py0Var.Z = new HashMap();
            int size = py0Var.Y.size();
            for (int i10 = 0; i10 < size; i10++) {
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) py0Var.Y.get(i10);
                py0Var.Z.put(importingSticker.path, importingSticker);
                FileLoader.getInstance(py0Var.currentAccount).uploadFile(importingSticker.path, false, true, 67108864);
            }
        }
        py0Var.C0();
    }

    public static void z(py0 py0Var, int[] iArr, EditTextBoldCursor editTextBoldCursor, TextView textView, TextView textView2, AlertDialog$Builder alertDialog$Builder) {
        int i10 = iArr[0];
        if (i10 != 1) {
            if (i10 == 0) {
                iArr[0] = 1;
                TLRPC.TL_stickers_suggestShortName tL_stickers_suggestShortName = new TLRPC.TL_stickers_suggestShortName();
                String obj = editTextBoldCursor.getText().toString();
                py0Var.f29436r0 = obj;
                tL_stickers_suggestShortName.title = obj;
                ConnectionsManager.getInstance(py0Var.currentAccount).sendRequest(tL_stickers_suggestShortName, new ai.s9(py0Var, editTextBoldCursor, textView, textView2, iArr, 7));
            } else if (i10 == 2) {
                iArr[0] = 3;
                if (!py0Var.f29434q0) {
                    AndroidUtilities.shakeView(editTextBoldCursor);
                    try {
                        editTextBoldCursor.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                SendMessagesHelper.getInstance(py0Var.currentAccount).prepareImportStickers(py0Var.f29436r0, py0Var.f29432o0, py0Var.f29415a0, py0Var.Y, new zx0(py0Var));
                alertDialog$Builder.f20602a.L0.run();
                py0Var.dismiss();
            }
        }
    }

    public final void A0(boolean z10) {
        py0 py0Var = this.d.f28335r;
        if (py0Var.W != null) {
            int childCount = py0Var.f29418c.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = py0Var.f29418c.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.r3) {
                    ((org.telegram.ui.Cells.r3) childAt).d();
                }
            }
        }
        this.h.setHighlightColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21130l5));
        this.f29441x.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21058h5) & (-536870913));
        this.f29430n.setIconColor(getThemedColor(org.telegram.ui.ActionBar.h6.Ji));
        this.f29430n.G(getThemedColor(org.telegram.ui.ActionBar.h6.E8), false);
        this.f29430n.G(getThemedColor(org.telegram.ui.ActionBar.h6.F8), true);
        this.f29430n.setPopupItemsSelectorColor(getThemedColor(org.telegram.ui.ActionBar.h6.I5));
        this.f29430n.B(getThemedColor(org.telegram.ui.ActionBar.h6.G8));
        if (this.f29435r != null) {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.f21225q7);
            this.f29435r.c(themedColor, themedColor);
            this.f29435r.setSelectorColor(org.telegram.ui.ActionBar.h6.m1(0.1f, themedColor));
            if (this.f29435r.getRightIcon() != null) {
                this.f29435r.getRightIcon().setColorFilter(themedColor);
            }
        }
        if (z10) {
            if (org.telegram.ui.ActionBar.h6.vl != null && this.f29439t0 == null) {
                ArrayList themeDescriptions = getThemeDescriptions();
                this.f29439t0 = themeDescriptions;
                int size = themeDescriptions.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((org.telegram.ui.ActionBar.j6) this.f29439t0.get(i11)).h = null;
                }
            }
            int size2 = this.f29439t0.size();
            for (int i12 = 0; i12 < size2; i12++) {
                org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) this.f29439t0.get(i12);
                j6Var.e(getThemedColor(j6Var.f21456f), false, false);
            }
        }
        if (org.telegram.ui.ActionBar.h6.vl == null && this.f29439t0 != null) {
            this.f29439t0 = null;
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
                if (this.f29416b == null) {
                    this.f29416b = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
                }
                Matcher matcher = this.f29416b.matcher(replaceEmoji);
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
                int measuredWidth = this.f29418c.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = AndroidUtilities.displaySize.x;
                }
                ly0 ly0Var = this.d;
                if (AndroidUtilities.isTablet()) {
                    f7 = 60.0f;
                } else {
                    f7 = 45.0f;
                }
                ly0Var.d = Math.max(1, measuredWidth / AndroidUtilities.dp(f7));
            } else {
                this.d.d = 5;
            }
            this.M.y1(this.d.d);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.S;
            int i17 = -1;
            if (tL_messages_stickerSet2 != null && (stickerSet7 = tL_messages_stickerSet2.set) != null && stickerSet7.emojis && !UserConfig.getInstance(this.currentAccount).isPremium() && this.f29420d0 == null) {
                if (this.S.documents != null) {
                    for (int i18 = 0; i18 < this.S.documents.size(); i18++) {
                        if (!MessageObject.isFreeEmoji(this.S.documents.get(i18))) {
                            this.v.setVisibility(0);
                            this.f29437s.setBackground(null);
                            x0(null, null, -1);
                            this.v.a(LocaleController.getString(R.string.UnlockPremiumEmoji), new yx0(this, 0), false);
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
                    if (stickerSets.get(i19) != null && stickerSets.get(i19).set != null && stickerSets.get(i19).set.f20300id == this.S.set.f20300id) {
                        z11 = true;
                        break;
                    }
                }
                z11 = false;
                z10 = !z11;
            } else if (tL_messages_stickerSet3 != null && (stickerSet = tL_messages_stickerSet3.set) != null && mediaDataController.isStickerPackInstalled(stickerSet.f20300id)) {
                z10 = false;
            } else {
                z10 = true;
            }
            org.telegram.ui.v60 v60Var = this.f29420d0;
            if (v60Var != null) {
                yx0 yx0Var = new yx0(this, 5);
                boolean z12 = v60Var.f42111a;
                if (v60Var.f42113c.N) {
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
                boolean z13 = this.f29420d0.f42111a;
                if (z13) {
                    i13 = org.telegram.ui.ActionBar.h6.f21225q7;
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
                y0(yx0Var, str, i13, i14, i17);
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
                y0(new yx0(this, 9), formatPluralString2, org.telegram.ui.ActionBar.h6.Sh, org.telegram.ui.ActionBar.h6.Oh, org.telegram.ui.ActionBar.h6.Qh);
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
                    y0(new yx0(this, 10), formatPluralString, org.telegram.ui.ActionBar.h6.Sh, org.telegram.ui.ActionBar.h6.Oh, org.telegram.ui.ActionBar.h6.Qh);
                } else {
                    String str2 = formatPluralString;
                    if (this.S.set.official) {
                        x0(new yx0(this, 11), str2, org.telegram.ui.ActionBar.h6.f21225q7);
                    } else {
                        x0(new yx0(this, 12), str2, org.telegram.ui.ActionBar.h6.f21225q7);
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
                x0(null, LocaleController.getString(R.string.ImportStickersProcessing), org.telegram.ui.ActionBar.h6.f21224q5);
                this.f29437s.setEnabled(false);
                return;
            }
            yx0 yx0Var2 = new yx0(this, 13);
            int i20 = R.string.ImportStickers;
            ArrayList arrayList7 = this.Y;
            if (arrayList7 != null) {
                size2 = arrayList7.size();
            } else {
                size2 = arrayList5.size();
            }
            x0(yx0Var2, LocaleController.formatString("ImportStickers", i20, LocaleController.formatPluralString("Stickers", size2, new Object[0])), org.telegram.ui.ActionBar.h6.f21169n5);
            this.f29437s.setEnabled(true);
            return;
        }
        x0(new yx0(this, 14), LocaleController.getString(R.string.Close), org.telegram.ui.ActionBar.h6.f21169n5);
    }

    public final void D0() {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Point point = AndroidUtilities.displaySize;
        int min = (int) ((Math.min(point.x, point.y) / 2) / AndroidUtilities.density);
        if (this.X != null) {
            this.f29442y.setText(LocaleController.getString(R.string.ImportStickersRemove));
            this.f29442y.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21225q7));
            float f7 = min;
            this.F.setLayoutParams(w7.z5.d(min, f7, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.G.setLayoutParams(w7.z5.d(min, f7, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.f29442y.setVisibility(0);
            this.E.setVisibility(0);
        } else if (this.f29417b0 != null && ((tL_messages_stickerSet = this.S) == null || !tL_messages_stickerSet.set.masks)) {
            this.f29442y.setText(LocaleController.getString(R.string.SendSticker));
            float f10 = min;
            this.F.setLayoutParams(w7.z5.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.G.setLayoutParams(w7.z5.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.f29442y.setVisibility(0);
            this.E.setVisibility(0);
        } else {
            this.f29442y.setText(LocaleController.getString(R.string.Close));
            this.F.setLayoutParams(w7.z5.e(min, min, 17));
            this.G.setLayoutParams(w7.z5.e(min, min, 17));
            this.f29442y.setVisibility(8);
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
            ai.u1 u1Var = this.f29418c;
            if (u1Var != null) {
                int childCount = u1Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    this.f29418c.getChildAt(i12).invalidate();
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
                    tL_messages_stickerSet = mediaDataController.getStickerSetById(this.V.f20293id);
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
        this.f29429l0.K(false);
        Runnable runnable = this.f29438s0;
        if (runnable != null) {
            runnable.run();
        }
        if (this.f29423f0 != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f29423f0, true);
            this.f29423f0 = 0;
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
        int i10 = org.telegram.ui.ActionBar.h6.f21058h5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(viewGroup, 0, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.containerView, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Ii));
        py0 py0Var = this.d.f28335r;
        if (py0Var.W != null) {
            org.telegram.ui.Cells.r3.a(arrayList, py0Var.f29418c, z6Var);
        }
        View[] viewArr = this.J;
        View view = viewArr[0];
        int i11 = org.telegram.ui.ActionBar.h6.V5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(viewArr[1], 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f29418c, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f21093j5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 2, null, null, null, null, org.telegram.ui.ActionBar.h6.f21113k5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f29430n, 65568, null, null, null, null, org.telegram.ui.ActionBar.h6.Ni));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f29437s, 32, null, null, null, null, i10));
        q6 q6Var = this.f29437s;
        int i12 = org.telegram.ui.ActionBar.h6.f21076i6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(q6Var, 65568, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f29437s, 4, null, null, null, null, this.f29428k0));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f29442y, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f21169n5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f29442y, 32, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f29442y, 65568, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.E, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.h6.f21130l5));
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
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21339w6));
            this.f29434q0 = true;
            this.f29432o0 = str;
            return;
        }
        by0 by0Var = this.f29431n0;
        if (by0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(by0Var);
            this.f29431n0 = null;
            this.f29432o0 = null;
            if (this.f29433p0 != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f29433p0, true);
            }
        }
        if (TextUtils.isEmpty(str)) {
            textView.setText(LocaleController.getString(R.string.ImportStickersEnterUrlInfo));
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21224q5));
            return;
        }
        this.f29434q0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                int length = str.length();
                for (int i10 = 0; i10 < length; i10++) {
                    char charAt = str.charAt(i10);
                    if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        textView.setText(LocaleController.getString(R.string.ImportStickersEnterUrlInfo));
                        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21208p7));
                        return;
                    }
                }
            } else {
                textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalid));
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21208p7));
                return;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 32) {
                textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalidLong));
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21208p7));
                return;
            }
            textView.setText(LocaleController.getString(R.string.ImportStickersLinkChecking));
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.F6));
            this.f29432o0 = str;
            by0 by0Var2 = new by0(this, str, textView, 0);
            this.f29431n0 = by0Var2;
            AndroidUtilities.runOnUIThread(by0Var2, 300L);
            return;
        }
        textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalidShort));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21208p7));
    }

    public final void o0() {
        if (!this.R) {
            return;
        }
        this.e.d(null);
        this.R = false;
        this.f29429l0.K(true);
        AndroidUtilities.forEachViews((RecyclerView) this.f29418c, (Utilities.Callback<View>) new ci.e(14));
        this.f29430n.postDelayed(new ay0(this, 0), 200L);
        this.f29437s.c(LocaleController.getString(R.string.EditStickers), true, true);
    }

    @Override
    public final void onBackPressed() {
        if (org.telegram.ui.et.q().E) {
            org.telegram.ui.et.q().o();
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
        this.e.d(this.f29418c);
        this.R = true;
        com.google.firebase.messaging.l lVar = this.f29429l0;
        char c10 = 0;
        lVar.K(false);
        float f7 = 0.0f;
        Float valueOf = Float.valueOf(0.0f);
        ArrayList arrayList = (ArrayList) lVar.d;
        if (arrayList.isEmpty()) {
            for (int i10 = 0; i10 < 6; i10++) {
                arrayList.add(valueOf);
                ((ArrayList) lVar.e).add(valueOf);
                ((ArrayList) lVar.f7648f).add(valueOf);
            }
        }
        int i11 = 0;
        for (int i12 = 6; i11 < i12; i12 = 6) {
            long nextFloat = Utilities.random.nextFloat() * 300;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, -2.0f, 0.0f, 2.0f, 0.0f);
            ofFloat.addUpdateListener(new oy0(lVar, i11, 3));
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
            ofFloat2.addUpdateListener(new oy0(lVar, i11, 4));
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
            ofFloat3.addUpdateListener(new oy0(lVar, i11, 5));
            ofFloat3.setRepeatCount(-1);
            ofFloat3.setRepeatMode(1);
            ofFloat3.setInterpolator(new LinearInterpolator());
            ofFloat3.setCurrentPlayTime(nextFloat);
            ofFloat3.setDuration(j10);
            ofFloat3.start();
            ((ArrayList) lVar.f7645a).add(ofFloat);
            ((ArrayList) lVar.f7646b).add(ofFloat2);
            ((ArrayList) lVar.f7647c).add(ofFloat3);
            i11++;
            f7 = f10;
            c10 = c11;
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f29418c, (Utilities.Callback<View>) new ci.e(15));
        this.f29430n.postDelayed(new ay0(this, 1), 200L);
        this.f29437s.c(LocaleController.getString(R.string.Done), true, true);
    }

    public final void r0() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f29441x, View.ALPHA, 0.0f));
        animatorSet.setDuration(200L);
        animatorSet.addListener(new c80(this, 23));
        animatorSet.start();
    }

    public final void s0(Context context) {
        int i10;
        hy0 hy0Var = new hy0(this, context);
        this.containerView = hy0Var;
        hy0Var.setWillNotDraw(false);
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
        this.f29418c = u1Var;
        u1Var.setTag(14);
        ai.u1 u1Var2 = this.f29418c;
        getContext();
        di.k kVar = new di.k(this);
        this.M = kVar;
        u1Var2.setLayoutManager(kVar);
        this.M.O = new ai.q1(this, 6);
        this.e = new s4.y(new iy0(this));
        ai.u1 u1Var3 = this.f29418c;
        ly0 ly0Var = new ly0(this, context);
        this.d = ly0Var;
        u1Var3.setAdapter(ly0Var);
        this.f29418c.setVerticalScrollBarEnabled(false);
        this.f29418c.i(new ci.l(8));
        this.f29418c.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.f29418c.setClipToPadding(false);
        this.f29418c.setEnabled(true);
        this.f29418c.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.h6.A5));
        this.f29418c.setOnTouchListener(new rk(this, 6));
        this.f29418c.setOnScrollListener(new kv(this, 11));
        j jVar = new j(this, 16);
        this.H = jVar;
        this.f29418c.setOnItemClickListener(jVar);
        this.containerView.addView(this.f29418c, w7.z5.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 48.0f));
        ah.x xVar = new ah.x(this, context, 23);
        this.K = xVar;
        this.containerView.addView(xVar, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.f29418c.setEmptyView(this.K);
        this.K.setOnTouchListener(new di.d(24));
        x90 x90Var = new x90(context, null);
        this.h = x90Var;
        x90Var.setLines(1);
        this.h.setSingleLine(true);
        this.h.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21093j5));
        this.h.setTextSize(1, 20.0f);
        this.h.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21113k5));
        this.h.setEllipsize(TextUtils.TruncateAt.END);
        this.h.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f));
        this.h.setGravity(16);
        this.h.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(this.h, w7.z5.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(org.telegram.ui.ActionBar.h6.Ji), false, this.resourcesProvider);
        this.f29430n = u0Var;
        u0Var.setLongClickEnabled(false);
        this.f29430n.setSubMenuOpenSide(2);
        this.f29430n.setIcon(R.drawable.ic_ab_other);
        this.f29430n.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(getThemedColor(org.telegram.ui.ActionBar.h6.Ni), 1, -1));
        this.containerView.addView(this.f29430n, w7.z5.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        this.f29430n.e(1, R.drawable.msg_share, LocaleController.getString(R.string.StickersShare));
        this.f29430n.e(2, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink));
        this.f29430n.setOnClickListener(new yx0(this, 1));
        this.f29430n.setDelegate(new zx0(this));
        this.f29430n.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f29430n;
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
        this.f29437s = q6Var;
        int i13 = org.telegram.ui.ActionBar.h6.f21058h5;
        int themedColor = getThemedColor(i13);
        int i14 = org.telegram.ui.ActionBar.h6.f21076i6;
        q6Var.setBackground(org.telegram.ui.ActionBar.h6.h0(themedColor, getThemedColor(i14)));
        q6 q6Var2 = this.f29437s;
        int i15 = org.telegram.ui.ActionBar.h6.f21169n5;
        this.f29428k0 = i15;
        q6Var2.setTextColor(getThemedColor(i15));
        this.f29437s.setTextSize(AndroidUtilities.dp(14.0f));
        this.f29437s.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        this.f29437s.setTypeface(AndroidUtilities.bold());
        this.f29437s.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f29440w = frameLayout;
        frameLayout.addView(this.f29437s, w7.z5.c(48.0f, -1));
        this.containerView.addView(this.f29440w, w7.z5.e(-1, -2, 83));
        sg.q0 q0Var = new sg.q0(AndroidUtilities.dp(24.0f), context, this.resourcesProvider, false);
        this.v = q0Var;
        q0Var.setIcon(R.raw.unlock_icon);
        this.v.setVisibility(4);
        this.containerView.addView(this.v, w7.z5.d(-1, 48.0f, 87, 8.0f, 0.0f, 8.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f29441x = frameLayout2;
        frameLayout2.setVisibility(8);
        this.f29441x.setSoundEffectsEnabled(false);
        this.containerView.addView(this.f29441x, w7.z5.c(-1.0f, -1));
        this.f29441x.setOnClickListener(new yx0(this, 2));
        w9 w9Var = new w9(context);
        this.F = w9Var;
        w9Var.setAspectFit(true);
        this.F.setLayerNum(7);
        this.f29441x.addView(this.F);
        TextView textView = new TextView(context);
        this.G = textView;
        textView.setTextSize(1, 30.0f);
        this.G.setGravity(85);
        this.f29441x.addView(this.G);
        TextView textView2 = new TextView(context);
        this.f29442y = textView2;
        textView2.setTextSize(1, 14.0f);
        this.f29442y.setTextColor(getThemedColor(i15));
        this.f29442y.setBackground(org.telegram.ui.ActionBar.h6.h0(getThemedColor(i13), getThemedColor(i14)));
        this.f29442y.setGravity(17);
        this.f29442y.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
        this.f29442y.setTypeface(AndroidUtilities.bold());
        this.f29441x.addView(this.f29442y, w7.z5.e(-1, 48, 83));
        this.f29442y.setOnClickListener(new yx0(this, 3));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams3.bottomMargin = AndroidUtilities.dp(48.0f);
        View view3 = new View(context);
        this.E = view3;
        view3.setBackgroundColor(getThemedColor(i12));
        this.f29441x.addView(this.E, layoutParams3);
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
        this.f29438s0 = runnable;
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
                this.S = mediaDataController.getStickerSetById(this.V.f20293id);
            }
            if (this.S == null) {
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                tL_messages_getStickerSet.stickerset = this.V;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getStickerSet, new org.telegram.ui.vc(21, this, mediaDataController));
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
            this.f29425h0 = !tL_messages_stickerSet.set.masks;
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
            q6 q6Var = this.f29437s;
            this.f29428k0 = i10;
            q6Var.setTextColor(getThemedColor(i10));
        }
        this.f29437s.c(str, false, true);
        this.f29437s.setOnClickListener(onClickListener);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f29437s.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.J[1].getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f29418c.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.K.getLayoutParams();
        if (onClickListener == null) {
            this.f29437s.setAlpha(0.0f);
        } else if (i11 >= 0 && i12 >= 0) {
            q6 q6Var2 = this.f29437s;
            int dp = AndroidUtilities.dp(24.0f);
            int themedColor = getThemedColor(i11);
            int themedColor2 = getThemedColor(i12);
            q6Var2.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, themedColor, themedColor2, themedColor2));
            this.f29440w.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21058h5));
            int dp2 = AndroidUtilities.dp(8.0f);
            marginLayoutParams.bottomMargin = dp2;
            marginLayoutParams.rightMargin = dp2;
            marginLayoutParams.topMargin = dp2;
            marginLayoutParams.leftMargin = dp2;
            int dp3 = AndroidUtilities.dp(64.0f);
            marginLayoutParams2.bottomMargin = dp3;
            marginLayoutParams3.bottomMargin = dp3;
            marginLayoutParams4.bottomMargin = dp3;
            if (this.f29437s.getAlpha() < 1.0f) {
                org.telegram.messenger.kk.t(this.f29437s.animate().alpha(1.0f), bs.h, 240L);
            }
        } else {
            this.f29437s.setBackground(org.telegram.ui.ActionBar.h6.h0(getThemedColor(org.telegram.ui.ActionBar.h6.f21058h5), org.telegram.ui.ActionBar.h6.m1(0.1f, getThemedColor(org.telegram.ui.ActionBar.h6.f21225q7))));
            this.f29440w.setBackgroundColor(0);
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            int dp4 = AndroidUtilities.dp(48.0f);
            marginLayoutParams2.bottomMargin = dp4;
            marginLayoutParams3.bottomMargin = dp4;
            marginLayoutParams4.bottomMargin = dp4;
            if (this.f29437s.getAlpha() < 1.0f) {
                org.telegram.messenger.kk.t(this.f29437s.animate().alpha(1.0f), bs.h, 240L);
            }
        }
        this.containerView.requestLayout();
    }

    public final void z0(int i10) {
        this.f29421e0 = i10;
        if (this.W == null) {
            float f7 = i10;
            this.h.setTranslationY(f7);
            if (this.X == null) {
                this.f29430n.setTranslationY(f7);
            }
            this.J[0].setTranslationY(f7);
        }
        this.containerView.invalidate();
    }

    public py0(Context context, String str, ArrayList arrayList, ArrayList arrayList2) {
        super(1, context, (org.telegram.ui.ActionBar.d6) null, false);
        this.I = new AnimatorSet[2];
        this.J = new View[2];
        this.f29427j0 = true;
        this.f29429l0 = new com.google.firebase.messaging.l(5);
        this.m0 = new ey0(this);
        fixNavigationBar();
        this.N = (Activity) context;
        this.X = arrayList;
        this.f29415a0 = str;
        Utilities.globalQueue.postRunnable(new by0(this, arrayList, arrayList2, 1));
        s0(context);
    }

    public py0(Context context, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.InputStickerSet inputStickerSet, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, my0 my0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, context, d6Var, false);
        this.I = new AnimatorSet[2];
        this.J = new View[2];
        this.f29427j0 = true;
        this.f29429l0 = new com.google.firebase.messaging.l(5);
        this.m0 = new ey0(this);
        fixNavigationBar();
        this.f29417b0 = my0Var;
        this.V = inputStickerSet;
        this.S = tL_messages_stickerSet;
        this.L = n2Var;
        u0();
        s0(context);
    }
}
