package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

public final class ul extends jk0 {

    public final Context f33114c;
    public final boolean d;

    public boolean f33115e;

    public boolean f33116f;
    public final ArrayList h = new ArrayList(8);

    public int f33117n;

    public int f33118r;

    public boolean f33119s;
    public final ChatAttachAlertPhotoLayout v;

    public ul(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z10) {
        this.v = chatAttachAlertPhotoLayout;
        this.f33114c = context;
        this.d = z10;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return false;
    }

    @Override
    public final boolean E(zk0 zk0Var) {
        MediaController.AlbumEntry albumEntry;
        boolean zIsEmpty = ChatAttachAlertPhotoLayout.f26238n1.isEmpty();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        return !(zIsEmpty && ((albumEntry = chatAttachAlertPhotoLayout.P0) == null || albumEntry.photos.isEmpty())) && chatAttachAlertPhotoLayout.f34900b.N && h() > 30;
    }

    @Override
    public final String F(int i10) {
        ArrayList<MediaController.PhotoEntry> arrayList;
        MediaController.PhotoEntry photoEntryM = M(i10);
        if (photoEntryM == null) {
            int i11 = this.f33118r;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
            if (i10 <= i11) {
                ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f26238n1;
                if (arrayList2.isEmpty()) {
                    MediaController.AlbumEntry albumEntry = chatAttachAlertPhotoLayout.P0;
                    if (albumEntry != null && (arrayList = albumEntry.photos) != null) {
                        photoEntryM = arrayList.get(0);
                    }
                } else {
                    photoEntryM = (MediaController.PhotoEntry) arrayList2.get(0);
                }
            } else if (!chatAttachAlertPhotoLayout.P0.photos.isEmpty()) {
                photoEntryM = (MediaController.PhotoEntry) i0.a.i(1, chatAttachAlertPhotoLayout.P0.photos);
            }
        }
        if (photoEntryM == null) {
            return "";
        }
        long j10 = photoEntryM.dateTaken;
        if (Build.VERSION.SDK_INT <= 28) {
            j10 /= 1000;
        }
        return LocaleController.formatYearMont(j10, true);
    }

