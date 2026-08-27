package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;

public final class t90 extends bz {
    public final tu0 X;
    public final aa0 Y;

    public t90(aa0 aa0Var) {
        super(100, false);
        this.Y = aa0Var;
        this.X = new tu0();
    }

    @Override
    public final int A() {
        aa0 aa0Var = this.Y;
        return (aa0Var.f26703f.I() == null && aa0Var.f26703f.Q == null) ? B() : B() - 1;
    }

    @Override
    public final tu0 D1(int i10) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        tu0 tu0Var = this.X;
        int i11 = 0;
        tu0Var.f32895c = false;
        aa0 aa0Var = this.Y;
        if (i10 == 0) {
            tu0Var.f32893a = this.f5862m;
            tu0Var.f32894b = aa0Var.f26702e.h;
            tu0Var.f32895c = true;
            return tu0Var;
        }
        int i12 = i10 - 1;
        if (aa0Var.f26703f.I() == null && aa0Var.f26703f.Q == null) {
            i10 = i12;
        }
        tu0Var.f32893a = 0.0f;
        tu0Var.f32894b = 0.0f;
        Object objJ = aa0Var.f26703f.J(i10);
        if (objJ instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) objJ;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                tu0Var.f32893a = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.f22405w : 100.0f;
                tu0Var.f32894b = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.h : 100.0f;
                while (i11 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i11);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        tu0Var.f32893a = documentAttribute.f22387w;
                        tu0Var.f32894b = documentAttribute.h;
                        break;
                    }
                    i11++;
                }
            } else if (botInlineResult.content != null) {
                while (i11 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i11);
                    if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        tu0Var.f32893a = documentAttribute2.f22387w;
                        tu0Var.f32894b = documentAttribute2.h;
                        break;
                    }
                    i11++;
                }
            } else if (botInlineResult.thumb != null) {
                while (i11 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i11);
                    if ((documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        tu0Var.f32893a = documentAttribute3.f22387w;
                        tu0Var.f32894b = documentAttribute3.h;
                        break;
                    }
                    i11++;
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    tu0Var.f32893a = closestPhotoSizeWithSize.f22405w;
                    tu0Var.f32894b = closestPhotoSizeWithSize.h;
                }
            }
        }
        return tu0Var;
    }
}
