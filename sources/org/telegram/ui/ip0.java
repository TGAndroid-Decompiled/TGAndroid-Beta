package org.telegram.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.RadialProgressView;
public final class ip0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean A;
    public final qn B;
    public int C;
    public boolean D;
    public org.telegram.ui.ActionBar.o1 E;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout F;
    public org.telegram.ui.ActionBar.g1[] G;
    public FrameLayout H;
    public org.telegram.ui.Components.ut I;
    public m0 J;
    public ImageView K;
    public dp0 L;
    public yi0 M;
    public View N;
    public final TextPaint O;
    public final RectF P;
    public final Paint Q;
    public hp0 R;
    public CharSequence f39239a;
    public final HashMap f39240b;
    public final ArrayList f39241c;
    public ArrayList d;
    public boolean f39242e;
    public int f39243f;
    public org.telegram.ui.Components.wk0 h;
    public gp0 f39244n;
    public FrameLayout f39245r;
    public TextView f39246s;
    public boolean v;
    public final int f39247w;
    public boolean f39248x;
    public final boolean f39249y;

    public ip0(int i9, boolean z10, boolean z11, qn qnVar) {
        super(null);
        this.f39240b = new HashMap();
        this.f39241c = new ArrayList();
        this.d = null;
        this.f39242e = false;
        this.f39243f = 2;
        this.f39248x = true;
        this.D = true;
        this.O = new TextPaint(1);
        this.P = new RectF();
        this.Q = new Paint(1);
        this.B = qnVar;
        this.f39247w = i9;
        this.f39249y = z10;
        this.A = z11;
    }

    public static void T(ip0 ip0Var, MediaController.AlbumEntry albumEntry) {
        if (albumEntry != null) {
            zp0 zp0Var = new zp0(0, albumEntry, ip0Var.f39240b, ip0Var.f39241c, ip0Var.f39247w, ip0Var.A, ip0Var.B, false);
            Editable text = ip0Var.I.getText();
            ip0Var.f39239a = text;
            zp0Var.d = text;
            org.telegram.ui.Components.ut utVar = zp0Var.Z;
            if (utVar != null) {
                utVar.setText(text);
            }
            zp0Var.f45225o0 = new ep0(ip0Var);
            zp0Var.e0(ip0Var.C, ip0Var.D);
            ip0Var.presentFragment(zp0Var);
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        if (ip0Var.f39249y) {
            eq0 eq0Var = new eq0(hashMap, arrayList, ip0Var.f39247w, ip0Var.A, ip0Var.B);
            Editable text2 = ip0Var.I.getText();
            ip0Var.f39239a = text2;
            zp0 zp0Var2 = eq0Var.f38008a;
            if (zp0Var2 != null) {
                zp0Var2.d = text2;
                org.telegram.ui.Components.ut utVar2 = zp0Var2.Z;
                if (utVar2 != null) {
                    utVar2.setText(text2);
                }
            }
            fp0 fp0Var = new fp0(ip0Var, hashMap, arrayList);
            zp0 zp0Var3 = eq0Var.f38008a;
            zp0Var3.f45225o0 = fp0Var;
            zp0 zp0Var4 = eq0Var.f38009b;
            zp0Var4.f45225o0 = fp0Var;
            zp0Var3.f45226p0 = new dq0(eq0Var, 0);
            zp0Var4.f45226p0 = new dq0(eq0Var, 1);
            int i9 = ip0Var.C;
            boolean z10 = ip0Var.D;
            zp0Var3.e0(i9, z10);
            eq0Var.f38009b.e0(i9, z10);
            ip0Var.presentFragment(eq0Var);
            return;
        }
        zp0 zp0Var5 = new zp0(0, albumEntry, hashMap, arrayList, ip0Var.f39247w, ip0Var.A, ip0Var.B, false);
        Editable text3 = ip0Var.I.getText();
        ip0Var.f39239a = text3;
        zp0Var5.d = text3;
        org.telegram.ui.Components.ut utVar3 = zp0Var5.Z;
        if (utVar3 != null) {
            utVar3.setText(text3);
        }
        zp0Var5.f45225o0 = new bp0(ip0Var, hashMap, arrayList);
        zp0Var5.e0(ip0Var.C, ip0Var.D);
        ip0Var.presentFragment(zp0Var5);
    }

    public final void U(HashMap hashMap, ArrayList arrayList, boolean z10, int i9) {
        if (!hashMap.isEmpty() && this.R != null && !this.v) {
            this.v = true;
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Object obj = hashMap.get(arrayList.get(i10));
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                arrayList2.add(sendingMediaInfo);
                String str = null;
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    String str2 = photoEntry.imagePath;
                    if (str2 != null) {
                        sendingMediaInfo.path = str2;
                    } else {
                        sendingMediaInfo.path = photoEntry.path;
                    }
                    sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                    sendingMediaInfo.coverPath = photoEntry.coverPath;
                    sendingMediaInfo.videoEditedInfo = photoEntry.editedInfo;
                    sendingMediaInfo.isVideo = photoEntry.isVideo;
                    CharSequence charSequence = photoEntry.caption;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    sendingMediaInfo.caption = str;
                    sendingMediaInfo.entities = photoEntry.entities;
                    sendingMediaInfo.masks = photoEntry.stickers;
                    sendingMediaInfo.ttl = photoEntry.ttl;
                } else if (obj instanceof MediaController.SearchImage) {
                    MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                    String str3 = searchImage.imagePath;
                    if (str3 != null) {
                        sendingMediaInfo.path = str3;
                    } else {
                        sendingMediaInfo.searchImage = searchImage;
                    }
                    sendingMediaInfo.thumbPath = searchImage.thumbPath;
                    sendingMediaInfo.coverPath = searchImage.coverPath;
                    sendingMediaInfo.videoEditedInfo = searchImage.editedInfo;
                    CharSequence charSequence2 = searchImage.caption;
                    if (charSequence2 != null) {
                        str = charSequence2.toString();
                    }
                    sendingMediaInfo.caption = str;
                    sendingMediaInfo.entities = searchImage.entities;
                    sendingMediaInfo.masks = searchImage.stickers;
                    sendingMediaInfo.ttl = searchImage.ttl;
                    TLRPC.BotInlineResult botInlineResult = searchImage.inlineResult;
                    if (botInlineResult != null && searchImage.type == 1) {
                        sendingMediaInfo.inlineResult = botInlineResult;
                        sendingMediaInfo.params = searchImage.params;
                    }
                    searchImage.date = (int) (System.currentTimeMillis() / 1000);
                }
            }
            this.R.a(arrayList2);
        }
    }

    public final void V(boolean z10) {
        boolean z11;
        Integer num;
        float f10;
        float f11;
        float f12;
        float f13;
        float dp;
        if (this.H.getTag() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 == z11) {
            return;
        }
        FrameLayout frameLayout = this.H;
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        frameLayout.setTag(num);
        if (this.I.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(this.I.getEditText());
        }
        this.I.k(true);
        if (z10) {
            this.H.setVisibility(0);
            this.J.setVisibility(0);
        } else {
            this.H.setVisibility(4);
            this.J.setVisibility(4);
        }
        m0 m0Var = this.J;
        float f14 = 0.2f;
        float f15 = 1.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.2f;
        }
        m0Var.setScaleX(f10);
        m0 m0Var2 = this.J;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.2f;
        }
        m0Var2.setScaleY(f11);
        m0 m0Var3 = this.J;
        float f16 = 0.0f;
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        m0Var3.setAlpha(f12);
        yi0 yi0Var = this.M;
        if (z10) {
            f13 = 1.0f;
        } else {
            f13 = 0.2f;
        }
        yi0Var.setScaleX(f13);
        yi0 yi0Var2 = this.M;
        if (z10) {
            f14 = 1.0f;
        }
        yi0Var2.setScaleY(f14);
        yi0 yi0Var3 = this.M;
        if (!z10) {
            f15 = 0.0f;
        }
        yi0Var3.setAlpha(f15);
        FrameLayout frameLayout2 = this.H;
        if (z10) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(48.0f);
        }
        frameLayout2.setTranslationY(dp);
        View view = this.N;
        if (!z10) {
            f16 = AndroidUtilities.dp(48.0f);
        }
        view.setTranslationY(f16);
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i9 = org.telegram.ui.ActionBar.f6.f23072h5;
        kVar.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.f6.f23108j5;
        kVar2.setTitleColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        this.actionBar.C(org.telegram.ui.ActionBar.f6.w0(null, i10, false), false);
        this.actionBar.A(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.I5, false), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new cp0(this));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        if (this.f39248x) {
            n10.a(2, R.drawable.outline_header_search).setContentDescription(LocaleController.getString(R.string.Search));
        }
        org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.ic_ab_other);
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        a2.e(1, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        dp0 dp0Var = new dp0(this, context);
        this.L = dp0Var;
        dp0Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        this.fragmentView = this.L;
        this.actionBar.setTitle(LocaleController.getString(R.string.Gallery));
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.h = wk0Var;
        wk0Var.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(54.0f));
        this.h.setClipToPadding(false);
        this.h.setHorizontalScrollBarEnabled(false);
        this.h.setVerticalScrollBarEnabled(false);
        this.h.setLayoutManager(new f2.m0(1, false));
        this.h.setDrawingCacheEnabled(false);
        this.L.addView(this.h, g7.e6.e(-1, -1, 51));
        org.telegram.ui.Components.wk0 wk0Var2 = this.h;
        gp0 gp0Var = new gp0(this, context);
        this.f39244n = gp0Var;
        wk0Var2.setAdapter(gp0Var);
        this.h.setGlowColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        TextView textView = new TextView(context);
        this.f39246s = textView;
        textView.setTextColor(-8355712);
        this.f39246s.setTextSize(1, 20.0f);
        this.f39246s.setGravity(17);
        this.f39246s.setVisibility(8);
        this.f39246s.setText(LocaleController.getString(R.string.NoPhotos));
        this.L.addView(this.f39246s, g7.e6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.f39246s.setOnTouchListener(new jh.d(2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f39245r = frameLayout;
        frameLayout.setVisibility(8);
        this.L.addView(this.f39245r, g7.e6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        radialProgressView.setProgressColor(-11371101);
        this.f39245r.addView(radialProgressView, g7.e6.e(-2, -2, 17));
        View view = new View(context);
        this.N = view;
        view.setBackgroundResource(R.drawable.header_shadow_reverse);
        this.N.setTranslationY(AndroidUtilities.dp(48.0f));
        this.L.addView(this.N, g7.e6.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.H = frameLayout2;
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        this.H.setVisibility(4);
        this.H.setTranslationY(AndroidUtilities.dp(48.0f));
        this.L.addView(this.H, g7.e6.e(-1, 48, 83));
        this.H.setOnTouchListener(new jh.d(2));
        org.telegram.ui.Components.ut utVar = this.I;
        if (utVar != null) {
            utVar.o();
        }
        this.I = new org.telegram.ui.Components.ut(context, this.L, null, 1, false, null);
        this.I.setFilters(new InputFilter[]{new InputFilter.LengthFilter(MessagesController.getInstance(UserConfig.selectedAccount).maxCaptionLength)});
        this.I.setHint(LocaleController.getString(R.string.AddCaption));
        org.telegram.ui.Components.mt editText = this.I.getEditText();
        editText.setMaxLines(1);
        editText.setSingleLine(true);
        this.H.addView(this.I, g7.e6.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
        CharSequence charSequence = this.f39239a;
        if (charSequence != null) {
            this.I.setText(charSequence);
        }
        m0 m0Var = new m0(this, context, 16);
        this.J = m0Var;
        m0Var.setFocusable(true);
        this.J.setFocusableInTouchMode(true);
        this.J.setVisibility(4);
        this.J.setScaleX(0.2f);
        this.J.setScaleY(0.2f);
        this.J.setAlpha(0.0f);
        this.L.addView(this.J, g7.e6.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        this.K = new ImageView(context);
        this.K.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.h0(AndroidUtilities.dp(56.0f), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.S5, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.T5, false)));
        this.K.setImageResource(R.drawable.attach_send);
        this.K.setImportantForAccessibility(2);
        this.K.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.U5, false), PorterDuff.Mode.MULTIPLY));
        this.K.setScaleType(ImageView.ScaleType.CENTER);
        this.K.setOutlineProvider(new bg.q1(17));
        this.J.addView(this.K, g7.e6.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
        this.K.setOnClickListener(new q50(this, 18));
        this.K.setOnLongClickListener(new u(this, 3));
        TextPaint textPaint = this.O;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        yi0 yi0Var = new yi0(this, context, 1);
        this.M = yi0Var;
        yi0Var.setAlpha(0.0f);
        this.M.setScaleX(0.2f);
        this.M.setScaleY(0.2f);
        this.L.addView(this.M, g7.e6.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        if (this.f39247w != 0) {
            this.I.setVisibility(8);
        }
        if (this.f39242e && ((arrayList = this.d) == null || arrayList.isEmpty())) {
            this.f39245r.setVisibility(0);
            this.h.setEmptyView(null);
        } else {
            this.f39245r.setVisibility(8);
            this.h.setEmptyView(this.f39246s);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.albumsDidLoad) {
            if (this.classGuid == ((Integer) objArr[0]).intValue()) {
                int i11 = this.f39247w;
                if (i11 != 1 && i11 != 2 && i11 != 10 && this.f39248x) {
                    this.d = (ArrayList) objArr[1];
                } else {
                    this.d = (ArrayList) objArr[2];
                }
                FrameLayout frameLayout = this.f39245r;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
                org.telegram.ui.Components.wk0 wk0Var = this.h;
                if (wk0Var != null && wk0Var.getEmptyView() == null) {
                    this.h.setEmptyView(this.f39246s);
                }
                gp0 gp0Var = this.f39244n;
                if (gp0Var != null) {
                    gp0Var.l();
                }
                this.f39242e = false;
            }
        } else if (i9 == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i9 = org.telegram.ui.ActionBar.f6.f23072h5;
        arrayList.add(new org.telegram.ui.ActionBar.h6(view, 1, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1, null, null, null, null, i9));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.f6.f23108j5;
        arrayList.add(new org.telegram.ui.ActionBar.h6(kVar, 64, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 32768, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 0, new Class[]{View.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.R4}, null, org.telegram.ui.ActionBar.f6.f23004da));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 0, new Class[]{View.class}, null, null, null, org.telegram.ui.ActionBar.f6.X9));
        return arrayList;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.ut utVar = this.I;
        if (utVar != null && utVar.f33124e) {
            if (z10) {
                utVar.k(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.wk0 wk0Var = this.h;
        if (wk0Var != null) {
            wk0Var.getViewTreeObserver().addOnPreDrawListener(new sh(this, 3));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i9 = this.f39247w;
        boolean z10 = true;
        if (i9 != 1 && i9 != 2 && i9 != 10 && this.f39248x) {
            this.d = MediaController.allMediaAlbums;
        } else {
            this.d = MediaController.allPhotoAlbums;
        }
        if (this.d != null) {
            z10 = false;
        }
        this.f39242e = z10;
        MediaController.loadGalleryPhotosAlbums(this.classGuid);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.closeChats);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        org.telegram.ui.Components.ut utVar = this.I;
        if (utVar != null) {
            utVar.o();
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        gp0 gp0Var = this.f39244n;
        if (gp0Var != null) {
            gp0Var.l();
        }
        org.telegram.ui.Components.ut utVar = this.I;
        if (utVar != null) {
            utVar.s();
        }
        org.telegram.ui.Components.wk0 wk0Var = this.h;
        if (wk0Var != null) {
            wk0Var.getViewTreeObserver().addOnPreDrawListener(new sh(this, 3));
        }
    }
}
