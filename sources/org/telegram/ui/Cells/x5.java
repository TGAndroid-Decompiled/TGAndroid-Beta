package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hp;
public final class x5 extends FrameLayout {
    public org.telegram.ui.Components.t9 f25920a;
    public FrameLayout f25921b;
    public hp f25922c;
    public TextView d;
    public bg.u1 f25923e;
    public int f25924f;
    public int h;

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f25922c.b(org.telegram.ui.ActionBar.g6.W9, org.telegram.ui.ActionBar.g6.X9, org.telegram.ui.ActionBar.g6.V9);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f25924f + this.h, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f25924f, 1073741824));
    }

    public void setImage(MediaController.PhotoEntry photoEntry) {
        bg.u1 u1Var = this.f25923e;
        org.telegram.ui.Components.t9 t9Var = this.f25920a;
        Drawable drawable = getResources().getDrawable(R.drawable.nophotos);
        String str = photoEntry.thumbPath;
        if (str != null) {
            t9Var.f(str, null, drawable);
        } else if (photoEntry.path != null) {
            t9Var.p(photoEntry.orientation, photoEntry.invert, true);
            if (photoEntry.isLivePhoto()) {
                u1Var.setVisibility(4);
                setContentDescription(LocaleController.getString(R.string.AttachLivePhoto));
                t9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, drawable);
            } else if (photoEntry.isVideo) {
                u1Var.setVisibility(0);
                this.d.setText(AndroidUtilities.formatShortDuration(photoEntry.duration));
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.b.j(R.string.AttachVideo, ", ", sb2);
                sb2.append(LocaleController.formatDuration(photoEntry.duration));
                setContentDescription(sb2.toString());
                t9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, drawable);
            } else {
                u1Var.setVisibility(4);
                setContentDescription(LocaleController.getString(R.string.AttachPhoto));
                t9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, drawable);
            }
        } else {
            t9Var.setImageDrawable(drawable);
        }
    }

    public void setNum(int i10) {
        this.f25922c.setNum(i10);
    }

    public void setImage(MediaController.SearchImage searchImage) {
        org.telegram.ui.Components.t9 t9Var = this.f25920a;
        Drawable drawable = getResources().getDrawable(R.drawable.nophotos);
        TLRPC.PhotoSize photoSize = searchImage.thumbPhotoSize;
        if (photoSize != null) {
            t9Var.h(ImageLocation.getForPhoto(photoSize, searchImage.photo), null, drawable, searchImage);
            return;
        }
        TLRPC.PhotoSize photoSize2 = searchImage.photoSize;
        if (photoSize2 != null) {
            t9Var.h(ImageLocation.getForPhoto(photoSize2, searchImage.photo), "80_80", drawable, searchImage);
            return;
        }
        String str = searchImage.thumbPath;
        if (str != null) {
            t9Var.f(str, null, drawable);
            return;
        }
        String str2 = searchImage.thumbUrl;
        if (str2 != null && str2.length() > 0) {
            t9Var.f(searchImage.thumbUrl, null, drawable);
        } else if (MessageObject.isDocumentHasThumb(searchImage.document)) {
            t9Var.h(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(searchImage.document.thumbs, 320), searchImage.document), null, drawable, searchImage);
        } else {
            t9Var.setImageDrawable(drawable);
        }
    }
}
