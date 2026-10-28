package org.telegram.tgnet.tl;

import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public class TL_agent {

    public static class Providers extends TLObject {
        public static Providers TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (Providers) TLObject.TLdeserialize(Providers.class, fromConstructor(i10), inputSerializedData, i10, z10);
        }

        private static Providers fromConstructor(int i10) {
            if (i10 != -2027776014) {
                if (i10 != 1140283053) {
                    return null;
                }
                return new TL_providersNotModified();
            }
            return new TL_providers();
        }
    }

    public static class TL_providers extends Providers {
        public static final int constructor = -2027776014;
        public long hash;
        public ArrayList<agentProvider> providers = new ArrayList<>();

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.hash = inputSerializedData.readInt64(z10);
            this.providers = Vector.deserialize(inputSerializedData, new c(17), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-2027776014);
            outputSerializedData.writeInt64(this.hash);
            Vector.serialize(outputSerializedData, this.providers);
        }
    }

    public static class agentProvider extends TLObject {
        public static final int constructor = 1194491015;
        public int flags;
        public long icon_emoji_id;
        public String f22238id;
        public String key_url;
        public boolean models_searchable;
        public String title;
        public String vendor;

        public static agentProvider TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            agentProvider agentprovider;
            if (i10 == 1194491015) {
                agentprovider = new agentProvider();
            } else {
                agentprovider = null;
            }
            return (agentProvider) TLObject.TLdeserialize(agentProvider.class, agentprovider, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.flags = inputSerializedData.readInt32(z10);
            this.f22238id = inputSerializedData.readString(z10);
            this.title = inputSerializedData.readString(z10);
            this.vendor = inputSerializedData.readString(z10);
            this.key_url = inputSerializedData.readString(z10);
            this.models_searchable = TLObject.hasFlag(this.flags, 1);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.icon_emoji_id = inputSerializedData.readInt64(z10);
            }
        }

        public void serializeParams(OutputSerializedData outputSerializedData) {
            int flag = TLObject.setFlag(this.flags, 1, this.models_searchable);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeString(this.f22238id);
            outputSerializedData.writeString(this.title);
            outputSerializedData.writeString(this.vendor);
            outputSerializedData.writeString(this.key_url);
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeInt64(this.icon_emoji_id);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1194491015);
            serializeParams(outputSerializedData);
        }
    }

    public static class connect extends TLMethod<settings> {
        public static final int constructor = -14388756;
        public String key;
        public String provider;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-14388756);
            outputSerializedData.writeString(this.provider);
            outputSerializedData.writeString(this.key);
        }

        @Override
        public settings deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return settings.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class disconnect extends TLMethod<settings> {
        public static final int constructor = -1698892007;
        public String provider;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1698892007);
            outputSerializedData.writeString(this.provider);
        }

        @Override
        public settings deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return settings.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class getProviders extends TLMethod<Providers> {
        public static final int constructor = -837913581;
        public long hash;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-837913581);
            outputSerializedData.writeInt64(this.hash);
        }

        @Override
        public Providers deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return Providers.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class getSettings extends TLMethod<settings> {
        public static final int constructor = -82864297;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-82864297);
        }

        @Override
        public settings deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return settings.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class providerKey extends TLObject {
        public static final int constructor = 2018344464;
        public int date_connected;
        public String key_last4;
        public String provider;

        public static providerKey TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            providerKey providerkey;
            if (i10 == 2018344464) {
                providerkey = new providerKey();
            } else {
                providerkey = null;
            }
            return (providerKey) TLObject.TLdeserialize(providerKey.class, providerkey, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.provider = inputSerializedData.readString(z10);
            this.key_last4 = inputSerializedData.readString(z10);
            this.date_connected = inputSerializedData.readInt32(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2018344464);
            outputSerializedData.writeString(this.provider);
            outputSerializedData.writeString(this.key_last4);
            outputSerializedData.writeInt32(this.date_connected);
        }
    }

    public static class setActiveProvider extends TLMethod<settings> {
        public static final int constructor = -1129164408;
        public String provider;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1129164408);
            outputSerializedData.writeString(this.provider);
        }

        @Override
        public settings deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return settings.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class settings extends TLObject {
        public static final int constructor = -54304075;
        public String active_provider;
        public int flags;
        public ArrayList<providerKey> keys = new ArrayList<>();

        public static settings TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            settings settingsVar;
            if (i10 == -54304075) {
                settingsVar = new settings();
            } else {
                settingsVar = null;
            }
            return (settings) TLObject.TLdeserialize(settings.class, settingsVar, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.flags = inputSerializedData.readInt32(z10);
            this.keys = Vector.deserialize(inputSerializedData, new c(18), z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.active_provider = inputSerializedData.readString(z10);
            }
        }

        public void serializeParams(OutputSerializedData outputSerializedData) {
            boolean z10;
            int i10 = this.flags;
            if (this.active_provider != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag = TLObject.setFlag(i10, 1, z10);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            Vector.serialize(outputSerializedData, this.keys);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.active_provider);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-54304075);
            serializeParams(outputSerializedData);
        }
    }

    public static class updateAgentSettings extends TLRPC.Update {
        public static final int constructor = -1808471667;
        public settings settings;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            settings settingsVar = new settings();
            this.settings = settingsVar;
            settingsVar.readParams(inputSerializedData, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1808471667);
            this.settings.serializeParams(outputSerializedData);
        }
    }

    public static class TL_providersNotModified extends Providers {
        public static final int constructor = 1140283053;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1140283053);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
        }
    }
}
