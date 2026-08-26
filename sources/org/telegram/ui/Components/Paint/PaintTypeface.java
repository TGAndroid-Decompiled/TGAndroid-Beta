package org.telegram.ui.Components.Paint;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import com.google.firebase.messaging.FirebaseMessaging$AutoInit$$ExternalSyntheticLambda0;
import com.stripe.android.Stripe;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.WindowVisibilityManager$$ExternalSyntheticLambda0;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda2;

public final class PaintTypeface {
    public static final List BUILT_IN_FONTS;
    public static final PaintTypeface ROBOTO_MEDIUM;
    public static boolean loadingTypefaces;
    public static final List preferable;
    public static ArrayList typefaces;
    public final String key;
    public final Stripe lazyTypeface;
    public final String name;
    public final String nameKey;

    public final class Family {
        public final ArrayList fonts = new ArrayList();
    }

    public final class FontData {
        public String family;
        public Font font;
        public String subfamily;
    }

    public final class NameRecord {
        public final int encodingID;
        public final int nameID;
        public final int nameLength;
        public final int stringOffset;

        public NameRecord(RandomAccessFile randomAccessFile) throws IOException {
            randomAccessFile.readUnsignedShort();
            this.encodingID = randomAccessFile.readUnsignedShort();
            randomAccessFile.readUnsignedShort();
            this.nameID = randomAccessFile.readUnsignedShort();
            this.nameLength = randomAccessFile.readUnsignedShort();
            this.stringOffset = randomAccessFile.readUnsignedShort();
        }

        public final String read(RandomAccessFile randomAccessFile, int i) throws IOException {
            randomAccessFile.seek(i + this.stringOffset);
            byte[] bArr = new byte[this.nameLength];
            randomAccessFile.read(bArr);
            return new String(bArr, this.encodingID == 1 ? StandardCharsets.UTF_16BE : StandardCharsets.UTF_8);
        }
    }

    static {
        int i = 17;
        PaintTypeface paintTypeface = new PaintTypeface("roboto", "PhotoEditorTypefaceRoboto", new Stripe(new FirebaseMessaging$AutoInit$$ExternalSyntheticLambda0(19), i));
        ROBOTO_MEDIUM = paintTypeface;
        BUILT_IN_FONTS = Arrays.asList(paintTypeface, new PaintTypeface("italic", "PhotoEditorTypefaceItalic", new Stripe(new FirebaseMessaging$AutoInit$$ExternalSyntheticLambda0(20), i)), new PaintTypeface("serif", "PhotoEditorTypefaceSerif", new Stripe(new FirebaseMessaging$AutoInit$$ExternalSyntheticLambda0(21), i)), new PaintTypeface("condensed", "PhotoEditorTypefaceCondensed", new Stripe(new FirebaseMessaging$AutoInit$$ExternalSyntheticLambda0(22), i)), new PaintTypeface("mono", "PhotoEditorTypefaceMono", new Stripe(new FirebaseMessaging$AutoInit$$ExternalSyntheticLambda0(23), i)), new PaintTypeface("mw_bold", "PhotoEditorTypefaceMerriweather", new Stripe(new FirebaseMessaging$AutoInit$$ExternalSyntheticLambda0(24), i)));
        preferable = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public PaintTypeface(String str, String str2, Stripe stripe) {
        this.key = str;
        this.nameKey = str2;
        this.name = null;
        this.lazyTypeface = stripe;
    }

    public static List get() {
        ArrayList arrayList = typefaces;
        if (arrayList != null) {
            return arrayList;
        }
        if (arrayList == null && !loadingTypefaces) {
            loadingTypefaces = true;
            Utilities.themeQueue.postRunnable(new GiftSheet$$ExternalSyntheticLambda2(7));
        }
        return BUILT_IN_FONTS;
    }

    public final Typeface getTypeface() {
        Stripe stripe = this.lazyTypeface;
        if (((Typeface) stripe.defaultPublishableKey) == null) {
            stripe.defaultPublishableKey = ((PaintTypeface$LazyTypeface$LazyTypefaceLoader) stripe.tokenCreator).load();
        }
        return (Typeface) stripe.defaultPublishableKey;
    }

    public PaintTypeface(Font font, String str) {
        this.key = str;
        this.name = str;
        this.nameKey = null;
        this.lazyTypeface = new Stripe(new WindowVisibilityManager$$ExternalSyntheticLambda0(font, 24), 17);
    }
}
