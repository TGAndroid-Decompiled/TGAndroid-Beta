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
public final class hp0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean A;
    public final tn B;
    public int C;
    public boolean D;
    public org.telegram.ui.ActionBar.o1 E;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout F;
    public org.telegram.ui.ActionBar.g1[] G;
    public FrameLayout H;
    public org.telegram.ui.Components.au I;
    public n0 J;
    public ImageView K;
    public cp0 L;
    public cg.h0 M;
    public View N;
    public final TextPaint O;
    public final RectF P;
    public final Paint Q;
    public gp0 R;
    public CharSequence f38984a;
    public final HashMap f38985b;
    public final ArrayList f38986c;
    public ArrayList d;
    public boolean f38987e;
    public int f38988f;
    public org.telegram.ui.Components.jl0 h;
    public fp0 f38989n;
    public FrameLayout f38990r;
    public TextView f38991s;
    public boolean v;
    public final int f38992w;
    public boolean f38993x;
    public final boolean f38994y;

    public hp0(int i10, boolean z10, boolean z11, tn tnVar) {
        super(null);
        this.f38985b = new HashMap();
        this.f38986c = new ArrayList();
        this.d = null;
        this.f38987e = false;
        this.f38988f = 2;
        this.f38993x = true;
        this.D = true;
        this.O = new TextPaint(1);
        this.P = new RectF();
        this.Q = new Paint(1);
        this.B = tnVar;
        this.f38992w = i10;
        this.f38994y = z10;
        this.A = z11;
    }

    public static void U(hp0 hp0Var, MediaController.AlbumEntry albumEntry) {
        if (albumEntry != null) {
            zp0 zp0Var = new zp0(0, albumEntry, hp0Var.f38985b, hp0Var.f38986c, hp0Var.f38992w, hp0Var.A, hp0Var.B, false);
            Editable text = hp0Var.I.getText();
            hp0Var.f38984a = text;
            zp0Var.d = text;
            org.telegram.ui.Components.au auVar = zp0Var.Z;
            if (auVar != null) {
                auVar.setText(text);
            }
            zp0Var.f45290o0 = new dp0(hp0Var);
            zp0Var.f0(hp0Var.C, hp0Var.D);
            hp0Var.presentFragment(zp0Var);
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        if (hp0Var.f38994y) {
            eq0 eq0Var = new eq0(hashMap, arrayList, hp0Var.f38992w, hp0Var.A, hp0Var.B);
            Editable text2 = hp0Var.I.getText();
            hp0Var.f38984a = text2;
            zp0 zp0Var2 = eq0Var.f37886a;
            if (zp0Var2 != null) {
                zp0Var2.d = text2;
                org.telegram.ui.Components.au auVar2 = zp0Var2.Z;
                if (auVar2 != null) {
                    auVar2.setText(text2);
                }
            }
            ep0 ep0Var = new ep0(hp0Var, hashMap, arrayList);
            zp0 zp0Var3 = eq0Var.f37886a;
            zp0Var3.f45290o0 = ep0Var;
            zp0 zp0Var4 = eq0Var.f37887b;
            zp0Var4.f45290o0 = ep0Var;
            zp0Var3.f45291p0 = new dq0(eq0Var, 0);
            zp0Var4.f45291p0 = new dq0(eq0Var, 1);
            int i10 = hp0Var.C;
            boolean z10 = hp0Var.D;
            zp0Var3.f0(i10, z10);
            eq0Var.f37887b.f0(i10, z10);
            hp0Var.presentFragment(eq0Var);
            return;
        }
        zp0 zp0Var5 = new zp0(0, albumEntry, hashMap, arrayList, hp0Var.f38992w, hp0Var.A, hp0Var.B, false);
        Editable text3 = hp0Var.I.getText();
        hp0Var.f38984a = text3;
        zp0Var5.d = text3;
        org.telegram.ui.Components.au auVar3 = zp0Var5.Z;
        if (auVar3 != null) {
            auVar3.setText(text3);
        }
        zp0Var5.f45290o0 = new ap0(hp0Var, hashMap, arrayList);
        zp0Var5.f0(hp0Var.C, hp0Var.D);
        hp0Var.presentFragment(zp0Var5);
    }

    public final void V(HashMap hashMap, ArrayList arrayList, boolean z10, int i10) {
        if (!hashMap.isEmpty() && this.R != null && !this.v) {
            this.v = true;
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                Object obj = hashMap.get(arrayList.get(i11));
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

    public final void W(boolean z10) {
        boolean z11;
        Integer num;
        float f9;
        float f10;
        float f11;
        float f12;
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
        n0 n0Var = this.J;
        float f13 = 0.2f;
        float f14 = 1.0f;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.2f;
        }
        n0Var.setScaleX(f9);
        n0 n0Var2 = this.J;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.2f;
        }
        n0Var2.setScaleY(f10);
        n0 n0Var3 = this.J;
        float f15 = 0.0f;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        n0Var3.setAlpha(f11);
        cg.h0 h0Var = this.M;
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.2f;
        }
        h0Var.setScaleX(f12);
        cg.h0 h0Var2 = this.M;
        if (z10) {
            f13 = 1.0f;
        }
        h0Var2.setScaleY(f13);
        cg.h0 h0Var3 = this.M;
        if (!z10) {
            f14 = 0.0f;
        }
        h0Var3.setAlpha(f14);
        FrameLayout frameLayout2 = this.H;
        if (z10) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(48.0f);
        }
        frameLayout2.setTranslationY(dp);
        View view = this.N;
        if (!z10) {
            f15 = AndroidUtilities.dp(48.0f);
        }
        view.setTranslationY(f15);
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f23133h5;
        lVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.g6.f23169j5;
        lVar2.setTitleColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        this.actionBar.C(org.telegram.ui.ActionBar.g6.w0(null, i11, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I5, false), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new bp0(this));
        org.telegram.ui.ActionBar.a0 n10 = this.actionBar.n();
        if (this.f38993x) {
            n10.a(2, R.drawable.outline_header_search).setContentDescription(LocaleController.getString(R.string.Search));
        }
        org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.ic_ab_other);
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        a2.e(1, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        cp0 cp0Var = new cp0(this, context);
        this.L = cp0Var;
        cp0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.fragmentView = this.L;
        this.actionBar.setTitle(LocaleController.getString(R.string.Gallery));
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(context, null);
        this.h = jl0Var;
        jl0Var.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(54.0f));
        this.h.setClipToPadding(false);
        this.h.setHorizontalScrollBarEnabled(false);
        this.h.setVerticalScrollBarEnabled(false);
        this.h.setLayoutManager(new f2.j0(1, false));
        this.h.setDrawingCacheEnabled(false);
        this.L.addView(this.h, i7.f6.e(-1, -1, 51));
        org.telegram.ui.Components.jl0 jl0Var2 = this.h;
        fp0 fp0Var = new fp0(this, context);
        this.f38989n = fp0Var;
        jl0Var2.setAdapter(fp0Var);
        this.h.setGlowColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        TextView textView = new TextView(context);
        this.f38991s = textView;
        textView.setTextColor(-8355712);
        this.f38991s.setTextSize(1, 20.0f);
        this.f38991s.setGravity(17);
        this.f38991s.setVisibility(8);
        this.f38991s.setText(LocaleController.getString(R.string.NoPhotos));
        this.L.addView(this.f38991s, i7.f6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.f38991s.setOnTouchListener(new mh.d(2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f38990r = frameLayout;
        frameLayout.setVisibility(8);
        this.L.addView(this.f38990r, i7.f6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        radialProgressView.setProgressColor(-11371101);
        this.f38990r.addView(radialProgressView, i7.f6.e(-2, -2, 17));
        View view = new View(context);
        this.N = view;
        view.setBackgroundResource(R.drawable.header_shadow_reverse);
        this.N.setTranslationY(AndroidUtilities.dp(48.0f));
        this.L.addView(this.N, i7.f6.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.H = frameLayout2;
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.H.setVisibility(4);
        this.H.setTranslationY(AndroidUtilities.dp(48.0f));
        this.L.addView(this.H, i7.f6.e(-1, 48, 83));
        this.H.setOnTouchListener(new mh.d(2));
        org.telegram.ui.Components.au auVar = this.I;
        if (auVar != null) {
            auVar.o();
        }
        this.I = new org.telegram.ui.Components.au(context, this.L, null, 1, false, null);
        this.I.setFilters(new InputFilter[]{new InputFilter.LengthFilter(MessagesController.getInstance(UserConfig.selectedAccount).maxCaptionLength)});
        this.I.setHint(LocaleController.getString(R.string.AddCaption));
        org.telegram.ui.Components.st editText = this.I.getEditText();
        editText.setMaxLines(1);
        editText.setSingleLine(true);
        this.H.addView(this.I, i7.f6.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
        CharSequence charSequence = this.f38984a;
        if (charSequence != null) {
            this.I.setText(charSequence);
        }
        n0 n0Var = new n0(this, context, 16);
        this.J = n0Var;
        n0Var.setFocusable(true);
        this.J.setFocusableInTouchMode(true);
        this.J.setVisibility(4);
        this.J.setScaleX(0.2f);
        this.J.setScaleY(0.2f);
        this.J.setAlpha(0.0f);
        this.L.addView(this.J, i7.f6.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        this.K = new ImageView(context);
        this.K.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(56.0f), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.S5, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.T5, false)));
        this.K.setImageResource(R.drawable.attach_send);
        this.K.setImportantForAccessibility(2);
        this.K.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.U5, false), PorterDuff.Mode.MULTIPLY));
        this.K.setScaleType(ImageView.ScaleType.CENTER);
        this.K.setOutlineProvider(new eg.k1(17));
        this.J.addView(this.K, i7.f6.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
        this.K.setOnClickListener(new t50(this, 18));
        this.K.setOnLongClickListener(new w(this, 3));
        TextPaint textPaint = this.O;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        cg.h0 h0Var = new cg.h0(this, context, 29);
        this.M = h0Var;
        h0Var.setAlpha(0.0f);
        this.M.setScaleX(0.2f);
        this.M.setScaleY(0.2f);
        this.L.addView(this.M, i7.f6.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        if (this.f38992w != 0) {
            this.I.setVisibility(8);
        }
        if (this.f38987e && ((arrayList = this.d) == null || arrayList.isEmpty())) {
            this.f38990r.setVisibility(0);
            this.h.setEmptyView(null);
        } else {
            this.f38990r.setVisibility(8);
            this.h.setEmptyView(this.f38991s);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.albumsDidLoad) {
            if (this.classGuid == ((Integer) objArr[0]).intValue()) {
                int i12 = this.f38992w;
                if (i12 != 1 && i12 != 2 && i12 != 10 && this.f38993x) {
                    this.d = (ArrayList) objArr[1];
                } else {
                    this.d = (ArrayList) objArr[2];
                }
                FrameLayout frameLayout = this.f38990r;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
                org.telegram.ui.Components.jl0 jl0Var = this.h;
                if (jl0Var != null && jl0Var.getEmptyView() == null) {
                    this.h.setEmptyView(this.f38991s);
                }
                fp0 fp0Var = this.f38989n;
                if (fp0Var != null) {
                    fp0Var.l();
                }
                this.f38987e = false;
            }
        } else if (i10 == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.g6.f23133h5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.g6.f23169j5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(lVar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 0, new Class[]{View.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.R4}, null, org.telegram.ui.ActionBar.g6.da));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 0, new Class[]{View.class}, null, null, null, org.telegram.ui.ActionBar.g6.X9));
        return arrayList;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.au auVar = this.I;
        if (auVar != null && auVar.f26885e) {
            if (z10) {
                auVar.k(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.jl0 jl0Var = this.h;
        if (jl0Var != null) {
            jl0Var.getViewTreeObserver().addOnPreDrawListener(new vh(this, 3));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i10 = this.f38992w;
        boolean z10 = true;
        if (i10 != 1 && i10 != 2 && i10 != 10 && this.f38993x) {
            this.d = MediaController.allMediaAlbums;
        } else {
            this.d = MediaController.allPhotoAlbums;
        }
        if (this.d != null) {
            z10 = false;
        }
        this.f38987e = z10;
        MediaController.loadGalleryPhotosAlbums(this.classGuid);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.closeChats);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        org.telegram.ui.Components.au auVar = this.I;
        if (auVar != null) {
            auVar.o();
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        fp0 fp0Var = this.f38989n;
        if (fp0Var != null) {
            fp0Var.l();
        }
        org.telegram.ui.Components.au auVar = this.I;
        if (auVar != null) {
            auVar.s();
        }
        org.telegram.ui.Components.jl0 jl0Var = this.h;
        if (jl0Var != null) {
            jl0Var.getViewTreeObserver().addOnPreDrawListener(new vh(this, 3));
        }
    }
}
