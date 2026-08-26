package org.telegram.ui.iv;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import androidx.datastore.preferences.protobuf.BooleanArrayList;
import androidx.datastore.preferences.protobuf.ByteString$LiteralByteString;
import androidx.datastore.preferences.protobuf.CodedInputStream$StreamDecoder;
import androidx.datastore.preferences.protobuf.DoubleArrayList;
import androidx.datastore.preferences.protobuf.ExtensionRegistryLite;
import androidx.datastore.preferences.protobuf.FloatArrayList;
import androidx.datastore.preferences.protobuf.IntArrayList;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.LazyStringList;
import androidx.datastore.preferences.protobuf.LongArrayList;
import androidx.datastore.preferences.protobuf.Protobuf;
import androidx.datastore.preferences.protobuf.Schema;
import androidx.datastore.preferences.protobuf.Utf8;
import androidx.datastore.preferences.protobuf.WireFormat$FieldType;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.upstream.Allocation;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import ru.noties.jlatexmath.JLatexMathAndroid;
import ru.noties.jlatexmath.JLatexMathDrawable;

public final class Latex {
    public static volatile boolean sInitialized = false;
    public int height;
    public int width;
    public int depth = 0;
    public Object bitmap = new Allocation[100];

    public static Latex render(String str, float f, boolean z) {
        JLatexMathDrawable jLatexMathDrawableBuild;
        int intrinsicWidth;
        int intrinsicHeight;
        int iconDepth;
        if (str != null && !str.isEmpty()) {
            try {
                if (sInitialized) {
                    jLatexMathDrawableBuild = JLatexMathDrawable.builder(str).textSize(f).build();
                    intrinsicWidth = jLatexMathDrawableBuild.getIntrinsicWidth();
                    intrinsicHeight = jLatexMathDrawableBuild.getIntrinsicHeight();
                    if (intrinsicWidth > 0) {
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ALPHA_8);
                        iconDepth = 0;
                        jLatexMathDrawableBuild.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                        jLatexMathDrawableBuild.draw(new Canvas(bitmapCreateBitmap));
                        if (z) {
                            iconDepth = jLatexMathDrawableBuild.icon().getIconDepth();
                        }
                        Latex latex = new Latex();
                        latex.bitmap = bitmapCreateBitmap;
                        latex.width = intrinsicWidth;
                        latex.height = intrinsicHeight;
                        latex.depth = iconDepth;
                        return latex;
                    }
                } else {
                    synchronized (Latex.class) {
                        try {
                            if (!sInitialized) {
                                JLatexMathAndroid.init(ApplicationLoader.applicationContext);
                                sInitialized = true;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    jLatexMathDrawableBuild = JLatexMathDrawable.builder(str).textSize(f).build();
                    intrinsicWidth = jLatexMathDrawableBuild.getIntrinsicWidth();
                    intrinsicHeight = jLatexMathDrawableBuild.getIntrinsicHeight();
                    if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ALPHA_8);
                        iconDepth = 0;
                        jLatexMathDrawableBuild.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                        jLatexMathDrawableBuild.draw(new Canvas(bitmapCreateBitmap2));
                        if (z) {
                            try {
                                iconDepth = jLatexMathDrawableBuild.icon().getIconDepth();
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                            }
                        }
                        Latex latex2 = new Latex();
                        latex2.bitmap = bitmapCreateBitmap2;
                        latex2.width = intrinsicWidth;
                        latex2.height = intrinsicHeight;
                        latex2.depth = iconDepth;
                        return latex2;
                    }
                }
            } catch (Throwable th3) {
                FileLog.e(th3);
            }
        }
        return null;
    }

    public static void verifyPackedFixed32Length$1(int i) throws InvalidProtocolBufferException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    public static void verifyPackedFixed64Length$1(int i) throws InvalidProtocolBufferException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    public void addPosition(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i3 = this.depth;
        int i4 = i3 * 2;
        int[] iArr = (int[]) this.bitmap;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.bitmap = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.bitmap = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = (int[]) this.bitmap;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.depth++;
    }

    public synchronized Allocation allocate() {
        int i = this.height + 1;
        this.height = i;
        int i2 = this.depth;
        if (i2 <= 0) {
            Allocation allocation = new Allocation(new byte[65536]);
            Allocation[] allocationArr = (Allocation[]) this.bitmap;
            if (i <= allocationArr.length) {
                return allocation;
            }
            this.bitmap = (Allocation[]) Arrays.copyOf(allocationArr, allocationArr.length * 2);
            return allocation;
        }
        Allocation[] allocationArr2 = (Allocation[]) this.bitmap;
        int i3 = i2 - 1;
        this.depth = i3;
        Allocation allocation2 = allocationArr2[i3];
        allocation2.getClass();
        ((Allocation[]) this.bitmap)[this.depth] = null;
        return allocation2;
    }

