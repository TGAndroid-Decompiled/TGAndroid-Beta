package org.telegram.ui.Components.Paint;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import com.google.zxing.BinaryBitmap;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda470;
import org.telegram.ui.Components.ProfileGooeyView$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda15;

public final class PaintTypeface {
    public static final List BUILT_IN_FONTS;
    public static final PaintTypeface ROBOTO_MEDIUM;
    public static boolean loadingTypefaces;
    public static final List preferable;
    public static ArrayList typefaces;
    public final String key;
    public final BinaryBitmap lazyTypeface;
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
        PaintTypeface paintTypeface = new PaintTypeface("roboto", "PhotoEditorTypefaceRoboto", new BinaryBitmap(25, (Object) new ShareAlert$$ExternalSyntheticLambda15(6), false));
        ROBOTO_MEDIUM = paintTypeface;
        BUILT_IN_FONTS = Arrays.asList(paintTypeface, new PaintTypeface("italic", "PhotoEditorTypefaceItalic", new BinaryBitmap(25, (Object) new ShareAlert$$ExternalSyntheticLambda15(7), false)), new PaintTypeface("serif", "PhotoEditorTypefaceSerif", new BinaryBitmap(25, (Object) new ShareAlert$$ExternalSyntheticLambda15(8), false)), new PaintTypeface("condensed", "PhotoEditorTypefaceCondensed", new BinaryBitmap(25, (Object) new ShareAlert$$ExternalSyntheticLambda15(9), false)), new PaintTypeface("mono", "PhotoEditorTypefaceMono", new BinaryBitmap(25, (Object) new ShareAlert$$ExternalSyntheticLambda15(10), false)), new PaintTypeface("mw_bold", "PhotoEditorTypefaceMerriweather", new BinaryBitmap(25, (Object) new ShareAlert$$ExternalSyntheticLambda15(11), false)));
        preferable = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public PaintTypeface(String str, String str2, BinaryBitmap binaryBitmap) {
        this.key = str;
        this.nameKey = str2;
        this.name = null;
        this.lazyTypeface = binaryBitmap;
    }

    public static List get() {
        ArrayList arrayList = typefaces;
        if (arrayList != null) {
            return arrayList;
        }
        if (arrayList == null && !loadingTypefaces) {
            loadingTypefaces = true;
            Utilities.themeQueue.postRunnable(new ChatActivity$$ExternalSyntheticLambda470(26));
        }
        return BUILT_IN_FONTS;
    }

    public final Typeface getTypeface() {
        BinaryBitmap binaryBitmap = this.lazyTypeface;
        if (((Typeface) binaryBitmap.matrix) == null) {
            binaryBitmap.matrix = ((PaintTypeface$LazyTypeface$LazyTypefaceLoader) binaryBitmap.binarizer).load();
        }
        return (Typeface) binaryBitmap.matrix;
    }

    public PaintTypeface(Font font, String str) {
        this.key = str;
        this.name = str;
        this.nameKey = null;
        this.lazyTypeface = new BinaryBitmap(25, (Object) new ProfileGooeyView$$ExternalSyntheticLambda0(font, 2), false);
    }
}
