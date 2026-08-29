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
public class nx0 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f31167q0 = 0;
    public View A;
    public t9 B;
    public TextView C;
    public k D;
    public final AnimatorSet[] E;
    public final View[] F;
    public bg.x2 G;
    public final org.telegram.ui.ActionBar.o2 H;
    public mh.k I;
    public final Activity J;
    public int K;
    public int L;
    public boolean M;
    public boolean N;
    public TLRPC.TL_messages_stickerSet O;
    public TLRPC.Document P;
    public SendMessagesHelper.ImportingSticker Q;
    public TLRPC.InputStickerSet R;
    public ArrayList S;
    public final ArrayList T;
    public ArrayList U;
    public HashMap V;
    public final String W;
    public final kx0 X;
    public lx0 Y;
    public org.telegram.ui.w60 Z;
    public int f31168a0;
    public Pattern f31169b;
    public int f31170b0;
    public jh.e1 f31171c;
    public boolean f31172c0;
    public jx0 d;
    public boolean f31173d0;
    public f2.e0 f31174e;
    public boolean f31175e0;
    public TLRPC.Document f31176f;
    public boolean f31177f0;
    public int f31178g0;
    public y80 h;
    public final bg.c2 f31179h0;
    public final cx0 f31180i0;
    public yw0 f31181j0;
    public String f31182k0;
    public int f31183l0;
    public boolean m0;
    public org.telegram.ui.ActionBar.w0 f31184n;
    public String f31185n0;
    public Runnable f31186o0;
    public ArrayList f31187p0;
    public org.telegram.ui.ActionBar.g1 f31188r;
    public o6 f31189s;
    public cg.d1 v;
    public FrameLayout f31190w;
    public FrameLayout f31191x;
    public TextView f31192y;

    public nx0(Context context, Object obj, TLObject tLObject, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, false, false);
        this.E = new AnimatorSet[2];
        this.F = new View[2];
        this.f31177f0 = true;
        this.f31179h0 = new bg.c2(9);
        this.f31180i0 = new cx0(this);
        this.resourcesProvider = c6Var;
        fixNavigationBar();
        this.J = (Activity) context;
        TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputStickeredMediaPhoto.f22462id = tL_inputPhoto;
            tL_inputPhoto.f22411id = photo.f22416id;
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
            tL_inputStickeredMediaDocument.f22461id = tL_inputDocument;
            tL_inputDocument.f22404id = document.f22398id;
            tL_inputDocument.access_hash = document.access_hash;
            byte[] bArr2 = document.file_reference;
            tL_inputDocument.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputDocument.file_reference = new byte[0];
            }
            tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
        }
        org.telegram.ui.nr0 nr0Var = (org.telegram.ui.nr0) this;
        this.f31170b0 = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getAttachedStickers, new ih.c1(nr0Var, obj, tL_messages_getAttachedStickers, new org.telegram.ui.zg(18, nr0Var, tL_messages_getAttachedStickers), 11));
        r0(context);
    }

    public static void A(nx0 nx0Var) {
        nx0Var.dismiss();
        MediaDataController.getInstance(nx0Var.currentAccount).toggleStickerSet(nx0Var.getContext(), nx0Var.O, 1, nx0Var.H, true, nx0Var.f31177f0);
    }

    public static void B(nx0 nx0Var) {
        nx0Var.dismiss();
        lx0 lx0Var = nx0Var.Y;
        if (lx0Var != null) {
            lx0Var.a();
        }
        if (nx0Var.R != null && !MediaDataController.getInstance(nx0Var.currentAccount).cancelRemovingStickerSet(nx0Var.R.f22412id)) {
            TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
            tL_messages_installStickerSet.stickerset = nx0Var.R;
            ConnectionsManager.getInstance(nx0Var.currentAccount).sendRequest(tL_messages_installStickerSet, new a2(nx0Var, 13));
        }
    }

    public static void C(nx0 nx0Var, int i10) {
        String str;
        org.telegram.ui.ActionBar.o2 o2Var = nx0Var.H;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = nx0Var.O;
        if (tL_messages_stickerSet != null) {
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null && stickerSet.emojis) {
                str = "https://" + MessagesController.getInstance(nx0Var.currentAccount).linkPrefix + "/addemoji/" + nx0Var.O.set.short_name;
            } else {
                str = "https://" + MessagesController.getInstance(nx0Var.currentAccount).linkPrefix + "/addstickers/" + nx0Var.O.set.short_name;
            }
            String str2 = str;
            if (i10 == 1) {
                Context context = nx0Var.J;
                if (context == null && o2Var != null) {
                    context = o2Var.getParentActivity();
                }
                if (context == null) {
                    context = nx0Var.getContext();
                }
                ax0 ax0Var = new ax0(nx0Var, context, str2, str2, nx0Var.resourcesProvider);
                if (o2Var != null) {
                    o2Var.showDialog(ax0Var);
                    if (o2Var instanceof org.telegram.ui.tn) {
                        ax0Var.setCalcMandatoryInsets(((org.telegram.ui.tn) o2Var).x9());
                        return;
                    }
                    return;
                }
                ax0Var.show();
            } else if (i10 == 2) {
                try {
                    AndroidUtilities.addToClipboard(str2);
                    new tc((FrameLayout) nx0Var.containerView, nx0Var.resourcesProvider).k(false).j();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            } else if (i10 == 3) {
                if (nx0Var.N) {
                    nx0Var.n0();
                } else {
                    nx0Var.p0();
                }
            } else if (i10 == 4) {
                tx0.c(nx0Var.O.set, nx0Var.resourcesProvider, nx0Var.getContext(), new d(nx0Var, 20));
            } else if (i10 == 5) {
                tx0.b(nx0Var.O.set, nx0Var.resourcesProvider, nx0Var.getContext(), new zw0(nx0Var, 2));
            }
        }
    }

    public static void D(nx0 nx0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        int i10;
        org.telegram.ui.ActionBar.o2 o2Var = nx0Var.H;
        TLRPC.StickerSet stickerSet = nx0Var.O.set;
        if (stickerSet.masks) {
            i10 = 1;
        } else if (stickerSet.emojis) {
            i10 = 5;
        } else {
            i10 = 0;
        }
        try {
            if (tL_error == null) {
                if (nx0Var.f31177f0) {
                    mc.g(o2Var, new sw0(nx0Var.f31190w.getContext(), nx0Var.O, 1, 2, null, nx0Var.resourcesProvider), 1500).j();
                }
                if (tLObject instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                    MediaDataController.getInstance(nx0Var.currentAccount).processStickerSetInstallResultArchive(o2Var, true, i10, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject);
                }
            } else {
                Toast.makeText(nx0Var.getContext(), LocaleController.getString(R.string.ErrorOccurred), 0).show();
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        MediaDataController.getInstance(nx0Var.currentAccount).loadStickers(i10, false, true);
    }

    public static void E(nx0 nx0Var, TLRPC.TL_error tL_error, TLObject tLObject, MediaDataController mediaDataController) {
        TLRPC.StickerSet stickerSet;
        boolean z10 = false;
        nx0Var.f31170b0 = 0;
        if (tL_error == null) {
            cm0 cm0Var = new cm0(nx0Var, 1);
            cm0Var.addTarget(nx0Var.containerView);
            TransitionManager.beginDelayedTransition(nx0Var.container, cm0Var);
            nx0Var.f31184n.setVisibility(0);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            nx0Var.O = tL_messages_stickerSet;
            mediaDataController.putStickerSet(tL_messages_stickerSet, false);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = nx0Var.O;
            if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents.isEmpty()) {
                nx0Var.dismiss();
                return;
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = nx0Var.O;
            if (tL_messages_stickerSet3 != null && (stickerSet = tL_messages_stickerSet3.set) != null && !stickerSet.masks) {
                z10 = true;
            }
            nx0Var.f31173d0 = z10;
            nx0Var.l0();
            mediaDataController.preloadStickerSetThumb(nx0Var.O);
            nx0Var.C0();
            nx0Var.B0();
            nx0Var.A0();
            nx0Var.d.l();
            return;
        }
        nx0Var.dismiss();
        org.telegram.ui.ActionBar.o2 o2Var = nx0Var.H;
        if (o2Var != null) {
            org.telegram.messenger.x3.s(R.string.AddStickersNotFound, tc.a0(o2Var), null);
        }
    }

    public static void F(nx0 nx0Var, String str, TextView textView) {
        TLRPC.TL_stickers_checkShortName tL_stickers_checkShortName = new TLRPC.TL_stickers_checkShortName();
        tL_stickers_checkShortName.short_name = str;
        nx0Var.f31183l0 = ConnectionsManager.getInstance(nx0Var.currentAccount).sendRequest(tL_stickers_checkShortName, new eg.z(nx0Var, str, textView, 18), 2);
    }

    public static void G(nx0 nx0Var) {
        boolean z10;
        TLRPC.StickerSet stickerSet;
        MediaDataController mediaDataController = MediaDataController.getInstance(nx0Var.currentAccount);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = nx0Var.O;
        if (tL_messages_stickerSet != null && mediaDataController.isStickerPackInstalled(tL_messages_stickerSet.set.f22419id)) {
            z10 = false;
        } else {
            z10 = true;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = nx0Var.O;
        if (tL_messages_stickerSet2 != null && (stickerSet = tL_messages_stickerSet2.set) != null && stickerSet.creator && nx0Var.f31188r == null) {
            nx0Var.f31184n.e(3, R.drawable.tabs_reorder, LocaleController.getString(R.string.StickersReorder));
            nx0Var.f31184n.e(4, R.drawable.msg_edit, LocaleController.getString(R.string.EditName));
            if (z10) {
                nx0Var.f31188r = nx0Var.f31184n.e(5, R.drawable.msg_delete, LocaleController.getString(R.string.Delete));
            } else {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, nx0Var.getContext(), nx0Var.resourcesProvider);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, nx0Var.resourcesProvider).setOnClickListener(new ww0(nx0Var, 4));
                org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.StickersDeleteForEveryone), false, nx0Var.resourcesProvider);
                int themedColor = nx0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23295q7);
                c3.c(themedColor, themedColor);
                c3.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(0.1f, themedColor));
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.StickersRemoveForMe), false, nx0Var.resourcesProvider).setOnClickListener(new ww0(nx0Var, 6));
                c3.setOnClickListener(new ww0(nx0Var, 7));
                nx0Var.f31188r = nx0Var.f31184n.i(R.drawable.msg_delete, null, LocaleController.getString(R.string.Delete), actionBarPopupWindow$ActionBarPopupWindowLayout);
            }
            nx0Var.f31184n.a(-1);
            qa0 qa0Var = new qa0(nx0Var.currentAccount, nx0Var.getContext(), nx0Var.resourcesProvider, new ArrayList(), 4);
            qa0Var.setOnClickListener(new ww0(nx0Var, 8));
            qa0Var.setTag(R.id.fit_width_tag, 1);
            org.telegram.ui.ActionBar.w0 w0Var = nx0Var.f31184n;
            w0Var.o();
            w0Var.f23915b.a(qa0Var, new LinearLayout.LayoutParams(-1, -2));
            int themedColor2 = nx0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23295q7);
            nx0Var.f31188r.c(themedColor2, themedColor2);
            nx0Var.f31188r.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(0.1f, themedColor2));
            if (nx0Var.f31188r.getRightIcon() != null) {
                nx0Var.f31188r.getRightIcon().setColorFilter(themedColor2);
            }
        }
        if (nx0Var.f31184n.getPopupLayout() != null) {
            nx0Var.f31184n.getPopupLayout().requestLayout();
        }
        nx0Var.f31184n.M(null, null);
    }

    public static void O(nx0 nx0Var) {
        if (nx0Var.f31171c.getChildCount() <= 0) {
            nx0Var.y0(nx0Var.f31171c.getPaddingTop());
            return;
        }
        int i10 = 0;
        View view = null;
        int i11 = -1;
        for (int i12 = 0; i12 < nx0Var.f31171c.getChildCount(); i12++) {
            View childAt = nx0Var.f31171c.getChildAt(i12);
            nx0Var.f31171c.getClass();
            int R = RecyclerView.R(childAt);
            if (i11 == -1 || i11 > R) {
                view = childAt;
                i11 = R;
            }
        }
        if (view != null && view.getTop() >= 0) {
            int top = view.getTop();
            nx0Var.v0(0, false);
            i10 = top;
        } else {
            nx0Var.v0(0, true);
        }
        nx0Var.v0(1, true);
        if (nx0Var.f31168a0 != i10) {
            nx0Var.y0(i10);
        }
    }

    public static void m(nx0 nx0Var, View view, int i10) {
        TLRPC.StickerSet stickerSet;
        String str;
        if (view instanceof hx0) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = nx0Var.O;
            org.telegram.ui.ActionBar.o2 o2Var = nx0Var.H;
            org.telegram.ui.ActionBar.c6 c6Var = nx0Var.resourcesProvider;
            if (o2Var != null) {
                Context context = o2Var.getContext();
                if (!(o2Var instanceof org.telegram.ui.tn)) {
                    tx0.a(tL_messages_stickerSet, o2Var, c6Var);
                    return;
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert3, 0, context, c6Var);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(LocaleController.getString(R.string.StickersCreateNewSticker));
                org.telegram.ui.b.h(R.drawable.menu_sticker_add, 0, arrayList3, arrayList2);
                arrayList.add(LocaleController.getString(R.string.StickersAddAnExistingSticker));
                arrayList3.add(Integer.valueOf(R.drawable.menu_sticker_select));
                arrayList2.add(1);
                org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                lh.b0 b0Var = new lh.b0(o1Var, arrayList2, tL_messages_stickerSet, o2Var, c6Var, 10);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, ((Integer) arrayList3.get(i11)).intValue(), (CharSequence) arrayList.get(i11), false, c6Var);
                    c3.setTag(Integer.valueOf(i11));
                    c3.setOnClickListener(b0Var);
                }
                o1Var.f23711c = 100;
                o1Var.f23714g = true;
                o1Var.setOutsideTouchable(true);
                o1Var.setClippingEnabled(true);
                o1Var.setAnimationStyle(R.style.PopupContextAnimation);
                o1Var.setFocusable(true);
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                o1Var.setInputMethodMode(2);
                o1Var.getContentView().setFocusableInTouchMode(true);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                o1Var.showAtLocation(view, 0, ((view.getMeasuredWidth() / 2) + iArr[0]) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() / 2), ((view.getMeasuredHeight() / 2) + iArr[1]) - (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() / 2));
                o1Var.b();
            }
        } else if (!nx0Var.N) {
            if (nx0Var.S != null) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) nx0Var.d.f29842f.get(i10);
                if (stickerSetCovered != null) {
                    nx0Var.dismiss();
                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                    TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                    tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                    tL_inputStickerSetID.f22412id = stickerSet2.f22419id;
                    new nx0(nx0Var.J, nx0Var.H, tL_inputStickerSetID, null, null, nx0Var.resourcesProvider).show();
                    return;
                }
                return;
            }
            ArrayList arrayList4 = nx0Var.U;
            if (arrayList4 != null) {
                if (i10 >= 0 && i10 < arrayList4.size()) {
                    SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) nx0Var.U.get(i10);
                    nx0Var.Q = importingSticker;
                    if (importingSticker.validated) {
                        TextView textView = nx0Var.C;
                        textView.setText(Emoji.replaceEmoji(importingSticker.emoji, textView.getPaint().getFontMetricsInt(), false));
                        t9 t9Var = nx0Var.B;
                        ImageLocation forPath = ImageLocation.getForPath(nx0Var.Q.path);
                        if (nx0Var.Q.animated) {
                            str = "tgs";
                        } else {
                            str = null;
                        }
                        t9Var.m(forPath, null, null, null, null, str, 0, null);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) nx0Var.f31191x.getLayoutParams();
                        layoutParams.topMargin = nx0Var.f31168a0;
                        nx0Var.f31191x.setLayoutParams(layoutParams);
                        nx0Var.f31191x.setVisibility(0);
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ObjectAnimator.ofFloat(nx0Var.f31191x, View.ALPHA, 0.0f, 1.0f));
                        animatorSet.setDuration(200L);
                        animatorSet.start();
                        return;
                    }
                    return;
                }
                return;
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = nx0Var.O;
            if (tL_messages_stickerSet2 != null && i10 >= 0 && i10 < tL_messages_stickerSet2.documents.size()) {
                nx0Var.P = nx0Var.O.documents.get(i10);
                int i12 = 0;
                while (true) {
                    if (i12 >= nx0Var.P.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = nx0Var.P.attributes.get(i12);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                        String str2 = documentAttribute.alt;
                        if (str2 != null && str2.length() > 0) {
                            TextView textView2 = nx0Var.C;
                            textView2.setText(Emoji.replaceEmoji(documentAttribute.alt, textView2.getPaint().getFontMetricsInt(), false));
                        }
                    } else {
                        i12++;
                    }
                }
                nx0Var.C.setText(Emoji.replaceEmoji(MediaDataController.getInstance(nx0Var.currentAccount).getEmojiForSticker(nx0Var.P.f22398id), nx0Var.C.getPaint().getFontMetricsInt(), false));
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = nx0Var.O;
                if ((tL_messages_stickerSet3 == null || (stickerSet = tL_messages_stickerSet3.set) == null || !stickerSet.emojis) && !org.telegram.ui.ht.q().y(view)) {
                    nx0Var.B.getImageReceiver().setImage(ImageLocation.getForDocument(nx0Var.P), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(nx0Var.P.thumbs, 90), nx0Var.P), (String) null, "webp", nx0Var.O, 1);
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) nx0Var.f31191x.getLayoutParams();
                    layoutParams2.topMargin = nx0Var.f31168a0;
                    nx0Var.f31191x.setLayoutParams(layoutParams2);
                    nx0Var.f31191x.setVisibility(0);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(nx0Var.f31191x, View.ALPHA, 0.0f, 1.0f));
                    animatorSet2.setDuration(200L);
                    animatorSet2.start();
                }
            }
        }
    }

    public static void n(nx0 nx0Var) {
        nx0Var.f31184n.n();
        tx0.b(nx0Var.O.set, nx0Var.resourcesProvider, nx0Var.getContext(), new zw0(nx0Var, 4));
    }

    public static void o(org.telegram.ui.nr0 nr0Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers) {
        nr0Var.f31170b0 = 0;
        if (tL_error == null && (tLObject instanceof Vector)) {
            Vector vector = (Vector) tLObject;
            if (vector.objects.isEmpty()) {
                nr0Var.dismiss();
                return;
            } else if (vector.objects.size() == 1) {
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                nr0Var.R = tL_inputStickerSetID;
                TLRPC.StickerSet stickerSet = ((TLRPC.StickerSetCovered) vector.objects.get(0)).set;
                tL_inputStickerSetID.f22412id = stickerSet.f22419id;
                tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                nr0Var.t0();
                return;
            } else {
                ArrayList arrayList = new ArrayList();
                nr0Var.S = arrayList;
                arrayList.addAll(vector.objects);
                nr0Var.f31171c.setLayoutParams(i7.f6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
                nr0Var.h.setVisibility(8);
                nr0Var.F[0].setVisibility(8);
                nr0Var.d.l();
                return;
            }
        }
        c5.f0(nr0Var.currentAccount, tL_error, nr0Var.H, tL_messages_getAttachedStickers, new Object[0]);
        nr0Var.dismiss();
    }

    public static void o0(org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, TLRPC.Document document) {
        org.telegram.ui.tn tnVar;
        boolean z10;
        TLRPC.StickerSet stickerSet;
        if (o2Var != null) {
            if (o2Var instanceof org.telegram.ui.tn) {
                tnVar = (org.telegram.ui.tn) o2Var;
            } else {
                tnVar = null;
            }
            org.telegram.ui.tn tnVar2 = tnVar;
            if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.creator) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (MessageObject.isStaticStickerDocument(document)) {
                ArrayList arrayList = new ArrayList();
                File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true);
                if (pathToAttach != null && pathToAttach.exists()) {
                    AndroidUtilities.runOnUIThread(new hh.h(pathToAttach, arrayList, o2Var, tnVar2, document, z10, tL_messages_stickerSet), 300L);
                    return;
                }
                return;
            }
            AndroidUtilities.runOnUIThread(new eg.j(o2Var, (Object) tL_messages_stickerSet, (Object) document, (Object) tnVar2, z10, 17), 300L);
        }
    }

    public static void p(org.telegram.ui.nr0 nr0Var, Object obj, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers, org.telegram.ui.zg zgVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && obj != null) {
            FileRefController.getInstance(nr0Var.currentAccount).requestReference(obj, tL_messages_getAttachedStickers, zgVar);
        } else {
            zgVar.run(tLObject, tL_error);
        }
    }

    public static void q(nx0 nx0Var) {
        nx0Var.dismiss();
        MediaDataController.getInstance(nx0Var.currentAccount).toggleStickerSet(nx0Var.getContext(), nx0Var.O, 0, nx0Var.H, true, nx0Var.f31177f0);
    }

    public static void r(nx0 nx0Var) {
        nx0Var.f31184n.n();
        nx0Var.dismiss();
        MediaDataController.getInstance(nx0Var.currentAccount).toggleStickerSet(nx0Var.getContext(), nx0Var.O, 1, nx0Var.H, true, true);
    }

    public static void s(nx0 nx0Var) {
        nx0Var.dismiss();
        MediaDataController.getInstance(nx0Var.currentAccount).toggleStickerSet(nx0Var.getContext(), nx0Var.O, 1, nx0Var.H, false, false);
    }

    public static void t(nx0 nx0Var) {
        nx0Var.dismiss();
        MediaDataController.getInstance(nx0Var.currentAccount).toggleStickerSet(nx0Var.getContext(), nx0Var.O, 1, nx0Var.H, false, false);
    }

    public static boolean v(nx0 nx0Var, MotionEvent motionEvent) {
        if (nx0Var.N) {
            return false;
        }
        return org.telegram.ui.ht.q().s(motionEvent, nx0Var.f31171c, nx0Var.D, nx0Var.f31180i0, nx0Var.resourcesProvider);
    }

    public static void w(nx0 nx0Var, ArrayList arrayList, Boolean bool) {
        nx0Var.U = arrayList;
        if (arrayList.isEmpty()) {
            nx0Var.dismiss();
            return;
        }
        nx0Var.d.l();
        if (bool.booleanValue()) {
            nx0Var.V = new HashMap();
            int size = nx0Var.U.size();
            for (int i10 = 0; i10 < size; i10++) {
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) nx0Var.U.get(i10);
                nx0Var.V.put(importingSticker.path, importingSticker);
                FileLoader.getInstance(nx0Var.currentAccount).uploadFile(importingSticker.path, false, true, 67108864);
            }
        }
        nx0Var.B0();
    }

    public static void x(nx0 nx0Var, int[] iArr, EditTextBoldCursor editTextBoldCursor, TextView textView, TextView textView2, AlertDialog$Builder alertDialog$Builder) {
        int i10 = iArr[0];
        if (i10 != 1) {
            if (i10 == 0) {
                iArr[0] = 1;
                TLRPC.TL_stickers_suggestShortName tL_stickers_suggestShortName = new TLRPC.TL_stickers_suggestShortName();
                String obj = editTextBoldCursor.getText().toString();
                nx0Var.f31185n0 = obj;
                tL_stickers_suggestShortName.title = obj;
                ConnectionsManager.getInstance(nx0Var.currentAccount).sendRequest(tL_stickers_suggestShortName, new eg.f0(nx0Var, editTextBoldCursor, textView, textView2, iArr, 9));
            } else if (i10 == 2) {
                iArr[0] = 3;
                if (!nx0Var.m0) {
                    AndroidUtilities.shakeView(editTextBoldCursor);
                    try {
                        editTextBoldCursor.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                SendMessagesHelper.getInstance(nx0Var.currentAccount).prepareImportStickers(nx0Var.f31185n0, nx0Var.f31182k0, nx0Var.W, nx0Var.U, new xw0(nx0Var));
                alertDialog$Builder.f22714a.H0.run();
                nx0Var.dismiss();
            }
        }
    }

    public final void A0() {
        if (this.containerView != null && !UserConfig.getInstance(this.currentAccount).isPremium()) {
            MessageObject.isPremiumEmojiPack(this.O);
        }
    }

    public final void B0() {
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
        float f9;
        if (this.h == null) {
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.O;
        int i16 = 1;
        if (tL_messages_stickerSet != null && (arrayList = tL_messages_stickerSet.documents) != null && !arrayList.isEmpty()) {
            CharSequence replaceEmoji = Emoji.replaceEmoji(this.O.set.title, this.h.getPaint().getFontMetricsInt(), false);
            try {
                if (this.f31169b == null) {
                    this.f31169b = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
                }
                Matcher matcher = this.f31169b.matcher(replaceEmoji);
                SpannableStringBuilder spannableStringBuilder = null;
                while (matcher.find()) {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder(replaceEmoji);
                    }
                    int start = matcher.start();
                    int end = matcher.end();
                    if (this.O.set.title.charAt(start) != '@') {
                        start++;
                    }
                    spannableStringBuilder.setSpan(new k4(replaceEmoji.subSequence(start + 1, end).toString(), 1, this), start, end, 0);
                }
                if (spannableStringBuilder != null) {
                    replaceEmoji = spannableStringBuilder;
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            this.h.setText(replaceEmoji);
            if (s0()) {
                int measuredWidth = this.f31171c.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = AndroidUtilities.displaySize.x;
                }
                jx0 jx0Var = this.d;
                if (AndroidUtilities.isTablet()) {
                    f9 = 60.0f;
                } else {
                    f9 = 45.0f;
                }
                jx0Var.d = Math.max(1, measuredWidth / AndroidUtilities.dp(f9));
            } else {
                this.d.d = 5;
            }
            this.I.y1(this.d.d);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.O;
            int i17 = -1;
            if (tL_messages_stickerSet2 != null && (stickerSet7 = tL_messages_stickerSet2.set) != null && stickerSet7.emojis && !UserConfig.getInstance(this.currentAccount).isPremium() && this.Z == null) {
                if (this.O.documents != null) {
                    for (int i18 = 0; i18 < this.O.documents.size(); i18++) {
                        if (!MessageObject.isFreeEmoji(this.O.documents.get(i18))) {
                            this.v.setVisibility(0);
                            this.f31189s.setBackground(null);
                            w0(null, null, -1);
                            this.v.a(LocaleController.getString(R.string.UnlockPremiumEmoji), new ww0(this, 0), false);
                            return;
                        }
                    }
                }
            } else {
                this.v.setVisibility(4);
            }
            MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = this.O;
            if (tL_messages_stickerSet3 != null && (stickerSet6 = tL_messages_stickerSet3.set) != null && stickerSet6.emojis) {
                ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = mediaDataController.getStickerSets(5);
                for (int i19 = 0; stickerSets != null && i19 < stickerSets.size(); i19++) {
                    if (stickerSets.get(i19) != null && stickerSets.get(i19).set != null && stickerSets.get(i19).set.f22419id == this.O.set.f22419id) {
                        z11 = true;
                        break;
                    }
                }
                z11 = false;
                z10 = !z11;
            } else if (tL_messages_stickerSet3 != null && (stickerSet = tL_messages_stickerSet3.set) != null && mediaDataController.isStickerPackInstalled(stickerSet.f22419id)) {
                z10 = false;
            } else {
                z10 = true;
            }
            org.telegram.ui.w60 w60Var = this.Z;
            if (w60Var != null) {
                ww0 ww0Var = new ww0(this, 5);
                boolean z12 = w60Var.f43849a;
                if (w60Var.f43851c.J) {
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
                boolean z13 = this.Z.f43849a;
                if (z13) {
                    i13 = org.telegram.ui.ActionBar.g6.f23295q7;
                } else {
                    i13 = org.telegram.ui.ActionBar.g6.Sh;
                }
                if (!z13) {
                    i14 = org.telegram.ui.ActionBar.g6.Oh;
                } else {
                    i14 = -1;
                }
                if (!z13) {
                    i17 = org.telegram.ui.ActionBar.g6.Qh;
                }
                x0(ww0Var, str, i13, i14, i17);
                return;
            }
            if (z10) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = this.O;
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
            if (z10) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = this.O;
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
                x0(new ww0(this, 9), formatPluralString2, org.telegram.ui.ActionBar.g6.Sh, org.telegram.ui.ActionBar.g6.Oh, org.telegram.ui.ActionBar.g6.Qh);
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet6 = this.O;
                TLRPC.StickerSet stickerSet8 = tL_messages_stickerSet6.set;
                boolean z14 = stickerSet8.creator;
                if (z14) {
                    if (this.N) {
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
                    x0(new ww0(this, 10), formatPluralString, org.telegram.ui.ActionBar.g6.Sh, org.telegram.ui.ActionBar.g6.Oh, org.telegram.ui.ActionBar.g6.Qh);
                } else {
                    String str2 = formatPluralString;
                    if (this.O.set.official) {
                        w0(new ww0(this, 11), str2, org.telegram.ui.ActionBar.g6.f23295q7);
                    } else {
                        w0(new ww0(this, 12), str2, org.telegram.ui.ActionBar.g6.f23295q7);
                    }
                }
            }
            this.d.l();
            return;
        }
        ArrayList arrayList5 = this.T;
        if (arrayList5 != null) {
            y80 y80Var = this.h;
            ArrayList arrayList6 = this.U;
            if (arrayList6 != null) {
                size = arrayList6.size();
            } else {
                size = arrayList5.size();
            }
            y80Var.setText(LocaleController.formatPluralString("Stickers", size, new Object[0]));
            HashMap hashMap = this.V;
            if (hashMap != null && !hashMap.isEmpty()) {
                w0(null, LocaleController.getString(R.string.ImportStickersProcessing), org.telegram.ui.ActionBar.g6.f23294q5);
                this.f31189s.setEnabled(false);
                return;
            }
            ww0 ww0Var2 = new ww0(this, 13);
            int i20 = R.string.ImportStickers;
            ArrayList arrayList7 = this.U;
            if (arrayList7 != null) {
                size2 = arrayList7.size();
            } else {
                size2 = arrayList5.size();
            }
            w0(ww0Var2, LocaleController.formatString("ImportStickers", i20, LocaleController.formatPluralString("Stickers", size2, new Object[0])), org.telegram.ui.ActionBar.g6.f23240n5);
            this.f31189s.setEnabled(true);
            return;
        }
        w0(new ww0(this, 14), LocaleController.getString(R.string.Close), org.telegram.ui.ActionBar.g6.f23240n5);
    }

    public final void C0() {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Point point = AndroidUtilities.displaySize;
        int min = (int) ((Math.min(point.x, point.y) / 2) / AndroidUtilities.density);
        if (this.T != null) {
            this.f31192y.setText(LocaleController.getString(R.string.ImportStickersRemove));
            this.f31192y.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23295q7));
            float f9 = min;
            this.B.setLayoutParams(i7.f6.d(min, f9, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.C.setLayoutParams(i7.f6.d(min, f9, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.f31192y.setVisibility(0);
            this.A.setVisibility(0);
        } else if (this.X != null && ((tL_messages_stickerSet = this.O) == null || !tL_messages_stickerSet.set.masks)) {
            this.f31192y.setText(LocaleController.getString(R.string.SendSticker));
            float f10 = min;
            this.B.setLayoutParams(i7.f6.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.C.setLayoutParams(i7.f6.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.f31192y.setVisibility(0);
            this.A.setVisibility(0);
        } else {
            this.f31192y.setText(LocaleController.getString(R.string.Close));
            this.B.setLayoutParams(i7.f6.e(min, min, 17));
            this.C.setLayoutParams(i7.f6.e(min, min, 17));
            this.f31192y.setVisibility(8);
            this.A.setVisibility(8);
        }
    }

    public final void D0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.O = tL_messages_stickerSet;
        if (this.d != null) {
            C0();
            B0();
            this.d.l();
        }
        A0();
        MediaDataController.getInstance(this.currentAccount).preloadStickerSetThumb(this.O);
        l0();
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            jh.e1 e1Var = this.f31171c;
            if (e1Var != null) {
                int childCount = e1Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    this.f31171c.getChildAt(i12).invalidate();
                }
            }
        } else if (i10 == NotificationCenter.fileUploaded) {
            HashMap hashMap = this.V;
            if (hashMap != null) {
                String str = (String) objArr[0];
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) hashMap.get(str);
                if (importingSticker != null) {
                    importingSticker.uploadMedia(this.currentAccount, (TLRPC.InputFile) objArr[1], new yw0(this, str, importingSticker, 0));
                }
            }
        } else if (i10 == NotificationCenter.fileUploadFailed) {
            HashMap hashMap2 = this.V;
            if (hashMap2 != null) {
                SendMessagesHelper.ImportingSticker importingSticker2 = (SendMessagesHelper.ImportingSticker) hashMap2.remove((String) objArr[0]);
                if (importingSticker2 != null) {
                    u0(importingSticker2);
                }
                if (this.V.isEmpty()) {
                    B0();
                }
            }
        } else if (i10 == NotificationCenter.stickersDidLoad) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
            if (this.R != null) {
                MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
                String str2 = this.R.short_name;
                if (str2 != null) {
                    tL_messages_stickerSet = mediaDataController.getStickerSetByName(str2);
                }
                if (tL_messages_stickerSet == null) {
                    tL_messages_stickerSet = mediaDataController.getStickerSetById(this.R.f22412id);
                }
            }
            if (tL_messages_stickerSet != null && tL_messages_stickerSet != this.O) {
                this.O = tL_messages_stickerSet;
                t0();
            }
            B0();
        }
    }

    @Override
    public void dismiss() {
        super.dismiss();
        this.f31179h0.C(false);
        Runnable runnable = this.f31186o0;
        if (runnable != null) {
            runnable.run();
        }
        if (this.f31170b0 != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f31170b0, true);
            this.f31170b0 = 0;
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        if (this.T != null) {
            ArrayList arrayList = this.U;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) this.U.get(i10);
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
        x6 x6Var = new x6(this, 9);
        ViewGroup viewGroup = this.containerView;
        Drawable[] drawableArr = {this.shadowDrawable};
        int i10 = org.telegram.ui.ActionBar.g6.f23133h5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(viewGroup, 0, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.containerView, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Ii));
        nx0 nx0Var = this.d.f29844r;
        if (nx0Var.S != null) {
            org.telegram.ui.Cells.p3.a(arrayList, nx0Var.f31171c, x6Var);
        }
        View[] viewArr = this.F;
        View view = viewArr[0];
        int i11 = org.telegram.ui.ActionBar.g6.V5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(viewArr[1], 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f31171c, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23169j5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 2, null, null, null, null, org.telegram.ui.ActionBar.g6.f23188k5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f31184n, 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.Ni));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f31189s, 32, null, null, null, null, i10));
        o6 o6Var = this.f31189s;
        int i12 = org.telegram.ui.ActionBar.g6.f23152i6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(o6Var, 65568, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f31189s, 4, null, null, null, null, this.f31178g0));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f31192y, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23240n5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f31192y, 32, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f31192y, 65568, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.f23205l5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, x6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.Ji));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.G8));
        return arrayList;
    }

    public final void l0() {
        if (this.O != null) {
            TLRPC.TL_messages_stickerSet filterPremiumStickers = MessagesController.getInstance(this.currentAccount).filterPremiumStickers(this.O);
            this.O = filterPremiumStickers;
            if (filterPremiumStickers == null) {
                dismiss();
            }
        }
    }

    public final void m0(TextView textView, String str, boolean z10) {
        if (z10) {
            textView.setText(LocaleController.getString(R.string.ImportStickersLinkAvailable));
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23401w6));
            this.m0 = true;
            this.f31182k0 = str;
            return;
        }
        yw0 yw0Var = this.f31181j0;
        if (yw0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(yw0Var);
            this.f31181j0 = null;
            this.f31182k0 = null;
            if (this.f31183l0 != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f31183l0, true);
            }
        }
        if (TextUtils.isEmpty(str)) {
            textView.setText(LocaleController.getString(R.string.ImportStickersEnterUrlInfo));
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23294q5));
            return;
        }
        this.m0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                int length = str.length();
                for (int i10 = 0; i10 < length; i10++) {
                    char charAt = str.charAt(i10);
                    if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        textView.setText(LocaleController.getString(R.string.ImportStickersEnterUrlInfo));
                        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23279p7));
                        return;
                    }
                }
            } else {
                textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalid));
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23279p7));
                return;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 32) {
                textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalidLong));
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23279p7));
                return;
            }
            textView.setText(LocaleController.getString(R.string.ImportStickersLinkChecking));
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.F6));
            this.f31182k0 = str;
            yw0 yw0Var2 = new yw0(this, str, textView, 3);
            this.f31181j0 = yw0Var2;
            AndroidUtilities.runOnUIThread(yw0Var2, 300L);
            return;
        }
        textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalidShort));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23279p7));
    }

    public final void n0() {
        if (!this.N) {
            return;
        }
        this.f31174e.d(null);
        this.N = false;
        this.f31179h0.C(true);
        AndroidUtilities.forEachViews((RecyclerView) this.f31171c, (f5.d) new l4.x0(9));
        this.f31184n.postDelayed(new zw0(this, 0), 200L);
        this.f31189s.c(LocaleController.getString(R.string.EditStickers), true, true);
    }

    @Override
    public final void onBackPressed() {
        if (org.telegram.ui.ht.q().E) {
            org.telegram.ui.ht.q().o();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onStart() {
        super.onStart();
        mc.a((FrameLayout) this.containerView, new ih.u0(this, 10));
    }

    @Override
    public final void onStop() {
        super.onStop();
        mc.h((FrameLayout) this.containerView);
    }

    public final void p0() {
        if (this.N) {
            return;
        }
        this.f31174e.d(this.f31171c);
        this.N = true;
        bg.c2 c2Var = this.f31179h0;
        c2Var.C(false);
        Float valueOf = Float.valueOf(0.0f);
        ArrayList arrayList = (ArrayList) c2Var.d;
        if (arrayList.isEmpty()) {
            for (int i10 = 0; i10 < 6; i10++) {
                arrayList.add(valueOf);
                ((ArrayList) c2Var.f2121e).add(valueOf);
                ((ArrayList) c2Var.f2122f).add(valueOf);
            }
        }
        int i11 = 0;
        for (int i12 = 6; i11 < i12; i12 = 6) {
            long nextFloat = Utilities.random.nextFloat() * 300;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, -2.0f, 0.0f, 2.0f, 0.0f);
            ofFloat.addUpdateListener(new mx0(c2Var, i11, 3));
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(1);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setCurrentPlayTime(nextFloat);
            long j10 = 300;
            ofFloat.setDuration(j10);
            ofFloat.start();
            float dp = AndroidUtilities.dp(0.5f);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, dp, 0.0f, -dp, 0.0f);
            ofFloat2.addUpdateListener(new mx0(c2Var, i11, 4));
            ofFloat2.setRepeatCount(-1);
            ofFloat2.setRepeatMode(1);
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setCurrentPlayTime(nextFloat);
            ofFloat2.setDuration((long) (300 * 1.2d));
            ofFloat2.start();
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, dp, 0.0f - dp, 0.0f);
            ofFloat3.addUpdateListener(new mx0(c2Var, i11, 5));
            ofFloat3.setRepeatCount(-1);
            ofFloat3.setRepeatMode(1);
            ofFloat3.setInterpolator(new LinearInterpolator());
            ofFloat3.setCurrentPlayTime(nextFloat);
            ofFloat3.setDuration(j10);
            ofFloat3.start();
            ((ArrayList) c2Var.f2118a).add(ofFloat);
            ((ArrayList) c2Var.f2119b).add(ofFloat2);
            ((ArrayList) c2Var.f2120c).add(ofFloat3);
            i11++;
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f31171c, (f5.d) new l4.x0(10));
        this.f31184n.postDelayed(new zw0(this, 1), 200L);
        this.f31189s.c(LocaleController.getString(R.string.Done), true, true);
    }

    public final void q0() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f31191x, View.ALPHA, 0.0f));
        animatorSet.setDuration(200L);
        animatorSet.addListener(new zz(this, 25));
        animatorSet.start();
    }

    public final void r0(Context context) {
        int i10;
        fx0 fx0Var = new fx0(this, context);
        this.containerView = fx0Var;
        fx0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, 0, i11, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(context);
        View[] viewArr = this.F;
        viewArr[0] = view;
        int i12 = org.telegram.ui.ActionBar.g6.V5;
        view.setBackgroundColor(getThemedColor(i12));
        viewArr[0].setAlpha(0.0f);
        viewArr[0].setVisibility(4);
        viewArr[0].setTag(1);
        this.containerView.addView(viewArr[0], layoutParams);
        jh.e1 e1Var = new jh.e1(this, context, 22);
        this.f31171c = e1Var;
        e1Var.setTag(14);
        jh.e1 e1Var2 = this.f31171c;
        getContext();
        mh.k kVar = new mh.k(this);
        this.I = kVar;
        e1Var2.setLayoutManager(kVar);
        this.I.O = new ih.n5(this, 7);
        this.f31174e = new f2.e0(new gx0(this));
        jh.e1 e1Var3 = this.f31171c;
        jx0 jx0Var = new jx0(this, context);
        this.d = jx0Var;
        e1Var3.setAdapter(jx0Var);
        this.f31171c.setVerticalScrollBarEnabled(false);
        this.f31171c.i(new lh.j(6));
        this.f31171c.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.f31171c.setClipToPadding(false);
        this.f31171c.setEnabled(true);
        this.f31171c.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.g6.A5));
        this.f31171c.setOnTouchListener(new pr(this, 4));
        this.f31171c.setOnScrollListener(new h00(this, 9));
        k kVar2 = new k(this, 16);
        this.D = kVar2;
        this.f31171c.setOnItemClickListener(kVar2);
        this.containerView.addView(this.f31171c, i7.f6.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 48.0f));
        bg.x2 x2Var = new bg.x2(this, context, 28);
        this.G = x2Var;
        this.containerView.addView(x2Var, i7.f6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.f31171c.setEmptyView(this.G);
        this.G.setOnTouchListener(new mh.d(24));
        y80 y80Var = new y80(context, null);
        this.h = y80Var;
        y80Var.setLines(1);
        this.h.setSingleLine(true);
        this.h.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23169j5));
        this.h.setTextSize(1, 20.0f);
        this.h.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23188k5));
        this.h.setEllipsize(TextUtils.TruncateAt.END);
        this.h.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f));
        this.h.setGravity(16);
        this.h.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(this.h, i7.f6.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, getThemedColor(org.telegram.ui.ActionBar.g6.Ji), false, this.resourcesProvider);
        this.f31184n = w0Var;
        w0Var.setLongClickEnabled(false);
        this.f31184n.setSubMenuOpenSide(2);
        this.f31184n.setIcon(R.drawable.ic_ab_other);
        this.f31184n.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(getThemedColor(org.telegram.ui.ActionBar.g6.Ni), 1, -1));
        this.containerView.addView(this.f31184n, i7.f6.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        this.f31184n.e(1, R.drawable.msg_share, LocaleController.getString(R.string.StickersShare));
        this.f31184n.e(2, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink));
        this.f31184n.setOnClickListener(new ww0(this, 1));
        this.f31184n.setDelegate(new xw0(this));
        this.f31184n.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f31184n;
        if (this.R != null) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        w0Var2.setVisibility(i10);
        this.G.addView(new RadialProgressView(context, null), i7.f6.e(-2, -2, 17));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
        View view2 = new View(context);
        viewArr[1] = view2;
        view2.setBackgroundColor(getThemedColor(i12));
        this.containerView.addView(viewArr[1], layoutParams2);
        o6 o6Var = new o6(context, false, false, false);
        this.f31189s = o6Var;
        int i13 = org.telegram.ui.ActionBar.g6.f23133h5;
        int themedColor = getThemedColor(i13);
        int i14 = org.telegram.ui.ActionBar.g6.f23152i6;
        o6Var.setBackground(org.telegram.ui.ActionBar.g6.g0(themedColor, getThemedColor(i14)));
        o6 o6Var2 = this.f31189s;
        int i15 = org.telegram.ui.ActionBar.g6.f23240n5;
        this.f31178g0 = i15;
        o6Var2.setTextColor(getThemedColor(i15));
        this.f31189s.setTextSize(AndroidUtilities.dp(14.0f));
        this.f31189s.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        this.f31189s.setTypeface(AndroidUtilities.bold());
        this.f31189s.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f31190w = frameLayout;
        frameLayout.addView(this.f31189s, i7.f6.c(48.0f, -1));
        this.containerView.addView(this.f31190w, i7.f6.e(-1, -2, 83));
        cg.d1 d1Var = new cg.d1(AndroidUtilities.dp(24.0f), context, this.resourcesProvider, false);
        this.v = d1Var;
        d1Var.setIcon(R.raw.unlock_icon);
        this.v.setVisibility(4);
        this.containerView.addView(this.v, i7.f6.d(-1, 48.0f, 87, 8.0f, 0.0f, 8.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f31191x = frameLayout2;
        frameLayout2.setVisibility(8);
        this.f31191x.setSoundEffectsEnabled(false);
        this.containerView.addView(this.f31191x, i7.f6.c(-1.0f, -1));
        this.f31191x.setOnClickListener(new ww0(this, 2));
        t9 t9Var = new t9(context);
        this.B = t9Var;
        t9Var.setAspectFit(true);
        this.B.setLayerNum(7);
        this.f31191x.addView(this.B);
        TextView textView = new TextView(context);
        this.C = textView;
        textView.setTextSize(1, 30.0f);
        this.C.setGravity(85);
        this.f31191x.addView(this.C);
        TextView textView2 = new TextView(context);
        this.f31192y = textView2;
        textView2.setTextSize(1, 14.0f);
        this.f31192y.setTextColor(getThemedColor(i15));
        this.f31192y.setBackground(org.telegram.ui.ActionBar.g6.g0(getThemedColor(i13), getThemedColor(i14)));
        this.f31192y.setGravity(17);
        this.f31192y.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
        this.f31192y.setTypeface(AndroidUtilities.bold());
        this.f31191x.addView(this.f31192y, i7.f6.e(-1, 48, 83));
        this.f31192y.setOnClickListener(new ww0(this, 3));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams3.bottomMargin = AndroidUtilities.dp(48.0f);
        View view3 = new View(context);
        this.A = view3;
        view3.setBackgroundColor(getThemedColor(i12));
        this.f31191x.addView(this.A, layoutParams3);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        if (this.T != null) {
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
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.O;
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis) {
            if (tL_messages_stickerSet == null && this.M) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final void setOnDismissListener(Runnable runnable) {
        this.f31186o0 = runnable;
    }

    @Override
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
    }

    public final void t0() {
        String str;
        if (this.R != null) {
            MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
            if (this.O == null && (str = this.R.short_name) != null) {
                this.O = mediaDataController.getStickerSetByName(str);
            }
            if (this.O == null) {
                this.O = mediaDataController.getStickerSetById(this.R.f22412id);
            }
            if (this.O == null) {
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                tL_messages_getStickerSet.stickerset = this.R;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getStickerSet, new org.telegram.ui.zg(17, this, mediaDataController));
            } else {
                if (this.d != null) {
                    C0();
                    B0();
                    this.d.l();
                }
                A0();
                mediaDataController.preloadStickerSetThumb(this.O);
                l0();
            }
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.O;
        if (tL_messages_stickerSet != null) {
            this.f31173d0 = !tL_messages_stickerSet.set.masks;
        }
        l0();
    }

    public final void u0(SendMessagesHelper.ImportingSticker importingSticker) {
        int indexOf = this.U.indexOf(importingSticker);
        if (indexOf >= 0) {
            this.U.remove(indexOf);
            this.d.u(indexOf);
            if (this.U.isEmpty()) {
                dismiss();
            } else {
                B0();
            }
        }
    }

    public final void v0(int i10, boolean z10) {
        Integer num;
        float f9;
        if (this.S == null) {
            View[] viewArr = this.F;
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
                AnimatorSet[] animatorSetArr = this.E;
                AnimatorSet animatorSet = animatorSetArr[i10];
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[i10] = animatorSet2;
                View view2 = viewArr[i10];
                Property property = View.ALPHA;
                if (z10) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                animatorSet2.playTogether(ObjectAnimator.ofFloat(view2, property, f9));
                animatorSetArr[i10].setDuration(150L);
                animatorSetArr[i10].addListener(new w90(this, i10, z10, 1));
                animatorSetArr[i10].start();
            }
        }
    }

    public final void w0(View.OnClickListener onClickListener, String str, int i10) {
        x0(onClickListener, str, i10, -1, -1);
    }

    public final void x0(View.OnClickListener onClickListener, String str, int i10, int i11, int i12) {
        if (i10 >= 0) {
            o6 o6Var = this.f31189s;
            this.f31178g0 = i10;
            o6Var.setTextColor(getThemedColor(i10));
        }
        this.f31189s.c(str, false, true);
        this.f31189s.setOnClickListener(onClickListener);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f31189s.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.F[1].getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f31171c.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.G.getLayoutParams();
        if (onClickListener == null) {
            this.f31189s.setAlpha(0.0f);
        } else if (i11 >= 0 && i12 >= 0) {
            o6 o6Var2 = this.f31189s;
            int dp = AndroidUtilities.dp(24.0f);
            int themedColor = getThemedColor(i11);
            int themedColor2 = getThemedColor(i12);
            o6Var2.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, themedColor, themedColor2, themedColor2));
            this.f31190w.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23133h5));
            int dp2 = AndroidUtilities.dp(8.0f);
            marginLayoutParams.bottomMargin = dp2;
            marginLayoutParams.rightMargin = dp2;
            marginLayoutParams.topMargin = dp2;
            marginLayoutParams.leftMargin = dp2;
            int dp3 = AndroidUtilities.dp(64.0f);
            marginLayoutParams2.bottomMargin = dp3;
            marginLayoutParams3.bottomMargin = dp3;
            marginLayoutParams4.bottomMargin = dp3;
            if (this.f31189s.getAlpha() < 1.0f) {
                org.telegram.ui.b.q(this.f31189s.animate().alpha(1.0f), jr.h, 240L);
            }
        } else {
            this.f31189s.setBackground(org.telegram.ui.ActionBar.g6.g0(getThemedColor(org.telegram.ui.ActionBar.g6.f23133h5), org.telegram.ui.ActionBar.g6.l1(0.1f, getThemedColor(org.telegram.ui.ActionBar.g6.f23295q7))));
            this.f31190w.setBackgroundColor(0);
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            int dp4 = AndroidUtilities.dp(48.0f);
            marginLayoutParams2.bottomMargin = dp4;
            marginLayoutParams3.bottomMargin = dp4;
            marginLayoutParams4.bottomMargin = dp4;
            if (this.f31189s.getAlpha() < 1.0f) {
                org.telegram.ui.b.q(this.f31189s.animate().alpha(1.0f), jr.h, 240L);
            }
        }
        this.containerView.requestLayout();
    }

    public final void y0(int i10) {
        this.f31168a0 = i10;
        if (this.S == null) {
            float f9 = i10;
            this.h.setTranslationY(f9);
            if (this.T == null) {
                this.f31184n.setTranslationY(f9);
            }
            this.F[0].setTranslationY(f9);
        }
        this.containerView.invalidate();
    }

    public final void z0(boolean z10) {
        nx0 nx0Var = this.d.f29844r;
        if (nx0Var.S != null) {
            int childCount = nx0Var.f31171c.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = nx0Var.f31171c.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.p3) {
                    ((org.telegram.ui.Cells.p3) childAt).d();
                }
            }
        }
        this.h.setHighlightColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23205l5));
        this.f31191x.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23133h5) & (-536870913));
        this.f31184n.setIconColor(getThemedColor(org.telegram.ui.ActionBar.g6.Ji));
        this.f31184n.G(getThemedColor(org.telegram.ui.ActionBar.g6.E8), false);
        this.f31184n.G(getThemedColor(org.telegram.ui.ActionBar.g6.F8), true);
        this.f31184n.setPopupItemsSelectorColor(getThemedColor(org.telegram.ui.ActionBar.g6.I5));
        this.f31184n.B(getThemedColor(org.telegram.ui.ActionBar.g6.G8));
        if (this.f31188r != null) {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.f23295q7);
            this.f31188r.c(themedColor, themedColor);
            this.f31188r.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(0.1f, themedColor));
            if (this.f31188r.getRightIcon() != null) {
                this.f31188r.getRightIcon().setColorFilter(themedColor);
            }
        }
        if (z10) {
            if (org.telegram.ui.ActionBar.g6.sl != null && this.f31187p0 == null) {
                ArrayList themeDescriptions = getThemeDescriptions();
                this.f31187p0 = themeDescriptions;
                int size = themeDescriptions.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((org.telegram.ui.ActionBar.i6) this.f31187p0.get(i11)).h = null;
                }
            }
            int size2 = this.f31187p0.size();
            for (int i12 = 0; i12 < size2; i12++) {
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.f31187p0.get(i12);
                i6Var.d(getThemedColor(i6Var.f23536f), false, false);
            }
        }
        if (org.telegram.ui.ActionBar.g6.sl == null && this.f31187p0 != null) {
            this.f31187p0 = null;
        }
    }

    public nx0(Context context, String str, ArrayList arrayList, ArrayList arrayList2) {
        super(context, null, false, false);
        this.E = new AnimatorSet[2];
        this.F = new View[2];
        this.f31177f0 = true;
        this.f31179h0 = new bg.c2(9);
        this.f31180i0 = new cx0(this);
        fixNavigationBar();
        this.J = (Activity) context;
        this.T = arrayList;
        this.W = str;
        Utilities.globalQueue.postRunnable(new yw0(this, arrayList, arrayList2, 4));
        r0(context);
    }

    public nx0(Context context, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.InputStickerSet inputStickerSet, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, kx0 kx0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, false, false);
        this.E = new AnimatorSet[2];
        this.F = new View[2];
        this.f31177f0 = true;
        this.f31179h0 = new bg.c2(9);
        this.f31180i0 = new cx0(this);
        fixNavigationBar();
        this.X = kx0Var;
        this.R = inputStickerSet;
        this.O = tL_messages_stickerSet;
        this.H = o2Var;
        t0();
        r0(context);
    }
}