    public void collectPrefetchPositionsFromView(RecyclerView recyclerView, boolean z) {
        int i;
        boolean z2;
        int i2;
        this.depth = 0;
        int[] iArr = (int[]) this.bitmap;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.mLayout;
        if (recyclerView.mAdapter == null || layoutManager == null || !layoutManager.mItemPrefetchEnabled) {
            return;
        }
        if (z) {
            if (((ArrayList) recyclerView.mAdapterHelper.mPendingUpdates).size() <= 0) {
                int itemCount = recyclerView.mAdapter.getItemCount();
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                LinearLayoutManager.SavedState savedState = linearLayoutManager.mPendingSavedState;
                if (savedState == null || (i2 = savedState.mAnchorPosition) < 0) {
                    linearLayoutManager.resolveShouldLayoutReverse();
                    z2 = linearLayoutManager.mShouldReverseLayout;
                    i2 = linearLayoutManager.mPendingScrollPosition;
                    if (i2 == -1) {
                        i2 = z2 ? itemCount - 1 : 0;
                    }
                } else {
                    z2 = savedState.mAnchorLayoutFromEnd;
                }
                i = z2 ? -1 : 1;
                for (int i3 = 0; i3 < linearLayoutManager.mInitialPrefetchItemCount && i2 >= 0 && i2 < itemCount; i3++) {
                    addPosition(i2, 0);
                    i2 += i;
                }
            }
        } else if (!recyclerView.hasPendingAdapterUpdates()) {
            int i4 = this.width;
            int i5 = this.height;
            LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) layoutManager;
            if (linearLayoutManager2.mOrientation != 0) {
                i4 = i5;
            }
            if (linearLayoutManager2.getChildCount() != 0 && i4 != 0) {
                linearLayoutManager2.ensureLayoutState();
                i = i4 > 0 ? 1 : -1;
                int iAbs = Math.abs(i4);
                RecyclerView.State state = recyclerView.mState;
                linearLayoutManager2.updateLayoutState(i, iAbs, true, state);
                linearLayoutManager2.collectPrefetchPositionsForLayoutState(state, linearLayoutManager2.mLayoutState, this);
            }
        }
        int i6 = this.depth;
        if (i6 > layoutManager.mPrefetchMaxCountObserved) {
            layoutManager.mPrefetchMaxCountObserved = i6;
            layoutManager.mPrefetchMaxObservedInInitialPrefetch = z;
            recyclerView.mRecycler.updateViewCacheSize();
        }
    }

    public int getFieldNumber() {
        int i = this.depth;
        if (i != 0) {
            this.width = i;
            this.depth = 0;
        } else {
            this.width = ((CodedInputStream$StreamDecoder) this.bitmap).readTag();
        }
        int i2 = this.width;
        if (i2 == 0 || i2 == this.height) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    public int getTag() {
        return this.width;
    }

    public boolean readBool() throws InvalidProtocolBufferException.InvalidWireTypeException {
        requireWireType$1(0);
        return ((CodedInputStream$StreamDecoder) this.bitmap).readBool();
    }

    public void readBoolList(List list) throws InvalidProtocolBufferException {
        int tag;
        boolean z = list instanceof BooleanArrayList;
        CodedInputStream$StreamDecoder codedInputStream$StreamDecoder = (CodedInputStream$StreamDecoder) this.bitmap;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.width & 7;
            if (i == 0) {
                codedInputStream$StreamDecoder.readBool();
                throw null;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            codedInputStream$StreamDecoder.readUInt32();
            codedInputStream$StreamDecoder.readBool();
            throw null;
        }
        int i2 = this.width & 7;
        if (i2 == 0) {
            do {
                list.add(Boolean.valueOf(codedInputStream$StreamDecoder.readBool()));
                if (codedInputStream$StreamDecoder.isAtEnd()) {
                    return;
                } else {
                    tag = codedInputStream$StreamDecoder.readTag();
                }
            } while (tag == this.width);
            this.depth = tag;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead = codedInputStream$StreamDecoder.getTotalBytesRead() + codedInputStream$StreamDecoder.readUInt32();
        do {
            list.add(Boolean.valueOf(codedInputStream$StreamDecoder.readBool()));
        } while (codedInputStream$StreamDecoder.getTotalBytesRead() < totalBytesRead);
        requirePosition$1(totalBytesRead);
    }

    public ByteString$LiteralByteString readBytes() throws InvalidProtocolBufferException.InvalidWireTypeException {
        requireWireType$1(2);
        CodedInputStream$StreamDecoder codedInputStream$StreamDecoder = (CodedInputStream$StreamDecoder) this.bitmap;
        int rawVarint32 = codedInputStream$StreamDecoder.readRawVarint32();
        int i = codedInputStream$StreamDecoder.bufferSize;
        int i2 = codedInputStream$StreamDecoder.pos;
        int i3 = i - i2;
        byte[] bArr = codedInputStream$StreamDecoder.buffer;
        if (rawVarint32 <= i3 && rawVarint32 > 0) {
            ByteString$LiteralByteString byteString$LiteralByteStringCopyFrom = ByteString$LiteralByteString.copyFrom(i2, rawVarint32, bArr);
            codedInputStream$StreamDecoder.pos += rawVarint32;
            return byteString$LiteralByteStringCopyFrom;
        }
        if (rawVarint32 == 0) {
            return ByteString$LiteralByteString.EMPTY;
        }
        byte[] rawBytesSlowPathOneChunk = codedInputStream$StreamDecoder.readRawBytesSlowPathOneChunk(rawVarint32);
        if (rawBytesSlowPathOneChunk != null) {
            return ByteString$LiteralByteString.copyFrom(0, rawBytesSlowPathOneChunk.length, rawBytesSlowPathOneChunk);
        }
        int i4 = codedInputStream$StreamDecoder.pos;
        int i5 = codedInputStream$StreamDecoder.bufferSize;
        int length = i5 - i4;
        codedInputStream$StreamDecoder.totalBytesRetired += i5;
        codedInputStream$StreamDecoder.pos = 0;
        codedInputStream$StreamDecoder.bufferSize = 0;
        ArrayList rawBytesSlowPathRemainingChunks = codedInputStream$StreamDecoder.readRawBytesSlowPathRemainingChunks(rawVarint32 - length);
        byte[] bArr2 = new byte[rawVarint32];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        int size = rawBytesSlowPathRemainingChunks.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = rawBytesSlowPathRemainingChunks.get(i6);
            i6++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        ByteString$LiteralByteString byteString$LiteralByteString = ByteString$LiteralByteString.EMPTY;
        return new ByteString$LiteralByteString(bArr2);
    }

    public void readBytesList(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int tag;
        if ((this.width & 7) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(readBytes());
            CodedInputStream$StreamDecoder codedInputStream$StreamDecoder = (CodedInputStream$StreamDecoder) this.bitmap;
            if (codedInputStream$StreamDecoder.isAtEnd()) {
                return;
            } else {
                tag = codedInputStream$StreamDecoder.readTag();
            }
        } while (tag == this.width);
        this.depth = tag;
    }

    public double readDouble() throws InvalidProtocolBufferException.InvalidWireTypeException {
        requireWireType$1(1);
        return ((CodedInputStream$StreamDecoder) this.bitmap).readDouble();
    }

    public void readDoubleList(List list) throws InvalidProtocolBufferException {
        int tag;
        boolean z = list instanceof DoubleArrayList;
        CodedInputStream$StreamDecoder codedInputStream$StreamDecoder = (CodedInputStream$StreamDecoder) this.bitmap;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.width & 7;
            if (i == 1) {
                codedInputStream$StreamDecoder.readDouble();
                throw null;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            verifyPackedFixed64Length$1(codedInputStream$StreamDecoder.readUInt32());
            codedInputStream$StreamDecoder.readDouble();
            throw null;
        }
        int i2 = this.width & 7;
        if (i2 == 1) {
            do {
                list.add(Double.valueOf(codedInputStream$StreamDecoder.readDouble()));
                if (codedInputStream$StreamDecoder.isAtEnd()) {
                    return;
                } else {
                    tag = codedInputStream$StreamDecoder.readTag();
                }
            } while (tag == this.width);
            this.depth = tag;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int uInt32 = codedInputStream$StreamDecoder.readUInt32();
        verifyPackedFixed64Length$1(uInt32);
        int totalBytesRead = codedInputStream$StreamDecoder.getTotalBytesRead() + uInt32;
        do {
            list.add(Double.valueOf(codedInputStream$StreamDecoder.readDouble()));
        } while (codedInputStream$StreamDecoder.getTotalBytesRead() < totalBytesRead);
    }

    public int readEnum() throws InvalidProtocolBufferException.InvalidWireTypeException {
        requireWireType$1(0);
        return ((CodedInputStream$StreamDecoder) this.bitmap).readEnum();
    }

    public void readEnumList(List list) throws InvalidProtocolBufferException {
        int tag;
        boolean z = list instanceof IntArrayList;
        CodedInputStream$StreamDecoder codedInputStream$StreamDecoder = (CodedInputStream$StreamDecoder) this.bitmap;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.width & 7;
            if (i == 0) {
                codedInputStream$StreamDecoder.readEnum();
                throw null;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            codedInputStream$StreamDecoder.readUInt32();
            codedInputStream$StreamDecoder.readEnum();
            throw null;
        }
        int i2 = this.width & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(codedInputStream$StreamDecoder.readEnum()));
                if (codedInputStream$StreamDecoder.isAtEnd()) {
                    return;
                } else {
                    tag = codedInputStream$StreamDecoder.readTag();
                }
            } while (tag == this.width);
            this.depth = tag;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead = codedInputStream$StreamDecoder.getTotalBytesRead() + codedInputStream$StreamDecoder.readUInt32();
        do {
            list.add(Integer.valueOf(codedInputStream$StreamDecoder.readEnum()));
        } while (codedInputStream$StreamDecoder.getTotalBytesRead() < totalBytesRead);
        requirePosition$1(totalBytesRead);
    }

    public Object readField$1(WireFormat$FieldType wireFormat$FieldType, Class cls, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
        switch (wireFormat$FieldType.ordinal()) {
            case 0:
                return Double.valueOf(readDouble());
            case 1:
                return Float.valueOf(readFloat());
            case 2:
                return Long.valueOf(readInt64());
            case 3:
                return Long.valueOf(readUInt64());
            case 4:
                return Integer.valueOf(readInt32());
            case 5:
                return Long.valueOf(readFixed64());
            case 6:
                return Integer.valueOf(readFixed32());
            case 7:
                return Boolean.valueOf(readBool());
            case 8:
                return readStringRequireUtf8();
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                requireWireType$1(2);
                return readMessage$1(Protobuf.INSTANCE.schemaFor(cls), extensionRegistryLite);
            case 11:
                return readBytes();
            case 12:
                return Integer.valueOf(readUInt32());
            case 13:
                return Integer.valueOf(readEnum());
            case 14:
                return Integer.valueOf(readSFixed32());
            case 15:
                return Long.valueOf(readSFixed64());
            case 16:
                return Integer.valueOf(readSInt32());
            case 17:
                return Long.valueOf(readSInt64());
        }
    }

    public int readFixed32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        requireWireType$1(5);
        return ((CodedInputStream$StreamDecoder) this.bitmap).readFixed32();
    }

    public void readFixed32List(List list) throws InvalidProtocolBufferException {
        int tag;
        boolean z = list instanceof IntArrayList;
        CodedInputStream$StreamDecoder codedInputStream$StreamDecoder = (CodedInputStream$StreamDecoder) this.bitmap;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.width & 7;
            if (i == 2) {
                verifyPackedFixed32Length$1(codedInputStream$StreamDecoder.readUInt32());
                codedInputStream$StreamDecoder.readFixed32();
                throw null;
            }
            if (i != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            codedInputStream$StreamDecoder.readFixed32();
            throw null;
        }
        int i2 = this.width & 7;
        if (i2 == 2) {
            int uInt32 = codedInputStream$StreamDecoder.readUInt32();
            verifyPackedFixed32Length$1(uInt32);
            int totalBytesRead = codedInputStream$StreamDecoder.getTotalBytesRead() + uInt32;
            do {
                list.add(Integer.valueOf(codedInputStream$StreamDecoder.readFixed32()));
            } while (codedInputStream$StreamDecoder.getTotalBytesRead() < totalBytesRead);
            return;
        }
        if (i2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Integer.valueOf(codedInputStream$StreamDecoder.readFixed32()));
            if (codedInputStream$StreamDecoder.isAtEnd()) {
                return;
            } else {
                tag = codedInputStream$StreamDecoder.readTag();
            }
        } while (tag == this.width);
        this.depth = tag;
    }

    public long readFixed64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        requireWireType$1(1);
        return ((CodedInputStream$StreamDecoder) this.bitmap).readFixed64();
    }

    public void readFixed64List(List list) throws InvalidProtocolBufferException {
        int tag;
        boolean z = list instanceof LongArrayList;
        CodedInputStream$StreamDecoder codedInputStream$StreamDecoder = (CodedInputStream$StreamDecoder) this.bitmap;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.width & 7;
            if (i == 1) {
                codedInputStream$StreamDecoder.readFixed64();
                throw null;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            verifyPackedFixed64Length$1(codedInputStream$StreamDecoder.readUInt32());
            codedInputStream$StreamDecoder.readFixed64();
            throw null;
        }
        int i2 = this.width & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(codedInputStream$StreamDecoder.readFixed64()));
                if (codedInputStream$StreamDecoder.isAtEnd()) {
                    return;
                } else {
                    tag = codedInputStream$StreamDecoder.readTag();
                }
            } while (tag == this.width);
            this.depth = tag;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int uInt32 = codedInputStream$StreamDecoder.readUInt32();
        verifyPackedFixed64Length$1(uInt32);
        int totalBytesRead = codedInputStream$StreamDecoder.getTotalBytesRead() + uInt32;
        do {
            list.add(Long.valueOf(codedInputStream$StreamDecoder.readFixed64()));
        } while (codedInputStream$StreamDecoder.getTotalBytesRead() < totalBytesRead);
    }

    public float readFloat() throws InvalidProtocolBufferException.InvalidWireTypeException {
        requireWireType$1(5);
        return ((CodedInputStream$StreamDecoder) this.bitmap).readFloat();
    }

    public void readFloatList(List list) throws InvalidProtocolBufferException {
        int tag;
        boolean z = list instanceof FloatArrayList;
        CodedInputStream$StreamDecoder codedInputStream$StreamDecoder = (CodedInputStream$StreamDecoder) this.bitmap;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.width & 7;
            if (i == 2) {
                verifyPackedFixed32Length$1(codedInputStream$StreamDecoder.readUInt32());
                codedInputStream$StreamDecoder.readFloat();
                throw null;
            }
            if (i != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            codedInputStream$StreamDecoder.readFloat();
            throw null;
        }
        int i2 = this.width & 7;
        if (i2 == 2) {
            int uInt32 = codedInputStream$StreamDecoder.readUInt32();
            verifyPackedFixed32Length$1(uInt32);
            int totalBytesRead = codedInputStream$StreamDecoder.getTotalBytesRead() + uInt32;
            do {
                list.add(Float.valueOf(codedInputStream$StreamDecoder.readFloat()));
            } while (codedInputStream$StreamDecoder.getTotalBytesRead() < totalBytesRead);
            return;
        }
        if (i2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Float.valueOf(codedInputStream$StreamDecoder.readFloat()));
            if (codedInputStream$StreamDecoder.isAtEnd()) {
                return;
            } else {
                tag = codedInputStream$StreamDecoder.readTag();
            }
        } while (tag == this.width);
        this.depth = tag;
    }

    public Object readGroup$1(Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        int i = this.height;
        this.height = ((this.width >>> 3) << 3) | 4;
        try {
            Object objNewInstance = schema.newInstance();
            schema.mergeFrom(objNewInstance, this, extensionRegistryLite);
            schema.makeImmutable(objNewInstance);
            if (this.width != this.height) {
                throw InvalidProtocolBufferException.parseFailure();
            }
            this.height = i;
            return objNewInstance;
        } catch (Throwable th) {
            this.height = i;
            throw th;
        }
    }

    public Object readGroupBySchemaWithCheck(Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
        requireWireType$1(3);
        return readGroup$1(schema, extensionRegistryLite);
    }

    public int readInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        requireWireType$1(0);
        return ((CodedInputStream$StreamDecoder) this.bitmap).readInt32();
    }

    public void readInt32List(List list) throws InvalidProtocolBufferException {
        int tag;
        boolean z = list instanceof IntArrayList;
        CodedInputStream$StreamDecoder codedInputStream$StreamDecoder = (CodedInputStream$StreamDecoder) this.bitmap;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.width & 7;
            if (i == 0) {
                codedInputStream$StreamDecoder.readInt32();
                throw null;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            codedInputStream$StreamDecoder.readUInt32();
            codedInputStream$StreamDecoder.readInt32();
            throw null;
        }
        int i2 = this.width & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(codedInputStream$StreamDecoder.readInt32()));
                if (codedInputStream$StreamDecoder.isAtEnd()) {
                    return;
                } else {
                    tag = codedInputStream$StreamDecoder.readTag();
                }
            } while (tag == this.width);
            this.depth = tag;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead = codedInputStream$StreamDecoder.getTotalBytesRead() + codedInputStream$StreamDecoder.readUInt32();
        do {
            list.add(Integer.valueOf(codedInputStream$StreamDecoder.readInt32()));
        } while (codedInputStream$StreamDecoder.getTotalBytesRead() < totalBytesRead);
        requirePosition$1(totalBytesRead);
    }

    public long readInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        requireWireType$1(0);
        return ((CodedInputStream$StreamDecoder) this.bitmap).readInt64();
    }

    public void readInt64List(List list) throws InvalidProtocolBufferException {
        int tag;
        boolean z = list instanceof LongArrayList;
        CodedInputStream$StreamDecoder codedInputStream$StreamDecoder = (CodedInputStream$StreamDecoder) this.bitmap;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.width & 7;
            if (i == 0) {
                codedInputStream$StreamDecoder.readInt64();
                throw null;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            codedInputStream$StreamDecoder.readUInt32();
            codedInputStream$StreamDecoder.readInt64();
            throw null;
        }
        int i2 = this.width & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(codedInputStream$StreamDecoder.readInt64()));
                if (codedInputStream$StreamDecoder.isAtEnd()) {
                    return;
                } else {
                    tag = codedInputStream$StreamDecoder.readTag();
                }
            } while (tag == this.width);
            this.depth = tag;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead = codedInputStream$StreamDecoder.getTotalBytesRead() + codedInputStream$StreamDecoder.readUInt32();
        do {
            list.add(Long.valueOf(codedInputStream$StreamDecoder.readInt64()));
        } while (codedInputStream$StreamDecoder.getTotalBytesRead() < totalBytesRead);
        requirePosition$1(totalBytesRead);
    }

    public Object readMessage$1(Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        CodedInputStream$StreamDecoder codedInputStream$StreamDecoder = (CodedInputStream$StreamDecoder) this.bitmap;
        int uInt32 = codedInputStream$StreamDecoder.readUInt32();
        if (codedInputStream$StreamDecoder.recursionDepth >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iPushLimit = codedInputStream$StreamDecoder.pushLimit(uInt32);
        Object objNewInstance = schema.newInstance();
        codedInputStream$StreamDecoder.recursionDepth++;
        schema.mergeFrom(objNewInstance, this, extensionRegistryLite);
        schema.makeImmutable(objNewInstance);
        codedInputStream$StreamDecoder.checkLastTagWas(0);
        codedInputStream$StreamDecoder.recursionDepth--;
        codedInputStream$StreamDecoder.popLimit(iPushLimit);
        return objNewInstance;
    }

    public Object readMessageBySchemaWithCheck(Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
        requireWireType$1(2);
        return readMessage$1(schema, extensionRegistryLite);
    }

    public int readSFixed32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        requireWireType$1(5);
        return ((CodedInputStream$StreamDecoder) this.bitmap).readSFixed32();
    }

    public void readSFixed32List(List list) throws InvalidProtocolBufferException {
        int tag;
        boolean z = list instanceof IntArrayList;
        CodedInputStream$StreamDecoder codedInputStream$StreamDecoder = (CodedInputStream$StreamDecoder) this.bitmap;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.width & 7;
            if (i == 2) {
                verifyPackedFixed32Length$1(codedInputStream$StreamDecoder.readUInt32());
                codedInputStream$StreamDecoder.readSFixed32();
                throw null;
            }
            if (i != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            codedInputStream$StreamDecoder.readSFixed32();
            throw null;
        }
        int i2 = this.width & 7;
        if (i2 == 2) {
            int uInt32 = codedInputStream$StreamDecoder.readUInt32();
            verifyPackedFixed32Length$1(uInt32);
            int totalBytesRead = codedInputStream$StreamDecoder.getTotalBytesRead() + uInt32;
            do {
                list.add(Integer.valueOf(codedInputStream$StreamDecoder.readSFixed32()));
            } while (codedInputStream$StreamDecoder.getTotalBytesRead() < totalBytesRead);
            return;
        }
        if (i2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Integer.valueOf(codedInputStream$StreamDecoder.readSFixed32()));
            if (codedInputStream$StreamDecoder.isAtEnd()) {
                return;
            } else {
                tag = codedInputStream$StreamDecoder.readTag();
            }
        } while (tag == this.width);
        this.depth = tag;
    }

    public long readSFixed64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        requireWireType$1(1);
        return ((CodedInputStream$StreamDecoder) this.bitmap).readSFixed64();
    }

    public void readSFixed64List(List list) throws InvalidProtocolBufferException {
        int tag;
        boolean z = list instanceof LongArrayList;
        CodedInputStream$StreamDecoder codedInputStream$StreamDecoder = (CodedInputStream$StreamDecoder) this.bitmap;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.width & 7;
            if (i == 1) {
                codedInputStream$StreamDecoder.readSFixed64();
                throw null;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            verifyPackedFixed64Length$1(codedInputStream$StreamDecoder.readUInt32());
            codedInputStream$StreamDecoder.readSFixed64();
            throw null;
        }
        int i2 = this.width & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(codedInputStream$StreamDecoder.readSFixed64()));
                if (codedInputStream$StreamDecoder.isAtEnd()) {
                    return;
                } else {
                    tag = codedInputStream$StreamDecoder.readTag();
                }
            } while (tag == this.width);
            this.depth = tag;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int uInt32 = codedInputStream$StreamDecoder.readUInt32();
        verifyPackedFixed64Length$1(uInt32);
        int totalBytesRead = codedInputStream$StreamDecoder.getTotalBytesRead() + uInt32;
        do {
            list.add(Long.valueOf(codedInputStream$StreamDecoder.readSFixed64()));
        } while (codedInputStream$StreamDecoder.getTotalBytesRead() < totalBytesRead);
    }

    public int readSInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        requireWireType$1(0);
        return ((CodedInputStream$StreamDecoder) this.bitmap).readSInt32();
    }

    public void readSInt32List(List list) throws InvalidProtocolBufferException {
        int tag;
        boolean z = list instanceof IntArrayList;
        CodedInputStream$StreamDecoder codedInputStream$StreamDecoder = (CodedInputStream$StreamDecoder) this.bitmap;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.width & 7;
            if (i == 0) {
                codedInputStream$StreamDecoder.readSInt32();
                throw null;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            codedInputStream$StreamDecoder.readUInt32();
            codedInputStream$StreamDecoder.readSInt32();
            throw null;
        }
        int i2 = this.width & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(codedInputStream$StreamDecoder.readSInt32()));
                if (codedInputStream$StreamDecoder.isAtEnd()) {
                    return;
                } else {
                    tag = codedInputStream$StreamDecoder.readTag();
                }
            } while (tag == this.width);
            this.depth = tag;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead = codedInputStream$StreamDecoder.getTotalBytesRead() + codedInputStream$StreamDecoder.readUInt32();
        do {
            list.add(Integer.valueOf(codedInputStream$StreamDecoder.readSInt32()));
        } while (codedInputStream$StreamDecoder.getTotalBytesRead() < totalBytesRead);
        requirePosition$1(totalBytesRead);
    }

    public long readSInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        requireWireType$1(0);
        return ((CodedInputStream$StreamDecoder) this.bitmap).readSInt64();
    }

    public void readSInt64List(List list) throws InvalidProtocolBufferException {
        int tag;
        boolean z = list instanceof LongArrayList;
        CodedInputStream$StreamDecoder codedInputStream$StreamDecoder = (CodedInputStream$StreamDecoder) this.bitmap;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.width & 7;
            if (i == 0) {
                codedInputStream$StreamDecoder.readSInt64();
                throw null;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            codedInputStream$StreamDecoder.readUInt32();
            codedInputStream$StreamDecoder.readSInt64();
            throw null;
        }
        int i2 = this.width & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(codedInputStream$StreamDecoder.readSInt64()));
                if (codedInputStream$StreamDecoder.isAtEnd()) {
                    return;
                } else {
                    tag = codedInputStream$StreamDecoder.readTag();
                }
            } while (tag == this.width);
            this.depth = tag;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead = codedInputStream$StreamDecoder.getTotalBytesRead() + codedInputStream$StreamDecoder.readUInt32();
        do {
            list.add(Long.valueOf(codedInputStream$StreamDecoder.readSInt64()));
        } while (codedInputStream$StreamDecoder.getTotalBytesRead() < totalBytesRead);
        requirePosition$1(totalBytesRead);
    }

    public String readString() throws InvalidProtocolBufferException.InvalidWireTypeException {
        requireWireType$1(2);
        CodedInputStream$StreamDecoder codedInputStream$StreamDecoder = (CodedInputStream$StreamDecoder) this.bitmap;
        int rawVarint32 = codedInputStream$StreamDecoder.readRawVarint32();
        byte[] bArr = codedInputStream$StreamDecoder.buffer;
        if (rawVarint32 > 0) {
            int i = codedInputStream$StreamDecoder.bufferSize;
            int i2 = codedInputStream$StreamDecoder.pos;
            if (rawVarint32 <= i - i2) {
                String str = new String(bArr, i2, rawVarint32, Internal.UTF_8);
                codedInputStream$StreamDecoder.pos += rawVarint32;
                return str;
            }
        }
        if (rawVarint32 == 0) {
            return "";
        }
        if (rawVarint32 > codedInputStream$StreamDecoder.bufferSize) {
            return new String(codedInputStream$StreamDecoder.readRawBytesSlowPath(rawVarint32), Internal.UTF_8);
        }
        codedInputStream$StreamDecoder.refillBuffer(rawVarint32);
        String str2 = new String(bArr, codedInputStream$StreamDecoder.pos, rawVarint32, Internal.UTF_8);
        codedInputStream$StreamDecoder.pos += rawVarint32;
        return str2;
    }

    public void readStringListInternal(List list, boolean z) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int tag;
        int tag2;
        if ((this.width & 7) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        boolean z2 = list instanceof LazyStringList;
        CodedInputStream$StreamDecoder codedInputStream$StreamDecoder = (CodedInputStream$StreamDecoder) this.bitmap;
        if (!z2 || z) {
            do {
                list.add(z ? readStringRequireUtf8() : readString());
                if (codedInputStream$StreamDecoder.isAtEnd()) {
                    return;
                } else {
                    tag = codedInputStream$StreamDecoder.readTag();
                }
            } while (tag == this.width);
            this.depth = tag;
            return;
        }
        LazyStringList lazyStringList = (LazyStringList) list;
        do {
            lazyStringList.add(readBytes());
            if (codedInputStream$StreamDecoder.isAtEnd()) {
                return;
            } else {
                tag2 = codedInputStream$StreamDecoder.readTag();
            }
        } while (tag2 == this.width);
        this.depth = tag2;
    }

    public String readStringRequireUtf8() throws InvalidProtocolBufferException.InvalidWireTypeException {
        requireWireType$1(2);
        CodedInputStream$StreamDecoder codedInputStream$StreamDecoder = (CodedInputStream$StreamDecoder) this.bitmap;
        int rawVarint32 = codedInputStream$StreamDecoder.readRawVarint32();
        int i = codedInputStream$StreamDecoder.pos;
        int i2 = codedInputStream$StreamDecoder.bufferSize;
        int i3 = i2 - i;
        byte[] rawBytesSlowPath = codedInputStream$StreamDecoder.buffer;
        if (rawVarint32 <= i3 && rawVarint32 > 0) {
            codedInputStream$StreamDecoder.pos = i + rawVarint32;
        } else {
            if (rawVarint32 == 0) {
                return "";
            }
            i = 0;
            if (rawVarint32 <= i2) {
                codedInputStream$StreamDecoder.refillBuffer(rawVarint32);
                codedInputStream$StreamDecoder.pos = rawVarint32;
            } else {
                rawBytesSlowPath = codedInputStream$StreamDecoder.readRawBytesSlowPath(rawVarint32);
            }
        }
        return Utf8.processor.decodeUtf8(i, rawVarint32, rawBytesSlowPath);
    }

    public int readUInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        requireWireType$1(0);
        return ((CodedInputStream$StreamDecoder) this.bitmap).readUInt32();
    }

    public void readUInt32List(List list) throws InvalidProtocolBufferException {
        int tag;
        boolean z = list instanceof IntArrayList;
        CodedInputStream$StreamDecoder codedInputStream$StreamDecoder = (CodedInputStream$StreamDecoder) this.bitmap;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.width & 7;
            if (i == 0) {
                codedInputStream$StreamDecoder.readUInt32();
                throw null;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            codedInputStream$StreamDecoder.readUInt32();
            codedInputStream$StreamDecoder.readUInt32();
            throw null;
        }
        int i2 = this.width & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(codedInputStream$StreamDecoder.readUInt32()));
                if (codedInputStream$StreamDecoder.isAtEnd()) {
                    return;
                } else {
                    tag = codedInputStream$StreamDecoder.readTag();
                }
            } while (tag == this.width);
            this.depth = tag;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead = codedInputStream$StreamDecoder.getTotalBytesRead() + codedInputStream$StreamDecoder.readUInt32();
        do {
            list.add(Integer.valueOf(codedInputStream$StreamDecoder.readUInt32()));
        } while (codedInputStream$StreamDecoder.getTotalBytesRead() < totalBytesRead);
        requirePosition$1(totalBytesRead);
    }

    public long readUInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        requireWireType$1(0);
        return ((CodedInputStream$StreamDecoder) this.bitmap).readUInt64();
    }

    public void readUInt64List(List list) throws InvalidProtocolBufferException {
        int tag;
        boolean z = list instanceof LongArrayList;
        CodedInputStream$StreamDecoder codedInputStream$StreamDecoder = (CodedInputStream$StreamDecoder) this.bitmap;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.width & 7;
            if (i == 0) {
                codedInputStream$StreamDecoder.readUInt64();
                throw null;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            codedInputStream$StreamDecoder.readUInt32();
            codedInputStream$StreamDecoder.readUInt64();
            throw null;
        }
        int i2 = this.width & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(codedInputStream$StreamDecoder.readUInt64()));
                if (codedInputStream$StreamDecoder.isAtEnd()) {
                    return;
                } else {
                    tag = codedInputStream$StreamDecoder.readTag();
                }
            } while (tag == this.width);
            this.depth = tag;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead = codedInputStream$StreamDecoder.getTotalBytesRead() + codedInputStream$StreamDecoder.readUInt32();
        do {
            list.add(Long.valueOf(codedInputStream$StreamDecoder.readUInt64()));
        } while (codedInputStream$StreamDecoder.getTotalBytesRead() < totalBytesRead);
        requirePosition$1(totalBytesRead);
    }

    public void requirePosition$1(int i) throws InvalidProtocolBufferException {
        if (((CodedInputStream$StreamDecoder) this.bitmap).getTotalBytesRead() != i) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public void requireWireType$1(int i) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.width & 7) != i) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    public synchronized void setTargetBufferSize(int i) {
        boolean z = i < this.width;
        this.width = i;
        if (z) {
            trim();
        }
    }

    public boolean skipField() {
        int i;
        CodedInputStream$StreamDecoder codedInputStream$StreamDecoder = (CodedInputStream$StreamDecoder) this.bitmap;
        if (codedInputStream$StreamDecoder.isAtEnd() || (i = this.width) == this.height) {
            return false;
        }
        return codedInputStream$StreamDecoder.skipField(i);
    }

    public synchronized void trim() {
        int i = this.width;
        int i2 = Util.SDK_INT;
        int iMax = Math.max(0, ((i + 65535) / 65536) - this.height);
        int i3 = this.depth;
        if (iMax >= i3) {
            return;
        }
        Arrays.fill((Allocation[]) this.bitmap, iMax, i3, (Object) null);
        this.depth = iMax;
    }
}
