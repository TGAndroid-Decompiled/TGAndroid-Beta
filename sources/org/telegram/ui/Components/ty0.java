package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
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
import java.util.HashSet;
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
public class ty0 extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f30926w0 = 0;
    public View E;
    public w9 F;
    public TextView G;
    public j H;
    public final AnimatorSet[] I;
    public final View[] J;
    public ah.x K;
    public final org.telegram.ui.ActionBar.o2 L;
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
    public final String f30927a0;
    public Pattern f30928b;
    public final qy0 f30929b0;
    public ai.u1 f30930c;
    public ry0 f30931c0;
    public py0 d;
    public org.telegram.ui.z60 f30932d0;
    public s4.y e;
    public int f30933e0;
    public TLRPC.Document f30934f;
    public int f30935f0;
    public boolean f30936g0;
    public y90 h;
    public boolean f30937h0;
    public boolean f30938i0;
    public boolean f30939j0;
    public int f30940k0;
    public final com.google.firebase.messaging.l f30941l0;
    public final iy0 m0;
    public org.telegram.ui.ActionBar.u0 f30942n;
    public fy0 f30943n0;
    public String f30944o0;
    public int f30945p0;
    public boolean f30946q0;
    public org.telegram.ui.ActionBar.e1 f30947r;
    public String f30948r0;
    public q6 f30949s;
    public Runnable f30950s0;
    public ArrayList f30951t0;
    public int f30952u0;
    public sg.p0 v;
    public int f30953v0;
    public FrameLayout f30954w;
    public FrameLayout f30955x;
    public TextView f30956y;

    public ty0(Context context, Object obj, TLObject tLObject, org.telegram.ui.ActionBar.g6 g6Var) {
        super(1, context, g6Var, false);
        this.I = new AnimatorSet[2];
        this.J = new View[2];
        this.f30939j0 = true;
        this.f30941l0 = new com.google.firebase.messaging.l(5);
        this.m0 = new iy0(this);
        this.resourcesProvider = g6Var;
        fixNavigationBar();
        this.N = (Activity) context;
        TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputStickeredMediaPhoto.f20413id = tL_inputPhoto;
            tL_inputPhoto.f20362id = photo.f20367id;
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
            tL_inputStickeredMediaDocument.f20412id = tL_inputDocument;
            tL_inputDocument.f20355id = document.f20349id;
            tL_inputDocument.access_hash = document.access_hash;
            byte[] bArr2 = document.file_reference;
            tL_inputDocument.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputDocument.file_reference = new byte[0];
            }
            tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
        }
        org.telegram.ui.as0 as0Var = (org.telegram.ui.as0) this;
        this.f30935f0 = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getAttachedStickers, new ai.k2(as0Var, obj, tL_messages_getAttachedStickers, new org.telegram.ui.vc(22, as0Var, tL_messages_getAttachedStickers), 12));
        t0(context);
    }

    public static void A(ty0 ty0Var, int[] iArr, EditTextBoldCursor editTextBoldCursor, TextView textView, TextView textView2, AlertDialog$Builder alertDialog$Builder) {
        int i10 = iArr[0];
        if (i10 != 1) {
            if (i10 == 0) {
                iArr[0] = 1;
                TLRPC.TL_stickers_suggestShortName tL_stickers_suggestShortName = new TLRPC.TL_stickers_suggestShortName();
                String obj = editTextBoldCursor.getText().toString();
                ty0Var.f30948r0 = obj;
                tL_stickers_suggestShortName.title = obj;
                ConnectionsManager.getInstance(ty0Var.currentAccount).sendRequest(tL_stickers_suggestShortName, new ai.s9(ty0Var, editTextBoldCursor, textView, textView2, iArr, 7));
            } else if (i10 == 2) {
                iArr[0] = 3;
                if (!ty0Var.f30946q0) {
                    AndroidUtilities.shakeView(editTextBoldCursor);
                    try {
                        editTextBoldCursor.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                SendMessagesHelper.getInstance(ty0Var.currentAccount).prepareImportStickers(ty0Var.f30948r0, ty0Var.f30944o0, ty0Var.f30927a0, ty0Var.Y, new dy0(ty0Var));
                alertDialog$Builder.f20678a.N0.run();
                ty0Var.dismiss();
            }
        }
    }

    public static void C(ty0 ty0Var) {
        ty0Var.dismiss();
        MediaDataController.getInstance(ty0Var.currentAccount).toggleStickerSet(ty0Var.getContext(), ty0Var.S, 1, ty0Var.L, true, ty0Var.f30939j0);
    }

    public static void D(ty0 ty0Var) {
        ty0Var.dismiss();
        ry0 ry0Var = ty0Var.f30931c0;
        if (ry0Var != null) {
            ry0Var.a();
        }
        if (ty0Var.V != null && !MediaDataController.getInstance(ty0Var.currentAccount).cancelRemovingStickerSet(ty0Var.V.f20363id)) {
            TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
            tL_messages_installStickerSet.stickerset = ty0Var.V;
            ConnectionsManager.getInstance(ty0Var.currentAccount).sendRequest(tL_messages_installStickerSet, new x1(ty0Var, 13));
        }
    }

    public static void E(ty0 ty0Var, int i10) {
        String str;
        org.telegram.ui.ActionBar.o2 o2Var = ty0Var.L;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = ty0Var.S;
        if (tL_messages_stickerSet != null) {
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null && stickerSet.emojis) {
                str = "https://" + MessagesController.getInstance(ty0Var.currentAccount).linkPrefix + "/addemoji/" + ty0Var.S.set.short_name;
            } else {
                str = "https://" + MessagesController.getInstance(ty0Var.currentAccount).linkPrefix + "/addstickers/" + ty0Var.S.set.short_name;
            }
            String str2 = str;
            if (i10 == 1) {
                Context context = ty0Var.N;
                if (context == null && o2Var != null) {
                    context = o2Var.getParentActivity();
                }
                if (context == null) {
                    context = ty0Var.getContext();
                }
                gy0 gy0Var = new gy0(ty0Var, context, str2, str2, ty0Var.resourcesProvider);
                if (o2Var != null) {
                    o2Var.showDialog(gy0Var);
                    if (o2Var instanceof org.telegram.ui.sn) {
                        gy0Var.setCalcMandatoryInsets(((org.telegram.ui.sn) o2Var).C9());
                        return;
                    }
                    return;
                }
                gy0Var.show();
            } else if (i10 == 2) {
                try {
                    AndroidUtilities.addToClipboard(str2);
                    new xc((FrameLayout) ty0Var.containerView, ty0Var.resourcesProvider).k(false).j();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else if (i10 == 3) {
                if (ty0Var.R) {
                    ty0Var.p0();
                } else {
                    ty0Var.r0();
                }
            } else if (i10 == 4) {
                yy0.c(ty0Var.S.set, ty0Var.resourcesProvider, ty0Var.getContext(), new d(ty0Var, 20));
            } else if (i10 == 5) {
                yy0.b(ty0Var.S.set, ty0Var.resourcesProvider, ty0Var.getContext(), new ey0(ty0Var, 2));
            }
        }
    }

    public static void F(ty0 ty0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        int i10;
        org.telegram.ui.ActionBar.o2 o2Var = ty0Var.L;
        TLRPC.StickerSet stickerSet = ty0Var.S.set;
        if (stickerSet.masks) {
            i10 = 1;
        } else if (stickerSet.emojis) {
            i10 = 5;
        } else {
            i10 = 0;
        }
        try {
            if (tL_error == null) {
                if (ty0Var.f30939j0) {
                    qc.g(o2Var, new yx0(ty0Var.f30954w.getContext(), ty0Var.S, 1, 2, null, ty0Var.resourcesProvider), 1500).j();
                }
                if (tLObject instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                    MediaDataController.getInstance(ty0Var.currentAccount).processStickerSetInstallResultArchive(o2Var, true, i10, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject);
                }
            } else {
                Toast.makeText(ty0Var.getContext(), LocaleController.getString(R.string.ErrorOccurred), 0).show();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        MediaDataController.getInstance(ty0Var.currentAccount).loadStickers(i10, false, true);
    }

    public static void G(ty0 ty0Var, TLRPC.TL_error tL_error, TLObject tLObject, MediaDataController mediaDataController) {
        TLRPC.StickerSet stickerSet;
        boolean z10 = false;
        ty0Var.f30935f0 = 0;
        if (tL_error == null) {
            gn0 gn0Var = new gn0(ty0Var, 1);
            gn0Var.addTarget(ty0Var.containerView);
            TransitionManager.beginDelayedTransition(ty0Var.container, gn0Var);
            ty0Var.f30942n.setVisibility(0);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            ty0Var.S = tL_messages_stickerSet;
            mediaDataController.putStickerSet(tL_messages_stickerSet, false);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = ty0Var.S;
            if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents.isEmpty()) {
                ty0Var.dismiss();
                return;
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = ty0Var.S;
            if (tL_messages_stickerSet3 != null && (stickerSet = tL_messages_stickerSet3.set) != null && !stickerSet.masks) {
                z10 = true;
            }
            ty0Var.f30937h0 = z10;
            ty0Var.n0();
            mediaDataController.preloadStickerSetThumb(ty0Var.S);
            ty0Var.E0();
            ty0Var.D0();
            ty0Var.C0();
            ty0Var.d.l();
            return;
        }
        ty0Var.dismiss();
        org.telegram.ui.ActionBar.o2 o2Var = ty0Var.L;
        if (o2Var != null) {
            org.telegram.messenger.sl.q(R.string.AddStickersNotFound, xc.a0(o2Var), null);
        }
    }

    public static void I(ty0 ty0Var, String str, TextView textView) {
        TLRPC.TL_stickers_checkShortName tL_stickers_checkShortName = new TLRPC.TL_stickers_checkShortName();
        tL_stickers_checkShortName.short_name = str;
        ty0Var.f30945p0 = ConnectionsManager.getInstance(ty0Var.currentAccount).sendRequest(tL_stickers_checkShortName, new ai.j2(ty0Var, str, textView, 17), 2);
    }

    public static void J(ty0 ty0Var) {
        boolean z10;
        TLRPC.StickerSet stickerSet;
        MediaDataController mediaDataController = MediaDataController.getInstance(ty0Var.currentAccount);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = ty0Var.S;
        if (tL_messages_stickerSet != null && mediaDataController.isStickerPackInstalled(tL_messages_stickerSet.set.f20370id)) {
            z10 = false;
        } else {
            z10 = true;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = ty0Var.S;
        if (tL_messages_stickerSet2 != null && (stickerSet = tL_messages_stickerSet2.set) != null && stickerSet.creator && ty0Var.f30947r == null) {
            ty0Var.f30942n.e(3, R.drawable.tabs_reorder, LocaleController.getString(R.string.StickersReorder));
            ty0Var.f30942n.e(4, R.drawable.msg_edit, LocaleController.getString(R.string.EditName));
            if (z10) {
                ty0Var.f30947r = ty0Var.f30942n.e(5, R.drawable.msg_delete, LocaleController.getString(R.string.Delete));
            } else {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, ty0Var.getContext(), ty0Var.resourcesProvider);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, ty0Var.resourcesProvider).setOnClickListener(new cy0(ty0Var, 4));
                org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.StickersDeleteForEveryone), false, ty0Var.resourcesProvider);
                int i10 = org.telegram.ui.ActionBar.k6.f21421q7;
                ty0Var.getThemedColor(i10);
                c10.c(i10, i10);
                c10.h(0.1f, i10);
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.StickersRemoveForMe), false, ty0Var.resourcesProvider).setOnClickListener(new cy0(ty0Var, 6));
                c10.setOnClickListener(new cy0(ty0Var, 7));
                ty0Var.f30947r = ty0Var.f30942n.i(R.drawable.msg_delete, null, LocaleController.getString(R.string.Delete), actionBarPopupWindow$ActionBarPopupWindowLayout);
            }
            ty0Var.f30942n.a(-1);
            pb0 pb0Var = new pb0(ty0Var.currentAccount, 4, ty0Var.getContext(), new ArrayList(), ty0Var.resourcesProvider);
            pb0Var.setOnClickListener(new cy0(ty0Var, 8));
            pb0Var.setTag(R.id.fit_width_tag, 1);
            org.telegram.ui.ActionBar.u0 u0Var = ty0Var.f30942n;
            u0Var.o();
            u0Var.f21874b.a(pb0Var, new LinearLayout.LayoutParams(-1, -2));
            int themedColor = ty0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21421q7);
            ty0Var.f30947r.d(themedColor, themedColor);
            ty0Var.f30947r.setSelectorColor(org.telegram.ui.ActionBar.k6.o1(0.1f, themedColor));
            if (ty0Var.f30947r.getRightIcon() != null) {
                ty0Var.f30947r.getRightIcon().setColorFilter(themedColor);
            }
        }
        if (ty0Var.f30942n.getPopupLayout() != null) {
            ty0Var.f30942n.getPopupLayout().requestLayout();
        }
        ty0Var.f30942n.M(null, null);
    }

    public static void Q(ty0 ty0Var) {
        if (ty0Var.f30930c.getChildCount() <= 0) {
            ty0Var.A0(ty0Var.f30930c.getPaddingTop());
            return;
        }
        int i10 = 0;
        View view = null;
        int i11 = -1;
        for (int i12 = 0; i12 < ty0Var.f30930c.getChildCount(); i12++) {
            View childAt = ty0Var.f30930c.getChildAt(i12);
            ty0Var.f30930c.getClass();
            int R = RecyclerView.R(childAt);
            if (i11 == -1 || i11 > R) {
                view = childAt;
                i11 = R;
            }
        }
        if (view != null && view.getTop() >= 0) {
            int top = view.getTop();
            ty0Var.x0(0, false);
            i10 = top;
        } else {
            ty0Var.x0(0, true);
        }
        ty0Var.x0(1, true);
        if (ty0Var.f30933e0 != i10) {
            ty0Var.A0(i10);
        }
    }

    public static void m(ty0 ty0Var, View view, int i10) {
        TLRPC.StickerSet stickerSet;
        String str;
        if (view instanceof ny0) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = ty0Var.S;
            org.telegram.ui.ActionBar.o2 o2Var = ty0Var.L;
            org.telegram.ui.ActionBar.g6 g6Var = ty0Var.resourcesProvider;
            if (o2Var != null) {
                Context context = o2Var.getContext();
                if (!(o2Var instanceof org.telegram.ui.sn)) {
                    yy0.a(tL_messages_stickerSet, o2Var, g6Var);
                    return;
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert3, 0, context, g6Var);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(LocaleController.getString(R.string.StickersCreateNewSticker));
                org.telegram.ui.Cells.b1.n(R.drawable.menu_sticker_add, 0, arrayList3, arrayList2);
                arrayList.add(LocaleController.getString(R.string.StickersAddAnExistingSticker));
                arrayList3.add(Integer.valueOf(R.drawable.menu_sticker_select));
                arrayList2.add(1);
                org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                ci.e0 e0Var = new ci.e0(m1Var, arrayList2, tL_messages_stickerSet, o2Var, g6Var, 11);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, ((Integer) arrayList3.get(i11)).intValue(), (CharSequence) arrayList.get(i11), false, g6Var);
                    c10.setTag(Integer.valueOf(i11));
                    c10.setOnClickListener(e0Var);
                }
                m1Var.f21631c = 100;
                m1Var.f21633g = true;
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
        } else if (!ty0Var.R) {
            if (ty0Var.W != null) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) ty0Var.d.f29698f.get(i10);
                if (stickerSetCovered != null) {
                    ty0Var.dismiss();
                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                    TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                    tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                    tL_inputStickerSetID.f20363id = stickerSet2.f20370id;
                    new ty0(ty0Var.N, ty0Var.L, tL_inputStickerSetID, null, null, ty0Var.resourcesProvider).show();
                    return;
                }
                return;
            }
            ArrayList arrayList4 = ty0Var.Y;
            if (arrayList4 != null) {
                if (i10 >= 0 && i10 < arrayList4.size()) {
                    SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) ty0Var.Y.get(i10);
                    ty0Var.U = importingSticker;
                    if (importingSticker.validated) {
                        TextView textView = ty0Var.G;
                        textView.setText(Emoji.replaceEmoji(importingSticker.emoji, textView.getPaint().getFontMetricsInt(), false));
                        w9 w9Var = ty0Var.F;
                        ImageLocation forPath = ImageLocation.getForPath(ty0Var.U.path);
                        if (ty0Var.U.animated) {
                            str = "tgs";
                        } else {
                            str = null;
                        }
                        w9Var.m(forPath, null, null, null, null, str, 0, null);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ty0Var.f30955x.getLayoutParams();
                        layoutParams.topMargin = ty0Var.f30933e0;
                        ty0Var.f30955x.setLayoutParams(layoutParams);
                        ty0Var.f30955x.setVisibility(0);
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ObjectAnimator.ofFloat(ty0Var.f30955x, View.ALPHA, 0.0f, 1.0f));
                        animatorSet.setDuration(200L);
                        animatorSet.start();
                        return;
                    }
                    return;
                }
                return;
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = ty0Var.S;
            if (tL_messages_stickerSet2 != null && i10 >= 0 && i10 < tL_messages_stickerSet2.documents.size()) {
                ty0Var.T = ty0Var.S.documents.get(i10);
                int i12 = 0;
                while (true) {
                    if (i12 >= ty0Var.T.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = ty0Var.T.attributes.get(i12);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                        String str2 = documentAttribute.alt;
                        if (str2 != null && str2.length() > 0) {
                            TextView textView2 = ty0Var.G;
                            textView2.setText(Emoji.replaceEmoji(documentAttribute.alt, textView2.getPaint().getFontMetricsInt(), false));
                        }
                    } else {
                        i12++;
                    }
                }
                ty0Var.G.setText(Emoji.replaceEmoji(MediaDataController.getInstance(ty0Var.currentAccount).getEmojiForSticker(ty0Var.T.f20349id), ty0Var.G.getPaint().getFontMetricsInt(), false));
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = ty0Var.S;
                if ((tL_messages_stickerSet3 == null || (stickerSet = tL_messages_stickerSet3.set) == null || !stickerSet.emojis) && !org.telegram.ui.ht.o().w(view)) {
                    ty0Var.F.getImageReceiver().setImage(ImageLocation.getForDocument(ty0Var.T), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(ty0Var.T.thumbs, 90), ty0Var.T), (String) null, "webp", ty0Var.S, 1);
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ty0Var.f30955x.getLayoutParams();
                    layoutParams2.topMargin = ty0Var.f30933e0;
                    ty0Var.f30955x.setLayoutParams(layoutParams2);
                    ty0Var.f30955x.setVisibility(0);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(ty0Var.f30955x, View.ALPHA, 0.0f, 1.0f));
                    animatorSet2.setDuration(200L);
                    animatorSet2.start();
                }
            }
        }
    }

    public static void n(ty0 ty0Var) {
        ty0Var.f30942n.n();
        yy0.b(ty0Var.S.set, ty0Var.resourcesProvider, ty0Var.getContext(), new ey0(ty0Var, 4));
    }

    public static void p(ty0 ty0Var) {
        Context context = ty0Var.getContext();
        int[] iArr = {0};
        FrameLayout frameLayout = new FrameLayout(context);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.ImportStickersEnterName);
        alertDialog$Builder.k(LocaleController.getString(R.string.Next), new ud0(19));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        linearLayout.addView(frameLayout, w7.z5.t(-1, 36, 51, 24, 6, 24, 0));
        TextView textView = new TextView(context);
        TextView g10 = org.telegram.messenger.v0.g(context, 1, 16.0f);
        org.telegram.ui.ActionBar.r6.W(g10, org.telegram.ui.ActionBar.k6.f21478t5, ty0Var.resourcesProvider);
        g10.setMaxLines(1);
        g10.setLines(1);
        g10.setText("t.me/addstickers/");
        g10.setInputType(16385);
        g10.setGravity(51);
        g10.setSingleLine(true);
        g10.setVisibility(4);
        g10.setImeOptions(6);
        g10.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        frameLayout.addView(g10, w7.z5.e(-2, 36, 51));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setBackground(null);
        org.telegram.ui.ActionBar.r6.H(editTextBoldCursor, org.telegram.ui.ActionBar.k6.f21498u5, org.telegram.ui.ActionBar.k6.f21515v5, org.telegram.ui.ActionBar.k6.f21421q7, null);
        editTextBoldCursor.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.W(editTextBoldCursor, org.telegram.ui.ActionBar.k6.f21289j5, ty0Var.resourcesProvider);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setImeOptions(5);
        org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.k6.G6, ty0Var.resourcesProvider);
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        editTextBoldCursor.addTextChangedListener(new hy0(ty0Var, iArr, textView, editTextBoldCursor));
        frameLayout.addView(editTextBoldCursor, w7.z5.e(-1, 36, 51));
        editTextBoldCursor.setOnEditorActionListener(new d1(alertDialog$Builder, 8));
        editTextBoldCursor.setSelection(editTextBoldCursor.length());
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new tv(editTextBoldCursor, 23));
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ImportStickersEnterNameInfo)));
        textView.setTextSize(1, 14.0f);
        textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21420q5, ty0Var.resourcesProvider);
        linearLayout.addView(textView, w7.z5.n(-1, -2));
        i2 i2Var = new i2(editTextBoldCursor, 2);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
        c2Var.setOnShowListener(i2Var);
        c2Var.show();
        editTextBoldCursor.requestFocus();
        c2Var.d(-1).setOnClickListener(new m0(ty0Var, iArr, editTextBoldCursor, textView, g10, alertDialog$Builder, 3));
    }

    public static void q(org.telegram.ui.as0 as0Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers) {
        as0Var.f30935f0 = 0;
        if (tL_error == null && (tLObject instanceof Vector)) {
            Vector vector = (Vector) tLObject;
            if (vector.objects.isEmpty()) {
                as0Var.dismiss();
                return;
            } else if (vector.objects.size() == 1) {
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                as0Var.V = tL_inputStickerSetID;
                TLRPC.StickerSet stickerSet = ((TLRPC.StickerSetCovered) vector.objects.get(0)).set;
                tL_inputStickerSetID.f20363id = stickerSet.f20370id;
                tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                as0Var.v0();
                return;
            } else {
                ArrayList arrayList = new ArrayList();
                as0Var.W = arrayList;
                arrayList.addAll(vector.objects);
                as0Var.f30930c.setLayoutParams(w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
                as0Var.h.setVisibility(8);
                as0Var.J[0].setVisibility(8);
                as0Var.d.l();
                return;
            }
        }
        f5.f0(as0Var.currentAccount, tL_error, as0Var.L, tL_messages_getAttachedStickers, new Object[0]);
        as0Var.dismiss();
    }

    public static void q0(org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, TLRPC.Document document) {
        org.telegram.ui.sn snVar;
        boolean z10;
        TLRPC.StickerSet stickerSet;
        if (o2Var != null) {
            if (o2Var instanceof org.telegram.ui.sn) {
                snVar = (org.telegram.ui.sn) o2Var;
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
                    AndroidUtilities.runOnUIThread(new ig.q0(pathToAttach, arrayList, o2Var, snVar2, document, z10, tL_messages_stickerSet), 300L);
                    return;
                }
                return;
            }
            AndroidUtilities.runOnUIThread(new ei.s1((Object) o2Var, (Object) tL_messages_stickerSet, (Object) document, (Object) snVar2, z10, 18), 300L);
        }
    }

    public static void r(org.telegram.ui.as0 as0Var, Object obj, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers, org.telegram.ui.vc vcVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && obj != null) {
            FileRefController.getInstance(as0Var.currentAccount).requestReference(obj, tL_messages_getAttachedStickers, vcVar);
        } else {
            vcVar.run(tLObject, tL_error);
        }
    }

    public static void s(ty0 ty0Var) {
        ty0Var.dismiss();
        MediaDataController.getInstance(ty0Var.currentAccount).toggleStickerSet(ty0Var.getContext(), ty0Var.S, 0, ty0Var.L, true, ty0Var.f30939j0);
    }

    public static void t(ty0 ty0Var) {
        ty0Var.f30942n.n();
        ty0Var.dismiss();
        MediaDataController.getInstance(ty0Var.currentAccount).toggleStickerSet(ty0Var.getContext(), ty0Var.S, 1, ty0Var.L, true, true);
    }

    public static void u(ty0 ty0Var) {
        ty0Var.dismiss();
        MediaDataController.getInstance(ty0Var.currentAccount).toggleStickerSet(ty0Var.getContext(), ty0Var.S, 1, ty0Var.L, false, false);
    }

    public static void v(ty0 ty0Var) {
        ty0Var.dismiss();
        MediaDataController.getInstance(ty0Var.currentAccount).toggleStickerSet(ty0Var.getContext(), ty0Var.S, 1, ty0Var.L, false, false);
    }

    public static void w(ty0 ty0Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, TextView textView) {
        ty0Var.f30945p0 = 0;
        String str2 = ty0Var.f30944o0;
        if (str2 != null && str2.equals(str)) {
            if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                textView.setText(LocaleController.getString(R.string.ImportStickersLinkAvailable));
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21535w6, ty0Var.resourcesProvider);
                ty0Var.f30946q0 = true;
                return;
            }
            textView.setText(LocaleController.getString(R.string.ImportStickersLinkTaken));
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21404p7, ty0Var.resourcesProvider);
            ty0Var.f30946q0 = false;
        }
    }

    public static boolean y(ty0 ty0Var, MotionEvent motionEvent) {
        if (ty0Var.R) {
            return false;
        }
        return org.telegram.ui.ht.o().q(motionEvent, ty0Var.f30930c, ty0Var.H, ty0Var.m0, ty0Var.resourcesProvider);
    }

    public static void z(ty0 ty0Var, ArrayList arrayList, Boolean bool) {
        ty0Var.Y = arrayList;
        if (arrayList.isEmpty()) {
            ty0Var.dismiss();
            return;
        }
        ty0Var.d.l();
        if (bool.booleanValue()) {
            ty0Var.Z = new HashMap();
            int size = ty0Var.Y.size();
            for (int i10 = 0; i10 < size; i10++) {
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) ty0Var.Y.get(i10);
                ty0Var.Z.put(importingSticker.path, importingSticker);
                FileLoader.getInstance(ty0Var.currentAccount).uploadFile(importingSticker.path, false, true, 67108864);
            }
        }
        ty0Var.D0();
    }

    public final void A0(int i10) {
        this.f30933e0 = i10;
        if (this.W == null) {
            float f7 = i10;
            this.h.setTranslationY(f7);
            if (this.X == null) {
                this.f30942n.setTranslationY(f7);
            }
            this.J[0].setTranslationY(f7);
        }
        this.containerView.invalidate();
    }

    public final void B0(boolean z10) {
        this.d.getClass();
        this.h.setHighlightColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21326l5));
        this.f30955x.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21254h5) & (-536870913));
        this.f30942n.setIconColor(getThemedColor(org.telegram.ui.ActionBar.k6.Ji));
        this.f30942n.G(getThemedColor(org.telegram.ui.ActionBar.k6.E8), false);
        this.f30942n.G(getThemedColor(org.telegram.ui.ActionBar.k6.F8), true);
        this.f30942n.setPopupItemsSelectorColor(getThemedColor(org.telegram.ui.ActionBar.k6.I5));
        this.f30942n.B(getThemedColor(org.telegram.ui.ActionBar.k6.G8));
        if (this.f30947r != null) {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21421q7);
            this.f30947r.d(themedColor, themedColor);
            this.f30947r.setSelectorColor(org.telegram.ui.ActionBar.k6.o1(0.1f, themedColor));
            if (this.f30947r.getRightIcon() != null && themedColor != this.f30952u0) {
                this.f30952u0 = themedColor;
                this.f30947r.getRightIcon().setColorFilter(themedColor);
            }
        }
        if (z10) {
            if (org.telegram.ui.ActionBar.k6.g1() && this.f30951t0 == null) {
                ArrayList themeDescriptions = getThemeDescriptions();
                this.f30951t0 = themeDescriptions;
                int size = themeDescriptions.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((org.telegram.ui.ActionBar.t6) this.f30951t0.get(i10)).f21862g = null;
                }
            }
            int size2 = this.f30951t0.size();
            for (int i11 = 0; i11 < size2; i11++) {
                org.telegram.ui.ActionBar.t6 t6Var = (org.telegram.ui.ActionBar.t6) this.f30951t0.get(i11);
                t6Var.e(getThemedColor(t6Var.e), false, false);
            }
        }
        if (!org.telegram.ui.ActionBar.k6.g1() && this.f30951t0 != null) {
            this.f30951t0 = null;
        }
    }

    public final void C0() {
        if (this.containerView != null && !UserConfig.getInstance(this.currentAccount).isPremium()) {
            MessageObject.isPremiumEmojiPack(this.S);
        }
    }

    public final void D0() {
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
                if (this.f30928b == null) {
                    this.f30928b = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
                }
                Matcher matcher = this.f30928b.matcher(replaceEmoji);
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
                    spannableStringBuilder.setSpan(new m4(replaceEmoji.subSequence(start + 1, end).toString(), 1, this), start, end, 0);
                }
                if (spannableStringBuilder != null) {
                    replaceEmoji = spannableStringBuilder;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            this.h.setText(replaceEmoji);
            if (u0()) {
                int measuredWidth = this.f30930c.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = AndroidUtilities.displaySize.x;
                }
                py0 py0Var = this.d;
                if (AndroidUtilities.isTablet()) {
                    f7 = 60.0f;
                } else {
                    f7 = 45.0f;
                }
                py0Var.d = Math.max(1, measuredWidth / AndroidUtilities.dp(f7));
            } else {
                this.d.d = 5;
            }
            this.M.y1(this.d.d);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.S;
            int i17 = -1;
            if (tL_messages_stickerSet2 != null && (stickerSet7 = tL_messages_stickerSet2.set) != null && stickerSet7.emojis && !UserConfig.getInstance(this.currentAccount).isPremium() && this.f30932d0 == null) {
                if (this.S.documents != null) {
                    for (int i18 = 0; i18 < this.S.documents.size(); i18++) {
                        if (!MessageObject.isFreeEmoji(this.S.documents.get(i18))) {
                            this.v.setVisibility(0);
                            this.f30949s.setBackground(null);
                            y0(null, null, -1);
                            this.v.a(LocaleController.getString(R.string.UnlockPremiumEmoji), new cy0(this, 0), false);
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
                    if (stickerSets.get(i19) != null && stickerSets.get(i19).set != null && stickerSets.get(i19).set.f20370id == this.S.set.f20370id) {
                        z11 = true;
                        break;
                    }
                }
                z11 = false;
                z10 = !z11;
            } else if (tL_messages_stickerSet3 != null && (stickerSet = tL_messages_stickerSet3.set) != null && mediaDataController.isStickerPackInstalled(stickerSet.f20370id)) {
                z10 = false;
            } else {
                z10 = true;
            }
            org.telegram.ui.z60 z60Var = this.f30932d0;
            if (z60Var != null) {
                cy0 cy0Var = new cy0(this, 5);
                boolean z12 = z60Var.f44060a;
                if (z60Var.f44062c.N) {
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
                boolean z13 = this.f30932d0.f44060a;
                if (z13) {
                    i13 = org.telegram.ui.ActionBar.k6.f21421q7;
                } else {
                    i13 = org.telegram.ui.ActionBar.k6.Sh;
                }
                if (!z13) {
                    i14 = org.telegram.ui.ActionBar.k6.Oh;
                } else {
                    i14 = -1;
                }
                if (!z13) {
                    i17 = org.telegram.ui.ActionBar.k6.Qh;
                }
                z0(cy0Var, str, i13, i14, i17);
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
                    z0(null, "", -1, -1, -1);
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
                z0(new cy0(this, 9), formatPluralString2, org.telegram.ui.ActionBar.k6.Sh, org.telegram.ui.ActionBar.k6.Oh, org.telegram.ui.ActionBar.k6.Qh);
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
                    z0(new cy0(this, 10), formatPluralString, org.telegram.ui.ActionBar.k6.Sh, org.telegram.ui.ActionBar.k6.Oh, org.telegram.ui.ActionBar.k6.Qh);
                } else {
                    String str2 = formatPluralString;
                    if (this.S.set.official) {
                        y0(new cy0(this, 11), str2, org.telegram.ui.ActionBar.k6.f21421q7);
                    } else {
                        y0(new cy0(this, 12), str2, org.telegram.ui.ActionBar.k6.f21421q7);
                    }
                }
            }
            this.d.l();
            return;
        }
        ArrayList arrayList5 = this.X;
        if (arrayList5 != null) {
            y90 y90Var = this.h;
            ArrayList arrayList6 = this.Y;
            if (arrayList6 != null) {
                size = arrayList6.size();
            } else {
                size = arrayList5.size();
            }
            y90Var.setText(LocaleController.formatPluralString("Stickers", size, new Object[0]));
            HashMap hashMap = this.Z;
            if (hashMap != null && !hashMap.isEmpty()) {
                y0(null, LocaleController.getString(R.string.ImportStickersProcessing), org.telegram.ui.ActionBar.k6.f21420q5);
                this.f30949s.setEnabled(false);
                return;
            }
            cy0 cy0Var2 = new cy0(this, 13);
            int i20 = R.string.ImportStickers;
            ArrayList arrayList7 = this.Y;
            if (arrayList7 != null) {
                size2 = arrayList7.size();
            } else {
                size2 = arrayList5.size();
            }
            y0(cy0Var2, LocaleController.formatString("ImportStickers", i20, LocaleController.formatPluralString("Stickers", size2, new Object[0])), org.telegram.ui.ActionBar.k6.f21365n5);
            this.f30949s.setEnabled(true);
            return;
        }
        y0(new cy0(this, 14), LocaleController.getString(R.string.Close), org.telegram.ui.ActionBar.k6.f21365n5);
    }

    public final void E0() {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Point point = AndroidUtilities.displaySize;
        int min = (int) ((Math.min(point.x, point.y) / 2) / AndroidUtilities.density);
        if (this.X != null) {
            this.f30956y.setText(LocaleController.getString(R.string.ImportStickersRemove));
            org.telegram.ui.ActionBar.r6.W(this.f30956y, org.telegram.ui.ActionBar.k6.f21421q7, this.resourcesProvider);
            float f7 = min;
            this.F.setLayoutParams(w7.z5.d(min, f7, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.G.setLayoutParams(w7.z5.d(min, f7, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.f30956y.setVisibility(0);
            this.E.setVisibility(0);
        } else if (this.f30929b0 != null && ((tL_messages_stickerSet = this.S) == null || !tL_messages_stickerSet.set.masks)) {
            this.f30956y.setText(LocaleController.getString(R.string.SendSticker));
            float f10 = min;
            this.F.setLayoutParams(w7.z5.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.G.setLayoutParams(w7.z5.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.f30956y.setVisibility(0);
            this.E.setVisibility(0);
        } else {
            this.f30956y.setText(LocaleController.getString(R.string.Close));
            this.F.setLayoutParams(w7.z5.e(min, min, 17));
            this.G.setLayoutParams(w7.z5.e(min, min, 17));
            this.f30956y.setVisibility(8);
            this.E.setVisibility(8);
        }
    }

    public final void F0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.S = tL_messages_stickerSet;
        if (this.d != null) {
            E0();
            D0();
            this.d.l();
        }
        C0();
        MediaDataController.getInstance(this.currentAccount).preloadStickerSetThumb(this.S);
        n0();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.F8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.E8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21326l5));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            ai.u1 u1Var = this.f30930c;
            if (u1Var != null) {
                int childCount = u1Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    this.f30930c.getChildAt(i12).invalidate();
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
                    w0(importingSticker2);
                }
                if (this.Z.isEmpty()) {
                    D0();
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
                    tL_messages_stickerSet = mediaDataController.getStickerSetById(this.V.f20363id);
                }
            }
            if (tL_messages_stickerSet != null && tL_messages_stickerSet != this.S) {
                this.S = tL_messages_stickerSet;
                v0();
            }
            D0();
        }
    }

    @Override
    public void dismiss() {
        super.dismiss();
        this.f30941l0.B(false);
        Runnable runnable = this.f30950s0;
        if (runnable != null) {
            runnable.run();
        }
        if (this.f30935f0 != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f30935f0, true);
            this.f30935f0 = 0;
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
        z6 z6Var = new z6(this, 6);
        ViewGroup viewGroup = this.containerView;
        Drawable[] drawableArr = {this.shadowDrawable};
        int i10 = org.telegram.ui.ActionBar.k6.f21254h5;
        arrayList.add(new org.telegram.ui.ActionBar.t6(viewGroup, 0, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.containerView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ii));
        if (this.d.f29700r.W != null) {
            org.telegram.ui.Cells.r3.a(arrayList, z6Var);
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f30942n, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ni));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f30949s, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        q6 q6Var = this.f30949s;
        int i11 = org.telegram.ui.ActionBar.k6.f21272i6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(q6Var, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f30949s, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, this.f30940k0));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f30956y, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f30956y, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        return arrayList;
    }

    public final void n0() {
        if (this.S != null) {
            TLRPC.TL_messages_stickerSet filterPremiumStickers = MessagesController.getInstance(this.currentAccount).filterPremiumStickers(this.S);
            this.S = filterPremiumStickers;
            if (filterPremiumStickers == null) {
                dismiss();
            }
        }
    }

    public final void o0(TextView textView, String str, boolean z10) {
        if (z10) {
            textView.setText(LocaleController.getString(R.string.ImportStickersLinkAvailable));
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21535w6, this.resourcesProvider);
            this.f30946q0 = true;
            this.f30944o0 = str;
            return;
        }
        fy0 fy0Var = this.f30943n0;
        if (fy0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(fy0Var);
            this.f30943n0 = null;
            this.f30944o0 = null;
            if (this.f30945p0 != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f30945p0, true);
            }
        }
        if (TextUtils.isEmpty(str)) {
            textView.setText(LocaleController.getString(R.string.ImportStickersEnterUrlInfo));
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21420q5, this.resourcesProvider);
            return;
        }
        this.f30946q0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                int length = str.length();
                for (int i10 = 0; i10 < length; i10++) {
                    char charAt = str.charAt(i10);
                    if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        textView.setText(LocaleController.getString(R.string.ImportStickersEnterUrlInfo));
                        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21404p7, this.resourcesProvider);
                        return;
                    }
                }
            } else {
                textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalid));
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21404p7, this.resourcesProvider);
                return;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 32) {
                textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalidLong));
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21404p7, this.resourcesProvider);
                return;
            }
            textView.setText(LocaleController.getString(R.string.ImportStickersLinkChecking));
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.F6, this.resourcesProvider);
            this.f30944o0 = str;
            fy0 fy0Var2 = new fy0(this, str, textView, 0);
            this.f30943n0 = fy0Var2;
            AndroidUtilities.runOnUIThread(fy0Var2, 300L);
            return;
        }
        textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalidShort));
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21404p7, this.resourcesProvider);
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
    public final void onStart() {
        super.onStart();
        qc.a((FrameLayout) this.containerView, new ah.m0(this, 9));
    }

    @Override
    public final void onStop() {
        super.onStop();
        qc.h((FrameLayout) this.containerView);
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        B0(false);
        try {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21254h5);
            if (this.shadowDrawable != null && themedColor != this.f30953v0) {
                this.f30953v0 = themedColor;
                setBackgroundColor(themedColor);
            }
            ViewGroup viewGroup = this.containerView;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void p0() {
        if (!this.R) {
            return;
        }
        this.e.d(null);
        this.R = false;
        this.f30941l0.B(true);
        AndroidUtilities.forEachViews((RecyclerView) this.f30930c, (Utilities.Callback<View>) new ci.e(14));
        this.f30942n.postDelayed(new ey0(this, 0), 200L);
        this.f30949s.c(LocaleController.getString(R.string.EditStickers), true, true);
    }

    public final void r0() {
        if (this.R) {
            return;
        }
        this.e.d(this.f30930c);
        this.R = true;
        com.google.firebase.messaging.l lVar = this.f30941l0;
        char c10 = 0;
        lVar.B(false);
        float f7 = 0.0f;
        Float valueOf = Float.valueOf(0.0f);
        ArrayList arrayList = (ArrayList) lVar.d;
        if (arrayList.isEmpty()) {
            for (int i10 = 0; i10 < 6; i10++) {
                arrayList.add(valueOf);
                ((ArrayList) lVar.e).add(valueOf);
                ((ArrayList) lVar.f7660f).add(valueOf);
            }
        }
        int i11 = 0;
        for (int i12 = 6; i11 < i12; i12 = 6) {
            long nextFloat = Utilities.random.nextFloat() * 300;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, -2.0f, 0.0f, 2.0f, 0.0f);
            ofFloat.addUpdateListener(new sy0(lVar, i11, 3));
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
            ofFloat2.addUpdateListener(new sy0(lVar, i11, 4));
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
            ofFloat3.addUpdateListener(new sy0(lVar, i11, 5));
            ofFloat3.setRepeatCount(-1);
            ofFloat3.setRepeatMode(1);
            ofFloat3.setInterpolator(new LinearInterpolator());
            ofFloat3.setCurrentPlayTime(nextFloat);
            ofFloat3.setDuration(j10);
            ofFloat3.start();
            ((ArrayList) lVar.f7657a).add(ofFloat);
            ((ArrayList) lVar.f7658b).add(ofFloat2);
            ((ArrayList) lVar.f7659c).add(ofFloat3);
            i11++;
            f7 = f10;
            c10 = c11;
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f30930c, (Utilities.Callback<View>) new ci.e(15));
        this.f30942n.postDelayed(new ey0(this, 1), 200L);
        this.f30949s.c(LocaleController.getString(R.string.Done), true, true);
    }

    public final void s0() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f30955x, View.ALPHA, 0.0f));
        animatorSet.setDuration(200L);
        animatorSet.addListener(new i60(this, 24));
        animatorSet.start();
    }

    @Override
    public final void setOnDismissListener(Runnable runnable) {
        this.f30950s0 = runnable;
    }

    @Override
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
    }

    public final void t0(Context context) {
        int i10;
        ly0 ly0Var = new ly0(this, context);
        this.containerView = ly0Var;
        ly0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, 0, i11, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(context);
        View[] viewArr = this.J;
        viewArr[0] = view;
        int i12 = org.telegram.ui.ActionBar.k6.V5;
        org.telegram.ui.ActionBar.r6.i(i12, view, this.resourcesProvider);
        viewArr[0].setAlpha(0.0f);
        viewArr[0].setVisibility(4);
        viewArr[0].setTag(1);
        this.containerView.addView(viewArr[0], layoutParams);
        ai.u1 u1Var = new ai.u1(this, context, 24);
        this.f30930c = u1Var;
        u1Var.setTag(14);
        ai.u1 u1Var2 = this.f30930c;
        getContext();
        di.k kVar = new di.k(this);
        this.M = kVar;
        u1Var2.setLayoutManager(kVar);
        this.M.O = new ai.q1(this, 6);
        this.e = new s4.y(new my0(this));
        ai.u1 u1Var3 = this.f30930c;
        py0 py0Var = new py0(this, context);
        this.d = py0Var;
        u1Var3.setAdapter(py0Var);
        this.f30930c.setVerticalScrollBarEnabled(false);
        this.f30930c.i(new ci.l(8));
        this.f30930c.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.f30930c.setClipToPadding(false);
        this.f30930c.setEnabled(true);
        org.telegram.ui.ActionBar.r6.J(this.f30930c, org.telegram.ui.ActionBar.k6.A5, this.resourcesProvider);
        this.f30930c.setOnTouchListener(new rk(this, 6));
        this.f30930c.setOnScrollListener(new kv(this, 11));
        j jVar = new j(this, 16);
        this.H = jVar;
        this.f30930c.setOnItemClickListener(jVar);
        this.containerView.addView(this.f30930c, w7.z5.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 48.0f));
        ah.x xVar = new ah.x(this, context, 23);
        this.K = xVar;
        this.containerView.addView(xVar, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.f30930c.setEmptyView(this.K);
        this.K.setOnTouchListener(new di.d(24));
        y90 y90Var = new y90(context, null);
        this.h = y90Var;
        y90Var.setLines(1);
        this.h.setSingleLine(true);
        org.telegram.ui.ActionBar.r6.W(this.h, org.telegram.ui.ActionBar.k6.f21289j5, this.resourcesProvider);
        this.h.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.r6.I(this.h, org.telegram.ui.ActionBar.k6.f21309k5, this.resourcesProvider);
        this.h.setEllipsize(TextUtils.TruncateAt.END);
        this.h.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f));
        this.h.setGravity(16);
        this.h.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(this.h, w7.z5.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(context, null, 0, getThemedColor(org.telegram.ui.ActionBar.k6.Ji), false, this.resourcesProvider);
        this.f30942n = u0Var;
        u0Var.setLongClickEnabled(false);
        this.f30942n.setSubMenuOpenSide(2);
        this.f30942n.setIcon(R.drawable.ic_ab_other);
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f30942n;
        int i13 = org.telegram.ui.ActionBar.k6.Ni;
        org.telegram.ui.ActionBar.r6.S(u0Var2, org.telegram.ui.ActionBar.k6.g0(getThemedColor(i13), 1, -1), null, org.telegram.ui.ActionBar.r6.O(i13), this.resourcesProvider);
        this.containerView.addView(this.f30942n, w7.z5.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        this.f30942n.e(1, R.drawable.msg_share, LocaleController.getString(R.string.StickersShare));
        this.f30942n.e(2, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink));
        this.f30942n.setOnClickListener(new cy0(this, 1));
        this.f30942n.setDelegate(new dy0(this));
        this.f30942n.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        org.telegram.ui.ActionBar.u0 u0Var3 = this.f30942n;
        if (this.V != null) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        u0Var3.setVisibility(i10);
        this.K.addView(new RadialProgressView(context, null), w7.z5.e(-2, -2, 17));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
        View view2 = new View(context);
        viewArr[1] = view2;
        org.telegram.ui.ActionBar.r6.i(i12, view2, this.resourcesProvider);
        this.containerView.addView(viewArr[1], layoutParams2);
        q6 q6Var = new q6(context, false, false, false);
        this.f30949s = q6Var;
        int i14 = org.telegram.ui.ActionBar.k6.f21254h5;
        int themedColor = getThemedColor(i14);
        int i15 = org.telegram.ui.ActionBar.k6.f21272i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(themedColor, getThemedColor(i15));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i14);
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i15);
        org.telegram.ui.ActionBar.g6 g6Var = this.resourcesProvider;
        q6Var.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(q6Var, h02, O, O2, g6Var);
        q6 q6Var2 = this.f30949s;
        int i16 = org.telegram.ui.ActionBar.k6.f21365n5;
        this.f30940k0 = i16;
        org.telegram.ui.ActionBar.r6.a0(q6Var2, i16, this.resourcesProvider);
        this.f30949s.setTextSize(AndroidUtilities.dp(14.0f));
        this.f30949s.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        this.f30949s.setTypeface(AndroidUtilities.bold());
        this.f30949s.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f30954w = frameLayout;
        frameLayout.addView(this.f30949s, w7.z5.c(48.0f, -1));
        this.containerView.addView(this.f30954w, w7.z5.e(-1, -2, 83));
        sg.p0 p0Var = new sg.p0(AndroidUtilities.dp(24.0f), context, this.resourcesProvider, false);
        this.v = p0Var;
        p0Var.setIcon(R.raw.unlock_icon);
        this.v.setVisibility(4);
        this.containerView.addView(this.v, w7.z5.d(-1, 48.0f, 87, 8.0f, 0.0f, 8.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f30955x = frameLayout2;
        frameLayout2.setVisibility(8);
        this.f30955x.setSoundEffectsEnabled(false);
        this.containerView.addView(this.f30955x, w7.z5.c(-1.0f, -1));
        this.f30955x.setOnClickListener(new cy0(this, 2));
        w9 w9Var = new w9(context);
        this.F = w9Var;
        w9Var.setAspectFit(true);
        this.F.setLayerNum(7);
        this.f30955x.addView(this.F);
        TextView textView = new TextView(context);
        this.G = textView;
        textView.setTextSize(1, 30.0f);
        this.G.setGravity(85);
        this.f30955x.addView(this.G);
        TextView textView2 = new TextView(context);
        this.f30956y = textView2;
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.W(this.f30956y, i16, this.resourcesProvider);
        org.telegram.ui.ActionBar.r6.S(this.f30956y, org.telegram.ui.ActionBar.k6.h0(getThemedColor(i14), getThemedColor(i15)), org.telegram.ui.ActionBar.r6.O(i14), org.telegram.ui.ActionBar.r6.O(i15), this.resourcesProvider);
        this.f30956y.setGravity(17);
        this.f30956y.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
        this.f30956y.setTypeface(AndroidUtilities.bold());
        this.f30955x.addView(this.f30956y, w7.z5.e(-1, 48, 83));
        this.f30956y.setOnClickListener(new cy0(this, 3));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams3.bottomMargin = AndroidUtilities.dp(48.0f);
        View view3 = new View(context);
        this.E = view3;
        org.telegram.ui.ActionBar.r6.i(i12, view3, this.resourcesProvider);
        this.f30955x.addView(this.E, layoutParams3);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        if (this.X != null) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploaded);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploadFailed);
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        D0();
        E0();
        C0();
        B0(false);
        this.d.l();
    }

    public final boolean u0() {
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

    public final void v0() {
        String str;
        if (this.V != null) {
            MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
            if (this.S == null && (str = this.V.short_name) != null) {
                this.S = mediaDataController.getStickerSetByName(str);
            }
            if (this.S == null) {
                this.S = mediaDataController.getStickerSetById(this.V.f20363id);
            }
            if (this.S == null) {
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                tL_messages_getStickerSet.stickerset = this.V;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getStickerSet, new org.telegram.ui.vc(21, this, mediaDataController));
            } else {
                if (this.d != null) {
                    E0();
                    D0();
                    this.d.l();
                }
                C0();
                mediaDataController.preloadStickerSetThumb(this.S);
                n0();
            }
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.S;
        if (tL_messages_stickerSet != null) {
            this.f30937h0 = !tL_messages_stickerSet.set.masks;
        }
        n0();
    }

    public final void w0(SendMessagesHelper.ImportingSticker importingSticker) {
        int indexOf = this.Y.indexOf(importingSticker);
        if (indexOf >= 0) {
            this.Y.remove(indexOf);
            this.d.u(indexOf);
            if (this.Y.isEmpty()) {
                dismiss();
            } else {
                D0();
            }
        }
    }

    public final void x0(int i10, boolean z10) {
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
                animatorSetArr[i10].addListener(new va0(this, i10, z10, 1));
                animatorSetArr[i10].start();
            }
        }
    }

    public final void y0(View.OnClickListener onClickListener, String str, int i10) {
        z0(onClickListener, str, i10, -1, -1);
    }

    public final void z0(View.OnClickListener onClickListener, String str, int i10, int i11, int i12) {
        if (i10 >= 0) {
            q6 q6Var = this.f30949s;
            this.f30940k0 = i10;
            org.telegram.ui.ActionBar.r6.a0(q6Var, i10, this.resourcesProvider);
        }
        this.f30949s.c(str, false, true);
        this.f30949s.setOnClickListener(onClickListener);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f30949s.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.J[1].getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f30930c.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.K.getLayoutParams();
        if (onClickListener == null) {
            this.f30949s.setAlpha(0.0f);
        } else if (i11 >= 0 && i12 >= 0) {
            q6 q6Var2 = this.f30949s;
            int dp = AndroidUtilities.dp(24.0f);
            int themedColor = getThemedColor(i11);
            int themedColor2 = getThemedColor(i12);
            org.telegram.ui.ActionBar.r6.S(q6Var2, org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, themedColor, themedColor2, themedColor2), org.telegram.ui.ActionBar.r6.O(i11), org.telegram.ui.ActionBar.r6.O(i12), this.resourcesProvider);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21254h5, this.f30954w, this.resourcesProvider);
            int dp2 = AndroidUtilities.dp(8.0f);
            marginLayoutParams.bottomMargin = dp2;
            marginLayoutParams.rightMargin = dp2;
            marginLayoutParams.topMargin = dp2;
            marginLayoutParams.leftMargin = dp2;
            int dp3 = AndroidUtilities.dp(64.0f);
            marginLayoutParams2.bottomMargin = dp3;
            marginLayoutParams3.bottomMargin = dp3;
            marginLayoutParams4.bottomMargin = dp3;
            if (this.f30949s.getAlpha() < 1.0f) {
                org.telegram.messenger.sl.t(this.f30949s.animate().alpha(1.0f), bs.h, 240L);
            }
        } else {
            q6 q6Var3 = this.f30949s;
            int i13 = org.telegram.ui.ActionBar.k6.f21254h5;
            int themedColor3 = getThemedColor(i13);
            int i14 = org.telegram.ui.ActionBar.k6.f21421q7;
            org.telegram.ui.ActionBar.r6.S(q6Var3, org.telegram.ui.ActionBar.k6.h0(themedColor3, org.telegram.ui.ActionBar.k6.o1(0.1f, getThemedColor(i14))), org.telegram.ui.ActionBar.r6.O(i13), org.telegram.ui.ActionBar.r6.M(0.1f, i14), this.resourcesProvider);
            this.f30954w.setBackgroundColor(0);
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            int dp4 = AndroidUtilities.dp(48.0f);
            marginLayoutParams2.bottomMargin = dp4;
            marginLayoutParams3.bottomMargin = dp4;
            marginLayoutParams4.bottomMargin = dp4;
            if (this.f30949s.getAlpha() < 1.0f) {
                org.telegram.messenger.sl.t(this.f30949s.animate().alpha(1.0f), bs.h, 240L);
            }
        }
        this.containerView.requestLayout();
    }

    public ty0(Context context, String str, ArrayList arrayList, ArrayList arrayList2) {
        super(1, context, (org.telegram.ui.ActionBar.g6) null, false);
        this.I = new AnimatorSet[2];
        this.J = new View[2];
        this.f30939j0 = true;
        this.f30941l0 = new com.google.firebase.messaging.l(5);
        this.m0 = new iy0(this);
        fixNavigationBar();
        this.N = (Activity) context;
        this.X = arrayList;
        this.f30927a0 = str;
        Utilities.globalQueue.postRunnable(new fy0(this, arrayList, arrayList2, 1));
        t0(context);
    }

    public ty0(Context context, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.InputStickerSet inputStickerSet, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, qy0 qy0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(1, context, g6Var, false);
        this.I = new AnimatorSet[2];
        this.J = new View[2];
        this.f30939j0 = true;
        this.f30941l0 = new com.google.firebase.messaging.l(5);
        this.m0 = new iy0(this);
        fixNavigationBar();
        this.f30929b0 = qy0Var;
        this.V = inputStickerSet;
        this.S = tL_messages_stickerSet;
        this.L = o2Var;
        v0();
        t0(context);
    }
}