    @Override
    public final void G(zk0 zk0Var, float f10, int[] iArr) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int measuredHeight = zk0Var.getChildAt(0).getMeasuredHeight();
        float fH = h();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        float fCeil = (((int) (Math.ceil(fH / chatAttachAlertPhotoLayout.I0) * ((double) measuredHeight))) - (zk0Var.getMeasuredHeight() - currentActionBarHeight)) * f10;
        float f11 = measuredHeight;
        iArr[0] = ((int) (fCeil / f11)) * chatAttachAlertPhotoLayout.I0;
        int paddingTop = zk0Var.getPaddingTop() + ((int) (fCeil % f11)) + ((int) ((1.0f - f10) * currentActionBarHeight));
        iArr[1] = paddingTop;
        if (iArr[0] != 0 || paddingTop >= chatAttachAlertPhotoLayout.getListTopPadding()) {
            return;
        }
        iArr[1] = chatAttachAlertPhotoLayout.getListTopPadding() + currentActionBarHeight;
    }

    @Override
    public final float H(zk0 zk0Var) {
        int i10 = this.v.I0;
        int iCeil = (int) Math.ceil(this.f33117n / i10);
        if (zk0Var.getChildCount() != 0) {
            int measuredHeight = zk0Var.getChildAt(0).getMeasuredHeight();
            View childAt = zk0Var.getChildAt(0);
            int iR = RecyclerView.R(childAt);
            if (iR >= 0) {
                return Utilities.clamp((((iR / i10) * measuredHeight) - childAt.getTop()) / ((iCeil * measuredHeight) - (zk0Var.getMeasuredHeight() - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())), 1.0f, 0.0f);
            }
        }
        return 0.0f;
    }

    @Override
    public final void J(zk0 zk0Var) {
        this.f33119s = false;
        int childCount = zk0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            zk0Var.getChildAt(i10).invalidate();
        }
    }

    @Override
    public final void K() {
        this.f33119s = true;
    }

    public final lk0 L() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        org.telegram.ui.Cells.q5 q5Var = new org.telegram.ui.Cells.q5(this.f33114c, chatAttachAlertPhotoLayout.f34899a);
        if (this == chatAttachAlertPhotoLayout.C) {
            q5Var.setOutlineProvider(new sl(this));
            q5Var.setClipToOutline(true);
        }
        q5Var.setFastScrollDelegate(new s(this, 22));
        q5Var.setDelegate(new g1(14, this, q5Var));
        return new lk0(q5Var);
    }

    public final MediaController.PhotoEntry M(int i10) {
        boolean z10 = this.f33116f;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        if (z10 && i10 > chatAttachAlertPhotoLayout.I0) {
            i10--;
        }
        if (this.d && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0) {
            i10--;
        }
        boolean z11 = ChatAttachAlertPhotoLayout.f26237m1;
        return chatAttachAlertPhotoLayout.b0(i10);
    }

    @Override
    public final int h() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        ul ulVar = chatAttachAlertPhotoLayout.C;
        if (!chatAttachAlertPhotoLayout.f26271r0) {
            return 1;
        }
        int size = 0;
        this.f33115e = false;
        this.f33116f = false;
        boolean z10 = chatAttachAlertPhotoLayout.L0;
        if (z10 && this == ulVar) {
            return 2;
        }
        if (this.d && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0) {
            this.f33115e = true;
            size = 1;
        }
        if (chatAttachAlertPhotoLayout.f26247c1) {
            size++;
        }
        if (z10 && this == ulVar) {
            size++;
        }
        this.f33118r = size;
        if (!z10) {
            size += ChatAttachAlertPhotoLayout.f26238n1.size();
            MediaController.AlbumEntry albumEntry = chatAttachAlertPhotoLayout.P0;
            if (albumEntry != null) {
                size += albumEntry.photos.size();
            }
        }
        if (this.f33115e && size > chatAttachAlertPhotoLayout.I0 && !chatAttachAlertPhotoLayout.K0) {
            this.f33116f = true;
            size++;
        }
        if (this == ulVar) {
            size++;
        }
        this.f33117n = size;
        return size;
    }

    @Override
    public final int j(int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        ul ulVar = chatAttachAlertPhotoLayout.C;
        if (!chatAttachAlertPhotoLayout.f26271r0) {
            return 2;
        }
        boolean z10 = chatAttachAlertPhotoLayout.L0;
        if (z10 && this == ulVar) {
            return i10 == 0 ? 7 : 2;
        }
        boolean z11 = this.d;
        if (z11 && i10 == 0 && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0) {
            return chatAttachAlertPhotoLayout.K0 ? 8 : 1;
        }
        boolean z12 = this.f33116f;
        if (z12 && i10 == chatAttachAlertPhotoLayout.I0) {
            return 5;
        }
        int i11 = (!z12 || i10 <= chatAttachAlertPhotoLayout.I0) ? i10 : i10 - 1;
        if (z11) {
            i11--;
        }
        if (chatAttachAlertPhotoLayout.f26247c1 && i11 == 0) {
            return 4;
        }
        if (this == ulVar && i10 == this.f33117n - 1) {
            return 2;
        }
        return z10 ? 3 : 0;
    }

    @Override
    public final void l() {
        super.l();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        if (this == chatAttachAlertPhotoLayout.C) {
            chatAttachAlertPhotoLayout.D.setVisibility((!(h() == 1 && !chatAttachAlertPhotoLayout.L0 && chatAttachAlertPhotoLayout.P0 == null) && chatAttachAlertPhotoLayout.f26271r0) ? 4 : 0);
        }
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        gi giVar = chatAttachAlertPhotoLayout.f34900b;
        int i11 = o1Var.f5793f;
        View view = o1Var.f5789a;
        boolean z10 = this.d;
        if (i11 != 0) {
            if (i11 == 1) {
                ((org.telegram.ui.Cells.j5) view).setItemSize(chatAttachAlertPhotoLayout.G0);
                return;
            }
            if (i11 != 3) {
                if (i11 != 7) {
                    return;
                }
                ((u10) view).setUseAnEmojiVisible(chatAttachAlertPhotoLayout.f26247c1);
                return;
            } else {
                org.telegram.ui.Cells.k5 k5Var = (org.telegram.ui.Cells.k5) view;
                k5Var.setItemSize(chatAttachAlertPhotoLayout.G0);
                k5Var.setType((z10 && chatAttachAlertPhotoLayout.K0 && i10 == 0) ? 0 : 1);
                return;
            }
        }
        if (this.f33116f && i10 > chatAttachAlertPhotoLayout.I0) {
            i10--;
        }
        if (z10 && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0) {
            i10--;
        }
        if (chatAttachAlertPhotoLayout.f26247c1) {
            i10--;
        }
        org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
        if (this == chatAttachAlertPhotoLayout.C) {
            q5Var.setItemSize(chatAttachAlertPhotoLayout.G0);
        } else {
            q5Var.setIsVertical(chatAttachAlertPhotoLayout.f26272s.f5720o == 1);
        }
        if (giVar.M0 != 0 || giVar.P0 || giVar.D) {
            q5Var.getCheckBox().setVisibility(8);
        } else {
            q5Var.getCheckBox().setVisibility(0);
        }
        MediaController.PhotoEntry photoEntryB0 = chatAttachAlertPhotoLayout.b0(i10);
        if (photoEntryB0 == null) {
            return;
        }
        HashMap map = ChatAttachAlertPhotoLayout.f26239o1;
        q5Var.d(photoEntryB0, map.size() > 1, z10 && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0, i10 == h() - 1, giVar != null && giVar.f28646e0);
        if ((giVar.f28635b0 instanceof org.telegram.ui.rn) && giVar.P1) {
            q5Var.b(ChatAttachAlertPhotoLayout.f26240p1.indexOf(Integer.valueOf(photoEntryB0.imageId)), map.containsKey(Integer.valueOf(photoEntryB0.imageId)), false);
        } else {
            q5Var.b(-1, map.containsKey(Integer.valueOf(photoEntryB0.imageId)), false);
        }
        if (!chatAttachAlertPhotoLayout.f26273s0 && photoEntryB0.isVideo) {
            q5Var.setAlpha(0.3f);
        } else if (chatAttachAlertPhotoLayout.f26274t0 || photoEntryB0.isVideo) {
            q5Var.setAlpha(1.0f);
        } else {
            q5Var.setAlpha(0.3f);
        }
        q5Var.getImageView().setTag(Integer.valueOf(i10));
        q5Var.setTag(Integer.valueOf(i10));
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        gi giVar = chatAttachAlertPhotoLayout.f34900b;
        org.telegram.ui.ActionBar.c6 c6Var = chatAttachAlertPhotoLayout.f34899a;
        if (i10 == 0) {
            ArrayList arrayList = this.h;
            if (arrayList.isEmpty()) {
                return L();
            }
            lk0 lk0Var = (lk0) arrayList.get(0);
            arrayList.remove(0);
            return lk0Var;
        }
        Context context = this.f33114c;
        if (i10 == 1) {
            org.telegram.ui.Cells.j5 j5Var = new org.telegram.ui.Cells.j5(context);
            j5Var.setFocusable(true);
            j5Var.f24531a = AndroidUtilities.dp(0.0f);
            return new lk0(j5Var);
        }
        if (i10 == 2) {
            return new lk0(new ag.s0(this, context, 12));
        }
        if (i10 == 4) {
            giVar.getClass();
            return new lk0(new tl(this, context));
        }
        if (i10 == 5) {
            return new lk0(new View(context));
        }
        if (i10 == 7) {
            u10 u10Var = new u10(context, giVar.F1);
            u10Var.setLayoutParams(new f2.y0(-1, AndroidUtilities.dp(400.0f)));
            u10Var.setGravity(17);
            u10Var.isClickable();
            u10Var.f32945b.setOnClickListener(new f0(new yk(chatAttachAlertPhotoLayout, 5), 18));
            u10Var.f32944a.setOnClickListener(new f0(new yk(chatAttachAlertPhotoLayout, 6), 19));
            u10Var.f32946c.setOnClickListener(new q2(23, u10Var, new v2(this, 2)));
            return new lk0(u10Var);
        }
        if (i10 == 8) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new f2.y0(-1, AndroidUtilities.dp(56.0f)));
            lh.d dVar = new lh.d(context, c6Var, true);
            dVar.setUseWrapContent(true);
            dVar.e();
            dVar.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
            spannableStringBuilder.setSpan(new cq(R.drawable.camera, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.GalleryAccessAllowAccessCamera));
            dVar.g(spannableStringBuilder, false, true);
            frameLayout.addView(dVar, h7.z5.d(-2, 44.0f, 81, 10.0f, 0.0f, 10.0f, 12.0f));
            return new lk0(frameLayout);
        }
        org.telegram.ui.Cells.k5 k5Var = new org.telegram.ui.Cells.k5(context);
        ImageView imageView = new ImageView(context);
        k5Var.f24582a = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23002aa, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(iV0, mode));
        k5Var.addView(imageView, h7.z5.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
        ImageView imageView2 = new ImageView(context);
        k5Var.f24583b = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23021ba, c6Var), mode));
        k5Var.addView(imageView2, h7.z5.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
        TextView textView = new TextView(context);
        k5Var.f24584c = textView;
        org.telegram.messenger.rl.l(org.telegram.ui.ActionBar.g6.ca, c6Var, textView, 1, 12.0f);
        textView.setGravity(17);
        k5Var.addView(textView, h7.z5.d(-2, -2.0f, 17, 5.0f, 13.0f, 5.0f, 0.0f));
        k5Var.d = AndroidUtilities.dp(80.0f);
        return new lk0(k5Var);
    }

    @Override
    public final void y(f2.o1 o1Var) {
        if (o1Var.f5789a instanceof org.telegram.ui.Cells.j5) {
            this.v.M.f();
        }
    }
}
